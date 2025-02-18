#include <iostream>
using namespace std;

int factorial(int num) {
    int fact = 1;
  for (int i = 1; i <= num; i++) {
        fact *= i;
    }
  return fact;
}

int combination(int n, int r) {
  return factorial(n) / (factorial(r) * factorial(n - r));
}

int main() {
 int n = 5;  

for (int i = 0; i < n; i++) {
         
 for (int j = 0; j < n - i - 1; j++) {
            cout << " ";
        }
        
 for (int j = 0; j <= i; j++) {
            cout << combination(i, j) << " ";
        }
        cout << endl;
    }

    return 0;
}
