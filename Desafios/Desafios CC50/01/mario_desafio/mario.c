#include <stdio.h>
// #include <cs50.h>

int main(void)
{
	int number;

	do {
		number = get_int("Digite a algura da coluna: ");
	}while(number > 1 && number >= 9);

        for(int i = 0; i < number; i++)
		{
            for(int j = 0; j < number; j++)
			{
                if(j + 1 < number - i)
				{
                    print(" ");
                }else 
				{
                    print("#");
                }
            }
            print("\n");
        }
}