#include <stdio.h>
 
int main()
{
    printf("정수를 입력하세요! : ");

    char a[256];
    scanf("%s", a);

    printf(" \" %s \" 을(를) 입력하셨군요.\n", a);
    return 0;
}