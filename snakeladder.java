public class snakeladder {
	
	
	static final int NoPlay = 0;
	static final int Ladder = 1;
	static final int Snake = 2;
	static int Sum1 = 0;
	static int Sum2 = 0;
	static int c = 0;
	
	public static void main(String[] args) {
	 boolean Player1 = true;
	
	
	while (Sum1 < 100 && Sum2 < 100)	{
	int current_sum = Player1 ? Sum1 :Sum2 ;	

		int die;
//using random function
	die=(int)(Math.random()*6) + 1;

		//System.out.println("start position is zero");
		System.out.println("Turn: " +( Player1 ? "Player 1" : "Player 2"));
		System.out.println("The Player rolls the die no is "+die);
	
		int opt = (int) Math.floor(Math.random() * 10) % 3;

		if (opt == Ladder) {
			if (current_sum <= 100 && (current_sum + die <= 100))
			current_sum = current_sum + die;
			System.out.println("Ladder");
}
		else if (opt == Snake) {
			
			if (current_sum > 0 && (current_sum - die) >=0){
			current_sum = current_sum - die;
			System.out.println("Snake");
	}
}
else {
			System.out.println("No play");

}
			System.out.println("position:" + current_sum);
			c++;
			
			 if (Player1 )
                        Sum1 = current_sum;
                else
                        Sum2 = current_sum;


			if (opt != Ladder)
				Player1 = !Player1;

			System.out.println("number of times, the dice was played is "+ c+".");
			System.out.println(Sum1>=100? "player 1 won" : "player 2 Won");
}


}

}
