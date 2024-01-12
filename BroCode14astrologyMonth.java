import java.util.Scanner;

public class BroCode14astrologyMonth {
    static int Choice;
    public static void main(String[] args) {
        userInfo();
        astrologyMonth();
    }
    public static void userInfo() {
        System.out.println("""
                Which month were you born?
                1.)March 21–April 19
                2.)April 20–May 20
                3.)May 21–June 21
                4.)June 22–July 22
                5.)July 23–August 22.
                6.)August 23–September 22.
                7.)October 24–November 21.
                8.)November 22–December 21
                9.)December 22–January 19
                10.)January 20–February 18
                11.)February 19–March 20""");
        Scanner month = new Scanner(System.in);
        Choice = month.nextInt();
    }

    public static void astrologyMonth() {

        switch (Choice) {
            case 1:
                System.out.println("""
                        You were born between the months of March 21–April 19.
                        Which means, your star-sign is Aries.
                        Your star animal is Ram!.""");
                break;
            case 2:
                System.out.println("""
                        You were born between the months of April 20–May 20.
                        Which means, your star-sign is Taurus.
                        Your star animal is Bull!.""");
                break;
            case 3:
                System.out.println("""
                        You were born between the months of May 21–June 21.
                        Which means, your star-sign is Gemini.
                        Your star animal is Twins!.""");
                break;
            case 4:
                System.out.println("""
                        You were born between the months of June 22–July 22.
                        Which means, your star-sign is Cancer.
                        Your star animal is Crab!.""");
                break;
            case 5:
                System.out.println("""
                        You were born between the months of July 23–August 22.
                        Which means, your star-sign is Leo.
                        Your star animal is Lion!.""");
                break;
            case 6:
                System.out.println("""
                        You were born between the months of August 23–September 22.
                        Which means, your star-sign is Virgo.
                        Your star animal is Virgin!.""");
                break;
            case 7:
                System.out.println("""
                        You were born between the months of October 24–November 21.
                        Which means, your star-sign is Scorpio.
                        Your star animal is Scorpion!.""");
                break;
            case 8:
                System.out.println("""
                        You were born between the months of November 22–December 21.
                        Which means, your star-sign is Sagittarius.
                        Your star animal is Archer!.""");
                break;
            case 9:
                System.out.println("""
                        You were born between the months of December 22–January 19.
                        Which means, your star-sign is Capricorn.
                        Your star animal is Goat!.""");
                break;
            case 10:
                System.out.println("""
                        You were born between the months of January 20–February 18.
                        Which means, your star-sign is Aquarius.
                        Your star animal is Water Bearer!.""");
                break;
            case 11:
                System.out.println("""
                        You were born between the months of February 19–March 20.
                        Which means, your star-sign is Pisces.
                        Your star animal is Fish!.""");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 11.");
        }
    }
}
