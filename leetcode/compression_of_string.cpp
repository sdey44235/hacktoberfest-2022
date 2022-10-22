
#include<iostream>
#include<string>


using namespace std;
int main()
{
    string s="saaaaaahyjjjjjjjjjedaaasss";

    char ans[100];
    ans[0]=s[0];
    int count=0;

    for(int i=1;i<s.size();i++)
    {
        if(s[i]!=s[i-1])
        {
            ans[count]=s[i];
        }
    }

    for(int i=0;i<100;i++) 
    {
        cout<<ans[i]<<" ";
    }

}