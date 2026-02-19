package com.sayan.jobprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobProfileApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobProfileApplication.class, args);
         int n= 12345;
         int nRev =0;
            int rev=0;
            while(n !=0) {
                int digit = n % 10;
                rev = rev * 10 + digit;
                n /= 10;
            }
                 nRev=rev;

        System.out.println(nRev);

        int[] nums = {1,2,3,3,3,4,4,5};
        int left = 1;
        for (int right =1; right < nums.length ;right++){
            if(nums[right] != nums[right-1]){
                nums[left] = nums[right];
                left++;
            }

        }
        System.out.println(nums);

    }
}