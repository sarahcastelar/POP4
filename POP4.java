package pop4;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import productos.*;

public class POP4 {

   
    public static void main(String[] args) {
        //agregar producto
        ArrayList producto = new ArrayList(); //lista de cualquier producto ingresado. 
        //modificar producto
        ArrayList temporal = new ArrayList();
        int cont;//contador para que solo entre 1 vez al while.
        //eliminar producto
        Object temporal2 = null;
        //informe
        String salida1 = "  GRANOS BASICOS \n", salida2 = "  LIMPIEZA \n", salida3 = "   LIQUIDOS \n", salida4 = "   CARNES y EMBUTIDOS \n", salida5 = "   FRUTAS y VERDURAS \n";
        ArrayList nombreProducto = new ArrayList();
        //facturizacion
        ArrayList cesta = new ArrayList();
        ArrayList <Double> precioProducto = new ArrayList();
        ArrayList <Double> precioProductoSolo = new ArrayList();
        ArrayList <Double> cant = new ArrayList(); //cant de prductos que lleva el cliente
        String factura = "";
        
        int option = -1, option2 = -1;
        while (option != 6){
            option = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                    + "1. Agregar producto \n"
                    + "2. Modificar producto \n"
                    + "3. Eliminar Producto \n"
                    + "4. Simulacion de Facturacion \n"
                    + "5. Reporte \n"
                    + "6. Salir"));
            
            if (option == 1){
                    
                    while (option2 != 6){
                        option2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese producto a agregar: \n"
                                + "1. Granos Basicos \n"
                                + "2. Limpieza \n"
                                + "3. Liquidos \n"
                                + "4. Carne y Embutidos \n"
                                + "5. Frutas y Verduras \n"
                                + "6. Salir"));
                        
