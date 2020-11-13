class Frog{
	private int depth,jumpdepth,slipdepth;
	public int trydepth=0;
	public int count=0;
	
	public void jump(int depth,int jumpdepth,int slipdepth) {
		this.depth=depth;
		this.jumpdepth=jumpdepth;
		this.slipdepth=slipdepth;
		
		trydepth=this.jumpdepth-this.slipdepth;
		while(this.depth>=jumpdepth && trydepth>0) {
			this.depth-=trydepth;
			count++;
		}
		
	}
	
	public int totaljump() {
		return count;
	}
	
}
public class Assignment9 {
	public static void main(String[] args) {
		Frog frog=new Frog();
		frog.jump(10,2,1);
		System.out.println("Frog jumps "+frog.totaljump()+" times");
	}
}
