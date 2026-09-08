package Session05;

import java.util.Random;

public class LottaryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_LOTTARY_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateTicketNumbers();
        printTicketNumbers(ticket);
    }

    public static int[] generateTicketNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = random.nextInt(MAX_LOTTARY_NUMBER) + 1;
        }
        return ticket;
    }

    public static void printTicketNumbers(int[] ticket) {
//        for (int i=0;i<ticket.length;i++){
//            System.out.println(ticket[i]);
//        }
        for (int number : ticket) {
            System.out.print(number + " | ");
        }
    }
}