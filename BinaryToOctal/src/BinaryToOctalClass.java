
public class BinaryToOctalClass {
	
	public int convertBinaryToOctal(int num)
	{
		int decimal=0, power=0, rem=0, octal=0;
		int	i=1;
		//Conversion of Binary to Decimal
		while(true)
		{
			if(num==0)
			{
				break;
			}
			else
			{
				int temp=num%10;
				decimal+= temp*Math.pow(2,power);
				num=num/10;
				power++;
			}
		}
		//Conversion of Decimal to Octal
		while(decimal!=0)
		{
			rem=decimal%8;
			decimal/=8;
			octal+=(rem*i);
			i*=10;
		}
		return octal;
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryToOctalClass ob = new  BinaryToOctalClass();
		 ob.convertBinaryToOctal(110101);
		}

}
