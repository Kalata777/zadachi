package alg;

public class Test {

	public static void main(String[] args) {
		  int[] numbers;
		  int k=100000;
		  numbers = new int[k];
		  for(int i=0;i<k;i++) {
			  numbers[i]=(int) (Math.random()*100000);
		  }
		  long start = System.currentTimeMillis();
			BubbleSort.bubbleSort(numbers);
			System.out.println(System.currentTimeMillis() - start);

			 for(int i=0;i<k;i++) {
				  numbers[i]=(int) (Math.random()*100000);
			  }


			start = System.currentTimeMillis();
			SelectionSort.selectionSort(numbers);
			System.out.println(System.currentTimeMillis() - start);


			 for(int i=0;i<k;i++) {
				  numbers[i]=(int) (Math.random()*100000);
			  }


			start = System.currentTimeMillis();
			MergeSort.mergeSort(numbers);
			System.out.println(System.currentTimeMillis() - start);


			 for(int i=0;i<k;i++) {
				  numbers[i]=(int) (Math.random()*100000);
			  }

			start = System.currentTimeMillis();
			QuickSort.quickSort(numbers);
			System.out.println(System.currentTimeMillis() - start);
	}

	



}
