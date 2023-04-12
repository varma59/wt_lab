/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
public class Beansign extends Canvas implements Serializable 
{
transient private Color color; // not persistent
private boolean rectangular; // is persistent
public Beansign()
{
addMouseListener(new MouseAdapter() 
{
public void mousePressed(MouseEvent me) 
{
change();
}
});
rectangular = false;
setSize(200, 100);
change();
}


public boolean getRectangular() 
{
return rectangular;
}
public void setRectangular(boolean flag) 
{
this.rectangular = flag;
repaint();
}
public void change()
 {
color = randomColor();
repaint();
}
private Color randomColor()
 {
int r = (int)(255*Math.random());
int g = (int)(255*Math.random());
int b = (int)(255*Math.random());
return new Color(r, g, b);
}
public void paint(Graphics g)
{
Dimension d = getSize();
int h = d.height;
int w = d.width;
g.setColor(color);
if(rectangular) 
{
g.fillRect(0, 0, w-1, h-1);
}
else
 {
g.fillOval(0, 0, w-1, h-1);
}
}
}
