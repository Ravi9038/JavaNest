

class PrimeNumber2ndLogic{

	public static void main(String [] args){

		int anyNum = 37;
		int count = 0;

		for(int i=2;i<anyNum;i++){

			if(anyNum % i == 0){

				count++;
				break;

			}
		}

		if(count == 0){

			System.out.println("Number is a prime number : "+ anyNum);
		}else{

			System.out.println("Number is not Prime Number : "+ anyNum);
		}
	}	

}
