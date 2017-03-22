import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DashboardClient {

	public static void main(String[] args) {
		NetworkTable.setClientMode();
		NetworkTable.setNetworkIdentity("DriverStation");
		NetworkTable.setIPAddress("127.0.0.1");
		NetworkTable.initialize();
		SmartDashboard.putNumber("set value", 0);
		double num = SmartDashboard.getNumber("set value", -1);
		System.out.println(num);
		NetworkTable.getTable("SmartDashboard").putNumber("share value", num);
	}
}
