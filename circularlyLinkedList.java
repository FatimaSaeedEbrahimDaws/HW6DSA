public class circularlyLinkedList<E> {

    private Node<E>tail=null;
    private  int size=0;

    public circularlyLinkedList() {

    }
    public int methodSize(circularlyLinkedList<E> list){
        Node<E>i=tail.next;
        int s=0;
        while (i!=null){
            s++;
            i=i.next;
           if( tail.next==i)
            break;
        }return  s;
    }
    public boolean  equals(circularlyLinkedList<E> L,circularlyLinkedList<E> M){
        boolean f=false;
        Node<E>m=M.tail.next;
        Node<E>l=L.tail.next;
        if (L.size()==M.size()){
            while (m!=null&&l!=null){
                if (m.element==l.element)
                    f=true;
                else {
                    f=false;
                    return  f;}
                m=m.next;
                l=l.next;
                if( m==M.tail.next&&l==L.tail.next)
                    break;
            }}

        return  f;
    }
    public boolean  sameSequence(circularlyLinkedList<E> L,circularlyLinkedList<E> M){
        boolean f=false;
        Node<E>m=M.tail.next;
        Node<E>l=L.tail.next;
        if (L.size()==M.size()){
            System.out.println("sssss");
            ///////////////////////////////////////////////////
            for (int i = 0; i <M.size ; i++) {
                System.out.println(M.size);
                if (m.element== l.element) {
                    break;

                }
                else {
                    l = l.next;
                    if (i == M.size - 1)
                        return f;
                }

                System.out.println("jjjj");
            }///////////////////////////////
//            while (m!=null&&l!=null){
//
//                if (m.element==l.element)
//                    f=true;
//                else {
//                    f=false;
//                    return  f;}
//                m=m.next;
//                l=l.next;
//                if( m==M.tail.next&&l==L.tail.next)
//                    break;
//
//          }
        }

        return  f;
    }
    public circularlyLinkedList<E> split(circularlyLinkedList<E>l){
        circularlyLinkedList<E>l2=new circularlyLinkedList<>();
        if (l.size%2==0){
            for (int i=0;i<=l.size/2;i++){
             l2.addLast(  l.removeFirst());
            }
    }return l2;}
    public circularlyLinkedList<E> clone(circularlyLinkedList<E>l){
        circularlyLinkedList<E>l1=new circularlyLinkedList<>();
        Node<E> i=l.tail.next;
        while (i!=l.tail){

           l1.addLast(i.element);
           i=i.next;
        }
        return l;}

    public  boolean isEmpty(){
        return  size==0;
    }
    public  int size()
    {return size;}
    public E first()
    {
        if( isEmpty())return  null;
        return tail.next.getElement();
    }
    public E last()
    {
        if( isEmpty())return  null;
        return  tail.element;
    }
    public void addFirst(E newElment)
    {if (size==0)
    {   tail=new Node<E>(newElment,null);
        tail.setNext(tail);}
        else {
            Node<E>x=new Node<>(newElment,tail.next);
            tail.setNext(x);
    }
//        tail.next=new Node<E>(newElment,tail.next);
//        if (isEmpty() )
//            tail=tail.next;
        size++;

    }
   public  void addLast(E newelement){
        addFirst(newelement);
      tail=tail.next;
   }
    public E removeFirst(){
        if (isEmpty())return  null;
       Node<E>x=tail.next;
       if ((x==tail))
           tail=null;
       else
           tail.next=x.next;
       size--;
       return  x.element;

//        E del=tail.next.element;
//         tail.next=tail.next.next;
//        size--;
//        if (size==0)
//            tail=null;
//        return  del;


    }
    public void rotate(){
        if(tail!=null){
            tail=tail.next;
        }
    }
    public void print(){
     Node<E> i=tail.next;
        while (i!=tail){
            System.out.print(i.getElement()+"  ");
            i=i.next;
        }

        System.out.println(i.getElement());
    }

    private static  class Node<E>{
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
