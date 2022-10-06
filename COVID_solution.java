
public class COVID {

	public static void main(String[] args) {
		System.out.println(getCases(3, 12)); //should print 69984
		System.out.println(getCases(3, 5));  //should print 108
		System.out.println(getCases(3, 0));  //should print -1
		System.out.println(getCases(3, 7));  //should print 648

		System.out.println(getNumMonth(3888, 3)); //should print 9
		System.out.println(getNumMonth(23328, 3)); //should print 11
		System.out.println(getNumMonth(324, 3)); //should print 6
		System.out.println(getNumMonth(123, 3)); //should throw IllegalArgumentException with message "Month not found"
	}

	// Method returns the number of cases given the start cases and the target month.
	public static int getCases(int startCase, int month) {
		//TODO write your code below.
		int value = 0;
		if(month>1 && month % 2 == 0) {
			value=startCase*3;
		}else if(month>1 && month %2 !=0) {
			value=startCase*2;
		}if(month==1) {
			return startCase;
		}if(month<1) {
			return -1;
		}
		getCases(value, month-1);
		return getCases(value, month-1);
	}
	
	
	//Recursive method that return the month of the cases collected
	public static int getNumMonth(int cases, int startCase) {
		//TODO write your code below. You must use recursion to solve this problem
		int value=0;
		value=cases/startCase;
		if(value %3 ==0) {
			value=cases/3;	
		}else if(value %2 ==0) {
			value=cases/2;
		}else if(value==1) {
			return 1;
		}else {
			throw new IllegalArgumentException("Month not found");
		}
		
//		getNumMonth(value, startCase);

		return 1+getNumMonth(value, startCase);
	}

}
