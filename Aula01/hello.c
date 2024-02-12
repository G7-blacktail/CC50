#include <cs50.h>
#include <stdio.h>

int main(void)
{
    printf("Hello word C\n");
    string aswer = get_string("What your name? ");
    printf("hello %s \n", aswer);
}