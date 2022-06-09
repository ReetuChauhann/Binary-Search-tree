import org.jcp.xml.dsig.internal.SignerOutputStream;

public class preorder {
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

            Node newNode=new Node(nodes[idx]);
            newNode.left=fun(nodes);
            newNode.right=fun(nodes);
            return newNode;
        }
    }

    //preorder(R0,L,R)
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree bt=new binarytree();
        Node root=bt.fun(nodes);
       // System.out.println(root.data);
       preorder(root);
    }
    
}
