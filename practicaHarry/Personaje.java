package practicaHarry;

public class Personaje {
    public String nombre;
    public String casa;
    public String genero;
    public String boggart;
    public String pratrons;
    public String description;

    public String getNombre(){ return nombre; }
    public String getCasa(){ return casa; }
    public String getGenero(){ return genero; }
    public String getBoggart(){ return boggart; }
    public String getPatrons(){ return pratrons; }
    public String getDescription(){ return description; }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public boolean setCasa(String casa){
        if (!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }
    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }
    public boolean setPratrons(String pratrons){
        if (!pratrons.isEmpty()){
            this.pratrons = pratrons;
            return true;
        }else
            return false;
    }
    public boolean setDescription(String description){
        if (!description.isEmpty()){
            this.description = description;
            return true;
        }else
            return false;
    }


    public String printState() {
        return "nombre: " + nombre + "\n" +
                "casa: " + casa + "\n" +
                "genero: " + genero + "\n" +
                "boggart: " + boggart + "\n" +
                "pratrons: " + pratrons + "\n" +
                "description" + description;
    }
}
