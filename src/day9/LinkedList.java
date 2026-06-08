package day9;
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    private class Node
    {
        private int value;
        private Node next;
        Node(int value)
        {
            this.value=value;
            next=null;
        }
        Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
    void insertAtBegin(int value)
    {
        Node newnode=new Node(value);
        newnode.next=head;
        head=newnode;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
    void insertAtLast(int value)
    {
        if(tail==null)
        {
            insertAtBegin(value);
            return;
        }
        Node newnode=new Node(value);
        tail.next=newnode;
        tail=newnode;
        size++;
    }
    void insert(int value,int index)
    {
        if(index==size)
        {
            insertAtLast(value);
            return;
        }
        if(index==0)
        {
            insertAtBegin(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node newnode=new Node(value,temp.next);
        temp.next=newnode;
        size++;
    }
    int deleteAtBegin()
    {
        if(size==0)
        {
            tail=null;
            return -1;
        }
        int val=head.value;
        head=head.next;
        size--;
        if(head == null) //if list has only one node and after removing that,head becomes null but still tail points the node.value itself to handle that we used if condition
        {
            tail = null;
        }
        return val;
    }
    Node get(int index)
    {
        Node temp=head;
        if(index < 0 || index >= size)
        {
            return null;
        }
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    int deleteAtLast()
    {
        if(size<=1)
        {
            return deleteAtBegin();
        }
        int val=tail.value;
        Node secondLast=get(size-2);
        tail=secondLast;
        secondLast.next=null;
        size--;
        return val;
    }
    int delete(int index)
    {
        if(index==0)
        {
            return deleteAtBegin();
        }
        if(index==size-1)
        {
            return deleteAtLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
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
        System.out.println("End");
    }

    public static void main(String args[])
    {
        LinkedList obj=new LinkedList();
        obj.insertAtBegin(10);
        obj.insertAtBegin(20);
        obj.insertAtBegin(30);
        obj.insertAtBegin(40);
        obj.insertAtBegin(50);
        obj.insertAtLast(0);
        obj.insert(70,3);
        obj.display();
        System.out.println("Removed value is:"+ obj.deleteAtBegin());
        obj.display();
        System.out.println("Removed value is: "+obj.deleteAtLast());
        obj.display();
        System.out.println("Removed value is: "+obj.delete(3));
        obj.display();
    }
}