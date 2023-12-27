#include <iostream>
using namespace std;

class Student
{
public:
    string name;
    int age;
    string gender;
};

int main()
{
    cout << "Hello World!";
    // string john = Student;
    Student john;
    john.name = "john";
    john.age = 20;
    john.gender = "male";
    cout << john.name;
}
