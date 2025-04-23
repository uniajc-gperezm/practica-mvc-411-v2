package controlador;

import modelo.Estudiante;
import vista.VistaEstudiante;

/**
 *
 * @author g.perezmoreno
 */
public class ControladorEstudiante {
  private Estudiante modelo;
  private VistaEstudiante vista;

  public ControladorEstudiante(Estudiante modelo, VistaEstudiante vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  public void setNombreEstudiante(String nombre) {
    modelo.setNombre(nombre);
  }

  public String getNombreEstudiante() {
    return modelo.getNombre();
  }

  public void setEdadEstudiante(int edad) {
    modelo.setEdad(edad);
  }

  public int getEdadEstudiante() {
    return modelo.getEdad();
  }

  public void actualizarVista() {
    vista.mostrarDetallesEstudiante(modelo.getNombre(), modelo.getEdad());
  }
}