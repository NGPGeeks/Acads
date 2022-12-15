#include<iostream>
using namespace std;
class alpha{
    public:

    alpha(){
        cout<<"Alpha constructor called."<<endl;
    }
};
class beta{
    public: 

    beta(){
        cout<<"Beta constructor called."<<endl;
    }
};
class gamma : public alpha, public beta{
    public:

    gamma()
    {
        cout<<"Gamma constructor called."<<endl;
    }
};
int main()
{
    gamma g1;

}
