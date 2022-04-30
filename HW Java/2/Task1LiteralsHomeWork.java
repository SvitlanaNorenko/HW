public class Task1LiteralsHomeWork {

    public static void main(String[] args) {
        // declare a variable with year of favourite movie via decimal, octal, hexa-decimal and binary representation
        int yearOfFavouriteMovieDemicalValue = 2009;
        int yearOfFavouriteMovieOctalValue = 03731; // 3*8^3+7*8^2+3*8^1+1*8^=1536+448+24+1=2009
        int yearOfFavouriteMovieHexValue = 07d9; // 7*16^2+13*16^1+9*16^0=1792+208+9=2009
        int yearOfFavouriteMovieBinaryValue = 11111011001; // 1*2^10+1*2^9+1*2^8+1*2^7+1*2^7+1*2^6+1*0^5+1*2^4....=2009
        // <add your code here>
        // print them all via System.out.println - each number in each line - they have to be the same
        System.out.println("2009" + 2009);
        System.out.println("03731" + 3*8^3+7*8^2+3*8^1+1*8^=1536+448+24+1=2009);
        System.out.println("07d9" + 7*16^2+13*16^1+9*16^0=1792+208+9=2009);
        System.out.println("11111011001" + 1*2^10+1*2^9+1*2^8+1*2^7+1*2^7+1*2^6+1*0^5+1*2^4+1*2^3+0*2^2+0*2^1+1*2^0);

        // Print maximum positive and minimum negative values that can be stored
        // in an int variable via binary representation and print them out. Compare it with values in
        // https://www.w3schools.com/java/java_data_types.asp
        int maxValue = 1111111111111111111111111111111;
        int minValue = -10000000000000000000000000000000;


    }
}
