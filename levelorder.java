import java.util.*;
public class levelorder {

     static class Node{
         int data;
         Node left;
         Node right;

         Node(int data){
             this.data=data;
             this.left=null;
             this.right=null;
         }
     }

     static class binarytree{
         static int idx=-1;
         static Node fun(int[] nodes){
             idx++;
             if(nodes[idx]==-1){
                 return null;
             }
             Node newnode=new Node(nodes[idx]);
             newnode.left=fun(nodes);
             newnode.right=fun(nodes);
             return newnode;
         }
     }
     //levelorderr (implemnted using queue(linkedlist) for using FIFO)
         static void levelorderr(Node root){
             if(root==null){
                return;
             }
             Queue<Node> q=new LinkedList<>();
             q.add(root);
             q.add(null);

             while(!q.isEmpty()){
                 Node currentnode=q.remove();
                 if(currentnode==null){
                     System.out.println();
                     if(q.isEmpty()){
                         break;
                     }else{
                         q.add(null);
                     }
                 }else{
                        System.out.print(currentnode.data+ " ");
                        if(currentnode.left!=null){
                            q.add(currentnode.left);
                        }
                        if(currentnode.right!=null){
                            q.add(currentnode.right);
                        }
                 }
             }

         }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree bt=new binarytree();
        Node root=bt.fun(nodes);
        levelorderr(root);
    }
}
