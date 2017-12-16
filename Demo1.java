package fanshe;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo1 {

	public static void main(String[] args) {
		Class c;
		try {
			c = Class.forName("java.lang.String");
			Method ms[] = c.getDeclaredMethods();
			for (Method m:ms) {
				System.out.print(Modifier.toString(m.getModifiers()) + " ");
				System.out.print(m.getReturnType().getSimpleName() + " ");
				System.out.print(m.getName());
				
				Class paras[] = m.getParameterTypes();
				System.out.print(" (");
				for(int i = 0; i<paras.length; i++) {
					System.out.print(paras[i].getSimpleName());
					if(i<paras.length-1)
						System.out.print( ",");
				}
				System.out.print(")");
				
				Class exs[] = m.getExceptionTypes();
				if(exs.length >0) {
					System.out.print(" throw ");
				}
				System.out.print(" {");
				for(int i = 0; i<exs.length; i++) {
					System.out.print(exs[i].getSimpleName());
					if(i<exs.length-1)
						System.out.print( ",");
				}
				System.out.print(""
						+ "}");
				
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
