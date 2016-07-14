
class Ordering{
    public int checkOrdering(int a[]){
        int count1=0,count2=0; 
        
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1])    // condition for ascending
            {
                count1++;
            }
            else{				// condition for descending
                count2++;
            }
        }
        if(count1==a.length-1){  
            return 1;
        }
        else if(count2==a.length-1){
        return 2;
    }
        else{
                return 0;
                }
        
    }
}
public class CheckingArrayOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= new Ordering().checkOrdering(new int[]{4,3,2,1});
	       System.out.println(i);
	}
	
}
