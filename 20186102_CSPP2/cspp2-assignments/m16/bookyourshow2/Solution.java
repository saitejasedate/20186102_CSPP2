import java.util.*;
class Show {
	private String moviename;
	private String datetime;
	String[] seats;
	Show(String moviename, String datetime, String[] seats) {
		this.moviename = moviename;
		this.datetime =  datetime;
		this.seats = seats;
	}
	public String getmoviename() {
		return moviename;
	}
	public void setmoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getdatetime() {
		return datetime;
	}
	public void setdatetime(String datetime) {
		this.datetime = datetime;
	}
	public String[] getseats() {
		return seats;
	}
}
class Patron {
	private String username;
	private String mobilenum;
	Patron(String username, String mobilenum) {
		this.username = username;
		this.mobilenum = mobilenum;
	}
	public String getusername() {
		return username;
	}
	public void setusername() {
		this.username = username;
	}
	public String getmobilenum() {
		return mobilenum;
	}
	public void setmobilenum() {
		this.mobilenum = mobilenum;
	}
}

class BookYourShow {
	Show[] movielist = new Show[10];
	int movielistsize = 0;
	Patron[] patronlist = new Patron[10];
	int patronsize = 0;
	void addAShow(Show k) {
		movielist[movielistsize++] = k;
	}
	Show getAShow(String moviename, String datetime) {
		for (int i = 0; i < movielistsize; i++) {
			if (movielist[i].getmoviename().equals(moviename)) {
				if (movielist[i].getdatetime().equals(datetime)) {
					return movielist[i];
				}
			}
		}
		return null;
	}
	void bookAShow(String moviename, String datetime, Patron p, String[] seats) {
		int count = 0;
		if (getAShow(moviename, datetime) != null) {
			String[] avail = getAShow(moviename, datetime).getseats();
			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < avail.length; j++) {
					if (seats[i].equals(avail[j])) {
						avail[j] = "N/A";
						count++;
					}
				}
			}
			if (count > 0) {
				patronlist[patronsize++] = p;
			}
		}
	}

	boolean printTicket(String moviename, String datetime, String mobilenum) {
		for (int i = 0; i < patronlist.length; i++) {
			if (patronlist[i].getmobilenum().equals(mobilenum)) {
				if (getAShow(moviename, datetime) != null) {
					System.out.println(mobilenum + " " + moviename + " " + datetime);
					return true;
				}
			}
		}
		return false;
	}
	void showAll() {
		if (movielist.length > 0) {
			for (int i = 0; i < movielist.length; i++) {
				String str = "";
				str += movielist[i].getmoviename() + ",";
				str += movielist[i].getdatetime() + ",";
				String[] avail = movielist[i].getseats();
				str += "[";
				for (int j = 0; j < avail.length - 1; j++) {
					str = avail[j] + ",";
				}
				str += avail[avail.length - 1] + "]";
				System.out.println(str);
			}
		}
	}
}
/**
 * { item_description }.
 */
public final class Solution {
	/**
	 * main method to drive program.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		BookYourShow bys = new BookYourShow();
		Scanner scan = new Scanner(System.in);
		int testCases = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < testCases; i++) {
			String[] tokens = scan.nextLine().
			                  replace("[", "").replace("]", "").split(",");
			String[] check = tokens[0].split(" ");
			switch (check[0]) {
			case "add":
				int k = 2;
				String[] seats = new String[tokens.length - 2];
				for (int j = 0; j < seats.length; j++) {
					seats[j] = tokens[k++];
				}
				bys.addAShow(new Show(check[1], tokens[1], seats));
				break;

			case "book":
				k = 2 + 2;
				seats = new String[tokens.length - 2 - 2];
				for (int j = 0; j < seats.length; j++) {
					seats[j] = tokens[k++];
				}
				bys.bookAShow(check[1], tokens[1],
				              new Patron(tokens[2], tokens[2 + 1]), seats);
				break;

			case "get":
				Show show = bys.getAShow(check[1], tokens[1]);
				if (show != null) {
					System.out.println(check[1] + "," + tokens[1]);
				} else {
					System.out.println("No show");
				}
				break;

			case "print":
				if (bys.printTicket(check[1], tokens[1], tokens[2])) {
					break;
				} else {
					System.out.println("Invalid");
				}
				break;

			case "showAll":
				bys.showAll();
				break;

			default:
				break;
			}
		}
	}
}
