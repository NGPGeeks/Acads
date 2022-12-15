#include<iostream>
using namespace std;
class complex {
   int real, img;
   public:
      complex() {
         real = 0; img = 0;
      }
      complex(int r, int i) {
         real = r; img = i;
      }
      void set();
      void get();
      void display();
      friend complex operator +(complex, complex);
      friend complex operator -(complex, complex);
      friend complex operator *(complex, complex);
};
void complex::set() {
   cout << "Enter Real part: ";
   cin >> real;
   cout << "Enter Imaginary Part: ";
   cin >> img;
}
void complex::get() {
   cout << "The complex number is: "<< real << "+" << img << "i" << endl;
}
void complex::display() {
   if(img < 0)
      if(img == -1)
         cout << "The complex number is: "<< real << "-i" << endl;
      else
         cout << "The complex number is: "<< real << img << "i" << endl;
      else
         if(img == 1)
            cout << "The complex number is: "<< real << " + i"<< endl;
         else
            cout << "The complex number is: "<< real << " + " << img << "i" <<
   endl;
}
complex operator +(complex c1, complex c2) {
   complex res;
   res.real = c1.real + c2.real;
   res.img = c1.img + c2.img;
   return res;
}
complex operator -(complex c1, complex c2) {
   complex res;
   res.real = c1.real - c2.real;
   res.img = c1.img - c2.img;
   return res;
}
complex operator *(complex c1, complex c2) {
   complex res;
   res.real = (c1.img*c2.img)+(c1.real*c2.real);
   res.img = (c1.img*c2.real) + (c2.img*c1.real);
   return res;
}
int main() {
   complex n1(3, 2), n2(4, -3);
   complex result;
   n1.display();
   n2.display();
   cout<<"After addition : "<<endl;
   result = n1+n2;
   result.display();
   cout<<"After subtraction : "<<endl;
   result = n1-n2;
   result.display();
   cout<<"After multiplication : "<<endl;
   result = n1*n2;
   result.display();
}
