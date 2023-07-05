/*
You are developing a ticket reservation system for a popular concert. The system allows multiple users to simultaneously 
reserve tickets for the concert. However, a problem arises when two or more users try to reserve the same ticket at the 
same time, leading to incorrect ticket availability and potential overselling. Your task is to assess the problem and propose 
a solution using Java's thread modifiers

How would you assess the problem of concurrent ticket reservations and propose a solution using thread modifiers in Java? 


code:
*/
//Author: Mahady Hasan Fahim:

import java.util.concurrent.atomic.AtomicInteger;

class TicketReservationSystem {
    private AtomicInteger availableTickets;

    public TicketReservationSystem(int totalTickets) {
        availableTickets = new AtomicInteger(totalTickets);
    }

    public synchronized boolean reserveTicket(int numTickets) {
        if (numTickets <= availableTickets.get()) {
            // Simulating a delay in processing the reservation
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            availableTickets.addAndGet(-numTickets);
            return true;
        }
        return false;
    }

    public int getAvailableTickets() {
        return availableTickets.get();
    }
}

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem reservationSystem = new TicketReservationSystem(100);

        // Create multiple threads to reserve tickets
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                boolean reserved = reservationSystem.reserveTicket(5);
                if (reserved) {
                    System.out.println("Tickets reserved successfully.");
                } else {
                    System.out.println("No tickets available.");
                }
            });
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the final available ticket count
        System.out.println("Available tickets: " + reservationSystem.getAvailableTickets());
    }
}

