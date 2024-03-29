public class Main {

    public static void main(String[] args) {
        Robot robotBot = new Robot("Bot", "blue", "black", 8);
        // Robot robotRob = new Robot("Rob", "Yellow", "green", 10);
        //Robot tedRobot = new Robot("Renato", "brown");
        // Robot renatoRobot = new Robot();
        //Robot robotBlue = new Robot("Blue");
        // Robot robotYellow = new Robot("Yellow", "Green");

        // Robot[] robots = new Robot[]{robotBlue, robotBot, robotRob, tedRobot, renatoRobot, robotYellow};

        //yellow.introduce();

        //int Sum = yellow.Sum(5, 5);
        //System.out.println("the summation is :" + Sum);

        //   blue.introduce();
        //  int multiply = blue.multiply(5, 5);

        //   System.out.println("the multiplication is : "+ multiply);


        // purple.introduce();

        //  int power =purple.pow (8);
        // System.out.println("the power is : "+ power);

        PurpleRobot purple = new PurpleRobot("Purple", "yellow", 10);
        BlueRobot blue = new BlueRobot("Blue", "yellow", 10);
        YellowRobot yellow = new YellowRobot("Yellow", "yellow", 10);
        RedRobot red = new RedRobot("Red", "red", 20);
        BlackRobot black = new BlackRobot("Black", "Black", 30);


        HelperRobot helper = new HelperRobot(6, 2);
        helper.calculateOperation(yellow);
        helper.calculateOperation(purple);
        helper.calculateOperation(blue);
        helper.calculateOperation(red);
        helper.calculateOperation(black);

        yellow.fly(5);
        black.fly(4);
        blue.swim(6);
        purple.run(3);


        //  blue.ChangeColor("Brown");

//        // only yellow ones introduce themselves!
//        for (Robot r : robots) {
//            if ("yellow".equalsIgnoreCase(r.color)) {
//                r.introduce();
//            }
//        }
//
//        robotRob.introduce();
//        robotBot.introduce();
//        renatoRobot.introduce();
//        tedRobot.introduce();
//
//        Robot weirdRobot = new Robot("Brown", "Renato");

        // Exercise 1 - Basic Inheritance
        // 1.1 - Create a new constructor in Robot Class with String name, String eyesColor, int weight as parameters
        // 1.2 - Create a new Class called YellowRobot that:
        // 1.2.1 - is a subclass of Robot (extends Robot)
        // 1.2.1 - Have the color equals to Yellow
        // 1.2.3 - Have a new behaviour/method that sums 2 Integers returning an Integer
        // 1.2.4 - Use this class in main, calls introduce, calls sum method and print the result


        //if I run this line
        //Robot newYellow2 = new YellowRobot("Marcelio", "green", 800 );
        //Does it work?

        // Exercise 2
        // 1.1 - Let's create another subclass of Robot called BlueRobot
        // 1.2 - The BlueRobots must be always Blue
        // 1.3 - Have a new behaviour/method that multiply 2 Integers returning an Integer
        // 1.4 - We need to change the accessibility of the color property, it must be only changed inside the super class.
        // 1.4.1 - Create a method in Robot called changeColor, to enable to change color in the sub classes. (change the constructor in subclasses)
        // 1.5 - Now the method introduce for BlueRobots should return the following output:
        // "Hey, I am a BlueRobot! I know how to multiply integers." +
        // "Hello! My name is (name), I am (color), I have (eyes color) and I weight (weight) kilograms"
        // 1.6 - Use this class in main, calls introduce, calls multiply method and print the result

        // Exercise 3 - Overriding, hierarquical inheritance
        // 1.1 - Let's create another class called PurpleRobot, but now, the superclass is BlueRobot
        // 1.2 - The PurpleRobots must be always Purple
        // 1.3 - Have a new behaviour/method that calculate a number raise to the power of 2. (Give the name Pow) - Integer as parameter and return.
        // 1.4 - Try to reuse the method multiply from BlueRobot.
        // 1.5 - Now the method introduce for PurpleRobots should return the following output:
        // "Hey, I am a PurpleRobot! My parent class is BlueRobot."
        // "Hello! My name is (name), I am (color), I have (eyes color) and I weight (weight) kilograms"
        // 1.6 - Use this class in main, calls introduce, calls pow method and print the result

        // Exercise 4 - Polymorphism
        // 1.1 - Now it's time to create a method calculate in all Robots
        // 1.1.1 - This method must run the specific ability that the robots do. Like Yellow Robot sum, Blue multiply, etc.
        // 1.1.2 - In the case of Purple Robot, we must create a new method pow, with two Integer parameters, and call Math.pow
        // 1.1.3 - the return of the calculate method must be an Integer. Cast the result from Math.pow. Add (int) before the method call.
        // 1.1.4 - Now it's time to create a new class - RobotHelper - this class has two properties Integer a and b
        // 1.1.5 - You cannot change the properties out of this class
        // 1.1.5 - This class helps the Robots to calculate,
        // it has a method that get any Robot as parameter (Robot, BlueRobot, YellowRobot, PurpleRobot)
        // and return the result of calculate from them using the properties.
        // 1.2 - Use this class in main, print the result passing each Robot you have created
        // Integer result = helper.calculateOperation(newYellow);
        // System.out.println("The Result is: " + result);


    }
}
