public class Program_08_insertsinglylinkedlist{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public int size;
    public Node head;

   
    public void insert_at_beginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            
        }
        else{
            head.next = newNode;
            head = newNode;
        }
        size++;
    }

    public void insert_at_middle(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            
        }
        else{
            Node temp,current;
            int count = (size%2 == 0)?(size/2):((size+1)/2);
            temp = head;
            current = null;
            for(int i=0;i<count;i++){
                current = temp;
                temp = temp.next;
            }
            current.next = newNode;
            newNode.next = temp;
        }
        size++;
    }

    public void insert_at_end(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void display(){
        Node current = head;
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        } 
        while( current != null){
            System.out.println(current.data+"");
            current = current.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Program_08_insertsinglylinkedlist LL = new Program_08_insertsinglylinkedlist();
        LL.insert_at_beginning(10);
        LL.insert_at_beginning(5);
        System.out.println("Original List:");
        LL.display();

        LL.insert_at_middle(15);
        LL.insert_at_middle(18);
        System.out.println("Updated List:");
        LL.display();

        LL.insert_at_end(20);
        LL.insert_at_end(30);
        System.out.println("Updated List:");
        LL.display();

    }
}