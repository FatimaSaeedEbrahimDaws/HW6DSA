public class Q4 {
    public static void main(String[] args) {
    doulayLinkedList<Integer>L=new doulayLinkedList<>();
       doulayLinkedList<Integer>M=new doulayLinkedList<>();
        L.addFirst(11);
        L.addlast(12);
        L.addlast(13);
        L.addlast(14);
        L.addlast(15);
        System.out.print("list1: ");
L.print();
        M.addFirst(16);
        M.addlast(17);
        M.addlast(18);
        M.addlast(19);
        M.addlast(20);
        System.out.print("list2: ");
        M.print();
        System.out.print("after margin list: ");
        L=L.margin(L,M);
   L.print();

    }
}
