/***
 * 
 * @author kyndalharrison
 *
 */
import java.util.ArrayList;
import java.util.HashSet;


public class Library extends PhotoContainer {

	//fields

	private final int id;


	//constructor
	public Library( String name, int id)
	{
		super( name, null);
		this.id = id;
	} 
 

	public static void main(String[] args) {
		//My main method tests had to go 
		
	}

	//methods

	public boolean removePhoto( Photo p )
	{	
		if (photos.contains(p) == true)
		{	photos.remove(p);
			return true;
		}
		else
			return false;
	}	 


	public boolean equals( Object o)
	{
		if ( o == null)
			return false;
		if ( o instanceof Library )
		{
			Library libID = (Library) o;
			if ( this.id == libID.getId())
				return true;
			else 
				return false;
		}
		else 
			return false;
	}

	public String toString()
	{
		return ("The name of this library is " + this.getName() + ", the id is " + this.getId() + ", " + this.getName() + " contains these photos: " + this.getPhotos() );
	}

	public static ArrayList<Photo> commonPhotos( Library a, Library b)
	{
		ArrayList<Photo> commonPhoto = new ArrayList<Photo>();

		for ( int i = 0; i < b.numPhotos(); i++)
		{
			for ( int k = 0; k < a.numPhotos(); k++)
			{
				if ( a.getPhotos().get(k).equals(b.getPhotos().get(i)) == true)
				{
					commonPhoto.add( b.getPhotos().get(i) );
					k = a.numPhotos();
				}
			}
		}
		return commonPhoto;
	}		

	public static double similarity( Library a, Library b)
	{
		double common = ( double )commonPhotos( a, b ).size();

		if ( a.numPhotos() > b.numPhotos() )
			return (double) (common / b.numPhotos() );
		else if ( b.numPhotos() > a.numPhotos())
			return (double) (common / a.numPhotos() );
		else
			return 0.0;
	}

	public boolean createAlbum( String albumName)
	{
		if ( getAlbumByName( albumName ) == null )
		{	
			ArrayList<Photo> newPhotos = new ArrayList<Photo>();
			
			Album alName = new Album( albumName);
		
			return true;
		}
		else
			return false;
	}


//	public boolean removeAlbum( String albumName)
//	{
//
//		if ( getAlbumByName( albumName ) != null )
//		{	
//			this..remove(albumName);
//			return true;
//		}
//		else
//			return false;
//		}
	
//	public boolean addPhotoToAlbum( Photo p, String albumName)
//	{
//		for (  al : )
//			if ( al.getName() == albumName)
//			{
//				al.addPhoto(p);
//				return true;
//			}
//			else
//				return false;
//		return false;
//	}
//
//	public boolean removePhotoFromAlbum( Photo p, String albumName)
//	{
//		for ( Album al : this.albums)
//			if( al.getName() == albumName)
//			{
//				al.removePhoto(p);
//				return true;
//			}
//			else
//				return false;
//		return false;
//	}
//


	//getters

	public int getId() {
		return id;
	}

	private Album getAlbumByName( String albumName ) {

		for ( Object al : this.photos)
		{
			if (getName().equals(albumName) )
				return (Album) al;
			else
				return null;
		}
		return null; 
	}

//	public HashSet<Album> getAlbums() {
//		return albums;
//	}


	//setters
	public void setPhotos(ArrayList<Photo> photo) {
		this.photos = photo;
	}


}
