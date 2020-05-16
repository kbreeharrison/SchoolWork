/***
 * 
 * @author kyndalharrison
 *
 */
public class Photo {


	//fields
	private final String caption;
	private final String filename;
	private int rating;
	private String dateTaken;


	//constructors
	public Photo( String filename , String caption )
	{
		rating = 1;
		this.filename = filename;
		this.caption = caption;
		dateTaken = "1901-01-01";
	}

	//second constructor
	public Photo( String caption, String filename, String dateTaken, int rating )
	{
		this.filename = filename;
		this.caption = caption;
	
		if ( DateLibrary.isValidDateFormat(dateTaken) == false )
				this.dateTaken = "1901-01-01";
		else
			this.dateTaken = dateTaken;

		if ( rating < 1 || rating > 5)
			this.rating = 1;
		else
			this.rating = rating;
	}



	//main method
	public static void main(String[] args) {

	}


	//toString()
	public String toString()
	{
		return ( "The file name is " + this.getFilename() + ", the caption is " + this.getCaption() + ", and the rating is " + this.getRating() + ".");
	}

	//comparable
	public int compareTo( Photo p) {
		if ( this.dateTaken.compareTo(p.dateTaken) == 0 )
			return this.getCaption().compareTo(p.getCaption());
		else
			return this.dateTaken.compareTo(p.dateTaken);
	}
	
	//equals()
	public boolean equals( Object o )
	{
		if ( o == null ) 
			return false;
		if ( o instanceof Photo)
		{
			Photo pict = (Photo) o;
			if ( pict.getCaption( ) == this.getCaption() && pict.getFilename() == this.getFilename() )
				return true;
			else
				return false;
		}
		else
			return false;
	}
	//hashCode
	public int hashCode()
	{ 
		return this.filename.hashCode();
	}

	//getters
	public String getCaption() {
		return caption;
	}

	public String getFilename() {
		return filename;
	}


	public int getRating() {
		return rating;
	}

	public String getDateTaken() {

		return dateTaken;
	}


	//setters
	public boolean setRating(int newRating) 
	{
		if ( this.getRating() < 1 || this.getRating() > 5)
			return false;
		else
			return true;
	}


}
