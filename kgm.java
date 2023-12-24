import java.util.Scanner;
class kgm{
        private static int rectlength;
        private static int rectwidth;
        private static double rhombusdig1;
        private static double rhombusdig2;
         
         
    void rect(int length,int width){
        rectlength=length;
        rectwidth=width;
         }
         
    void rhombus(double dig1,double dig2){
        rhombusdig1=dig1;
        rhombusdig2=dig2;
    }  
    
    static int rectarea(){
     return rectlength*rectwidth;   
    }
    
    static double rhombusarea(){
        return (rhombusdig1*rhombusdig2)/2;
    }
    public static void main(String[] args){
        kgm obj=new kgm();
        obj.rect(11,12);
        obj.rhombus(12.0,10.0);
        
        System.out.println("Rectangle: "+ rectarea());
        System.out.println("Rhombus: "+ rhombusarea());
    }
}