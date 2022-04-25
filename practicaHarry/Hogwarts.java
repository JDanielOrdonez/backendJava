package practicaHarry;

public class Hogwarts {
    public static void main(String[] args) {
        harry();
        hermion();
        RonWeasley();
        Dumbledore();
        severus();
    }
    public static void harry(){
        Personaje harry = new Personaje();

        harry.setNombre("Harry James Potter");
        harry.setGenero("Masculino");
        harry.setCasa("Gryffindor");
        harry.setBoggart("Un Dementor");
        harry.setPratrons("Ron Weasley");
        harry.setDescription("Cabello negro, ojos verdes, una cicatriz\n " +
                "en forma de rayo está¡ en su frente (producto\n " +
                "de una maldición Avada Kedavra). Usa gafas redondas.");

        String msg = harry.getNombre();
        msg += "\nGenero: "+harry.getGenero();
        msg += "\nCasa: "+harry.getCasa();
        msg += "\nBoggart: "+harry.getBoggart();
        msg += "\nPatrons: "+harry.getPatrons();
        msg += "\nDescripción:"+harry.getDescription() + "\n";

        System.out.print(msg);
    }
    public static void hermion(){
        Personaje hermion = new Personaje();

        hermion.setNombre("\nHermione Jean Granger");
        hermion.setGenero("Femenino");
        hermion.setCasa("Gryffindor");
        hermion.setBoggart("Fracaso");
        hermion.setPratrons("Mago/bruja");
        hermion.setDescription("Ella demuestra una considerable destreza academica,\n " +
                                "en comparación con sus amigos y compañeros, pero\n " +
                                "carece de madurez emocional. ");

        String msg = hermion.getNombre();
        msg += "\nGenero: "+hermion.getGenero();
        msg += "\nCasa: "+hermion.getCasa();
        msg += "\nBoggart: "+hermion.getBoggart();
        msg += "\nPatrons: "+hermion.getPatrons();
        msg += "\nDescripción:"+hermion.getDescription() + "\n";

        System.out.print(msg);
    }
    public static void RonWeasley(){
        Personaje ronWeasley = new Personaje();

        ronWeasley.setNombre("\nRonald Billius Weasley");
        ronWeasley.setGenero("Masculino");
        ronWeasley.setCasa("Gryffindor");
        ronWeasley.setBoggart("Leta Lestrange");
        ronWeasley.setPratrons("Remus Lupin");
        ronWeasley.setDescription("Ronald Bilius Weasley apareciá\n " +
                                    "por primera vez en Harry Potter y la\n " +
                                    "Piedra Filosofal, y es el mejor amigo de Harry Potter ");

        String msg = ronWeasley.getNombre();
        msg += "\nGenero: "+ronWeasley.getGenero();
        msg += "\nCasa: "+ronWeasley.getCasa();
        msg += "\nBoggart: "+ronWeasley.getBoggart();
        msg += "\nPatrons: "+ronWeasley.getPatrons();
        msg += "\nDescripción:"+ronWeasley.getDescription() + "\n";

        System.out.print(msg);
    }
    public static void Dumbledore(){
        Personaje dumbledore = new Personaje();

        dumbledore.setNombre("\nAlbus Percival Wulfric Brian Dumbledore");
        dumbledore.setGenero("Masculino");
        dumbledore.setCasa("Gryffindor");
        dumbledore.setBoggart("Leta Lestrange");
        dumbledore.setPratrons("Remus Lupin");
        dumbledore.setDescription("Albus Percival Wulfric Brian Dumbledore es,\n " +
                                    "hasta el final de Harry Potter y el Misterio\n " +
                                    "del principe, el director del Colegio " +
                                    "Hogwarts de Magia y hechicería. Se le describe\n " +
                                    "como un mago alto, delgado, ataviado con una tecnica y\n " +
                                    "un gorro puntiagudo, y sobre todo, con larga y plateada barba.");

        String msg = dumbledore.getNombre();
        msg += "\nGenero: "+dumbledore.getGenero();
        msg += "\nCasa: "+dumbledore.getCasa();
        msg += "\nBoggart: "+dumbledore.getBoggart();
        msg += "\nPatrons: "+dumbledore.getPatrons();
        msg += "\nDescripción:"+dumbledore.getDescription() + "\n";

        System.out.print(msg);
    }
    public static void severus(){
        Personaje severus = new Personaje();

        severus.setNombre("\nSeverus Snape Prince");
        severus.setGenero("Masculino");
        severus.setCasa("Slytherin");
        severus.setBoggart("Neville Longbottom");
        severus.setPratrons("Dolores Umbridge");
        severus.setDescription("Severus Snape Prince, es el profesor\n " +
                                "de Pociones (y de Defensa Contra las\n " +
                                "Artes Oscuras en Harry Potter y el Misterio\n" +
                                "del principe el Colegio Hogwarts de Magia\n" +
                                "y Hechicero. También es jefe de la casa Slytherin");

        String msg = severus.getNombre();
        msg += "\nGenero: "+severus.getGenero();
        msg += "\nCasa: "+severus.getCasa();
        msg += "\nBoggart: "+severus.getBoggart();
        msg += "\nPatrons: "+severus.getPatrons();
        msg += "\nDescripción:"+severus.getDescription() + "\n";

        System.out.print(msg);
    }
}
