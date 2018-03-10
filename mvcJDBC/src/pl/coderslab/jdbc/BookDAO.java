package pl.coderslab.jdbc;

import java.sql.*;
import java.util.ArrayList;

public class BookDAO {
	private final static String CONNECTION_STRING = "jdbc:mysql://localhost:3306/Books?useSSL=false";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "coderslab";

	
	public static boolean addBook(String author, String title, String isbn) { 

		
		
		try(Connection con = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD)) { 
			Class.forName("com.mysql.jdbc.Driver"); 
			PreparedStatement statement = con.prepareStatement("insert into Books (Title, Author, Isbn) values (?, ?, ?);");
			statement.setString(1, title);
			statement.setString(2,  author);
			statement.setString(3,  isbn);		
			statement.executeUpdate(); 
			System.out.println("Udało się");
			
		} catch (Exception e) { 
			
			System.out.println("Exception thrown!");
			e.printStackTrace(); 
			return false;
		}
		
		
		return true; 
		
	}
	
/*=================================================================================================
 * ================================================================================================	
 */
	
	
	public static boolean deleteBook(String id)  { 

		
		
		try(Connection con = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD)) { 
			Class.forName("com.mysql.jdbc.Driver"); 
			PreparedStatement statement = con.prepareStatement("DELETE FROM Books WHERE id = ?");
			statement.setString(1, id);
			statement.executeUpdate(); 
			System.out.println("Udało się");
			
		} catch (Exception e) { 
			
			System.out.println("Exception thrown!");
			e.printStackTrace(); 
			return false;
		}
		
		
		return true; 
		
	}
/*=================================================================================================
 * ================================================================================================*/
	
	public static ArrayList<Book> retrieveAllBooks() throws ClassNotFoundException { 
		Class.forName("com.mysql.jdbc.Driver"); 
		try(Connection con = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD)) { 
			
			Statement stat = con.createStatement(); 
			ResultSet result = stat.executeQuery("Select * from Books;");
			ArrayList<Book> books = new ArrayList<Book>();
			
			while(result.next()) {
				
				Book bookItem = new Book(result.getString("id"), result.getString("Title"), result.getString("Author"),result.getString("Isbn"));
				books.add(bookItem); 
			}
			
			return books; 
			
			
		} catch (Exception e) { 
			
			System.out.println("Exception thrown!");
			e.printStackTrace(); 
			return null;
		}
		
		

		
	}
	
	
	public static Book retrieveSpecificBook(String id) throws ClassNotFoundException { 
		Class.forName("com.mysql.jdbc.Driver"); 
		try(Connection con = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD)) { 
					
			PreparedStatement statement = con.prepareStatement("Select * from Books where id = ?");
			statement.setString(1, id);
			ResultSet result = statement.executeQuery();
			if (result.next()) { 
				Book bookItem = new Book(result.getString("id"), result.getString("Title"), result.getString("Author"),result.getString("Isbn"));
				return bookItem; 
			}
			
			return null;
			
			
		} catch (Exception e) { 
			
			System.out.println("Exception thrown!");
			e.printStackTrace(); 
			return null;
		}
		
		

		
	}
	
	
	public static boolean updateSpecificBook(Book book) throws ClassNotFoundException { 
		Class.forName("com.mysql.jdbc.Driver"); 
		try(Connection con = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD)) { 
			
			PreparedStatement statement = con.prepareStatement("UPDATE Books SET title = ?, author = ?, isbn = ? WHERE id = ?;");
			statement.setString(1, book.getTitle());
			statement.setString(2, book.getAuthor());
			statement.setString(3, book.getIsbn());
			statement.setString(4, book.getId());
			statement.executeUpdate();
		
			return true;
			
		} catch (Exception e) { 
			
			System.out.println("Exception thrown!");
			e.printStackTrace(); 
			return false;
		}
		
		

		
	}
	
	
}
