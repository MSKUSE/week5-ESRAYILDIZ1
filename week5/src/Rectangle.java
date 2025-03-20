public class Rectangle {

    private Point topLeft;
    private int sideA,sideB;
    public Rectangle(Point topLeft,int sideA,int sideB){
        this.topLeft =topLeft;
        setSideA(sideA);
        setSideB(sideB);

    }
    public Rectangle(Point topLeft,int sideA){
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
    }
    public Point getTopLeft(){
        return topLeft;
    }
    public void setTopLeft(Point topLeft){
        this.topLeft =topLeft;
    }
    public int getSideB(){
        this.topLeft = topLeft;


    }
    public int getSideB(){
        return sideB;

    }
    public void setSideB(int sideB){
        if(sideB < 0){
            this.sideB =0;
            System.out.println("Side B is negative");

        }
        else{
            this.sideB =sideB;

        }
    }
    public int getSideA(){
        return sideA;
    }
    public void setSideA(int sideA){
        if (sideA < 0){
            System.out.println("side A cant be negative");
        }
        else{
            this.sideA = sideA;

        }
    }

}
