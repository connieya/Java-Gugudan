# JAVA 기초 복습하기
---
## 구구단

```
     System.out.println("구구단 중 출력할 단은? :"); 
```

```
		 	Scanner scanner = new Scanner(System.in); 
		 	int number = scanner.nextInt();
```

```
 System.out.println(number+"*"+1+ "=" +number*1);
 System.out.println(number+"*"+2+ "=" +number*2);
 System.out.println(number+"*"+3+ "=" +number*3);
 System.out.println(number+"*"+4+ "=" +number*4);
 System.out.println(number+"*"+5+ "=" +number*5);
 System.out.println(number+"*"+6+ "=" +number*6);
 System.out.println(number+"*"+7+ "=" +number*7);
 System.out.println(number+"*"+8+ "=" +number*8);
 System.out.println(number+"*"+9+ "=" +number*9);
```

![image](https://user-images.githubusercontent.com/66653324/102690020-f70e0580-4245-11eb-8f40-5fbd84c4fe41.png)

----
### 반복문 사용

1. for 문


```
System.out.println("구구단 중 출력할 단은? :"); 
		  Scanner scanner = new Scanner(System.in); 
		  int number = scanner.nextInt(); 
		  for(int i=1; i<10; i++) {
		  System.out.println(number+"*"+i+"="+number*i); 
		  }

```

2. while 문


```
System.out.println("구구단 중 출력할 단은? :");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
	
		int i=1;
		while(i<10) {
			System.out.println(number+"*"+i+"="+number*i);
			i++;
		}
	

```

----

### 조건문

2 이상 9 이하 일때 출력

```
System.out.println("구구단 중 출력할 단은? :");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number >=2 && number <=9) {
		int i=1;
		while(i<10) {
			System.out.println(number+"*"+i+"="+number*i);
			i++;
		}
		}else {
			System.out.println("2이상 9이하 숫자만 입력 가능합니다.");
		}
```

---

### 배열로 구구단 구현

```
                System.out.println("구구단 중 출력할 단은 ?  ");
		int result [] =new int[9];
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i=0; i<result.length; i++) {
			result[i] = number * (i+1);
			System.out.println(number+"*"+(i+1)+"="+result[i] );
			
		}

```


### 메서드로 구구단 구현

```
public static int[] calculate(int times){
    int result[] = new int[9];
    for(int i=0; i<result.length; i++){
      result[i] = times * (i+1);
      
      }
      
      return result;
	
 
}

```
calculate 메서드에 times 라는 매개변수를 선언
인자(argument)에 숫자를 담아 전달하여 해당 구구단을 구현


```
public class Gugudan {

public static int[] calculate(int times){
    int result[] = new int[9];
    for(int i=0; i<result.length; i++){
      result[i] = times * (i+1);
      System.out.println(result[i]);
      }
      
      return result;
}
	public static void main(String[] args) {
		calculate(5)
	}
	
	
	
}
```

main 함수에 calculate 인자로 숫자 5을 담아 
5단을 출력
(calculate 메서드 안에 System.out 출력 문을 넣음)

### `자바기지 박재성` 님 코드와 비교하기

```
public class Gugudan{

	public static int[] calculate(int times) {
		int result[] = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i+1);	
		}
		return result;
		}
		
	public static void print(int[] result){
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		
		}
	
	}
		
	public static void main(String[] args) {
		int[] result = calculate(2);
		print(result);
		
		int[] time3 = calculate(3);
		print(time3);
		
		int[] time4 = calculate(4);
		print(time4)
		
	}

}
```

 `calculate 메서드` 안에 System.out 출력 코드를 바로 넣어서 출력하면 되지 않나?
 `print 메서드`를 따로 만들어 출력하는 코드를 굳이 넣어야 하는 이유가 있을까?
 
 calculate(5)로 호출 하면 되는데, 
 int[] result = calculate(2);
 print(result); 로 해야하는 이유가 있을까??
 
 
### 크기가 다른 구구단 구현

* 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
* 예를 들어 사용자가 "8,7" 과 같은 문자열을 입력하면 팔칠단을 구현한다. 팔칠단은 2x 1,...2 x 7, 3 x 1..3 x'7...,8'x'1....8'x'7까지 구현 하는 것을 의미한다.


 `힌트`
 
 * 사용자가 입력한 값을 문자열(String)로 받는다.
 
 ```
 Scanner scanner = new Scanner(System.in);
 String inputValue = scanner.nextLine();
 ```
 
 * 사용자가 입력한 값을 쉽표(,)를 기준으로 분리한다.
 
 ```
 String[] splitedValue = inputValue.split(",");
 ```
 
 * 쉼표를 기준으로 분리한 문자열을 숫자로 변환한다.
 ```
 int first = Integer.parseInt(splitedValue[0]);
 int second = Integer.parseInt(splitedValue[1]);
 ```
 
  `크기가 다른 구구단 구현`
  
  ```
  public static void main(String[] args) {
			System.out.println("크기가 다른 구구단 숫자 입력 :");
			Scanner scanner = new Scanner(System.in);
			while(true) {
				
			
			String inputValue = scanner.nextLine();
			
			String[] splitedValue = inputValue.split(",");
			
			int first = Integer.parseInt(splitedValue[0]);
			int second = Integer.parseInt(splitedValue[1]);
			
			if(first >1 && second >1) {
				for(int i=2; i<=first; i++)
					for(int j=1; j<=second; j++) {
						System.out.println(i+"*"+j+"= "+i*j);
					}
			}else {
				System.out.println("2이상 입력하세요");
			}
			
			}
			
			
	}
  ```
  
  ![image](https://user-images.githubusercontent.com/66653324/102705052-77744b00-42c6-11eb-9372-523673e8412b.png)

