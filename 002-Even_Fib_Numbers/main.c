#include <stdio.h>
#include <stdlib.h>

int main() {
    size_t bufSize = 128;
    int tests;
    char* buffer = (char*) malloc(sizeof(char) * bufSize);
    scanf("%s", buffer);
    tests = atoi(buffer);
    long* cases = (long *) malloc(sizeof(long) * tests);
    int i;
    for(i = 0; i < tests; i++){
        scanf("%s", buffer);
        cases[i] = atol(buffer);
    }
    free(buffer);
    //The first 80 fib numbers is enough to exceed 4 * 10^16
    long* fibNums = (long*) calloc(sizeof(long), 80);
    fibNums[0] = 1;
    fibNums[1] = 2;
    for(i = 0; i < tests; i++){
        int j = 0;
        long sum = 0;
        do{
            if(fibNums[j] == 0) {
                fibNums[j] = fibNums[j - 1] + fibNums[j - 2];
            }
            if(fibNums[j] > cases[i])
                break;
            if(fibNums[j] % 2 == 0)
                sum += fibNums[j];
            j++;
        }while(1);
        printf("%ld\n", sum);
    }
    free(cases);
    free(fibNums);
    return 0;
}
