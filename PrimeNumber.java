

class PrimeNumber{

	public static void main(String [] args){

		int anyNum = 4;
		int count = 0;

		for(int i=1;i<=anyNum;i++){

			if(anyNum % i == 0){

				count++;

			}
		}

		if(count == 2){

			System.out.println("Number is a prime number : "+ anyNum);
		}else{

			System.out.println("Number is not Prime Number : "+ anyNum);
		}
	}	

}
