#include<iostream.h>
class student
{
	char name;
	int dob;
	char course[10];
	int id;
		public:
	void accept()
	{
		cout<<"Enter your name";
		cin>>name;
		cout<<"Enter your d o b";
		cin>>dob;
		cout<<"Enter your course and id";
		cin>>course>> id;
	}
	void display()
	{
		
	
	cout<<"your name"<<name;
	cout<<"your dob"<<dob;
	cout<<"your course"<<course;
	cout<<"id::"<<id;
	
}
};
int main()
{
	student detail[4];
	detail[0].accept();
	detail[1].accept();
	detail[2].accept();
	detail[3].accept();
	detail[0].display();
	detail[1].display();
	detail[2].display();
	detail[3].display();
	detail[4].display();
	return 0;
	
}