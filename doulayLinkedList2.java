public class doulayLinkedList2 <E>{


        private Node<E> head;
        private Node<E> tail;
        private  int size=0;

        public doulayLinkedList2() {
            head=new Node<>(null,null, null);
            tail= new Node<>(null,head, null);
            head.next=tail;
        }


        public  boolean isEmpty(){
            return size==0;
        }
        public  int size()
        {return size;}
        public E first()
        {
            if( isEmpty())return  null;
            return head.element;
        }
        public E last()
        {
            if( isEmpty())return  null;
            return  tail.prev.element;
        }
        private  void  addfbetween (E e, Node<E> p, Node<E> n){
            Node<E> x=new Node<>(e,p,n);
            p.next=x;
            n.prev=x;
            size++;

        }
        public void addFirst(E e)
        {
           // addfbetween(e,null,head);
//            {if (size==0)
//            {   head=new doulayLinkedList2.Node<E>(e,null,head);
//                head=tail;}
//            else {
//               doulayLinkedList2.Node<E> x=new doulayLinkedList2.Node<>(e,null,head);
//               head=x;
//
//        }}
//        size++;

            head=new Node<E>(e,null,head);
            if (isEmpty() )
                tail.prev=head;
            size++;

        }
        public void addlast(E e)
        {
//            addfbetween(e,tail.prev,tail);
            Node<E>newest=new Node<E>(e,null,null);
            if (isEmpty() ){head=newest;
            newest.next=tail;}
            else    {tail.prev.next=newest;
           // p.next=x;
         //   n.prev=x;
            tail.prev=newest;}
            size++;
        }

        private E remove(Node<E> x)  {
            if( isEmpty())return  null;
//            Node<E> p=x.prev;
//            Node<E> n=x.next;
         if (size>1) {
//             p.next=n;
//            n.prev=x.prev;
            tail.prev=x.prev;
             x.prev=x.next;
         }
         else head=null;
            size--;
            return x.element;

        }

        public void print(){
            Node<E> i=head;
            while (i!=null){
                System.out.print(i.getElement()+"  ");
                i=i.next;
            }
            System.out.println();
        }


        public  E removeFrist()

        {
           // return  remove(head);
            if(isEmpty())return  null;
            E del=head.element;
if (size>1)
            head=new Node<>(head.next.element,null,head.next.next);
else

    head=null;
size--;
            if (size==0)
                tail.prev=null;
            return  del;
        }
//    public E removelast2NodeCon(doulayLinkedList2<E>list)  {
//        doulayLinkedList2.Node<E> t=tail;
//        if( size<2)return  null;
//        else {
//            doulayLinkedList2.Node<E> p=t.prev.prev;
//            doulayLinkedList2.Node<E> n=t.prev.next;
//            p.next=n;
//            n.prev=p;
//            size--;}
//        return t.prev.element;
//
//    }

        public  E removeLast()

        {
           // return  remove(tail.prev);
            if(isEmpty())return  null;
            E del=tail.prev.element;
            if (size>1) {
                // tail.prev=new Node<>(tail.prev.prev.element,tail.prev.prev.prev,tail);
                tail.prev.prev.next=tail;
                tail.prev=tail.prev.prev;

            }

            else
            {head=null;
            tail.prev=null;}
            size--;


            return  del;
        }


        protected   static class Node<E>{
            E element;
            Node<E> prev;
            Node<E> next;

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

