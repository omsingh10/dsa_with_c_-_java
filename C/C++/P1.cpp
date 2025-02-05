#include <iostream>
//using namespace std;

int main() {
    int n = 7; 
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
          if (i == 1 || i == n || j == 1 || j == n) {
            cout << "*";
            } else {
         cout << " ";
            }
        }
        cout << endl;
    }
    return 0;}
//Hollow Square Pattern
//This problem involves printing a square of asterisks (*) where the border is filled with stars and the interior is hollow (spaces).
