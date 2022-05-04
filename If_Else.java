package controlStatements;

public class If_Else {

	public static void main(String[] args) {
		
		int score_Out_Of_100 ;
		
		score_Out_Of_100 = 101 ;   
		
	 /* if <=20 .... poor   
		if >20 & <40..... average
		if >40 & <80 ......Good
		if >80 & <=100.......Best
		if  >100 .......invalid    */
		
		
		if (score_Out_Of_100 >= 0  && score_Out_Of_100 <=20)          
		{
			System.out.println("Poor Performance");
		}  
		else if (score_Out_Of_100 > 20 && score_Out_Of_100 <=40)
		{
			System.out.println("Average Performance");
		}
		else if (score_Out_Of_100 > 40 && score_Out_Of_100 <=80)
		{
			System.out.println("Good Performance");
		}
		else if (score_Out_Of_100 > 80 && score_Out_Of_100 <=100)
		{
			System.out.println("Best Performance");
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
