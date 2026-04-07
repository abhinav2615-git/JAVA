import java.util.*;
void main(){
    Set<Integer> list = new HashSet<>();
    list.add(1);
    list.add(2);
    list.add(null);
    list.add(-5);
    list.add(0);

    System.out.println(list);
    list.addAll(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(list);

    Set<Integer> list2 = new HashSet<>();
    for(int i=1;i<=10;i++){
        list2.add(i);
    }
    System.out.println(list2);

    Set<Integer> list3 = new HashSet<>();
    list3.addAll(list);
    list3.addAll(list2);
    System.out.println(list3);

    Set<Integer> list4 = new HashSet<>();
    list4.addAll(list);
    list4.removeAll(list2);
    System.out.println(list4);

    Set<Integer> list5 = new HashSet<>();
    list5.addAll(list); 
    list5.retainAll(list2);
    System.out.println(list5);
}