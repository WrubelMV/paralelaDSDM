package paraleladsdm;


import java.util.Scanner;


public class ParalelaDSDM {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        Moto moto1 = new Moto();
        Moto moto2 = new Moto();
        Passeio passeio1 = new Passeio();
        Passeio passeio2 = new Passeio();
        SUV suv = new SUV();
        
     
            moto1.setPlaca("OIL-3289");
            moto1.setAno(2015);
            moto1.setMarca("HONDA");
            moto1.setModelo("CG125");
            moto1.setValor(5000.00);
            moto1.setKilometragem(0);
            
            
            moto2.setPlaca("BIL-2928");
            moto2.setAno(2011);
            moto2.setMarca("HONDA");
            moto2.setModelo("POP100");
            moto2.setValor(2000.00);
            moto2.setKilometragem(3000);
            
            passeio1.setPlaca("JEO-8213");
            passeio1.setAno(2017);
            passeio1.setMarca("Honda");
            passeio1.setModelo("Civic");
            passeio1.setValor(80000.00);
            passeio1.setKilometragem(7600);
            passeio1.setNumAssentos(5);
            passeio1.setValSeg(800.00);
            
            passeio2.setPlaca("MAN-9093");
            passeio2.setAno(2015);
            passeio2.setMarca("Volkswagen");
            passeio2.setModelo("Jetta");
            passeio2.setValor(40000.00);
            passeio2.setKilometragem(7600);
            passeio2.setNumAssentos(5);
            passeio2.setValSeg(400.00);
            
            suv.setPlaca("OI-9653");
            suv.setAno(2017);
            suv.setMarca("HONDA");
            suv.setModelo("HR-V");
            suv.setValor(100000.00);
            suv.setKilometragem(0);
            suv.setNumAssentos(5);
            suv.setValSeg(1500.00);
            
            
            double valorTotalMoto1 = moto1.getValor() + (moto1.getValor() * 0.025);
            moto1.setValor(valorTotalMoto1);
            
            double valorTotalMoto2 = moto2.getValor() + (moto2.getValor() * 0.025);
            moto2.setValor(valorTotalMoto2);
            
            double valorTotalPasseio1 = passeio1.getValor() + (passeio1.getValor() * 0.05) + passeio1.getValSeg;
            passeio1.setValor(valorTotalPasseio1);
            
            double valorTotalPasseio2 = passeio2.getValor() + (passeio2.getValor() * 0.05) + passeio2.getValSeg;
            passeio2.setValor(valorTotalPasseio2);
            
            double valorTotalSuv = suv.getValor() + (suv.getValor() * 0.08) + suv.getValSeg;
            suv.setValor(valorTotalSuv);
            
            
            System.out.println("Lista dos veículos com informações de seu valor em ordem decrescente :");
            System.out.println("");
            System.out.println("HONDA HR-V: ");
            System.out.println("Valor: " + suv.getValor());
            System.out.println("");
            System.out.println("HONDA Civic: ");
            System.out.println("Valor: " + passeio1.getValor());
            System.out.println("");
            System.out.println("VOLKSWAGEN Jetta: ");
            System.out.println("Valor: " + passeio2.getValor());
            System.out.println("");
            System.out.println("HONDA CG125: ");
            System.out.println("Valor: " + moto1.getValor());
            System.out.println("");
            System.out.println("HONDA POP100: ");
            System.out.println("Valor: " + moto2.getValor());
            System.out.println("");
            
        
    }
    
}
