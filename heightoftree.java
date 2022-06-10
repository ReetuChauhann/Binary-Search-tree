public class heightoftree {
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
      static class binarytrr{
          static int idx=-1;
          static Node fun(int[] nodes){
              idx++;
              if(nodes[idx]==-1){
                  return null;
              }

              Node newNode=new Node(nodes[idx]);
              newNode.left=fun(nodes);
              newNode.right=fun(nodes);
              return newNode;
          }
      }
      //height of the tree
      static int height(Node root){
          if(root==null){
              return 0;
          }
          int left=height(root.left);
          int right=height(root.right);
          int myheight=Math.max(left, right)+1;
          return myheight;
      }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytrr bt= new binarytrr();
        Node root=bt.fun(nodes);
        int ans=height(root);
        System.out.println(ans);
    }
    
}
