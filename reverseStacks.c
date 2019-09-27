#include <stdio.h>
#include <stdlib.h>

int main()
{
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
