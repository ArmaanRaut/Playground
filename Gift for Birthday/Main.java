/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
#include <iostream>
using namespace std;

int main()
{
    int year;

    cin >> year;

    if (year % 4 == 0)
    {
        if (year % 100 == 0)
        {
            if (year % 400 == 0)
                cout << year << " is a leap year";
            else
                cout << year << " is not a leap year";
        }
        else
            cout << year << " is a leap year";
    }
    else
        cout << year << " is not a leap year";

    return 0;
}