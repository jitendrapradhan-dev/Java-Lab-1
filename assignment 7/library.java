import java.util.*;
class library{
	String[] booksN = new String[10];
	int[] booksNo = new int [10];
	String[] authorName = new String[10];
	int count = 0;
	
	void addBooks(String name, int no, String aut){
		booksN[count] = name;
		booksNo[count] = no;
		authorName[count] = aut;
		count++;
		
		System.out.println("Book Added Succesfully");
	}
	void removeBooks(int no){
		for(int i = 0; i < count; i++){
			if(booksNo[i] == no){
				for(int j = i; j < count - 1; j++){
					booksN[j] = booksN[j + 1];
					booksNo[j] = booksNo[j + 1];
					authorName[j] = authorName[j + 1];
				}
			count --;
			System.out.println("Book Removed Succesfully");
			return;
			}
		}
	System.out.println("Book Not Found");
	}
	void displayBooks(){
		System.out.println("\nBooks in library : ");

		for(int i = 0; i < count; i++){
			System.out.println("Book Name : " + booksN[i]);
			System.out.println("Book No : " + booksNo[i]);
			System.out.println("Author Name : " + authorName[i]);
			System.out.println();
		}
	}
	public static void main(String args[]){
	   library l = new library();
		l.addBooks("Java", 101, "James Gosling");
		l.addBooks("Python", 102, "Guido Ven Rossum");
		l.addBooks("C", 103, "Dennis Ritchie");

		l.displayBooks();
		l.removeBooks(102);
		l.displayBooks();
		}
}
