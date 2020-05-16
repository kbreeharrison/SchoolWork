import java.util.ArrayList;

public abstract class PhotoContainer {

	protected String name;
	protected ArrayList<Photo> photos;
	
	public PhotoContainer( String name, ArrayList<Photo> photos ) {
		this.name = name;
		this.photos = photos;
	}
	
	public static void main( String[] args) {
		
	}
	
	//getName
	public String getName() {
		return name;
	}
	
	//setName
	public void setName(String name) {
		this.name = name;
	}
	
	//getPhotos 
	//ArrayList<Photo>
	public ArrayList<Photo> getPhotos(){
		ArrayList<Photo> newPhotos = new ArrayList<Photo>();
		for ( Photo i : this.photos)
			newPhotos.add(i);
		return newPhotos;
	}
	
	//addPhoto
	public boolean addPhoto( Photo p )
	{
		if ( this.photos.contains(p) == true)
			return false;
		else if ( p == null)
			return false;
		else
		{
			this.photos.add(p);
			return true;
		}
	}
	
	//hasPhoto
	public boolean hasPhoto( Photo p)
	{
		if ( this.photos.contains(p))
			return true;
		else
			return false;
	}
	
	//revised removedPhoto
	public boolean removePhoto( Photo p )
	{
		if ( this.photos.contains(p) == true)
		{
			this.photos.remove(p);
			return true;
		}
		else
			return false;
	}
	 
	//numPhotos
	public int numPhotos()
	{
		return photos.size();
	}

	//equalsMethod
	public boolean equals( Object o)
	{
		if (  o instanceof PhotoContainer )
		{
			PhotoContainer object = (PhotoContainer) o;
			if(  object.getName() == this.getName())
				return true;
			else
				return false;
		}
		else 
			return false; 
	}
	
	//toStringMethod
	public String toString()
	{
		return "The photo container is " + this.getName() + " and it has these photos: " + this.getPhotos();
	}

	//hashCode
	public int hashCode()
	{
		return this.name.hashCode();
	}

	//getPhotos by rating
	public ArrayList<Photo> getPhotos( int rating)
	{
		ArrayList<Photo> equalRating = new ArrayList<Photo>();
		
		for ( Photo p : photos)
		{
				if(  p.getRating() >= rating)
					equalRating.add(p);
		}
		return equalRating;	 
	}
	
	//getPhotosInYear
	public ArrayList<Photo> getPhotosInYear( int year)
	{
		ArrayList<Photo> equalsYear = new ArrayList<Photo>();
		for ( Photo p : this.photos)
			if (  DateLibrary.getYear( p.getDateTaken() ) == year )
				equalsYear.add(p);
		return equalsYear;
	}
	
	//getPhotosInMonth
	public ArrayList<Photo> getPhotosInMonth( int month, int year)
	{
		ArrayList<Photo> equalsMonthYear = new ArrayList<Photo>();
		for ( Photo p : this.photos)
		{
			if ( DateLibrary.isValidDate(p.getDateTaken()))
				{
				if ( DateLibrary.getMonth( p.getDateTaken() ) == month  && DateLibrary.getYear( p.getDateTaken() ) == year )
					equalsMonthYear.add(p);
				}
			else
				return null;
		}
		return equalsMonthYear;
	}

	//getPhotosBetween certain dates
	public ArrayList<Photo> getPhotosBetween( String beginDate, String endDate )
	{
		ArrayList<Photo> betweenDates = new ArrayList<Photo>();
		if ( DateLibrary.isValidDate( beginDate) == true & DateLibrary.isValidDate( endDate ) == true)
		{
			for ( Photo p : this.photos)
			{
				if( DateLibrary.compare(beginDate, p.getDateTaken() ) == -1 &&  DateLibrary.compare( p.getDateTaken(), endDate) == -1)
					betweenDates.add(p);
			}
			return betweenDates;
		}
		else
			return null;
			
	}

	

}
