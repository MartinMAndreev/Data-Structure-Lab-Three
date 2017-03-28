
//MAIN CLASS DOESNT SEEM TO RUN - However, it used to check if the program would print
public class Main {
    public static void main(String[] args) {
  
  DoublyLinkedList list = new DoublyLinkedList();
  list.add(0, "A");
  list.add(1, "B");
  list.add(2, "C");
  list.add(3, "D");
  list.add(4, "E");
  System.out.println("Length : "+list.listSize());
  
             
        list.traverseForward();
        System.out.println("List backwards: ");
        list.traverseBackwards();
                
        list.deleteNode(2);
        System.out.println("Length : "+list.listSize());
        System.out.println("New List with removal of node: ");
        list.traverseForward();
        list.destroyList();
        System.out.println("Length : "+list.listSize());
        System.out.println("List has been deleted.");

 }

    
}
