import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPurchaseList {
	
	public static void main (String[] args) throws FileNotFoundException {
		
		double totalPrice = 0;
		
		ArrayList<BookStoreItem> list = new ArrayList<BookStoreItem>();
		
		Scanner in = new Scanner(new File("order.txt"));
		
		while (in.hasNextLine()) {
			
			String s2 = in.nextLine();
			String item[] = s2.split(" / ");
						
			if (item[0].equals("Book")) {
				
				String title = item[1];
				String author = item[2];
				double price = Double.valueOf(item[3]);
				
				
				BookStoreItem book = new Book(title, price, author);
				
				if (list.contains(book)) {
					list.get(list.indexOf(book)).increaseInventory();			
				}else {
					list.add(book);
					list.get(list.indexOf(book)).increaseInventory();
				}
			}
			else if(item[0].equals("Magazine")) {
				
				String title = item[1];
				String date = item[2];
				double price = Double.valueOf(item[3]);
				
				BookStoreItem magazine = new Magazine(title, price, date);
				
				if (list.contains(magazine)) {
					list.get(list.indexOf(magazine)).increaseInventory();
				}else {
					list.add(magazine);
					list.get(list.indexOf(magazine)).increaseInventory();
				}
			}
			else if(item[0].equals("Movie")) {
				
				String title = item[1];
				String year = item[2];
				double price = Double.valueOf(item[3]);
				
				BookStoreItem movie = new Movie(title, price, year);
				
				if (list.contains(movie)) {
					list.get(list.indexOf(movie)).increaseInventory();
				} else {
					list.add(movie);
					list.get(list.indexOf(movie)).increaseInventory();
				}
			}
		
		
		}

		for (BookStoreItem b : list) {
			System.out.print(b.getClass() + ": ");
			System.out.print(b + " ");
			System.out.print("Total: " + b.getInventory() + "\n");
			totalPrice = totalPrice + (b.getPrice() * b.inventory);
			
		}
		System.out.println("Total: $" + totalPrice);	
	}
}
