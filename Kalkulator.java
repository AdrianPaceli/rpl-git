public class Kalkulator{
		
	public float plus(float a, float b){
		return a+b;
	}
	
	public float minus(float a, float b){
		return a-b;
	}
	
	public float multiply(float a, float b){

		return a*b;
		
	}
	
	public float division(float a, float b){

			return a/b;
	}

	public float min(float a,float b)
	{
		if(a>b)
		{
			return b;
		}
		else if (b>a)
		{
			return a;
		}
	}
}
