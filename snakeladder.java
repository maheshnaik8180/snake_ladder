public class snakeladder {
	
	
	static final int NoPlay = 0;
	static final int Ladder = 1;
	static final int Snake = 2;
	static int Sum = 0;

	
	public static void main(String[] args) {
	int die;
	
	while (Sum < 100)	{
	//using random function
	die=(int)(Math.random()*6) + 1;

		System.out.println("start position is zero");
		System.out.println("The Player rolls the die no is "+die);
	
		int opt = (int) Math.floor(Math.random() * 10) % 3;

		if (opt == Ladder) {
			Sum = Sum + die;
			System.out.println("Ladder");
}
		else if (opt == Snake) {
			
			if (Sum > 0 && (Sum - die) >=0){
			Sum = Sum - die;
			System.out.println("Snake");
	}
}
else {
			System.out.println("No play");

}

}


}

}
