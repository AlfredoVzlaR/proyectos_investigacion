package dominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Paulina Cortez Alamilla.
 */
public class Doctor extends Profesor {

    private List<ObjectId> proyectosIds;

    public Doctor() {
    }

    public Doctor(List<ObjectId> proyectosIds, String nombre, String apellido, String despacho, String telefono) {
        super(nombre, apellido, despacho, telefono);
        this.proyectosIds = proyectosIds;
    }

    public Doctor(List<ObjectId> proyectosIds, ObjectId id, String nombre, String apellido, String despacho, String telefono) {
        super(id, nombre, apellido, despacho, telefono);
        this.proyectosIds = proyectosIds;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getDespacho() {
        return despacho;
    }

    @Override
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<ObjectId> getProyectosIds() {
        return proyectosIds;
    }

    public void setProyectosIds(List<ObjectId> proyectosIds) {
        this.proyectosIds = proyectosIds;
    }

    @Override
    public String toString() {
        return "Doctor{" + "proyectosIds=" + proyectosIds + '}';
    }

}
