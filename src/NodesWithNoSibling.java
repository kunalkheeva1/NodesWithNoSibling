import java.util.*;

public class NodesWithNoSibling {
   static ArrayList<Integer> nodesWithNoSibling(int node){
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
