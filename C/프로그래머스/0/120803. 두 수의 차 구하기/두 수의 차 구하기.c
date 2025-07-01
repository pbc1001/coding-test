#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int a = num1 - num2;
    int b = a + 1;
    int c = b + 1;
    int d = c + 1;
    return d - c + a - 1;

}