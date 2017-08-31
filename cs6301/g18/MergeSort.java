package cs6301.g18;

public class MergeSort<T> {

	static<T extends Comparable<? super T>> void mergeSort(T[] arr, T[] tmp) {
		   mergeSort(arr, tmp, 0, arr.length - 1);
	   }
	   
	   static<T extends Comparable<? super T>> void mergeSort(T[] arr, T[] tmp, int left, int right) {
		   int mid = (left + right) / 2;
		   if(right <= left) return;
		   mergeSort(arr, tmp, left, mid);
		   mergeSort(arr, tmp, mid + 1, right);
		   merge(arr, tmp, left, mid, right);
	   }
	   
	   @SuppressWarnings("unchecked")
	static<T extends Comparable<? super T>> void merge(T[] arr, T[] tmp, int left, int mid, int right) {
		   Object[] temp = new Object[right - left + 1];
		   for(int l = left, r = mid + 1, count = 0; count < temp.length; count++) {
			   if(l == mid + 1) {
				   temp[count] = arr[r++];
				   continue;
			   }
			   if(r == right + 1) {
				   temp[count] = arr[l++];
				   continue;
			   }
			   temp[count] = (arr[l].compareTo(arr[r]) < 0) ? arr[l++] : arr[r++];
		   }
		   for(int k = 0; k < temp.length; k++) {
			   arr[k + left] = (T) temp[k];
		   }
	   }
	   
	   static void mergeSort(int[] arr, int[] tmp) {
		   mergeSort(arr, tmp, 0, arr.length - 1);
	   }
	   
	   static void mergeSort(int[] arr, int[] tmp, int left, int right) {
		   int mid = (left + right) / 2;
		   if(right <= left) return;
		   mergeSort(arr, tmp, left, mid);
		   mergeSort(arr, tmp, mid + 1, right);
		   merge(arr, tmp, left, mid, right);
	   }
	   
	   static void merge(int[] arr, int[] tmp, int left, int mid, int right) {
		   tmp = new int[right - left + 1];
		   for(int l = left, r = mid + 1, count = 0; count < tmp.length; count++) {
			   if(l == mid + 1) {
				   tmp[count] = arr[r++];
				   continue;
			   }
			   if(r == right + 1) {
				   tmp[count] = arr[l++];
				   continue;
			   }
			   tmp[count] = (arr[l] < arr[r]) ? arr[l++] : arr[r++];
		   }
		   for(int k = 0; k < tmp.length; k++) {
			   arr[k + left] = tmp[k];
		   }
	   }
	   
	   @SuppressWarnings("unchecked")
	static<T extends Comparable<? super T>> void nSquareSort(T[] arr) {
		   for(int i = 1; i < arr.length; i++) {
			   T insert = arr[i];
			   int j = i - 1;
			   for(j = i - 1; j >= 0 && insert.compareTo(arr[j]) < 0; j--) {
				   arr[j + 1] = arr[j];
			   }
			   arr[j + 1] = (T) insert;
		   }
	   }
	   
	   public static <T> void main(String[] args) {
		   
//		   for(int p = 1; p <= 16 ; p++) {
//			   
//			   //MergeSort General type: Integer
//			   Integer[] arr1 = new Integer[(int) Math.pow(2, 20) * p];
//			   for(int i = 0; i < arr1.length; i++) {
//				   arr1[i] = (int) (Math.random() * Math.pow(2, 0) * p);
//			   }
//			   Integer[] tmp = new Integer[arr1.length];
//			   Shuffle.shuffle(arr1, 0, arr1.length - 1);
//			   Timer timer1 = new Timer();
//			   timer1.start();
//			   MergeSort.mergeSort(arr1, tmp);
//			   timer1.end();
//			   System.out.println("MergeSort General type: Integer " + p + "M: " + timer1.toString());
//			   
//		   }
		   
//		   for(int p = 1; p <= 16 ; p++) {
//			   //MergeSort General type: Character
//			   Character[] arr2 = new Character[(int) Math.pow(2, 20) * p];
//			   for(int i = 0; i < arr2.length; i++) {
//				   arr2[i] = (char) (Math.random() * Math.pow(2, 20) * p);
//			   }
//			   Character[] tmp2 = new Character[arr2.length];
//			   Shuffle.shuffle(arr2, 0, arr2.length - 1);
//			   Timer timer2 = new Timer();
//			   timer2.start();
//			   MergeSort.mergeSort(arr2, tmp2);
//			   timer2.end();
//			   System.out.println("MergeSort General type: Character " + p + "M: " + timer2.toString());
//		   }
		   
//		   for(int p = 1; p <= 16 ; p++) {
//			   //MergeSort int type
//			   int[] arr3 = new int[(int) Math.pow(2, 20) * p];
//			   for(int i = 0; i < arr3.length; i++) {
//				   arr3[i] = (int) (Math.random() * Math.pow(2, 20) * p);
//			   }
//			   int[] tmp3 = new int[arr3.length];
//			   Timer timer3 = new Timer();
//			   timer3.start();
//			   MergeSort.mergeSort(arr3, tmp3);
//			   timer3.end();
//			   System.out.println("MergeSort int type " + p + "M: " + timer3.toString());
//		   }
		   
//		   for(int p = 1; p <= 16 ; p++) {
//			   //InsertionSort General type: Character
//			   Character[] arr5 = new Character[(int) Math.pow(2, 20) * p];
//			   for(int i = 0; i < arr5.length; i++) {
//				   arr5[i] = (char) (Math.random() * Math.pow(2, 20) * p);
//			   }
//			   Character[] tmp5 = new Character[arr5.length];
//			   Shuffle.shuffle(arr5, 0, arr5.length - 1);
//			   Timer timer5 = new Timer();
//			   timer5.start();
//			   MergeSort.nSquareSort(arr5);
//			   timer5.end();
//			   System.out.println("InsertionSort General type: Character " + p + "M: " + timer5.toString());
//		   }
//		   
		   for(int p = 1; p <= 16 ; p++) {
			   
			   //InsertionSort General type: Integer
			   Integer[] arr6 = new Integer[(int) Math.pow(2, 20) * p];
			   for(int i = 0; i < arr6.length; i++) {
				   arr6[i] = (int) (Math.random() * Math.pow(2, 20) * p);
			   }
			   Integer[] tmp6 = new Integer[arr6.length];
			   Shuffle.shuffle(arr6, 0, arr6.length - 1);
			   Timer timer6 = new Timer();
			   timer6.start();
			   MergeSort.nSquareSort(arr6);
			   timer6.end();
			   System.out.println("MergeSort General type: Integer " + p + "M: " + timer6.toString());
		   }
		   
	   }
		   
		   
		   

//		   

		   

//		   
		   
			   

			   
		   
			   

//		   

		   

//		   

	   
	
}
