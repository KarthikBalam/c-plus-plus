#include <iostream>
using namespace std;
int main() {
  int n,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
   if (i % 2 == 0)
   for(j=n;j>=1;j--)
   { 
     if(j==n)
     {
      cout<<i+1;
     }
     else
     {
       cout<<i;
     }
   }
    else
      for(j = n; j >= 1; j--)
      {
             if(j==1)
     {
      cout<<i+1;
     }
     else
     {
       cout<<i;
     }
        
        
      }
    cout<<"\n";
  }
    return 0;
}