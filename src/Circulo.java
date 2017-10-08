
public class Circulo {
	float area;
	float raio;
	
	public Circulo(float area, float raio) {
		super();
		this.area = area;
		this.raio = raio;
	}

	public float calculaArea(){
		float area;
		area = this.area = (float) (raio*3.14);
		System.out.println(area);
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
}
