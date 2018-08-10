public class Dom1 {

    public static void main(String[]args){


        int[]a={1,2,3,4,5,6,7};


        for(int arr:a){           //增强for循环
            System.out.println(arr);


        }

//  求奇数德和
         int sum=0;
        for(int arr1:a){
              if(arr1%2==0){
                  continue;  //跳过本次循环
              }
              sum+=arr1;
        }
           System.out.println("奇数和："+sum);

    }
}
