class Node{
    public int info;
    public Node link;
    void Node(int info,Node link){
        this.info = info;
        this.link = link;
    }
    public String toString(){
        return info + "";
    }

}

public class Program_08_createanode{
    public static void main(String[] args) {
        Node first = new Node();
        first.Node(10,null);
        System.out.println(first.info);
    }
}