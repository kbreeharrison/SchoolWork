
public class PhotoRatingComparator {

	public PhotoRatingComparator() { 
		// TODO Auto-generated constructor stub
	}
	
	public int compareTo( Photo a, Photo b) {
		if ( a.getRating() == b.getRating())
		{
			if (a.getCaption().compareTo(b.getCaption()) == 0)
				return 0;
		else
			return a.getCaption().compareTo(b.getCaption());
		}
			else if ( a.getRating() > b.getRating())
			return 1;
		else
			return -1;
		
	}

}
