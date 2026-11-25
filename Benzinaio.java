import java.util.Scanner;

public class Benzinaio {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);  //creo un oggetto di tipo scanner coleggato al system.in(la tastiera)

		System.out.printf("Inserisci il prezzo al litro (es. 1.85): ");
		double prezzoLitro = scanner.nextDouble();

		System.out.printf("Quanti euro vuoi inserire?");
		double euroInseriti = scanner.nextDouble();

		if (prezzoLitro <= 0 || euroInseriti <= 0) {  //controllo se e minore o uguale a 0 il prezzo a litro o se gli euro inseriti
			System.out.printf("Valori non validi: servono numeri maggiori di zero.");
			}else {
				double litri = euroInseriti / prezzoLitro;
				System.out.printf("Erogati %.2f litri per %.2f euro.%n", litri, euroInseriti);  //%.2f indico di stampare a schermo il numero decimale invece %n ritorna a capo
			}

			scanner.close();  //chiudo lo scanner
		}
	}
