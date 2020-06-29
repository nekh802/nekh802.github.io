If 짝수
  가운데 두 글자 반환
Else
  가운데 인덱스 반환

If (len(s) % 2 == 0)
  Answer = s[index]를 넣는다. 
  S[len(s)/2 -1]와 S[len(s)/2 +1]
Else
  가운데 인덱스 반환
  S[int(len(s)/2)+1]

*String 관련 메서드
char charAt(int index)
문자열에서 해당 위치(index)에 있는 문자를 반환한다.
int length()
문자열의 길이를 반환한다.
String substring(int from, int to)
문자열에서 해당 범위(from ~ to)의 문자열을 반환한다.(이상, 미만)
boolean equals(Object obj)
문자열의 내용이 같은지 확인한다. 같으면 결과는 true, 다르면 false
char[] toCharArray()
문자열을 문자배열(char [])로 변환해서 반환한다.

-

// StringBuilder의 sb에 char[] sol을 넣고, 역순으로 변경하고, String으로 변환
answer =sb.append(sol).reverse().toString(); 
String a = "첫번째 텍스트입니다."; String b = "두번째 텍스트입니다."; 
System.out.println(a.concat(b)); 
//결과값 : 첫번째 텍스트입니다. 두번째 텍스트입니다.

StringBuilder sb = new StringBuilder( "첫번째 텍스트입니다. " ); 
sb.append( "두번째 텍스트입니다. " ); 
sb.append( "세번째 텍스트입니다. "); 
System.out.println(sb); 
//결과값 : 첫번째 텍스트입니다. 두번째 텍스트입니다. 세번째 텍스트입니다.

*문제의 조건이 “가운데 글자” 이므로 len = s.length() / 2로 했을 때 연산을 줄일 수 있다.
*int len = s.length() / 2; 했을 때 5/2의 경우 2로 자동 내림 되는 것에 주의한다.
abcde의 경우 a = 2
Substring(2,3)하면 s에서 2번째 인덱스인 c만 나온다. 2이상 3미만
qwer의 경우 a = 2
Substring(1,3)하면 인덱스 1이상, 인덱스 3미만 나온다. 
*문자열 배열의 경우는 arr.length로 하면 문자열 배열의 길이를 구할 수 있지만, 문자열의 길이는 s.length()로 ()를 추가해주셔야 합니다!!!
*빈 String answer 에 바로 넣음에 주의 = substring()


answer = s.charAt(len/2);
/Solution.java:13: error: incompatible types: char cannot be converted to String
answer = s.charAt(len/2);

answer = Character.toString(s.charAt(len));
/Solution.java:13: error: method toString in class Object cannot be applied to given types;answer = toString(s.charAt(len));^required: no argumentsfound: charreason: actual and formal argument lists differ in length1 error
