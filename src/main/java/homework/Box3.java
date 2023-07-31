package homework;

public class Box3 implements Box{
    float length =23f;
    float weight = 14f;
    int height = 13;
    @Override
    public void volidate(float length, float width, int height) {
        if(this.length>length && this.width>width && this.height>height){
            System.out.println("可以寄送");
        }
        else{
            System.out.println("超出容量，不可寄送");
        }
    }
}
