package bai_tap.case_study.controllers;

import bai_tap.case_study.services.BookingService.BookingServiceImpl;
import bai_tap.case_study.services.BookingService.IBookingService;

import java.util.Scanner;

public class BookingManagementController {
    public void bookingManagement() {
        IBookingService iBookingService = new BookingServiceImpl();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---- Booking Management ----\n" +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tReturn main menu\n" +
                    "-----------------------------\n" +
                    "Enter you choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMainMenu();
                    break;
                default:
                    System.out.println("You choose wrong. Please choose again");
            }
        } while (true);
    }
}
