package questao4;

public class Main {

	public static void main(String[] args) {
		// Teste dos objetos das classes
		 FabricanteCelularA celularA = new FabricanteCelularA(false, 6800.00);
	        FabricanteCelularB celularB = new FabricanteCelularB(false, 5200.00);
	        
	        System.out.println("Fabricante Celular A:");
	        System.out.println("Preço: R$" + celularA.getPreco());
	        System.out.println("Tem TV: " + celularA.isTemTV());
	        
	        System.out.println("\nFabricante Celular B:");
	        System.out.println("Preço: R$" + celularB.getPreco());
	        System.out.println("Tem Rádio: " + celularB.isTemRadio());
	    }
	}