                                if (option2 == 1){
                                    String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                    int cantQuintales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad quintales: "));
                                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));
                                    String unidadMedida = JOptionPane.showInputDialog("Ingrese unidad de medida: ");
                                    String lugarPrecedencia = JOptionPane.showInputDialog("Ingrese lugar de procedencia: ");
                                    producto.add( new GranosBasicos(nombre, cantQuintales, precio, unidadMedida, lugarPrecedencia));
                                    nombreProducto.add(new GranosBasicos(nombre));
                                }
                                if (option2 == 2){
                                    String categoria = JOptionPane.showInputDialog("Ingrese categoria: ");
                                    String marca = JOptionPane.showInputDialog("Ingrese marca: ");
                                    String codigo = JOptionPane.showInputDialog("Ingrese codigo: ");
                                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));
                                    int cantInventario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de inventario: "));
                                    String proveedor = JOptionPane.showInputDialog("Ingrese proveedor: ");
                                    String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                    producto.add( new Limpieza(categoria,marca,codigo,precio,cantInventario,proveedor,nombre));
                                    nombreProducto.add(new Limpieza(nombre));
                                }
                                if (option2 == 3){
                                    String categoria = JOptionPane.showInputDialog("Ingrese categoria: ");
                                    String empaque = JOptionPane.showInputDialog("Ingrese forma de empaque: ");
                                    String tamano = JOptionPane.showInputDialog("Ingrese tamano: ");
                                    String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));
                                    String fechaVencimiento = JOptionPane.showInputDialog("Ingrese fecha de vencimiento: ");
                                    int cantInventario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de inventario: "));
                                    producto.add( new Liquidos(categoria,empaque,tamano,nombre,precio,fechaVencimiento, cantInventario));
                                    nombreProducto.add(new Liquidos(nombre));
                                }
                                if (option2 == 4){
                                    String lugarProcedencia = JOptionPane.showInputDialog("Ingrese lugar de procedencia: ");
                                    int cantInventario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de inventario: "));
                                    String tipo = JOptionPane.showInputDialog("Ingrese tipo de carne o embutido: ");
                                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));
                                    String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                    producto.add( new CarnesEmbutidos(lugarProcedencia,cantInventario,tipo,precio,nombre));
                                    nombreProducto.add(new CarnesEmbutidos(nombre));
                                }
                                if (option2 == 5){
                                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));
                                    int cantInventario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de inventario: "));
                                    String categoria = JOptionPane.showInputDialog("Ingrese categoria: ");
                                    String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                    producto.add( new FrutasVerduras(precio,cantInventario,categoria,nombre));
                                    nombreProducto.add(new FrutasVerduras(nombre));
                                }
                    }//fin de agregar productos.
            }//fin option1
            
            if (option == 2){//modificar productos
                option2 = -1;
                cont = 0;
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar: "));
                try {
                    if (producto.get(pos) != null){
                        producto.remove(pos);
                        while (option2 != 6 && cont < 1) {
                            option2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los datos del producto nuevo para modificarlos: \n"
                                    + "1. Granos Basicos \n"
                                    + "2. Limpieza \n"
                                    + "3. Liquidos \n"
                                    + "4. Carne y Embutidos \n"
                                    + "5. Frutas y Verduras \n"
                                    + "6. Salir"));

                            if (option2 == 1) {
                                String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                int cantQuintales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad quintales: "));
                                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));
                                String unidadMedida = JOptionPane.showInputDialog("Ingrese unidad de medida: ");
                                String lugarPrecedencia = JOptionPane.showInputDialog("Ingrese lugar de procedencia: ");
                                temporal.add(new GranosBasicos(nombre, cantQuintales, precio, unidadMedida, lugarPrecedencia));
                            }
                            if (option2 == 2) {
                                String categoria = JOptionPane.showInputDialog("Ingrese categoria: ");
                                String marca = JOptionPane.showInputDialog("Ingrese marca: ");
                                String codigo = JOptionPane.showInputDialog("Ingrese codigo: ");
                                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));
                                int cantInventario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de inventario: "));
                                String proveedor = JOptionPane.showInputDialog("Ingrese proveedor: ");
                                String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                temporal.add(new Limpieza(categoria, marca, codigo, precio, cantInventario, proveedor, nombre));
                            }
                            if (option2 == 3) {
                                String categoria = JOptionPane.showInputDialog("Ingrese categoria: ");
                                String empaque = JOptionPane.showInputDialog("Ingrese forma de empaque: ");
                                String tamano = JOptionPane.showInputDialog("Ingrese tamano: ");
                                String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));
                                String fechaVencimiento = JOptionPane.showInputDialog("Ingrese fecha de vencimiento: ");
                                int cantInventario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de inventario: "));
                                temporal.add(new Liquidos(categoria, empaque, tamano, nombre, precio, fechaVencimiento, cantInventario));
                            }
                            if (option2 == 4) {
                                String lugarProcedencia = JOptionPane.showInputDialog("Ingrese lugar de procedencia: ");
                                int cantInventario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de inventario: "));
                                String tipo = JOptionPane.showInputDialog("Ingrese tipo de carne o embutido: ");
                                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));
                                String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                temporal.add(new CarnesEmbutidos(lugarProcedencia, cantInventario, tipo, precio,nombre));
                            }
                            if (option2 == 5) {
                                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));
                                int cantInventario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de inventario: "));
                                String categoria = JOptionPane.showInputDialog("Ingrese categoria: ");
                                String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                temporal.add(new FrutasVerduras(precio, cantInventario, categoria,nombre));
                            }
                            cont++;
                        }
                        producto.add(pos,temporal); //esto ponelo al final. 
                    }   
                }
                catch (Exception e) {
                    JOptionPane.showConfirmDialog(null,"No se puede modificar un producto que no exista.");
                }
            }//fin option 2
            
            if (option == 3) {
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de producto a eliminar: "));
                try{
                    temporal2 = producto.get(pos);
                } 
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "No se puede eliminar un producto si no hay inventario de este.");
                }
                
                if (temporal2 instanceof Limpieza) {
                    if (Limpieza.cantidadInventario > 0) 
                        producto.remove(pos);
                }else if (temporal2 instanceof CarnesEmbutidos){
                    if (CarnesEmbutidos.cantidadInventario > 0) 
                        producto.remove(pos);
                }else if (temporal2 instanceof FrutasVerduras){
                    if (FrutasVerduras.cantidadInventario > 0) 
                        producto.remove(pos);
                }else if (temporal2 instanceof GranosBasicos) {
                    if (GranosBasicos.cantQuintales > 0) 
                        producto.remove(pos);
                }
            }//fin option 3
            
            if (option == 4) {
                int option4 = -1;
                
                while (option4 != 2){
                    option4 = Integer.parseInt(JOptionPane.showInputDialog("Desea comprar? Ingrese 1 si su respuesta es si. "));
                    
                    if (option4 == 1) {
                        String compra = JOptionPane.showInputDialog("Ingrese lo que va comprar: ");
                        double canti = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de producto que quiere: "));

                        for (Object t : producto) {//como si existe.. veremos si hay suficiente en el inventario. 
                            System.out.println("hola");
                            if (t instanceof GranosBasicos && (((GranosBasicos) t).getCantQuintales() - canti) > 0) {
                                cant.add(canti);
                                cesta.add(t);
                                int posicion = cesta.indexOf(t);
                                precioProducto.add(((GranosBasicos) t).getPrecio() * cant.get(posicion));
                                precioProductoSolo.add(((GranosBasicos) t).getPrecio());
                            }
                            else if (t instanceof Limpieza && (((Limpieza) t).getCantidadInventario() - canti) > 0) {
                                cant.add(canti);
                                cesta.add(t);
                                int posicion = cesta.indexOf(t);
                                precioProducto.add(((Limpieza) t).getPrecio() * cant.get(posicion));
                                precioProductoSolo.add(((Limpieza) t).getPrecio());
                            }
                            else if (t instanceof Liquidos && (((Liquidos) t).getCantidadInventario() - canti) > 0) {
                                cant.add(canti);
                                cesta.add(t);
                                int posicion = cesta.indexOf(t);
                                precioProducto.add(((Liquidos) t).getPrecio() * cant.get(posicion));
                                precioProductoSolo.add(((Liquidos) t).getPrecio());
                            }
                            else if (t instanceof CarnesEmbutidos && (((CarnesEmbutidos) t).getCantidadInventario() - canti) > 0) {
                                cant.add(canti);
                                cesta.add(t);
                                int posicion = cesta.indexOf(t);
                                precioProducto.add(((CarnesEmbutidos) t).getPrecio() * cant.get(posicion));
                                precioProductoSolo.add(((CarnesEmbutidos) t).getPrecio());
                            }
                            else if (t instanceof FrutasVerduras && (((FrutasVerduras) t).getCantidadInventario() - canti) > 0) {
                                cant.add(canti);
                                cesta.add(t);
                                int posicion = cesta.indexOf(t);
                                precioProducto.add(((FrutasVerduras) t).getPrecio() * cant.get(posicion));
                                precioProductoSolo.add(((FrutasVerduras) t).getPrecio());
                            }else
                                JOptionPane.showMessageDialog(null, "Lo siento, no se pudo realizar esta compra.");
                        }
                    }
                }
                int pos = 0;
                double totalPagar = 0;
                for (Object t : cesta) {
                    factura += t + "\n"
                            + "Precio individual: " + precioProductoSolo.get(pos) + "\n"
                            + "precio * cantidad de productos: " + precioProducto.get(pos) + "\n" + "\n";
                     totalPagar += precioProducto.get(pos);
                    pos++;
                }
                factura+= "Total a pagar: " + totalPagar + "\n ISV:  15% " + "\n" + "Total a pagar: " + (totalPagar + (totalPagar * 0.15)) ;
                JOptionPane.showMessageDialog(null, factura); 
                }
            
            
            
            
            
            
            if (option == 5){
                salida1 = "BIENVENIDOS AL INVENTARIO ACTUAL \n"
                        + "Si algun producto aparece en blanco significa que no hay. \n";
                for (Object t : nombreProducto) {
                    if (t instanceof GranosBasicos) 
                        salida1 += t + "\n";
                }
                    salida1 += "\n";
                for (Object t : nombreProducto) {
                    if (t instanceof Limpieza) 
                        salida2 += t + "\n";
                }
                    salida2 += "\n";
                for (Object t : nombreProducto) {
                    if (t instanceof Liquidos) 
                        salida3 += t + "\n";
                }
                    salida3 += "\n";
                for (Object t : nombreProducto) {
                    if (t instanceof CarnesEmbutidos) 
                        salida4 += t + "\n";
                }
                    salida4 += "\n";
                for (Object t : nombreProducto) {
                    if (t instanceof FrutasVerduras) 
                        salida5 += t + "\n";
                }
                    salida5 += "\n";
                String salida = salida1 + salida2 + salida3 + salida4 + salida5;
                JOptionPane.showConfirmDialog(null, salida);
            }
            
            
        }//fin while
    }
    
}
    

