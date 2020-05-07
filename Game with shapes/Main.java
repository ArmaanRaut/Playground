#include<iostream>
using namespace std;
int main()
{
  int x,r,d;
  cin>>r>>x;
  
  d=2*r;
  if(x>=d)
  {
      printf("circle can be inside a square");
  }
  else
  {
      printf("circle cannot be inside a square");
  }
  return 0;
}
 