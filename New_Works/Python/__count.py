def count( sheet ):
    new_list = []
    for i in sheet:
        new_list = new_list + i
    countoflist = len( new_list )
    return countoflist

def test_year( x ):

    if ( x <= 1787 ):
        result = 'no'
    elif ( x % 4 == 0 ):
        result = 'yes'
    else:
        result = 'no'
    return result

