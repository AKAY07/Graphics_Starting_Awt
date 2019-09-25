
package graphics_awt;
import java.awt.*;
import java.awt.event.*;

public class Graphics_awt extends Frame{

 Graphics_awt(){
     this.addWindowListener(new WindowAdapter(){
       public void windowClosing(WindowEvent e){
           System.exit(0);
       }
 });
     
 }
 
 public void paint(Graphics g){
     g.setColor(Color.red);
     g.drawRect(50,50,400,300);
     g.drawOval(160,110,160,160);
     g.drawOval(190, 150,30,30);
     g.drawOval(260,150,30,30);
     g.drawLine(240,170,240,200);
     g.drawArc(220,210,45,20,0,-180);
     
 }
    
    
    public static void main(String[] args) {
        Graphics_awt obj=new Graphics_awt();
        obj.setVisible(true);
        obj.setSize(500,500);
        
    }
    
}
