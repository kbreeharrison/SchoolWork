/***
 * 
 * @author kyndalharrison
 *
 */
public class DateLibrary {


	public static void main(String[] args) 
	{
//		String date1 = "2898-09-17";
//		String date2 = "2000-10-17";
//		String date3 = "2100-321-0";
//		String date4 = "1956-02-11";
//
//		System.out.println( isValidDateFormat( date1 ));
//		System.out.println( isValidDateFormat( date2 ));
//		System.out.println( isValidDateFormat( date3 ));
//		System.out.println( isValidDateFormat( date4 ));
//
//		System.out.println( getYear( date1) );
//		System.out.println( getYear( date2) );
//		System.out.println( getYear( date3) );
//		System.out.println( getYear( date4) );
//
//		System.out.println( getMonth( date1) );
//		System.out.println( getMonth( date2) );
//		System.out.println( getMonth( date3) );
//		System.out.println( getMonth( date4) );
//
//		System.out.println( getDay( date1) );
//		System.out.println( getDay( date2) );
//		System.out.println( getDay( date3) );
//		System.out.println( getDay( date4) );
//
//		System.out.println( isLeapYear( getYear(date1) ) );
//		System.out.println( isLeapYear( getYear(date2) ) );
//		System.out.println( isLeapYear( getYear(date3) ) );
//		System.out.println( isLeapYear( getYear(date4	) ) );
//
//		System.out.println( isValidDate( date1 ) );
//		System.out.println( isValidDate( date2 ) );
//		System.out.println( isValidDate( date3 ) );
//
//		System.out.println( compare( date1, date2) );
//		System.out.println( compare( date2, date3) );
//		System.out.println( compare( date3, date1) );
//		System.out.println( compare( date1, date1) );

	}
	
	//will return true if String is in proper format
	public static boolean isValidDateFormat( String date )
	{
		if ( date.length() == 10 ) 
			if (date.substring(4,5).equals("-") && date.substring(7, 8).equals( "-" ) )
				{
				String year = date.substring(0,4);
				for ( int i = 0 ; i < 4; i++)
				{
					int num = (int) year.charAt(i);
					
					if ( num > 57 || num < 48)
						return false;
				}

				String month = date.substring(5, 7);
				for ( int i = 0 ; i < 2; i++)
				{
					int num = (int) month.charAt(i);
					
					if ( num > 57 || num < 48)
						return false;
				}

				String day = date.substring(8, 10);
				for ( int i = 0 ; i < 2; i++)
				{
					int num = (int) day.charAt(i);
					
					if ( num > 57 || num < 48)
						return false;
				}
				return true;
			}
			else 
				return false;
		else
			return false;
	}

	//uses the first four indexes to get the Year
	public static int getYear( String date )
	{	
		if ( isValidDateFormat( date) == true)
			{
			int four = Integer.parseInt( date.substring(0, 4) );
			return four;
			}
		else
			return -1;

	}

	//uses index 6 and 7 to get the month
	public static int getMonth( String date )
	{
		if ( isValidDateFormat( date) == true)
		{
			int two = Integer.parseInt( date.substring(5, 7));
			if ( two < 1 ||  two > 12)
				return -1;
			else
				return two;
		}
		else
			return -1;
	}
	
	//uses index 9 and 10 to get the day
	public static int getDay( String date )
	{
		if ( isValidDateFormat( date) == true)
		{
			int two = Integer.parseInt( date.substring(8, 10));
			if ( two < 1 || two > 31)
				return -1;
			else
				return two;
		}
		else 
			return -1;
	}

	//calculates a leap year
	public static boolean isLeapYear( int year ) 
	{
		if ( year % 4 != 0)
			return false;						//I used wikipedia to understand
		else if (year % 100 != 0)		//the leap year rule because I found
			return true;						//the homework instructions vauge
		else if ( year % 400 != 0)
			return false;
		else
			return true;


	}

	//checks if the String is in the valid format and a calendar date
	public static boolean isValidDate( String date )
	{ 
		if ( isValidDateFormat( date) == true)
		{
			String year = date.substring(0,4);
			for ( int i = 0 ; i < 4; i++)
			{
				int num = (int) year.charAt(i);
				if ( num > 57 || num < 48)
					return false;
			}

			int month = Integer.parseInt( date.substring(5, 7));
			if ( month < 1 ||  month > 12)
				return false;

			int day = Integer.parseInt( date.substring(8, 10));
			if ( day < 1 || day > 31)
				return false;


			//by month
			if ( month == 1 )
				{
				if ( day > 0 && day < 31 )
					return true;
				}
			
			if ( month == 2 )
			{
				if ( isLeapYear( getYear(date)) == true)
				{
					if ( day >= 1 && day <= 29 )
						return true;
				}
				else if ( day >= 1 && day <= 28 )
					return true;
			}

			if ( month == 3)
				{if ( day >= 1 && day <= 31)
					return true;
				}
			else if ( month == 4)
			{
				if ( day >=1 && day <= 30)
					return true;
			}
			else if ( month == 5 )
				{
				if ( day >= 1 && day <= 31)
					return true;
				}
			else if ( month == 6)
				{
				if ( day >= 1 && day <= 30)
					return true;
				}
			else if ( month == 7)
				{
				if ( day >= 1 && day <= 31)
					return true;
				}
			else if ( month == 8 )
				{
				if ( day >= 1 && day <= 31 )
					return true;
				}

			else if ( month == 9)
				{
				if ( day >= 1 && day <= 30)
					return true;
				}

			else if ( month == 10 )
				{if ( day >= 1 && day <= 31 )
					return true;
				}

			else if ( month == 11)
				{if ( day >= 1 && day <= 30)
						return true;
				}

			else if ( month == 12 )
				{if ( day >= 1 && day <= 31 )
					return true;
				}
			
			else
				return false;
		}


		return false;

	}

	//comparing if a date comes before or after another
	public static int compare( String date1, String date2 )
	{//WebCat still has errors around this one, but I don't know why
		if ( isValidDateFormat( date1) == false || isValidDateFormat(date2) == false )
			return 0;
		else if (date1.compareTo(date2) >= 0)
			return 1;
		else if (date1.equals(date2) == true)
			return 0;     
		else  
			return -1; 
		}
}
