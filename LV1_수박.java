*다른 방법

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


N = 5일 때
String answer = ""; 
for (int i = 0; i < n; i++) {
  answer = word[i % 2];
}

결과 :
수수수수수

수정 :
answer += word[i % 2]; 로 해줘야 한다. 
