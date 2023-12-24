public class Maxminarr{

    public static void main(String[] args) {
        
        int myarr[] = {1,4,5,6,9,8,-99,99,45,65,67,89,-98,-45,87};
       // System.out.println(myarr[4]);

       int maxnum = myarr[0];
       int minnum = myarr[0]; 

       for(int i=1;i<myarr.length;i++){
        if(myarr[i]>maxnum){
            maxnum=myarr[i];
        }
        if(myarr[i]<minnum){
            minnum=myarr[i];
       }
    }     
    System.out.println("maxminum number of the array is:" +  maxnum);
    System.out.println("minimum number of the array is:"  +  minnum);

}
}