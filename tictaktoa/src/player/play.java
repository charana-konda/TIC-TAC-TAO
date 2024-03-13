package player;

public class play {
	private String name;
	private String email;
	private char sym;
	public void setdata(String name,String email,char sym ){
		this.name=name;
		this.email=email;
		this.sym=sym;
		
	}
	public void getdata(){
		System.out.println("name is "+this.name);
		System.out.println("email is "+this.email);
		System.out.println("Sym is "+this.sym);
		
		
	}
	
	public void setname(String name) {
		this.name=name;
		
	}
	public void setemail(String email) {
		this.email=email;
		
	}
	public void setsym(char sym) {
		this.sym=sym;
		
	}
	public String getname() {
		return name;
		
	}
	public String getemail() {
		return email;
		
	}
	public char getsym() {
	    return sym;
		
	}

}
