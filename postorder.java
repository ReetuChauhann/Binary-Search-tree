public class postorder {

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
      //postorder(LRR0)
      static void postorderr(Node root){
            if(root==null){
                return;
            }
            postorderr(root.left);
            postorderr(root.right);
            System.out.print(root.data + " ");
      }




    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree bt=new binarytree();
        Node root=bt.fun(nodes);
        postorderr(root);

    }
}
