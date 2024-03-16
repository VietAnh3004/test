package itforstudent;

import javax.swing.JOptionPane;
public class BaiTap1 {
  public static void main(String[] args){
      int nam,thang;
      nam=Integer.parseInt(JOptionPane.showInputDialog("Hay nhap nam:"));
      thang=Integer.parseInt(JOptionPane.showInputDialog("Hay nhap thang:"));
      switch(thang){
          case 1:case 3:case 5:case 7:case 8:case 10:case 12:
              JOptionPane.showMessageDialog(null,"So ngay la: 31");
              break;
          case 2: 
              if((nam%4==0 && nam%100!=0) || nam%400==0) 
              JOptionPane.showMessageDialog(null, "So ngay la: 29");
              else JOptionPane.showMessageDialog(null, "So ngay la: 28");
              break;
          default:
              JOptionPane.showMessageDialog(null, "So ngay la: 30");
      }
      System.exit(0);
  }
}
