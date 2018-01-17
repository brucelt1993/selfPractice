package com.bruce.thinkinjava19;

import com.bruce.tools.EnumsTools;

public class RandomTest {
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            System.out.print(EnumsTools.random(Activity.class)+" ");
        }
    }
}
enum Activity{
    SITTING,LYING,STANDING,HOPPING,RUNNING,DODGING,JUMPING,FALLING,FLYING,
}
