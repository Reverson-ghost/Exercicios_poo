package Class;


public class NewClassCone {
    
    int Raio, Altura;
    float geratriz;
    
    
    public int getRaio() {
        return Raio;
    }

    public void setRaio(int Raio) {
        this.Raio = Raio;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }
    
    public float CalcularGeratriz(){//verificado
        return(float) (Math.sqrt((Altura*Altura)+(Raio*Raio)));
    }
    
    float areaLateral(){
        return(float)(Math.PI*Raio*geratriz);
    }
    
    float areaTotal(){
        return(float) (Math.PI*Raio*(geratriz+Raio));
    }
    
    float volume(){
        return(float)(1.0/3.0*Math.PI*Raio*Raio*Altura);
    }
}
