
public class binarysearchtree {

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
        // method will return root node
        static  int idx=-1;
        public static Node fun(int[] nodes){
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

    public static void main(String[] args) {
        // int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] nodes={2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree bt=new binarytree();
        Node root=bt.fun(nodes);
        System.out.println(root.data);
    }
}
