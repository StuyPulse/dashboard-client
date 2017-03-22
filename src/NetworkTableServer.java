import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class NetworkTableServer {

	public static void main(String[] args) throws Exception {
		NetworkTable.setServerMode();
		NetworkTable.getTable("");
		
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Server Available");
		while(true){
			Thread.sleep(100L);
		}
	}
}
