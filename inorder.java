public class inorder {
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

    static class Binarytree{
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

    //inorder
    static void inorderr(Node root){
        if(root==null){
            return;
        }
        inorderr(root.left);
        System.out.print(root.data+" ");
        inorderr(root.right);
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree bt=new Binarytree();
        Node root=bt.fun(nodes);
        inorderr(root);

    }
}
