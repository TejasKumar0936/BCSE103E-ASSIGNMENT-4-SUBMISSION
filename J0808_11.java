class J0808_11{
    public void fullThrottle(){
        System.out.println("This car is going as fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }
    public static void main(String[] args){
        J0808_11 myObj = new J0808_11();
        myObj.fullThrottle();
        myObj.speed(200);
    }
}