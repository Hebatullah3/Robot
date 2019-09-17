class YellowRobot extends Robot {

    YellowRobot(String name, String eyesColor, int weight) {
        super(name, eyesColor, weight);
        //  this.color = "yellow";
    }

    int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int calculate(int num1, int num2) {
        return sum(num1, num2);
    }

}

