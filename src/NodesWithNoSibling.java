import java.util.*;
//node class
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

    //recursive call for the data
    static void rec(Node root, ArrayList<Integer>ans){
        //if null then return
        if(root ==null){
            return;
        }
        //if right is not null, then store its data
        if(root.left ==null && root.right != null){
            ans.add(root.right.data);
        }
        //if left is not null , then store its data
        if(root.left != null && root.right ==null){
            ans.add(root.left.data);
        }
        //call for left and right otherwise
        rec(root.left, ans);
        rec(root.right,ans);
    }

   static ArrayList<Integer> nodesWithNoSibling(Node node){
       ArrayList<Integer> ans = new ArrayList<>();
       rec(node, ans);
       //if empty then print -1, otherwise sort the list and return it
       if(ans.size()==0){
           ans.add(-1);
       }else{
           Collections.sort(ans);
       }
       return ans;
   }
    public static void main(String[] args) {

    }
}
