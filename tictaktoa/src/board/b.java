package board;

public class b {
	public int size;
	public char[][] mat;
	public b(int s){
		this.size=s;
		mat=new char[s][s];
		for(int i =0;i<s;i++) {
			for(int j =0;j<s;j++) {
				mat[i][j]='*';
			}
		}
		
	}
	public void getconfig() {
		//System.out.print("hello");
		int s=this.size;
		//System.out.print(mat[0][0]);
		for(int i =0;i<s;i++) {
			for(int j =0;j<s;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
