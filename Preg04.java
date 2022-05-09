#include<iostream>
#include<stdlib.h>


using namespace std;


int main(){

int numero;
int suma;
int r;
cout<<"Digite el numero: ";
cin>>numero;
for(int i=1;i<numero;i++){
	r=numero%i;
	if(r==0){
	suma=suma+i;
	}
	
	
}
	if(suma==numero){
			cout<<"El numero es perfecto"<<endl;
	}else{
		cout<<"No es perfecto";
	}




return 0;

}