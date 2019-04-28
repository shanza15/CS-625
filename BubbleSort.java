class BubbleSort {
public static void main(String args[]) {
 int num[]={10, 50, 30, 40, 12, 13, 15, 11, 9, 8};
   int a, b, i, temp;
   int size=10;
   for(i = 0; i<10; i++)
   System.out.println("The original array is:" + num[i]);
   for(a=1; a<size; a++)
    for(b=size-1; b>=a; b--) {
    if(num[b-1]>num[b]) {
      temp=num[b-1];
      num[b-1]=num[b];
      num[b]=temp;
   }
}
for(i=0; i<size; i++)
System.out.println("The array is in sorted form:" + num[i]);
   } 
}
