class Box {
    double width;
    double height;
    double depth;

    Box(){
        //the default constructor
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    // Method1
    double volume() {
        return width * height * depth;
    }

    //Method2
    void setDim(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
}

class Constructor {
    public static void main(String args[]) {

        //Creating object of class Box
        Box myBox =new Box(); //calling the default constructor
        myBox.width=5;
        myBox.height=10;
        myBox.depth=20;
        double vol= myBox.width* myBox.height* myBox.depth;
        System.out.println("Volume is: "+vol);

        // invoking constructor
        Box obj1 = new Box(3,5,10);
        // invoking constructor
        Box obj2 = new Box(10,15,20);
        System.out.println("Vol of Box1: " + obj1.volume());
        System.out.println("Vol of Box2: " + obj2.volume());
    }
}