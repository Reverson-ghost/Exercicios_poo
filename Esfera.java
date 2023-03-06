// metodos e atributos para a classe  Esfera
package classeEsfera;

public class Esfera {

    //atributos
    private float raio;

    public Esfera() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //metodos
    float calculrArea() {
        return (float) (4.0 * Math.PI * raio * raio);

    }

    public Esfera(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio)throws Exception {

        if (raio <= 0)throw new Exception ("O raio nao pode ser menor que  0");
        
        this.raio = raio;

    }

    double calcularVolume() {

        return (float) ((4.0 / 3.0) * Math.PI) * Math.pow(raio, 3);
        

    }

    public String calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
