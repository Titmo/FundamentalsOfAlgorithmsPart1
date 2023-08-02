public class Array {
    private int id;
    private String array;

   public Array(int id, String array) {
      this.id = id;
      this.array = array;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getArray() {
      return array;
   }

   public void setArray(String array) {
      this.array = array;
   }

   @Override
   public String toString() {
      return "Array{" +
              "id=" + id +
              ", array='" + array + '\'' +
              '}';
   }
}
