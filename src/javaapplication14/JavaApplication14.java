package javaapplication14;
import java.util.*;
import java.io.IOException;
import java.time.Clock;


public class JavaApplication14 {
       static String[] word;
       static Scanner reader;
       static double[] num;
       static int num3;
       static int[] arreglo;
       static int[] arreglo1;
       static int[] arreglo2;
       static int[] nume1;
       
    /**name: inicializar
     * this method initializes all static variables
     */   
    public static void inicializar(){
        word= new String[3];
        reader = new Scanner(System.in);
        num = new double[2];  
        arreglo  = new int[1];
        arreglo1  = new int[1];
        arreglo2 = new int[1];
        nume1 = new int[3];
    }
    /**name : main
     * is the main method and shows everything done in the other methods
     * @param args 
     */
    public static void main(String[] args) {
                inicializar();
                char finish='n';
                int opt;
                Double newData = new Double(1);
                int value = newData.intValue(); 
                num3=value;
                Random rnd = new Random();
                
		do{
                    cls();
                    System.out.println("main menu "
                            + "\n option1 = Enter three strings of characters "
                            + "\n option2 = the length of each chain "
                            + "\n option3 = Concatenate the three chains "
                            + "\n option 4 = Display on screen the character located in a position of the string as the user enters "
                            + "\n option 5 = Enter two real numbers greater than zero "
                            + "\n option 6 = Show the division of both numbers "
                            + "\n option 7 = Show the division and residue of the whole part of both numbers"
                            + "\n option 8 = enter the three sizes of the arrays and then fill them respectively"
                            + "\n option 9 = show ordered arrays"
                            + "\n option 10 = average value of one of the three arrays"
                            + "\n option 11 = greater value of the arrays"
                            + "\n option 12 = you want to operate the array"
                            + "\n option 13 = union of the three arrangements"
                            + "\n option 14 = union without repeating numbers"
                            + "\n option 15 = interception of the three arrangements"
                            + "\n option 16 = move arrangements n position"
                            + "\n option 17 = burbuja");
                    opt = Integer.parseInt(reader.nextLine());
			switch (opt){
			case 1://the length of each chain
                            caso1();  
			break;
			case 2://shows the size of the characters
                            caso2(word);
			break;
			case 3://prints the characters
                            caso3(word);
			break;
			case 4://looks for a snail 
                             caso4();
			break;
                        case 5://captures the numbers for the division
                            caso5();
                        break;
                        case 6://performs the division
                            caso6();
                        break;
                        case 7:
                            caso7();
                        break;
                        case 8:
                            caso8();    
                        break;
                        case 9:
                            caso9();
                        break;
                        case 10:
                            caso10();
                        break;
                        case 11:
                            caso11();
                        break;
                        case 12:
                            caso12();
                        break;
                        case 13:
                            caso13();
                        break;
                        case 14:
                            caso14();
                        break;
                        case 15:
                            //caso15();
                        break;
                        case 16:
                            caso16();
                        break;
                        case 17:
                            caso17_burbuja();
                        break;
                        }
                        System.out.println("\nwant to finish if/not");
                        finish = reader.nextLine().charAt(0);
                }while (finish !='i');        
        }
    /**name : cls
     * delete on screen
     */
    public static void cls(){
        try{
            ProcessBuilder pb =new ProcessBuilder("cmd","/c","cls");
            pb.inheritIO().start().waitFor();
        }catch(Exception E){
            System.out.println(E.getMessage());       
        }
    }
    public static void cls2(){
        try{
            Runtime.getRuntime().exec("cls");
        }
        catch(IOException E){
            System.out.println("error");       
        }
    }
    /**name:caso1
     * Enter three strings of characters 
     * <b>pre:</b> word tiene que existir 
     * <b>pos:</b> modifica el oljeto word 
     */
    public static void caso1(){
        int cont=0;
	for (int i=0;i<3;i++){
            cont++;
            System.out.println(" enter a word # "+cont);
            word[i]= reader.nextLine();				                                      
	}
    }
    /**name:caso2
     * the length of each chain 
     * @param word 
     */
    public static void caso2(String[] word){
        int data;
        for (int i=0;i<3;i++){
            data = word[i].length();
            System.out.println("string size "+data+"\n");
        }
    }
    /**name:caso3
     * Concatenate the three chains
     * @param word 
     */
    public static void caso3 (String[] word){
        for (int i=0;i<3;i++){			
            System.out.println(word[i]);
	}
    }
    /**name: caso4
     * Display on screen the character located in a position of the string as the user enters
     * <b>pre</b> tawork sea mayor a 0
     *  
     */
    public static void caso4 (){
        int psletra,tawork;
        char work1;
        System.out.println("type the number of the character ");
        psletra= Integer.parseInt(reader.nextLine());
        psletra=psletra-1;
	for (int i=0;i<3;i++){			
            tawork=word[i].length();
            if (psletra>tawork){
                System.out.println("in that position there is no character");
            }
            work1 = word[i].charAt(psletra);
            System.out.println(work1);		
	}
    }
    /**name : caso5
     * Enter two real numbers greater than zero
     */
    public static void caso5(){
        int cont1=0;
        for (int i=0;i<2;i++){
            cont1=cont1+1;
            System.out.println("digite el num  "+cont1);
            num[i]= Double.parseDouble(reader.nextLine());
        }
    }
    /**name: caso6
     * Show the division of both numbers
     * 
     */
    public static void caso6(){
        double div;
        div=num[0]/num[1];
        System.out.println("the division between "+num[0]+" / "+num[1]+" = "+div);
    }
    /**name : caso7
     * Show the division and residue of the whole part of both numbers
     * 
     */
    public static void caso7( ){
        double rec;
        rec=num[0]%num[1];
        Double newData1 = new Double(rec);
        int value2 = newData1.intValue();
        System.out.println("entire division = "+num3+"\n"+"and the residue is = "+value2);
    }
    /**name: caso8
     * enter the three sizes of the arrays and then fill them respectively
     */
    public static void caso8(){
        int nume2,nume3;
        for (int i=0;i<3;i++){  
            System.out.println("ingrese tamaño arreglo #"+(i+1));
            String a = reader.nextLine();
            nume1[i]= Integer.valueOf(a);
        }
        arreglo =new int[nume1[0]];
        arreglo1 = new int[nume1[1]];
        arreglo2 = new int[nume1[2]];
        for (int y=0;y<arreglo.length;y++){
            System.out.println("ingrese num arreglo #"+(y+1));
            arreglo[y] = Integer.parseInt(reader.nextLine());  
        }
        for(int y = 0; y < arreglo1.length; y++){
            System.out.println("ingrese num arreglo #"+(y+1));
            arreglo1[y] = Integer.parseInt(reader.nextLine());  
        }
        for(int y = 0; y < arreglo2.length; y++){
            System.out.println("ingrese num arreglo #"+(y+1));
            arreglo2[y] = Integer.parseInt(reader.nextLine());  
        }
        }
    /**name: caso8
     * show ordered arrays
     */
    public static void caso9(){
       for (int i=0;i<3;i++){  
                            
                for (int y=0;y<nume1[i];y++){
                if (i==0){
                    System.out.print(" * "+arreglo[y]+" | ");
                }
                if (i==1){
                    System.out.print(" * "+arreglo1[y]+" | ");
                }
                if (i==2){
                    System.out.print(" * "+arreglo2[y]+" | ");
                }
                if(y==nume1[i]-1){
                    System.out.println("");
                }
            }
        }
    }
    /**name: caso10
     * 
     */
    public static void caso10(){
        double pro=0;
        int cade;
        double div;
        System.out.println("digite la cadena que quiere revisar");
        cade= Integer.parseInt(reader.nextLine());                            
            for (int y=0;y<nume1[cade-1];y++){
                if (cade==1){
                    pro=(pro+arreglo[y]);
                }
                if (cade==2){
                    pro=(pro+arreglo1[y]); 
                }
                if (cade==3){
                    pro=(pro+arreglo2[y]);
                } 
            }
        div=pro/nume1[cade-1];
        System.out.print("el promedio del arreglo es = "+div);
    }
    /**name : caso11
     * greater value of the arrays
     */
    public static void caso11(){
        int cade;
        double mayor=0;
	int pos_salario=0;
        System.out.println("digite la cadena que quiere revisar");
        cade= Integer.parseInt(reader.nextLine());                            
            for (int y=0;y<nume1[cade-1];y++){
                if (cade==1){
                    if (arreglo[y]>mayor){
			mayor=arreglo[y];
			pos_salario=y;
                    }
                    System.out.println(arreglo[pos_salario]);
                }
                if (cade==2){
                    if (arreglo1[y]>mayor){
			mayor=arreglo1[y];
			pos_salario=y;
                        System.out.println(arreglo1[pos_salario]);
                    } 
                }
                if (cade==3){
                    if (arreglo2[y]>mayor){
			mayor=arreglo2[y];
			pos_salario=y;
                        System.out.println(arreglo2[pos_salario]);
                    }
                } 
            }
    }
    /**name : case12
     * you want to operate the array
     */
    public static void caso12(){
        int op=0,cad1,cad2,larg=0,mayorr=0;
        int[] opt_arreglo;
        System.out.println("digite la opcion que desea realizar \n 1) suma \n 2) resta \n 3) multiplicacion");
        op=Integer.parseInt(reader.nextLine());
        System.out.println("digite que cadenas quiere que realice la operacion");
        cad1=Integer.parseInt(reader.nextLine());
        System.out.println("digite que cadenas quiere que realice la operacion");
        cad2=Integer.parseInt(reader.nextLine());
        cad1--;
        cad2--;
        
        if (cad1<=2&&cad2<=2){
           if (nume1[cad1]<nume1[cad2]){
                    mayorr=nume1[cad2];
                    larg=nume1[cad1];
            }
            if (nume1[cad2]<nume1[cad1]){
                    mayorr=nume1[cad1];
                    larg=nume1[cad2];
            }
            if (nume1[cad2]==nume1[cad1]){
                    mayorr=nume1[cad1];
                    larg=nume1[cad1];
            }
                opt_arreglo  = new int[mayorr];
            switch (op){
            case 1:
                if(cad1==0&&cad2==1||cad1==1&&cad2==0){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo[i]+arreglo1[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo.length){
                            opt_arreglo[i]=arreglo[i];
                        }
                        if (mayorr==arreglo1.length){
                            opt_arreglo[i]=arreglo1[i];
                        }
                    }
                }
                if(cad1==1&&cad2==2||cad1==2&&cad2==1){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo2[i]+arreglo1[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo2.length){
                            opt_arreglo[i]=arreglo2[i];
                        }
                        if (mayorr==arreglo1.length){
                            opt_arreglo[i]=arreglo1[i];
                        }
                    }
                }
                if(cad1==2&&cad2==0||cad1==0&&cad2==2){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo[i]+arreglo2[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo2.length){
                            opt_arreglo[i]=arreglo2[i];
                        }
                        if (mayorr==arreglo.length){
                            opt_arreglo[i]=arreglo[i];
                        }
                    }
                }
                System.out.println("sum en arreglo nuevo");
                for(int i=0;i<=opt_arreglo.length-1;i++){
                    System.out.println(opt_arreglo[i]);
                }
            break;
            case 2:
                if(cad1==0&&cad2==1){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo[i]-arreglo1[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo.length){
                            opt_arreglo[i]=arreglo[i];
                        }
                        if (mayorr==arreglo1.length){
                            opt_arreglo[i]=arreglo1[i];
                        }
                    }
                }
                if(cad1==1&&cad2==0){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo1[i]-arreglo[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo.length){
                            opt_arreglo[i]=arreglo[i];
                        }
                        if (mayorr==arreglo1.length){
                            opt_arreglo[i]=arreglo1[i];
                        }
                    }
                }
                //cambio
                if(cad1==1&&cad2==2){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo1[i]-arreglo2[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo2.length){
                            opt_arreglo[i]=arreglo2[i];
                        }
                        if (mayorr==arreglo1.length){
                            opt_arreglo[i]=arreglo1[i];
                        }
                    }
                }
                if(cad1==2&&cad2==1){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo2[i]-arreglo1[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo2.length){
                            opt_arreglo[i]=arreglo2[i];
                        }
                        if (mayorr==arreglo1.length){
                            opt_arreglo[i]=arreglo1[i];
                        }
                    }
                }
                //cambio
                if(cad1==2&&cad2==0){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo2[i]-arreglo[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo2.length){
                            opt_arreglo[i]=arreglo2[i];
                        }
                        if (mayorr==arreglo.length){
                            opt_arreglo[i]=arreglo[i];
                        }
                    }
                }
                if(cad1==0&&cad2==2){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo[i]-arreglo2[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo2.length){
                            opt_arreglo[i]=arreglo2[i];
                        }
                        if (mayorr==arreglo.length){
                            opt_arreglo[i]=arreglo[i];
                        }
                    }
                }
                System.out.println("res en arreglo nuevo");
                for(int i=0;i<=opt_arreglo.length-1;i++){
                    System.out.println(opt_arreglo[i]);
                }
            break;
            case 3:
                if(cad1==0&&cad2==1||cad1==1&&cad2==0){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo[i]*arreglo1[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo.length){
                            opt_arreglo[i]=arreglo[i];
                        }
                        if (mayorr==arreglo1.length){
                            opt_arreglo[i]=arreglo1[i];
                        }
                    }
                }
                if(cad1==1&&cad2==2||cad1==2&&cad2==1){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo2[i]*arreglo1[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo2.length){
                            opt_arreglo[i]=arreglo2[i];
                        }
                        if (mayorr==arreglo1.length){
                            opt_arreglo[i]=arreglo1[i];
                        }
                    }
                }
                if(cad1==2&&cad2==0||cad1==0&&cad2==2){
                    for (int i=0;i<larg;i++){
                        opt_arreglo[i]= arreglo[i]*arreglo2[i];
                    }
                    for (int i=larg;i<mayorr;i++){
                        if (mayorr==arreglo2.length){
                            opt_arreglo[i]=arreglo2[i];
                        }
                        if (mayorr==arreglo.length){
                            opt_arreglo[i]=arreglo[i];
                        }
                    }
                }
                System.out.println("sum en arreglo nuevo");
                for(int i=0;i<=opt_arreglo.length-1;i++){
                    System.out.print(opt_arreglo[i]);
                }
            break;    
            }
        } else System.out.println("valores digitados invalidos");
        
    }
    /**name: case13
     * union of the three arrangements
     */
    public static void caso13(){
        int sum=0;
        int a=nume1[0];
        int b=nume1[1];
        int c=nume1[2];
        System.out.println(" ");
        for (int i=0;i<3;i++){
            sum=sum+nume1[i];
        }
        int[] union;
        union = new int[sum];
        
        for (int i=0;i<arreglo.length;i++){
            union[i]=arreglo[i];
        }
        
        for (int i=0;i<arreglo1.length;i++){
            union[i+arreglo.length]=arreglo1[i];
        }
        for (int i=0;i<arreglo2.length;i++){
            union[i+(arreglo.length+arreglo1.length)]=arreglo2[i];
        }
        for(int i=0;i<sum;i++){
            System.out.print(union[i]+" ");
        }
    }
    /**name : case14
     * union without repeating numbers
     */
    public static void caso14 (){
        int [] nuevoarreglo= new int [arreglo1.length+arreglo2.length];
	int cont=0,numelementos=0;
	for(int i=0; i<arreglo1.length;i++){
            if(!existe(arreglo1[i], nuevoarreglo)){
            nuevoarreglo[cont]=arreglo1[i];
            cont ++;
            }
	}
	for(int i=0;i<arreglo2.length;i++){
            if (!existe(arreglo2[i],nuevoarreglo)){
                nuevoarreglo[cont]=arreglo2[i];
                cont++;
            }
	}
	int []finarray=new int[cont];
            for(int i=0;i<cont;i++){
                finarray[i]=nuevoarreglo[i];
            }
            for(int i=0;i<finarray.length;i++){
                System.out.println( finarray[i]+" | ");
            }
                
	}
    /**name : caso15
     * interception of the three arrangements
     */
    public static void caso15(){
        int sum=0;
        for (int i=0;i<3;i++){
            sum=sum+nume1[i];
        }
        int[]newarray2=new int[sum];
        int cont=0;
        for(int i = 0; i < arreglo.length; i++,cont++){
            newarray2[cont] = arreglo[i];
        }
        boolean rep=false;
        for(int i = 0; i < arreglo1.length; i++){
            for(int y=0; y<cont&&rep==false;y++){
                if(arreglo1[i]==newarray2[y])
                    rep=true;
            }
            if(rep==false){
                newarray2[cont]=arreglo1[i];
                cont++;
                rep=true;
            }
        }
        for(int i = 0; i < arreglo2.length; i++){
            for(int y=0; y<cont&&rep==false;y++){
                if(arreglo2[i]==newarray2[y])
                    rep=true;
            }
            if(rep==false){
                newarray2[cont]=arreglo2[i];
                cont++;
                rep=true;
            }
        }
        for(int i=0;i<newarray2.length;i++){
            System.out.println( newarray2[i]+" | ");
        }
    }
    /**name: existe
     * confirms if the number already exists
     * @param o
     * @param arreglo
     * @return numero
     */
    public static boolean existe(int o, int []arreglo){
	boolean numero=false;
        for(int i=0;i<arreglo.length;i++){
            if (o==arreglo[i])
            numero=true;
        }
	return numero;
	}
    /**name : caso16
     * interception of the three arrangements
     */
    public static void caso16(){
        int a = 0,aux,b,c;
        System.out.println("cuanta vecees quiere rotar la cadena ");
        c=Integer.parseInt(reader.nextLine());
         
        System.out.println("cual arreglo quiere avaluar");
        a=Integer.parseInt(reader.nextLine());
        int[] arr=new int[nume1[a-1]];
            switch (a){
              case 1:
                  for(int i=0;i<arreglo.length;i++){
                      arr[i]=arreglo[i];
                  }
              break;
              case 2:
                  for(int i=0;i<arreglo1.length;i++){
                      arr[i]=arreglo1[i];
                  }
              break;
              case 3:
                  for(int i=0;i<arreglo2.length;i++){
                      arr[i]=arreglo2[i];
                  }
              break;
            }
        for(int i = 0; i < c; i++) {
            int lastN = arr[arr.length-1];
            for (int j = arr.length-1; j > 0; j--) {
		arr[j] = arr[j-1]; 
            }
       	arr[0] = lastN;
        }
         System.out.println("el metodo ordenado de forma fraciente es ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" | ");
            }
     }
    /**name: caso17_burbuja
     * performs the bubble method
     */
    public static void caso17_burbuja(){
        int a = 0,aux;
        System.out.println("cual arreglo quiere avaluar");
        a=Integer.parseInt(reader.nextLine());
        int[] arr=new int[nume1[a-1]];
            switch (a){
              case 1:
                  for(int i=0;i<arreglo.length;i++){
                      arr[i]=arreglo[i];
                  }
              break;
              case 2:
                  for(int i=0;i<arreglo1.length;i++){
                      arr[i]=arreglo1[i];
                  }
              break;
              case 3:
                  for(int i=0;i<arreglo2.length;i++){
                      arr[i]=arreglo2[i];
                    }
              break;
            }
            // metodo burbuja
            for(int i=0;i<(arr.length-1);i++){
                for(int y=0;y<(arr.length-1);y++){
                    if(arr[y]>arr[y+1]){
                        aux=arr[y];
                        arr[y]=arr[y+1];
                        arr[y+1]=aux;
                    }
                }
            }
            System.out.println("el metodo ordenado de forma fraciente es ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" | ");
            }
         
     }
            
}
