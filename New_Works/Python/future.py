
''' Purpose: solve future age
'''

# constants of interest
FUTURE_YEAR_OF_INTEREST = 2100
CURRENT_YEAR_OF_INTERST = 2020

# Suggested algorithm
#    get user to supply an age
USER_AGE = input( 'Enter your age: ' )
#    convert user reply to integer
INT_AGE = int( USER_AGE )
#    compute difference in years between the future and current years of interest
DIFFERENCE = FUTURE_YEAR_OF_INTEREST - CURRENT_YEAR_OF_INTERST
#    compute future age -- sum of age and difference in years between now and then
FUTURE_AGE = INT_AGE + DIFFERENCE
#    print the result of the computation
print( FUTURE_AGE )



