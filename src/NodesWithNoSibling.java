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


    static void rec()

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
