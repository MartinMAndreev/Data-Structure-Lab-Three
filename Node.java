public class Node {
//fields for the Node class
 private String data;
 public Node nextNode;
 public Node prevNode;
 public int listSize;
 public String name;

//constructors
 public Node(){
    this.data= ("");
    this.nextNode =null;
    this.prevNode =null;
  }
 
 public Node(String info){
    this.data= data;
    this.nextNode= null;
    this.prevNode= null;
  }
 
 //getter and setter for Info
 public String getData(){
    return this.data;
  }
 
 public void setData(String data){
    this.data= data;
  }
 
 //getter and setter for nextNode
 public Node getNext() {
  return this.nextNode;
 }

 public void setNext(Node next) {
  this.nextNode = nextNode;
 }
 
 //getter and setter for prevNode
 public Node getPrev() {
   return prevNode;
 }
 
 public void setPrev(Node prevNode) {
   this.prevNode = prevNode;
 }

 //getter and setter for name
 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }
 
//Method to change nodes to strings
 public String toString() {
  return this.data;
 }
 
 //keeps track of the size of the list I use
 public int listSize() { 
   return listSize; 
 }
 
 //add method from the linked list, returns added
 public String add(String added){
   return added;
 }
}