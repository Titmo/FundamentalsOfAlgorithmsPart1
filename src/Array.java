public class Array {
    private int size;
    private String[] array;

   public Array(int size, String[] array) {
      this.size = size;
      this.array = array;
   }

   public int getSize() {
      return size;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public String[] getArray() {
      return array;
   }

   public void setArray(String[] array) {
      this.array = array;
   }
}
