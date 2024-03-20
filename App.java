package week05assignment;

public class App {
	
	public static void main(String[] args) {
		
		Logger logger =  new AsteriskLogger();
		logger.log("Timmy");
		logger.error("potato");
		
		Logger logger2 =  new SpacedLogger();
		logger2.error("Yessir");
		logger2.log("progress");

}
}