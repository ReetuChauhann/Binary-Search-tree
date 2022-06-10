public class countnodeintree {
     static class Node{
         int val;
         Node left;
         Node right;
         
         Node(int val){
             this.val=val;
             this.left=null;
             this.right=null;
         }
     }

     static class binaryt{
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
     //count number of nodes in a given tree
     static int countnodes(Node root){
         if(root==null){
             return 0;
         }
         
         int left=countnodes(root.left);
         int right=countnodes(root.right);

         return left+right+1;
     }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryt bt=new binaryt();
        Node root=bt.fun(nodes);
        int ans=countnodes(root);
        System.out.println(ans);

    }
}
