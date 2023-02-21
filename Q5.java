public class Q5 {

        public static void main(String[] args) {
            doulayLinkedList2<Integer>list=new doulayLinkedList2<>();
                System.out.println(list.size());
                System.out.println(list.isEmpty());
                list.addFirst(11);
                list.addlast(12);
                list.addlast(13);
                list.addlast(14);
                list.print();
            System.out.println(list.size());
               while (!list.isEmpty()){
                    System.out.println(list.removeFrist()+" ");
                   System.out.println(list.size());

               }
            list.print();
            }

        }



