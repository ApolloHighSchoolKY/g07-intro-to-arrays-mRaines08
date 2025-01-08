
public class IntroToArrays {

    public static void main(String[] args)
    {
    	//Declare an array
		//Create positions 0-7
		//int[] ray = new int[8];
		int[] ray;                       

    	//To decide the size of the array you must initialize
		ray = new int[8];          

		//Place a value in the first position
		ray[0] = 2;

		//Assign more values to the array
		ray[1] = 13;
		ray[2] = 25;

		//Read a value back out
		//prints 13
		System.out.println(ray[1]);

		//Assign values starting at 10 and increasing by 10 to
		//each position in the array
		//
		//nums[0]=10;
		//nums[1]=20;
		//
		//This must be done with a loop
		int val = 10;

		for (int i=0; i<8; i++)
		{
			ray[i] = val;
			val += 10;
		}


		//If you try to print an array, you get the memory address
		System.out.println(ray);


		//To print the contents of an array you must use a loop

		System.out.print("[");

		for (int i=0; i<8; i++)
			System.out.print(ray[i] + " ");

		System.out.println("]");

    }


}