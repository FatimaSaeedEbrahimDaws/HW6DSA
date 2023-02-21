public class Q1 {
   public static void main(String[] args) {
      doulayLinkedList<Integer>list=new doulayLinkedList<>();

      list.addFirst(11);
      list.addlast(12);
      list.addlast(13);
      list.addlast(14);
      list.addlast(15);


      System.out.println("Size of list: "+list.size());
      System.out.println("element of middle node: "+list.findMiddle(list).element);

   }

   }
