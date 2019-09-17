public class HelperRobot extends Robot {

    private int a;
    private int b;


    HelperRobot(int a, int b) {
        this.a = a;
        this.b = b;

    }

    void setParam(int param1, int param2) {
        this.a = param1;
        this.b = param2;
    }

    void calculateOperation(Robot robot) {

        System.out.println("the result is :" + robot.calculate(this.a, this.b));

    }

}
