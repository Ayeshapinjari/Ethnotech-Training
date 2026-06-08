package day9;
public class DoublyLL {

    private Node head;
    private Node tail;
    private int size;
    private class Node
    {
        private int value;
        private Node prev;
        private Node next;
        Node(int value)
        {
            this.value=value;
            prev=null;
            next=null;
        }
    }
    void insertAtBegin(int value)
    {
        Node newnode=new Node(value);
        if(size==0)
        {
            head=tail=newnode;
            size++;
            return;
        }
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
        size++;
    }
    void insertAtLast(int value)
    {
        Node newnode=new Node(value);
        if(size==0)
        {
            head=tail=newnode;
            size++;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
        size++;

    }
    void insert(int value,int index)
    {
        if(index<0 || index>size)
        {
            System.out.println("Invalid positions");
            return;
        }
        if(index==0)
        {
            insertAtBegin(value);
            return;
        }
        if(index==size)
        {
            insertAtLast(value);
            return;
        }
        Node newnode=new Node(value);
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next.prev=newnode;
        temp.next=newnode;
        newnode.prev=temp;
        size++;
    }
    int deleteAtBegin()
    {
        if(size==0)
        {
            return -1;
        }
        int val=head.value;
        if(size==1)
        {
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
        return val;
    }
    int deleteAtLast()
    {
        if(size==0)
        {
            return -1;
        }
        if(size==1)
        {
            return deleteAtBegin();
        }
        int val=tail.value;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }
    int delete(int index)
    {
        if(index<0 || index>=size)
        {
            return -1;
        }
        if(index==0)
        {
            return deleteAtBegin();
        }
        if(index==size-1)
        {
            return deleteAtLast();
        }
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        int val=temp.value;
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        size--;
        return val;
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args)
    {
        DoublyLL obj=new DoublyLL();
        obj.insertAtBegin(10);
        obj.insertAtBegin(20);
        obj.insertAtBegin(30);
        obj.display();
        obj.insertAtLast(40);
        obj.insertAtLast(50);
        obj.display();
        obj.insert(60,3);
        obj.display();
        System.out.println("first element is removed: "+obj.deleteAtBegin());
        obj.display();
        System.out.println("last element is removed: "+obj.deleteAtLast());
        obj.display();
        System.out.println("index element is removed: "+obj.delete(2));
        obj.display();
    }
}