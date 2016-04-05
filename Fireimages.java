/**
 * Write a description of class Fireimages here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireimages implements Container {
   public String names[] = {"1" , "2" ,"3" };

   @Override
   public  Iter getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iter {

      int index;

      @Override
      public boolean hasNext() {
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }		
   }
}