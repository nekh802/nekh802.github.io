class Solution {
  public String solution(int n) {
    String answer = "";
    for(int i = 0; i < n; i++) {
    if(i%2 == 0) {
      answer += "수";
    }else {
      answer += "박";
    } 
  }
  return answer; 
  } 
}


String answer = "";

N = 5일 때 

        for (int i = 0; i < n; i++) {

                answer = word[i % 2];

            }

이렇게 하면 결과는 수수수수수


answer = word[i % 2]; 로 해줘야 한다. 
> block quote
