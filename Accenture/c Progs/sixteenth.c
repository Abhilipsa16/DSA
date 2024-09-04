#include<stdio.h>

int main(){
    int number;
    int sum=0 ,val =0;
    for(int i=0;i<=10;i++){
        val = number*i;
        printf("%d",val);
        sum = sum+val;
    }
    printf("%d",sum);
    return 0;
}