#include<iostream>
using namespace std;
int main(){
    int arr[5];
    int result=0;
    for(int i=0; i<5; i++){
        cout<<"Enter number: ";
        cin>>arr[i];
        result+=arr[i];

    }
    cout<<"Sum of all elements is: ";
    cout<<result;
    return 0;
}