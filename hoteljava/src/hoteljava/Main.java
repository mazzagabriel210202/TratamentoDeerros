package hoteljava;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import entities.Reservas;
import exeçao.Exceptions;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		System.out.println("digite as suas informaçoes");
		
		System.out.println("digite aqui o numero do quarto: ");
		int quarto = sc.nextInt();
		
        System.out.println("digite seu cpf aqui: ");
        int cpf = sc.nextInt();
        
        System.out.println("digite a data do checkin");
       Date checkIn = sdf.parse(sc.next());

       System.out.println("digite aqui a data do checkout");
       Date checkOut = sdf.parse(sc.next());
        
       Reservas reservation = new Reservas(quarto, checkIn,checkOut); 
       System.out.println("reservation:" + reservation); 
      
       System.out.println();
		System.out.println("Enter data to update the reservation:");
		System.out.print("Check-in date (dd/MM/yyyy): ");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		checkOut = sdf.parse(sc.next());
		
		reservation.updateDates(checkIn, checkOut);
		System.out.println("Reservation: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch  ( Exception e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
	

		sc.close();
	}

}
