    #include<stdio.h>

    int z=4;
    int x = 4;

    int func(){
      z = 2;
      return z;
    }

    int main(){
      x = 5;

      printf("%d\n",z);
      z=func();
      printf("%d\n",z);

      int j = 5;
    }

