// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.



	public class Algebra {
		public static void main(String args[]) {
			// Tests some of the operations
			System.out.println(plus(2,3));   // 2 + 3
			System.out.println(minus(7,2));  // 7 - 2
			   System.out.println(minus(2,7));  // 2 - 7
			 System.out.println(times(3,4));  // 3 * 4
			   System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
			   System.out.println(pow(5,3));      // 5^3
			   System.out.println(pow(3,5));      // 3^5
			   System.out.println(div(12,3));   // 12 / 3    
			   System.out.println(div(5,5));    // 5 / 5  
			   System.out.println(div(25,7));   // 25 / 7
			   System.out.println(mod(25,7));   // 25 % 7
			   System.out.println(mod(120,6));  // 120 % 6    
			   System.out.println(sqrt(36));
			System.out.println(sqrt(263169));
			   System.out.println(sqrt(76123));
			   System.out.println(sqrt(25));
			   System.out.println(sqrt(82));
			  
		}  
	
		// Returns x1 + x2
		// לבדוק על ערכים שליליים לדאוג לערך מוחלט
		public static int plus(int x1, int x2) {
			if(x1!=0){
				if(x2>0){
					for(int i=0;i<x2;i++)
				{
					x1++;
				}
				return x1;
				}
				if(x2<0)
				{
					for(int i=x2;i<0;i++){
						x1--;
					}
					return x1;	
				}
				else return x1;
			}
			return x2;
				
		}
	
		// Returns x1 - x2
		public static int minus(int x1, int x2) {
			if(x2>0){
				for(int i=0;i<x2;i++)
			{
				x1--;
			}
			return x1;
			}
			if(x2<0)
			{
				for(int i=x2;i<0;i++)
				{
					x1++;
				}
				return x1;
			}
			return x1;
		}
	
		// Returns x1 * x2
		public static int times(int x1, int x2) {
			if (x1==0 || x2==0)
				return 0;
				if(x1==1)
				return x2;
				if(x2==1)
				return x2;
			 if(x1>0&&x2>0)
				{
					int num =x2;
				 for(int i=1;i<x1;i++)
				 {
					x2=Algebra.plus(x2, num);
				 }
				 return x2;
				}
			if(x1<0&&x2<0)
				{
					int num1=0;
					for(int i=x1;i<0;i++)
					{
						num1++;
					}
					int num2=0;
					for(int j=x2;j<0;j++)
					{
						num2++;
					}
					int num3=num2;
					for(int t=1;t<num1;t++)
				 {
					num2=Algebra.plus(num2,num3);
				 }
				 return num2;
				}
				if(x1<0){
						int num =x1;
					for(int i=1;i<x2;i++){
						x1=Algebra.plus(x1,num);
					}
					return x1;
					}
				else{
						int num =x2;
					for(int i=1;i<x1;i++){
						x2=Algebra.plus(x2,num);
					}
					return x2;
					}
				}
					
	
	
		// Returns x^n (for n >= 0)
		public static int pow(int x, int n) {
			if(x==0)
			return 0;
			if(n==0)
			return 1;
			if(n==1)
			return x;
			if(x==1)
			return 1;
			int res=x;
			int num=0;
				if(x<0&& Algebra.mod(n, 2)==0)
				{
					for(int i=x;i<0;i++){
						num++;
					}
					res=num;
					for(int j=0;j<n;j++){
						res=Algebra.times(res, num);
					}
					return res;
				}
				else{
					for(int i=1;i<n;i++)
					{
						res=Algebra.times(res, x);
					}
					return res;
				}
			}
	
		// Returns the integer part of x1 / x2 
		public static int div(int x1, int x2) {
			if(x1==0)
			return 0;
			if(x2!=0)
			{
				if(x1<0||x2<0){
				if(x1<0){
					if(x2<0)
					{
						int num1=0;
						int num2=0;
						for(int i=x1;i<0;i++){
							num1++;
						}
						for(int j=x2;j<0;j++){
							num2++;
						}
						int t=0;
						while(num1>=0){
							num1=Algebra.minus(num1,num2);
							t++;
						}
						return t;	
					}
					int t=0;
					int num=x1;
						while(x1<=0){
							x1=Algebra.plus(num,x2);
							t--;
						}
						return t;
					}
				}
					else 
				{
					int i =0;
					while(x1>=0&&x1>=x2){
					x1=Algebra.minus(x1, x2);
					i++;
					}
					return i;
				}
			}
			 return (int)Double.NaN;
		}
	
		// Returns x1 % x2
		public static int mod(int x1, int x2) {
			if(x1 ==0 ) 
			return 0;
			if(x2 ==0)
			return (int)Double.NaN;
			int res=x1;
				x1=Algebra.div(x1, x2);
				res=Algebra.minus(res, Algebra.times(x1, x2));
				return res;
		}
	
		// Returns the integer part of sqrt(x) 
		public static int sqrt(int x) {
			if(x==0)
			return 0;
			if(x<0)
			return (int)Double.NaN;
			int i =1;
			int num=x;
			while (i<x && num > i)
			{
				num=Algebra.div(x, i);
				i++;
			}
			return num;	
		}	  	  
	}

	
	