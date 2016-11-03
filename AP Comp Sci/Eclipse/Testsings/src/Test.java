
public class Test {

	public static void main(String[] args) {
		SpecialMeal a = new VegetarianMeal();
		SpecialMeal[] list = {a};
		WeddingService ws = new WeddingService(5, 5, list);
		System.out.println(ws.getBasePrice());
		System.out.println(ws.getTotalPrice(.5));
		System.out.println(ws.getBasePrice() * 1.5);
		System.out.println(ws.toString());
	}

}
