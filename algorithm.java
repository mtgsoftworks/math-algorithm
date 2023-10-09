import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main {
	public static void main(String[] args) {
        int i = 0;
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();  

        for(i = 0; i < 30; i++) {
            int number = (int)(Math.random() * 10);
		    list1.add(number);
         }

         for(i = 0; i < 30; i++) {
            int number = (int)(Math.random() * 10);
		    list2.add(number);
         }
        
         List<Integer> list3 = new ArrayList<Integer>() { { addAll(list1); addAll(list2); } };
         
         Collections.reverse(list3);
         Collections.sort(list3);
         
         System.out.println(list3);

		
	}
}