public class MixMatch{

    public static void main(String[] args) {
        int number = 10;
        System.out.println(number + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647");

        String name = "manuel";
        System.out.println(name + " <- Strings are an object that contains a sequence of characters");

        char letter = 'a';
        System.out.println(letter + " <- a char is a primative data type that holds a single character");

        short lilnum = 2;
        System.out.println(lilnum + " <- a short is a primitive data type used to store whole numbers (integers) within a specific range.");

        long bignum = 23_345_345;
        System.out.println(bignum + " <- a long is a primitive data type used to store large whole numbers (integers).");

        float float_decimal = 23.4534f;
        System.out.println(float_decimal + " <- a float is primitive data type used to store single-precision 32-bit IEEE 754 floating-point numbers. ");

        double double_decimal = 3.14;
        System.out.println(double_decimal + " <- a double is primitive data type that represents a double-precision 64-bit IEEE 754 floating-point number. ");

        boolean f_or_t = false;
        System.out.println(f_or_t + " <- a boolean is primitive data type that can only hold two possible values: true or false. ");

        System.out.println("---------- practice outputting **multiple variables with a single print method ----------");
        System.out.println("my little  brother is "+lilnum+" and his name is "+name);
        

	}


}