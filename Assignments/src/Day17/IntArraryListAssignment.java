package Day17;

import java.util.ArrayList;

public class IntArraryListAssignment {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> score = new ArrayList<Integer>();
		      
        score.add(1);
        score.add(34);
        score.add(99);
        score.add(99);
        score.add(78);
		
        System.out.println("Total number of items in the list =" +score.size());
        System.out.println("Value of the Last item in the List is:" + score.get(4));
        //System.out.println("Index of the last item in the List is:" + score.lastIndexOf(score));
        //Above statement is incorrect, it should be written like -
        System.out.println("Index of the last item = " + score.indexOf(78));
	}

}
