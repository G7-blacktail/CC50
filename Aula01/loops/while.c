#include <stdio.h>
// #include <cs50.h>

int main(void)
{
    int count = 0;
    int count2 = 50;
    while(count < 50)
    {
        printf("Repeat %i\n", count+1);
        count++;
    }

    printf("\n");

    while(count2 > 0)
    {
        if(count2 != 0)
        {
         printf("Repeat %i\n", count2);
        }
        count2--;
    }
}
