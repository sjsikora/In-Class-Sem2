package L2;

public class RobotMain {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.id = "123";

        // Although, r has no to string method, however any class with no parent extends the Object class
        // everything defined in object can be inherinted into the robot

        System.out.println(r.toString());

        // If we tried to do this with spec robot, it would still work because specrobot extends robot which extends Object

        SpecRobot s = new SpecRobot();
        s.id = "456";

        System.out.println(s.toString());



    }
}
