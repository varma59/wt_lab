/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.io.*;
public class  Beanjava implements Serializable 
{
protected int n, fact=1;
public Beanjava(){   }
public int getN()
{
return n;
}
public void setN(int n)
{
 this.n=n;
for(int i=1;i<=n;i++)
	{	fact=fact*i;
	}
}
public int getFact()
{
return fact;
}
}
