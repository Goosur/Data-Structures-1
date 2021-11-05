public class IntScapegoat implements IntDataSet {

    public IntNode root;

    public IntScapegoat() {
        this.root = null;
    }

    @Override
    public void insert(int data) {
        
        if (root == null) {
            root = new IntNode(data);
            root.height = 1;
            root.nNodes = 1;
        } else {
            root.insert(data);
        }
    }

    @Override
    public boolean search(int target) {
        return false;
    }
}
