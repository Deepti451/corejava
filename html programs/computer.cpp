#include<iostream.h>

		class computer
			{
				
						int b,c;
						float a;
						char s;
				
public:
				void acceptdetails()
					{
				cout<<"Name of your pc"	<<endl;
				cin>>s;
				cout<<"Enter the battery backup"<<endl;
				cin>>a;
				cout<<"Enter the distance of  nearest service center in km"<<endl;
				cin>>b;
				cout<<"Enter the size of HDD"<<endl;
				cin>>c;}
					
				void displaydetails()
				{
					cout<<"The details you provide for your pc  ...."<<s<<endl;
					cout<<"BATTERY BACKUP :  "<<a<<"ghz"<<endl;
					cout<<"Service centre in shortest distance in km"<<b<<endl;
					cout<<"Size of HDD"<<c<<endl;
				}
		
	};
	int main()
		{
			
	computer dell;
	computer lenovo;
	computer acer;
	
	dell.acceptdetails();
	lenovo.acceptdetails();
	acer.acceptdetails();
	dell.displaydetails();
	lenovo.displaydetails();
	acer.displaydetails();
		return 0;
	}