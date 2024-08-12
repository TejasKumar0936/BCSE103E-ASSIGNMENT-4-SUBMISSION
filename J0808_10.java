class J0808_10{
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    public static void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args){
        myStaticMethod();
        J0808_10 myObj = new J0808_10();
        myObj.myPublicMethod();
    }
}