public class BasicPartI {
//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
    public static void Hello(){
        System.out.println("Hello\nDimitri Antoniou");
    }
//2. Write a Java program to print the sum of two numbers.
    public static void Sum(int a, int b){
        System.out.println(a+" plus "+b+" equals "+(a+b));
    }
//3. Write a Java program to divide two numbers and print on the screen.
    public static void Divide(int a, int b){
        System.out.println(a+" divided by "+b+" equals "+(a/b));
    }
//4. Write a Java program to print the result of the following operations.
    //a. -5 + 8 * 6
    //b. (55+9) % 9
    //c. 20 + -3*5 / 8
    //d. 5 + 15 / 3 * 2 - 8 % 3
    public static void Solve(){
        System.out.println("-5+8*6="+(-5+(8*6)));
        System.out.println("(55+9)%9="+(55+9)%9);
        System.out.println("20+-3*5/8="+(20+(-3*5/8)));
        System.out.println("5+15/3*2-8%3="+(5+(15/3*2)-(8%3)));
    }
//5. Write a Java program that takes two numbers as input and display the product of two numbers.
    public static void Multiply(int a, int b){
        System.out.println(a+"*"+b+"="+a*b);
    }
//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    public static void MathOperations(int a, int b){
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"/"+b+"="+(a/b));
        System.out.println(a+"%"+b+"="+(a%b));
    }
//7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
    public static void MultiplicationTable(int a){
        for (int i=1;i<11;i++){
            System.out.println(a*i);
        }
    }
//8. Write a Java program to display the following pattern.
    //   J    a   v     v  a
    //   J   a a   v   v  a a
    //J  J  aaaaa   V V  aaaaa
    // JJ  a     a   V  a     a
    public static void LetterPattern(){
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
//9. Write a Java program to compute the specified expressions and print the output. Go to the editor
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    public static void Compute(){
        System.out.println("((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))="+((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
//10. Write a Java program to compute a specified formula. Go to the editor
//Specified Formula :
//4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//Expected Output
//2.9760461760461765
    public static void Formula(){
        System.out.println("4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))="+4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }

//11. Write a Java program to print the area and perimeter of a circle.
    public static void CircleArea(float r){
        System.out.println("The area of a circle with radius "+r+" is: "+Math.PI*r*r);
    }
//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    public static void average(int a, int b, int c){
        System.out.printf("The average of %d, %d, and %d is "+(a+b+c)/3+"%n",a,b,c);
    }
//13. Write a Java program to print the area and perimeter of a rectangle.
    public static void rectangle(int l, int w){
        System.out.printf("The area of a rectangle with length %d and width %d is "+(l*w)+"%n",l,w);
        System.out.printf("The perimeter of a rectangle with length %d and width %d is " +(2*l+2*w)+"%n",l,w);
    }
//14. Write a Java program to print an American flag on the screen.
    public static void flag(){
        System.out.println("* * * * * * ===================================");
        System.out.println(" * * * * *  ===================================");
        System.out.println("* * * * * * ===================================");
        System.out.println(" * * * * *  ===================================");
        System.out.println("* * * * * * ===================================");
        System.out.println(" * * * * *  ===================================");
        System.out.println("* * * * * * ===================================");
        System.out.println(" * * * * *  ===================================");
        System.out.println("* * * * * * ===================================");
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("===============================================");
    }
//15. Write a Java program to swap two variables.
    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The new variables are "+a+" and "+b);
    }
//16. Write a Java program to print a face.
    public static void face(){
        System.out.println("  +\"\"\"\"\"+ ");
        System.out.println("[ | o o | ]");
        System.out.println("  |  ^  |");
        System.out.println("  | '-' |");
        System.out.println("  +-----+");
    }

    public static void main (String[] args){
        Hello();
        Sum(2,2);
        Divide(10,2);
        Solve();
        Multiply(3,5);
        MathOperations(3,2);
        MultiplicationTable(2);
        LetterPattern();
        Compute();
        Formula();
        CircleArea(2);
        average(2,5,10);
        rectangle(2,4);
        flag();
        swap(2,4);
        face();

    }
}


