#include<iostream>
using namespace std;
int main()
{
  float ans=0;
  int temp,odd_count=0;
  while(odd_count<3)
  {
std::cin>>temp;
    if(temp<0)
    {
ans=ans-1;
      break;
    }
else
{
if(temp%2)
{
  ans=ans+1;
odd_count++;
}
  else
  {
ans+=-.5;
  }
}
  }
std::cout<<ans;
}