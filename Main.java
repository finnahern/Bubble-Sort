public class Main{
	
	public static void main(String[] args){
		
		int[] numbers = {1, 2, 5, 9, 8};
		
		boolean swapped = false;
		
		for(int i = 0; i < numbers.length - 1; i++){
			
			for(int j = 0; j < numbers.length - 1 - i; j++){
			
				if(numbers[j] > numbers[j + 1]){
				
					int temp = numbers[j];
					numbers [j] = numbers[j + 1];
					numbers[j + 1] = temp;
					swapped = true;
				}
			} 
			
			if(swapped){
				
				break;
			}
		}
		
		printArray(numbers);
	}
	
	public static void printArray(int[] numbers){
		
		for(int i = 0; i < numbers.length; i++){
			
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
	}
}	