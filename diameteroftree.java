public class diameteroftree { //diameter: No of nodes in the longest path btw any 2 nodes
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
    static class binarytrrr{
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
    //height 
    static int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int myheight=Math.max(left, right) +1;
        return myheight;

    }
    //diameter of a tree
    static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int D1=diameter(root.left); 
        int D2=diameter(root.right);
        int D3=height(root.left)+height(root.right) +1; //height of the tree

        return Math.max(D3, Math.max(D1, D2));
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytrrr bt=new binarytrrr();
        Node root=bt.fun(nodes);
        int ans=diameter(root);
        System.out.println(ans);
    }
}
