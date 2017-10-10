
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gm = new GumballMachine(5);
		
		System.out.println (gm);
		
		System.out.println("\n ----------------- \n");
		
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println (gm);
		System.out.println("\n ----------------- \n");
		
		
		gm.insertQuarter();
		gm.ejectQuarter();
		gm.turnCrank();
		System.out.println(gm);
		System.out.println("\n ----------------- \n");
		
		gm.insertQuarter();
		gm.turnCrank();
		gm.insertQuarter();
		gm.turnCrank();
		gm.ejectQuarter();
		System.out.println (gm);
		System.out.println("\n ----------------- \n");
		
		gm.insertQuarter();
		gm.insertQuarter();
		gm.turnCrank();
		gm.insertQuarter();
		gm.turnCrank();
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println (gm);
		System.out.println("\n ----------------- \n");
		
		
	}

}
