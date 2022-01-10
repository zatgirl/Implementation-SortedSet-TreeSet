package cadastro;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
import java.util.Iterator;

//201820561
public class Cadastro {

	public static void main(String[] args) {
		//TESTE DE CLASSES
		Circle circulo = new Circle();
		Rectangle retangulo = new Rectangle();
		/*
		circulo.setName("batatinha");	
		circulo.setColor("Preto");
		circulo.setFilled(true);
		circulo.setRadius(2.0);
		System.out.println(circulo);
		
		retangulo.setName("pilhinha");	
		retangulo.setColor("Rosa");
		retangulo.setFilled(false);
		retangulo.setLength(10.0);
		retangulo.setWidth(20.0);
		System.out.println(retangulo);*/
		//END TESTE

		String op1 = "ADICIONAR";
		String op2 = "REMOVER";
		String op3 = "LISTAR";
		String op4 = "ENCERRAR";
		String Obj1 = "circulo";
		String Obj2 = "retangulo";

		List<Circle> listCircle = new ArrayList<Circle>();
		Comparator<Circle> radiusComparator = Comparator.comparing(Circle::getRadius);
		TreeSet<Circle> treeCircle = new TreeSet<>(radiusComparator);
		
		List<Rectangle> listRectangle = new ArrayList<Rectangle>();
		Comparator<Rectangle> areaComparator = Comparator.comparing(Rectangle::getArea);
		TreeSet<Rectangle> treeRectangle = new TreeSet<>(areaComparator);

		while(true){

			System.out.print("\nDigite se deseja ADICIONAR, REMOVER, LISTAR ou ENCERRAR: ");
			Scanner escolha = new Scanner(System.in);
			String op = escolha.nextLine();
			//System.out.print(op);
			//Testa se o usuário entrou com a string "ADICIONAR"
			if(op1.equals(op)){
				System.out.print("Digite a forma do objeto a ser adicionado: ");
				Scanner objeto = new Scanner(System.in);
				String comparaObj = objeto.nextLine();
				if(Obj1.equals(comparaObj)){
					Scanner scan_name = new Scanner(System.in);
					System.out.print("Digite o nome do circulo: ");
					String name = scan_name.nextLine();
					circulo.setName(name);
					System.out.print("Digite a cor do circulo: ");
					Scanner scan_color = new Scanner(System.in);
					String color = scan_color.nextLine();
					circulo.setColor(color);
					System.out.print("Digite o raio do circulo: (0,0) ");
					Scanner scan_radius = new Scanner(System.in);
					double radius = scan_radius.nextDouble();
					circulo.setRadius(radius);
					System.out.print("O circulo será preenchido ou nao? (true or false): ");
					Scanner scan_filled = new Scanner(System.in);
					boolean filled = scan_filled.nextBoolean();
					circulo.setFilled(filled);
					listCircle.add(new Circle(name, color, radius, filled));
					treeCircle.add(listCircle.get(0));
					listCircle.clear();
					//Set<Circle> hsc = new HashSet<Circle>();
					//hsc.add(new Circle());
				}
				if(Obj2.equals(comparaObj)){
					System.out.print("Digite o nome do retangulo: ");
					Scanner scan_name = new Scanner(System.in);
					String name = scan_name.nextLine();
					retangulo.setName(name);
					System.out.print("Digite a altura do retangulo: (0,0) ");
					Scanner scan_width = new Scanner(System.in);
					double width = scan_width.nextDouble();
					retangulo.setWidth(width);
					System.out.print("Digite a largura do retangulo: (0,0) ");
					Scanner scan_length = new Scanner(System.in);
					double length = scan_length.nextDouble();
					retangulo.setLength(length);
					System.out.print("Digite a cor do retangulo: ");
					Scanner scan_color = new Scanner(System.in);
					String color = scan_color.nextLine();
					retangulo.setColor(color);
					System.out.print("O retangulo será preenchido ou nao? (true or false): ");
					Scanner scan_filled = new Scanner(System.in);
					Boolean filled = scan_filled.nextBoolean();
					retangulo.setFilled(filled);
					listRectangle.add(new Rectangle(name, color, width, length, filled));
					treeRectangle.add(listRectangle.get(0));
					listRectangle.clear();
				}	
			}
			//Testa se o usuário entrou com a string "REMOVER"
			if(op2.equals(op)){
				System.out.print("Qual o objeto a ser removido? circulo ou retangulo: ");
				Scanner objeto = new Scanner(System.in);
				String comparaObj = objeto.nextLine();
				//Circulo selecionado
				if(Obj1.equals(comparaObj)){
					System.out.printf("Circulos existentes: \n");
					treeCircle.forEach(form -> System.out.println(form.getName()));
					System.out.print("Qual o NOME do circulo? ");
					Scanner scan_nameObj = new Scanner(System.in);
					String nameObj = scan_nameObj.nextLine();
						Iterator<Circle> name = treeCircle.iterator();
						while (name.hasNext()) {
							Circle next = name.next();
							if (next.getName().equals(nameObj)) {
								name.remove();
							} else {
								System.out.println("Não existe, tente novamente!");
								break;
							}
						}
				}
				//Retangulo selecionado
				if(Obj2.equals(comparaObj)){
					System.out.printf("Retangulos existentes: \n");
					treeRectangle.forEach(form -> System.out.println(form.getName()));
					System.out.print("Qual o NOME do retangulo? ");
					Scanner scan_nameObj = new Scanner(System.in);
					String nameObj = scan_nameObj.nextLine();
						Iterator<Rectangle> name = treeRectangle.iterator();
						while (name.hasNext()){
							Rectangle next = name.next();
							if (next.getName().equals(nameObj)){
								name.remove();
							} else {
								System.out.println("Não existe, tente novamente!");
								break;
							}
						}
				}	
			}
			//Testa se o usuário entrou com a string "LISTAR"
			if(op3.equals(op)){ //Ambas implementações funcionam
				System.out.println("--- Lista classificada por tamanho da area (A-Z) ---");
				// forEach
				/*System.out.printf("Circulos: \n");
				treeCircle.forEach(form -> System.out.println(form.getName()));
				System.out.printf("Retangulos: \n");
				treeRectangle.forEach(form -> System.out.println(form.getName()));*/

				// ou pela iterator que eh dita como o melhor jeito
				Iterator<Circle> ordemCircle = treeCircle.iterator();
				Iterator<Rectangle> ordemRectangle = treeRectangle.iterator();
				System.out.println("Circulos: ");
				while (ordemCircle.hasNext()) {
					Circle next = ordemCircle.next();
					System.out.println(next.getName());
				}
				System.out.println("Retangulos: ");
				while (ordemRectangle.hasNext()) {
					Rectangle next = ordemRectangle.next();
					System.out.println(next.getName());
				}
			}
			//Testa se o usuário entrou com a string "ENCERRAR"
			if(op4.equals(op)){
				break;
			}
		}
	}
}

//rascunho
		/*
		
		Set<Circle> hsc = new HashSet<Circle>();
        hsc.add(new Circle());
     	

		Set<Circle> hsc = new HashSet<Circle>();
		Iterator<Circle> it = ordena.iterator();
		while(it.hasNext()){
			System.out.printIn(it.next());
		}

		https://www.baeldung.com/java-8-comparator-comparing
		https://dicasdejava.com.br/java-como-ler-dados-do-console-com-a-classe-scanner/
		http://www.linhadecodigo.com.br/artigo/3669/trabalhando-com-a-interface-set-no-java.aspx
		https://stackoverflow.com/questions/85190/how-does-the-java-for-each-loop-work
		https://www.guj.com.br/t/pecorrendo-lista-com-iterator/92509/2
		https://stackoverflow.com/questions/13520571/foreach-loop-in-java-for-a-custom-object-list
		*/
