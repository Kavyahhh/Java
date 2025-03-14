class SmallestElement{
    public static void main(String[] args){
        int n=5;
        int [] a = {1,3,5,7,8};
        int Smallest=a[0];
        for(int i=1;i<n;i++){
            if(Smallest>a[i]){
                Smallest=a[i];
            }
            
        }
        System.out.print(Smallest);
    }
}
