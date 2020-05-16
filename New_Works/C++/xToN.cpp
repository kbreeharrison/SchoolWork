#include <iostream>
using namespace std;

int xton( int a, int b){
    if ( b == 0)
        return 1;
    else
        return a * xton( a, (b -1));
}

int main(){
    int a = 5;
    int b = 2;
    
    cout << xton( a, b);
    return 0;
}

