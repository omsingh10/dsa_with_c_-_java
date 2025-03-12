#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n = 5; 
    int radius = n / 2;

    for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {

        int distance = pow(i - radius, 2) + pow(j - radius, 2);
          if (distance <= pow(radius, 2) + radius) {
                cout << "*";
            } else {
                cout << " ";
            }
        }
        cout << endl;
    }

    return 0;
}
