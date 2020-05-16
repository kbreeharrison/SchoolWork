/***
 * 
 * @author kyndalharrison
 *
 */
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

public class HW3Tests {
	
	Photo p1 = new Photo( "KeyWest", "Aug 2019");
	Photo p2 = new Photo( "Key West", "Boats", "1956-02-11", 5);
	Photo p3 = new Photo( "BlueLagoon", "Beach", "1956-02-11", 2);
	Photo p4 = new Photo( "BlueLagoon", "Beach");
	Photo p5 = new Photo( "Sunday", "End of Reunion", "1956-02-11", 3);
	Photo q0 = new Photo( "May Flowes", "April Showers", "2000-05-10", 3 );
	Photo q1 = new Photo( "June Flowes", "May Showers", "2000-06-10", 3 );
	Photo q2 = new Photo( "Flowes", "Showers", "2000-05-10", 4 );
	Photo q3 = new Photo( "June Flowers", " ", "2000-06-17", 2 );
	Photo q4 = new Photo( "June Flowers", "May Showers", "2000-06-10", 4);
	
	
	ArrayList<Photo> photoList = new ArrayList<Photo>();
	ArrayList<Photo> albumHash = new ArrayList<Photo>();
	
	Library tester = new Library( "TestLibrary", 3421);
	
	ArrayList<Photo> newList = new ArrayList<Photo>();
	ArrayList<Photo> newAlbum = new ArrayList<Photo>();
	
	Library testerb = new Library( "TesterLibrary", 6453);
	Library testerc = new Library( "TLibrary", 6413);
	
	
	@Test
	public void testRemovePhoto() {
		photoList.add(p1);
		photoList.add(p2);
		photoList.add(p3);
		photoList.add(p4);
		photoList.add(p5);
	
		photoList.add(q1);
		photoList.add(q2);
		photoList.add(q3);
		photoList.add(q4);
		
		 
		//test 1
		boolean result = tester.removePhoto(p1);
		boolean expected = true;
		
		assertEquals( "correct", expected, result);
	
		//test 2
		
		boolean result1 = tester.removePhoto(q0);
		boolean expected1 = false;
		
		assertEquals( "correct", expected1, result1);
	}
	
	@Test
	public void testCompareTo() {
		//test 1
		int actual = q1.compareTo(p1);
		int expected = 1;
		
		assertEquals( "correct", expected, actual);
		
		//test 2
		int actual1 = p2.compareTo(q4);
		int expect1 = -1;
		
		assertEquals( "correct", actual1, expect1);
	}
	//CAPTION TEST
	@Test
	public void testCompare() {
		
		PhotoCaptionComparator testOne = new PhotoCaptionComparator();
		PhotoCaptionComparator testTwo = new PhotoCaptionComparator();
		
		//test 1
		int actual = testOne.compare(p3, q2);
		int expected = -4;
		
		assertEquals( "correct", expected, actual);
		
		//test2
		int actual1 = testTwo.compare(q0, p2);
		int expected1 = 2;
		
		assertEquals( "correct", expected1, actual1);
	}

	//RATING TEST
	@Test
	public void testCompare1() {
		
		PhotoRatingComparator testOne = new PhotoRatingComparator();
		PhotoRatingComparator testTwo = new PhotoRatingComparator();
		
		//test 1
		int actual = testOne.compareTo(p1, p4);
		int expected = -1;
		
		assertEquals( "corrects", expected,  actual);
		
		//test 2
		
		int actual1 = testTwo.compareTo(p3, q3);
		int expected1 = -8;
		
		assertEquals( "correct", expected1, actual1);
		
		
	}
	

}
