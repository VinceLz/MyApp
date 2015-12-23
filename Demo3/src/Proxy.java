import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.junit.Test;


public class Proxy {
	@Test
	public void  fun(){
		
		
		ClassLoader c=this.getClass().getClassLoader();
		Class[] inter={A.class,B.class};
		
		Object o=java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), inter, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				
					
					System.out.println("¹þ¹þ");
					
				
				return null;
			}
		});
		
		C d=(C)o;
		d.println1();
		d.println2();
	
	}
	
		
}
