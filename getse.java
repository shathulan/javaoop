class getst{
    private int Lenth,Width;

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getLenth() {
        return Lenth;
    }

    public void setLenth(int lenth) {
        Lenth = lenth;
    }
   
   void area(){
    int are=Lenth*Width;
    System.out.println("Area Is "+are);
   } 
  public int volume(int Lenth,int Width){
    int vol=Width*Lenth*Lenth;
    return vol;
   }

}


public class getse {
   public static void main(String[] args) {
    getst gettersetter=new getst();
    //gettersetter.lenth=25;
    gettersetter.setLenth(25);
    gettersetter.setWidth(2);
    gettersetter.area();
    System.out.println(gettersetter.volume(2,5));

   } 
}
