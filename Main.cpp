#include <iostream>
using namespace std;

int main() {
  
    int angka = 5;
    float pecahan = 3.14;
    char karakter = 'A';


    int arraySatuDimensi[5] = {1, 2, 3, 4, 5};

  
    int arrayMultiDimensi[2][3] = {{1, 2, 3}, {4, 5, 6}};

  
    int inputAngka;
    cout << "Masukkan sebuah angka: ";
    cin >> inputAngka;

   
    cout << "Angka yang dimasukkan: " << inputAngka << endl;

    
    for(int i = 0; i < 5; i++) {
        cout << arraySatuDimensi[i] << " ";
    }
    cout << endl;

 
    if(inputAngka > 0) {
        cout << "Angka yang dimasukkan adalah positif." << endl;
    } else if(inputAngka < 0) {
        cout << "Angka yang dimasukkan adalah negatif." << endl;
    } else {
        cout << "Angka yang dimasukkan adalah nol." << endl;
    }

 
    int counter = 0;
    while(counter < 3) {
        cout << "Ini adalah iterasi ke-" << counter + 1 << " menggunakan while loop." << endl;
        counter++;
    }
    int doWhileCounter = 0;
    do {
        cout << "Ini adalah iterasi ke-" << doWhileCounter + 1 << " menggunakan do-while loop." << endl;
        doWhileCounter++;
    } while(doWhileCounter < 3);

  

    return 0;
}
