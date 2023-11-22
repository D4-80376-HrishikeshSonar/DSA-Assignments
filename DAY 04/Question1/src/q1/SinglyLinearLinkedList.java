package q1;

public class SinglyLinearLinkedList {

    static private class Node{
        int data;
        Node next;
        Node(int val)
        {
            this.data=val;
            this.next=null;
        }

    }
    private Node head;
    private Node tail;
    SinglyLinearLinkedList(){
        head=null;
        tail=null;
    }
    public void addFirst(int val){
        Node newnode=new Node(val);
        if(head==null && tail==null){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;

        }
        //System.out.println("tail"+tail.data);
    }
    public void addLast(int val){
        Node newnode=new Node(val);
        if(head==null && tail==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;

        }
        //System.out.println("tail"+tail.data);
    }
    public void delFirst(){
        if(head==null && tail==null){
            System.out.println("List is empty");
           return;
        }
        else if(!((head.next) ==null)){
            head=head.next;
        }
        else if(head.next==null){
            return;
        }
    }
    public void delLast(){
        if(head==null && tail==null){
            System.out.println("Empty");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            Node trav=head;
            while (!(trav.next.next==null)){
                trav=trav.next;
            }
            tail=trav;
            trav.next=null;

        }
    }
    public  void display(){
        Node trav=head;
        while (trav!=null){
            System.out.print(trav.data+"->");
            trav=trav.next;
        }

    }

}
