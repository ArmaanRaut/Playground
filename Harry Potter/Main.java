#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,last,first,rev=0;
  std::cin>>n;
  last=n%10;
 first=n;
  n=(n/1000)%10;
  first=n;
  std::cout<<first+last;
}