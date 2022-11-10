package array;

public class Addclass {
	private Object[] array;
	private int position;
	public Addclass(int arraysize) {
		this.array=new Object[arraysize];
	}
	public void add(Object element) {
		if(this.position>=this.array.length) {
		  growArray();
		}
		this.array[position++]=element;
	}
	public Object get(int index) {
		return this.array[index];
	}
   public int size() {
	   return this.position;
   }
   private void growArray() {
	   Object[] temp=new Object[this.array.length+5];
	   System.arraycopy(this.array,0,temp,0,this.array.length);
	   array=temp;
  }
}
