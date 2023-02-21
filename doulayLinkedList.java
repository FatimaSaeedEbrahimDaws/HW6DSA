public class doulayLinkedList<E> {

    Node<E>header;
    Node<E>tailer;
    int size=0;

    public doulayLinkedList() {
        header=new Node<>(null,null, null);
        tailer = new Node<>(null,header, null);
        header.next=tailer;
    }

    public int methodSize(doulayLinkedList<E> list){
        Node<E>i=header.next;
        int s=0;
        while (i!=tailer){
            s++;
            i=i.next;
        }return  s;
    }
    public doulayLinkedList<E>  margin(doulayLinkedList<E> L,doulayLinkedList<E> M) {
        L.size=L.size+M.size;
          L.tailer.prev.next=M.header.next;
         L.tailer=M.tailer;

//        while (!M.isEmpty()) {
//            L.addLast(M.removeFirst());
//        }


        return L;
    }
        public  boolean isEmpty(){
        return size==0;
}
public  int size()
    {return size;}
    public E first()
    {
        if( isEmpty())return  null;
        return header.next.element;
    }
    public E last()
    {
        if( isEmpty())return  null;
        return  tailer.prev.element;
    }
    private  void  addfbetween (E e,Node<E>p,Node<E>n){
        Node<E> x=new Node<>(e,p,n);
         p.next=x;
         n.prev=x;
         size++;

    }
    public void addFirst(E e)
    {
        addfbetween(e,header,header.next);
    }
    public void addlast(E e)
    {
        addfbetween(e,tailer.prev,tailer);
    }

  private E remove(Node<E>x)  {
      if( isEmpty())return  null;
        Node<E>p=x.prev;
      Node<E>n=x.next;
      p.next=n;
      n.prev=p;
      size--;
      return x.element;

  }
    public doulayLinkedList<E> swap(doulayLinkedList<E> list,int i,int j){
        if(size<=i&&size<=j)return list;
        else  {
           Node<E> f=header.next,
       l=header.next;
            for (int k = 0; k <i; k++) {
                f=f.next;
            }
            for (int k = 0; k <j; k++) {
                l=l.next;

            }E temp=f.element;
            f.setElement(l.element);
            l.setElement(temp);

        }  return  list;}
    public void print(){
      Node<E> i=header.next;
        while (i.next!=null){
            System.out.print(i.getElement()+"  ");
            i=i.next;
        }
        System.out.println();
    }
    public doulayLinkedList<E> clone(doulayLinkedList<E>l){
       doulayLinkedList<E>l1=new doulayLinkedList<>();
        Node<E> i=l.header.next;
        while (i!=l.tailer){

            l1.addlast(i.element);
            i=i.next;
        }
        return l1;}
    public circularlyLinkedList<E> version(doulayLinkedList<E>l){
   circularlyLinkedList<E>l1=new circularlyLinkedList<>();
        Node<E> i=l.header.next;
        while (i!=l.tailer){

            l1.addLast(i.element);
            i=i.next;
        }
        return l1;}
    public Node<E> findMiddle(doulayLinkedList<E>l){

        Node<E> n=l.header.next;
        Node<E> m=l.tailer.prev;
   if (l.isEmpty())return null;
   while (n!=m) {
       if (n==m.prev)
           return  n;
       n = n.next;
       m=m.prev;
   }
        return n;}
    public boolean  equals(doulayLinkedList<E> L,doulayLinkedList<E> M){
        boolean f=false;
      Node<E> m=M.header.next,l=L.header.next;
        if (L.size()==M.size()){
            for (int i = 0; i < L.size; i++) {


                if (m.element==l.element)
                    f=true;
                else {
                    f = false;
                    return f;
                }

                m=m.next;
                l=l.next;
            }}
        return  f;
    }

  public E removelast2NodeCon(doulayLinkedList<E>list)  {
        Node<E>t=tailer;
        if( size<2)return  null;
        else {
        Node<E>p=t.prev.prev;
        Node<E>n=t.prev.next;
        p.next=n;
        n.prev=p;
        size--;}
        return t.prev.element;

    }

   public  E removeFrist()

   {
       return  remove(header.next);
   }
    public  E removeLast()

    {
        return  remove(tailer.prev);
    }


protected   static class Node<E>{
        E element;
Node<E>prev;
Node<E>next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
