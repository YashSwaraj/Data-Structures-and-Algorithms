#include <stdio.h>
#include <stdlib.h>

int main()
{
    int arr[50], tA=-1, tB=50, ch, n;

    printf("1. Push to stack A\n");
    printf("2. Pop from stack A\n");
    printf("3. Push to stack B\n");
    printf("4. Pop from stack B\n");
    printf("5. Exit\n");

    while(1)
    {
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            if (tA < tB-1)
            {
                printf("Enter number for pushing");
                scanf("%d", &n);
                tA++;
                arr[tA] = n;
            }
            else
                printf("Overflow");
            break;
        case 2:
            if (tA > -1)
            {
                printf("%d", arr[tA]);
                tA--;
            }
            else
                printf("Underflow");
            break;
        case 3:
            if(tB > tA+1)
            {
                printf("Enter number for pushing");
                scanf("%d", &n);
                tB--;
                arr[tB] = n;
            }
            else
                printf("Overflow");
            break;
        case 4:
            if (tB < 50)
            {
                printf("%d", arr[tB]);
                tB++;
            }
            else
                printf("Underflow");
            break;
        case 5:
            return 0;
        }
    }
    return 0;
}
