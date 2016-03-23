public class Proses{

	public static void main(String[] args)
	{
		Proses nama = new Proses();
		nama.namaSaya();
		nama.pertambahan();
		
		System.out.println(nama.namaSaya());
	}
		
	public String namaSaya(){
		return "jaelan Sopari";
	}
	
	public void pertambahan(){
		int a=1;
		int b=2;
		System.out.println(a+b);
	}
}

