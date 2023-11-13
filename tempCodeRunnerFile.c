#include<stdio.h>
struct myarray
{
    int total_size;
    int used_data;
    int *ptr;
};
void createArray(struct myarray*a,int total_size,int used_data){
    (*a).ptr=(int*)malloc(total_size*sizeof(int));


}
int main(){
    struct myarray marks;
    createArray(&marks,100,20);
    return 0;
}