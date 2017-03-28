public class DoublyLinkedList{
  //Definied Fields
  private Node root;
  private Node tail;
  private Node added;
  
  
  public int listSize(){
    int counter = 0;
    Node temp = root;
    while(temp != null){
      counter++;
      temp = temp.getNext();
    }
    return counter;
  }
  
  //a boolean method to first check if the linked list is empty
  public boolean isEmpty(){
    return root==null;
  }
  
  //method to add a node
  public void add(int nodeNumber, String added){
    Node newNode = new Node(added);
    
    if (root == null){
      root = tail = newNode;
    }
    else if(listSize()==1){
      if(newNode.getName().compareToIgnoreCase(tail.getName())>0){
        tail = newNode;
        root.setNext(tail);
        tail.setPrev(root);
      }
      else{
        root = newNode;
        root.setNext(tail);
        tail.setPrev(root);
      }
    }
    else{
      if(newNode.getName().compareToIgnoreCase(tail.getName())>0){
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
      }
      else if(newNode.getName().compareToIgnoreCase(root.getName())<0){
        root.setPrev(newNode);
        newNode.setNext(root);
        root = newNode;
      }
      else{
        Node tempRoot = root;
        while (tempRoot != null){
          if (newNode.getName().compareToIgnoreCase(tempRoot.getName())>0 && 
              newNode.getName().compareToIgnoreCase(tempRoot.getNext().getName())<0){
            
            newNode.setNext(tempRoot.getNext());
            newNode.setPrev(tempRoot);
            tempRoot.getNext().setPrev(newNode);
            tempRoot.setNext(newNode);
          }
          tempRoot = tempRoot.getNext();
        }
      }
    }
  }
  
  
  public void destroyList (){
    this.root = null;
  }
  
  public void traverseForward()
  {
    Node temp = root;
    while (temp!=null){
      System.out.println(temp.getName());
      temp = temp.getNext();
  }
  }
  
  public void traverseBackwards()
  {
    Node temp = tail;
    while (temp != null){
      System.out.println(temp.getName());
      temp = temp.getPrev();
    }
  }

  public Node findNode(String i){
    Node currentNode = root;
    
    while(currentNode!=null){
      if (i.equals(currentNode.getName()))
      {
        System.out.println("Found " + currentNode.getName()); 
        return currentNode;
      }
      currentNode = currentNode.getNext();
    }
    System.out.println(" Not Found " + i);
    return null;
  }
  

  public void deleteNode(int nodeNumber){
    Node temp = this.root;
    if (temp == root){
      root.getNext().setPrev(null);
      root = root.getNext();
    }
    else if (temp == tail)
    {
    tail.getPrev().setNext(null);
    tail = tail.getPrev();
    }
    else 
    {
      temp.getNext().setPrev(temp.getPrev());
      temp.getPrev().setNext(temp.getNext());
    }
  }
  
  
  public void iterate(){
    Node temp = root;
    
    while(temp != null)
    {
      System.out.println(temp.toString());
      temp = temp.getNext();
    }
  }
}
