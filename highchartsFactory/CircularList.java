package org.snbsniper.highchartsFactory;

import java.lang.*;

/**
 * Created by danielftapiar on 2/6/15.
 */
public class CircularList <T>{
    private T data;
    private CircularList next;


    public CircularList()
    {
        data = null;
        next = this;
    }

    public CircularList(T value)
    {
        data = value;
        next = this;
    }

    public CircularList InsertNext(T value)
    {
        CircularList node = new CircularList(value);
        if (this.next == this) // only one node in the circular list
        {
            // Easy to handle, after the two lines of executions,
            // there will be two nodes in the circular list
            node.next = this;
            this.next = node;
        }
        else
        {
            // Insert in the middle

            CircularList temp = this.next;
            node.next = temp;
            this.next = node;
        }
        return node;

    }

    public int DeleteNext()
    {
        if (this.next == this)
        {
            System.out.println("\nThe node can not be deleted as there is only one node in the circular list");
            return 0;
        }

        CircularList node = this.next;
        this.next = this.next.next;
        node = null;
        return 1;
    }

    public void Traverse()
    {
        Traverse(this);
    }

    public void Traverse(CircularList node)
    {
        if (node == null)
            node = this;
        System.out.println("\n\nTraversing in Forward Direction\n\n");
        CircularList startnode = node;

        do
        {
            System.out.println(node.data);
            node = node.next;
        }
        while (node != startnode);
    }

    public int GetNumberOfNodes()
    {
        return GetNumberOfNodes(this);
    }

    public CircularList getNextNode(){
        return this.next;
    }

    public int GetNumberOfNodes(CircularList node)
    {
        if (node == null)
            node = this;

        int count = 0;
        CircularList startnode = node;
        do
        {
            count++;
            node = node.next;
        }
        while (node != startnode);

        System.out.println("\nCurrent Node Value: " + node.data);
        System.out.println("\nTotal nodes in Circular List: " + count);

        return count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CircularList getNext() {
        return next;
    }

    public void setNext(CircularList next) {
        this.next = next;
    }

    //    public static void main(String[] args)
//    {
//
//        CircularList node1 = new CircularList("red");
//        node1.DeleteNext(); // Delete will fail in this case.
//
//        CircularList node2 = node1.InsertNext("blue");
//        node1.DeleteNext(); // It will delete the node2.
//
//        node2 = node1.InsertNext("blue"); // Insert it again
//
//        CircularList node3 = node2.InsertNext("green");
//        CircularList node4 = node3.InsertNext("pink");
//        CircularList node5 = node4.InsertNext("yellow");
//
//        node1.GetNumberOfNodes();
//        node3.GetNumberOfNodes();
//        node5.GetNumberOfNodes();
//
//        node1.Traverse();
//        node3.DeleteNext(); // delete the node "4"
//        node2.Traverse();
//
//        node1.GetNumberOfNodes();
//        node3.GetNumberOfNodes();
//        node5.GetNumberOfNodes();
//    }
}




