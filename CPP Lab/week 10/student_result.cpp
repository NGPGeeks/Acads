#include<iostream>
using namespace std;

class student{
    public:
    int roll;
    string name;
    void get_student(int r, string n)
    {
        name=n;
        roll=r;
    }
};
class test : public student{
    public:
    int sub1,sub2,sub3,sub4;
    void get_scores(){
        cout<<"Marks in : "<<endl;
        cout<<"Subject 1 : ";
        cin>>sub1;
        cout<<"Subject 2 : ";
        cin>>sub2;
        cout<<"Subject 3 : ";
        cin>>sub3;
        cout<<"Subject 4 : ";
        cin>>sub4;
    }
};
class sports{
    public:
    int sports_score;
    void get_spscore(){
        cout<<"Enter the score in sports : ";
        cin>>sports_score;
    }
};
class result : public test, public sports{
    public:
    void get()
    {
        string n;
        int r;
        cout<<"Enter the name of the student : ";
        cin>>n;
        cout<<"Enter the roll no. : ";
        cin>>r;
        get_student(r,n);
        get_scores();
        get_spscore();
    }
    void put()
    {
        cout<<"NAME : "<<name<<endl;
        cout<<"ROLL NO.: "<<roll<<endl;
        cout<<"Subject 1 score : "<<sub1<<endl;
        cout<<"Subject 2 score : "<<sub2<<endl;
        cout<<"Subject 3 score : "<<sub3<<endl;
        cout<<"Subject 4 score : "<<sub4<<endl;
        cout<<"Sports score : "<<sports_score<<endl;
    }
};
int main()
{
    result r1;
    r1.get();
    r1.put();
}
