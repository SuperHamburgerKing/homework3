package homework;

public class Box5 implements Box {
    float length =39.5f;
    float width = 27.5f;
    int height = 23;
    @Override
    public void volidate(float length,float width,int height) {
        if(this.length>length && this.width>width && this.height>height){
            System.out.println("可以寄送");
        }
        else{
            System.out.println("超出容量，不可寄送");
        }
    }
}
