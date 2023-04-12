/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.beans.*;
public class  IntroBean
{
public static void main(String args[])throws IntrospectionException
{
BeanInfo info=Introspector.getBeanInfo(Beanjava.class,Object.class);
for(PropertyDescriptor pd:info.getPropertyDescriptors())
{
System.out.println("Bean Properties:=" + pd.getName());
}
for (MethodDescriptor md : info.getMethodDescriptors())
{	
System.out.println(" Bean Methods: " + md.getName());
} 
}
}
