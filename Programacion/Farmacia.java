import java.util.Scanner;

class Farmacia {
	
public static void main (String[] args) {
	
Scanner sc = new Scanner (System.in); 
	
System.out.println("Ingrese el valor de la compra :");
	
double valor_compra = sc.nextDouble();
	
int tarjeta, contado ; tarjeta = 1 ; contado = 2 ;	
	
int metodo_pago=0;	
	
final double descuento, recargo ; descuento = 0.05 ; recargo = 0.03;
	
System.out.println("Ingrese el ultimo digito de su cedula por favor:");
	
int cc = sc.nextInt();
	
System.out.println(" Ingrese el dia actual por favor : ");
				  
int dia = sc.nextInt();

System.out.println("Ingresa el metodo de pago, tarjeta = 1 o contado = 2");

metodo_pago = sc.nextInt();
				   
while (!(metodo_pago == 1 || metodo_pago == 2)) {

metodo_pago = sc.nextInt(); 

}				   

if (metodo_pago == 1) {

System.out.println("tarjeta");
	
System.out.println("Tienes un recargo del 3% sobre el valor de tu compra");
	
double subtotal = valor_compra*recargo;	
	
System.out.println("El recargo equivale a: " + (valor_compra*recargo));
	
System.out.println("El saldo final es: " + (valor_compra+subtotal));
	
} else {

System.out.println("contado");
	
System.out.println("Tienes un decuento del 5% sobre el valor de tu compra");
		
System.out.println("El descuento equivale a: " + (valor_compra*descuento));

double subtotal = valor_compra*descuento;	

System.out.println("El saldo final es: " + (valor_compra-subtotal));	
	
	
}
	
String premio1 = "Te ganaste un té de durazno";	
 	
String premio2 = "Te ganaste una Cocacola de 750 ml";
	
String premio3 = "Te ganaste un descuento del 9% sobre el valor de tu proxima compra";
	
String premio4 = "Te ganaste un gel antibacterial";
	
String premio5 = "Te ganaste un sobre de dolex";

String premio6 = "Lo sentimos, no ganaste nada, suerte para la proxima"	;
	
System.out.println("Miremos si ganastes un premio");	
	
switch (dia) {
		
  case 6:
	if (cc%2==0){
	
	System.out.println("Felicidades. " + premio1);	
	
	}else{
	
	System.out.println("Felicidades. " + premio2);
	}
		
    break;
  
	case 9:
    System.out.println("Felicidades. " + premio3);
    break;
  
	case 24:
    if (cc%2==0){
	
	System.out.println("Felicidades. " + premio4);
	
	} else {
	
	System.out.println("Felicidades. " + premio5);	
	
	}
    break;
 
  default:
      System.out.println(premio6);
}






}
}