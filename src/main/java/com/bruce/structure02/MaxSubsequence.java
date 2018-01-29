package com.bruce.structure02;

/**
 * 最大子序列和
 */
public class MaxSubsequence {
    private static void subSequence1(int[] arr){
        int maxSub = 0;
        int size = arr.length;
        for(int i=0;i<size;i++){
            int sub = arr[i];
            for(int j=i+1;j<size;j++){
                sub +=arr[j];
                if(sub>maxSub){
                    maxSub = sub;
                }
            }
        }
        System.out.println(maxSub);
    }
    private static void subSequence2(int[] arr){
        int maxSub = 0;
        int size = arr.length;
        for(int i=0;i<size;i++){
            int sub = 0;
            for(int j=i;j<size;j++){
                sub +=arr[j];
                if(sub>maxSub){
                    maxSub = sub;
                }
            }
        }
        System.out.println(maxSub);
    }
    private static void subSequence3(int[] arr){
        int size = arr.length;
        int maxSub = 0;
        int thisSub = 0;
        for(int i=0;i<size;i++){
            thisSub+=arr[i];
            if(thisSub>maxSub){
                maxSub = thisSub;
            } else if(thisSub<=0){
                thisSub = 0;
            }
        }
        System.out.println(maxSub);
    }
    private static int subSequence4(int[] arr,int left,int right){
        if(left==right){
            if(arr[left]>0){
                return arr[left];
            }else {
                return 0;
            }
        }
        int center = (left+right)/2;
        int maxLeftNum = subSequence4(arr,left,center);
        int maxRightNum = subSequence4(arr,center+1,right);
        int maxLeft=0,thisLeft =0 ;
        for(int i=center;i>=left;i--){
            thisLeft+=arr[i];
            if(thisLeft>maxLeft){
                maxLeft = thisLeft;
            }
        }
        int maxRight=0,thisRight=0;
        for(int j=center+1;j<=right;j++){
            thisRight+=arr[j];
            if(thisRight>maxRight){
                maxRight = thisRight;
            }
        }
        return max(maxLeftNum,maxRightNum,(maxLeft+maxRight));
    }
    private static int getMax4(int[] arr){
        return subSequence4(arr,0,arr.length-1);
    }
    private static int max(int a,int b,int c){
        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-5,7,8,-2,4,3,-2,-3,1,4,3};
        subSequence1(arr);
        subSequence2(arr);
        subSequence3(arr);
        System.out.println(getMax4(arr));
    }
}
