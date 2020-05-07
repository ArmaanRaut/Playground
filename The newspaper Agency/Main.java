#include<iostream>
using namespace std;
int main()
{
  int w, x, y, profit=0;
  cin>>w>>x>>y;
  profit = (w*x)-(w*y)-100;
  cout<<profit;
  return 0;
}