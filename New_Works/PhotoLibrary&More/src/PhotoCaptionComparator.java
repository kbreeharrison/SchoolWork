
public class PhotoCaptionComparator {

	public PhotoCaptionComparator() {
		// TODO Auto-generated constructor stub
	}
	
	//comparator
	public int compare( Photo a, Photo b) {
		if ( a.getCaption().compareTo( b.getCaption()) == 0)
		{
			if ( a.getRating() > b.getRating() )
				return -1;
			else if ( a.getRating() < b.getRating())
				return 1;
			else
				return 0;
		}
		else
			return a.getCaption().compareTo( b.getCaption());
	}
}
