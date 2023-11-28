
public class Main {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "freddy", "villavicencio");

        Vehiculo vei1 = new Vehiculo();
        Vehiculo vei2 = new Vehiculo(11615, "spark", "toyota", "15/12/23");

        vei1.setnumeroMatricula(548651);
        vei1.setfecha("15/12/24");
        vei1.setmarca("Chevrolet");
        vei1.setmodelo("spark");

        System.out.println("el número de matricula del vehiculo 2 es: " + vei2.getnumeroMatricula());
        System.out.println("la marca del vehiculo 2 es: " + vei2.getmarca());
        System.out.println("el modelo del vehiculo 2 es: " + vei2.getmodelo());

        alu1.setId(8);
        alu1.setNombre("Miguel");
        alu1.setApellido("Angela");

        System.out.println("-----------------------");

        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("el nombre del alumno 1 es: " + alu1.getNombre());
        System.out.println("el apellido del alumno 1 es: " + alu1.getApellido());

        //cambio de valor

        System.out.println("-----------------------");
        alu2.setId(35);
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("el nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("el apellido del alumno 2 es: " + alu2.getApellido());

    }
}
