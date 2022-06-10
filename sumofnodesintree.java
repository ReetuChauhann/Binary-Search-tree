public class sumofnodesintree {

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

    static class binarytr{
        static int idx=-1;
        static  Node fun(int[] nodes){
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
    //sum of nodes in tree
    static int sum(Node root){
        if(root==null){
            return 0;
        }

        int left=sum(root.left);
        int right=sum(root.right);
        return left+right+root.val;
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytr bt=new binarytr();
        Node root=bt.fun(nodes);
        int ans=sum(root);
        System.out.println(ans);
    }
}
