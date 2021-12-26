package com.bridgelabs.hashmap;

public class OrderedLinkList {
    public static INode head;
    public INode tail;

    public OrderedLinkList()
    {
        this.head = null;
        this.tail = null;
    }
    public static void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        INode tempNode = head;
        while(tempNode.getNext() != null){
            System.out.print(tempNode.getKey()+ " -> ");
            tempNode=tempNode.getNext();
        }
        System.out.println(tempNode.getKey());
    }

    public  static  void sortingNodesAndAddingThemInList(INode newNode){
        if (head == null || (head.getKey().compareTo(newNode.getKey())==1) || (head.getKey().compareTo(newNode.getKey())==0)) {
            newNode.setNext(head);
            head=newNode;
        }
        else {
            INode tempNode = head;
            while(tempNode.getNext() != null && (tempNode.getNext().getKey().compareTo(tempNode.getKey())==-1)) {
                tempNode.setNext(newNode);
            }

            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
        }

    }
}
