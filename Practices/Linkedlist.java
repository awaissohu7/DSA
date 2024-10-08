public class Linkedlist {
    

public static Node head;
public static Node tail;
public static int size;
public void addfirst(int data)
{
    Node n= new Node(data);
    size++;
    if(head==null)
    {
        head=tail=n;
        return;
    }
    n.next=head;
    head=n;

}

public void addlast(int data)
{
    Node n=new Node(data);
    size++;
    if(head==null)
    {
        head=tail=n;
        return;
    }

    tail.next=n;
    tail=n;
}

void print(){
    if(head==null)
    {
        System.out.println("The LinkedLIst is Empty");
        return;
    }
    Node temp=head;
    while(temp != null)
    {
        System.out.println(temp.data+ " ");
        temp=temp.next;
    }
}

void add(int index,int data)
{
 
    Node n =new Node(data);
    size++;
    Node temp=head;
   int i=0;
    while (i<index-1) {
        temp=temp.next;
        i++;
    }
n.next=temp.next;
temp.next=n;
}

int removefirst(){
    int value=head.data;
    head=head.next;
    size--;
    return value;

}

int search(int key)
{
    Node temp= head;
    int i=0;
    while (temp!=null) {
        if(temp.data==key)
        {
            return i;
        }
        temp=temp.next;
        i++;
        
    }
    return -1;
}


public static void main(String[] args) {
    Linkedlist list=new Linkedlist();
    list.print();
    list.addlast(1);
    list.addlast(2);
    list.addlast(3);
   list. addlast(4);
   list.addlast(5);
   System.out.println("The Size of this LINKED LIST IS     :   "+size);
    list.removefirst();
    list.print();

    
    System.out.println("The key is found on INDEX Number    :   " +list.search(4));
System.out.println("The Size of this LINKED LIST IS     :   "+size);
System.out.println();




}
}
