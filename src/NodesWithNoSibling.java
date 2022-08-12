import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(Node left, Node right, int data){
        this.left =left;
        this.right = right;
        this.data = data;
    }

}

public class NodesWithNoSibling {


    static void rec(Node root, ArrayList<Integer>ans){
        if(root ==null){
            return;
        }
        if(root.left ==null && root.right != null){
            ans.add(root.right.data);
        }
        if(root.left != null && root.right ==null){
            ans.add(root.left.data);
        }
        rec(root.left, ans);
        rec(root.right,ans);
    }

   static ArrayList<Integer> nodesWithNoSibling(Node node){
       ArrayList<Integer> ans = new ArrayList<>();
       rec(node, ans);
       if(ans.size()==0){
           ans.add(-1);
           return ans;
       }else{
           Collections.sort(ans);
           return ans;
       }
   }
    public static void main(String[] args) {

    }
}
