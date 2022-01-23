/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsequence;

/**
 *
 * @author bmwat
 */
public class LongestSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,3,5,7,7,7,3,1,2,1,3,5,1,1};
        System.out.println(Sequence(arr));
    }
    public static int Sequence(int[] arr){
        int result = 0;
        int resultCount = 0;
        int temp;
        
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            temp = temp + 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] == arr[i]){
                    temp = temp + 1;
                }else{
                    break;
                }
            }
            if(temp > resultCount){
                resultCount = temp; 
                result = arr[i];
            }
        }
        
        return result;
    }
    
}
