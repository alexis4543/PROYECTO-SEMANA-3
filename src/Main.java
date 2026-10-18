//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Proyecto pro1 =new Proyecto();
Proyecto pro2 =new Proyecto();







    System.out.println("----PROYECTO 1-----");
    pro1.setNombre("Alquiler");
    pro1.setProgreso(5);
    pro1.setResponsable("Alexis");
    pro1.setTerminado(false);
    pro1.avanzar(20);
    pro1.avanzar(80);
    System.out.println("El nombre es: " +pro1.getNombre());
    System.out.println("El progreso es " +pro1.getProgreso());
    System.out.println("El responsable es: "+pro1.getResponsable());
    System.out.println("El estado es "+pro1.isTerminado());


    System.out.println("----PROYECTO 2-----");
    pro2.setNombre("Empresa");
    pro2.setProgreso(100);
    pro2.setResponsable("Alexis");
    pro2.setTerminado(true);
    System.out.println("El nombre es: " +pro2.getNombre());
    System.out.println("El progreso es " +pro2.getProgreso());
    System.out.println("El responsable es: "+pro2.getResponsable());
    System.out.println("El estado es "+pro2.isTerminado());
}
