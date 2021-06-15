//Navio implementa p�ssaro do Flappybird
public class Navio {

	public double x,y;
	public double vy = 0;
	
	public static double G = 1000;
	public static double FLAP = -300;
	
	public Hitbox box;
	
	public Navio(double x, double y){
		this.x = x;
		this.y = y;
		this.box = new Hitbox(x,y, x+34, y+24);
	}
	
	
	public void atualiza(double dt){ //atualiza conforme a varia��o de tempo
		//vy += G*dt;
		y += 2*dt;
		
		box.mover(0, vy*dt); //movimenta�o do plano de fundo
	}
	
	public void flap(){
		vy = FLAP;
	}
	
	
	public void desenhar(Tela t){
		t.imagem("ocean.png", 565, 101, 175, 100, Math.atan(vy/150), x, y);
	}
	
}
