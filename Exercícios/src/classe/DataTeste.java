package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data date1 = new Data();
		date1.ano = 2023;
		date1.mes = 4;
		date1.dia = 19;
		
		Data date2 = new Data();
		date2.ano = 1956;
		date2.mes = 8;
		date2.dia = 5;
		
		System.out.printf("%d/%d/%d\n", date1.dia ,date1.mes , date1.ano);
		System.out.printf("%d/%d/%d\n", date2.dia ,date2.mes ,date2.ano);
	}
}
