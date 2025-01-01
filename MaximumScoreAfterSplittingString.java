class Solution {
    public int maxScore(String s) {
        int leftZeros = 0;
        int rightOnes = 0;
        int maximumScore = 0;
        // count rightOnes
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                rightOnes += 1;
            }
        }
        for(int i =0 ; i < s.length() - 1; i++){
            if(s.charAt(i) == '0'){
                leftZeros += 1;
            }else{
                rightOnes -=1;
            } 
            maximumScore = Math.max(maximumScore, leftZeros + rightOnes);           
        }
        return maximumScore;
    }
}
    
// ## 011101 i from 0 to last second char
// # i left_zeros, right_ones, max_score
// # 0   1            4             5
// # 1   1            3             4
// # 2   1            2             3
// # 3   1            1             2
// # 4   2            1             3
// # ------------ Max Score is 5 -------
