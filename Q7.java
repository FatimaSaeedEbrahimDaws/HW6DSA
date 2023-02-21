public class Q7 {

        public static void main(String[] args) {
          doulayLinkedList<Integer>list=new doulayLinkedList<>();
            doulayLinkedList<Integer>list1=new doulayLinkedList<>();
            list.addFirst(11);
            list.addlast(12);
            list.addlast(13);
            list.addlast(14);
            list.addlast(15);
            list.addlast(16);
            System.out.print("list1: ");
            list.print();

            list1=list1.clone(list);
            System.out.println("after clone:  ");
            System.out.print("list1:  ");
            list.print();

            System.out.print("list2:  ");
            list1.print();



        }
    }

