public class Dataset {
    public double x1[] = {1,2,3,4,5,6,7,8,9};
    public double x2[] = {23,26,30,34,43,38,52,57,58};
    public double y[] = {651,762,856,1063,1190,1298,1421,1440,1518};
    public int n = 9;
    public void date(){
        int  i;
       for (i = 0; i < n; i++) {
            System.out.printf("\t %d\t %.2f \t %.2f\t %.2f \n", i + 1, x1[i], x2[i], y[i]);
        }
    }
}
