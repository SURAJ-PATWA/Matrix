public class Transpose_Matrix {
    public static void printTraspose(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                //swap (a[i][j],a[j][i])
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr[][]={{1,2,3,4} ,{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printTraspose(arr);
    }
}


 //OUR OUTPUT IS
// 1 5 9 13 
// 2 6 10 14 
// 3 7 11 15 
// 4 8 12 16 
