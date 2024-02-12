#include <stdio.h>
// #include <cs50.h>

// Prototype
void meow(void);
int main(void)
{
        meow(3);
}

void meow(int n)
{
    for(int count = 0; count < n; count++)
    {
        printf("meow\n");
    }
}
