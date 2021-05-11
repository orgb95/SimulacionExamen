/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.simulacionexamen.pojo;


/**
 *
 * @author Sistemas-09
 */
public class TipoActivoPojo {
    private String nombre;
    private float valorActivo;
    private EnumTipoActivo tipoActivo;
    private float valorSalvamento;

    public TipoActivoPojo() {
    }

    public TipoActivoPojo(String nombre, float valorActivo, EnumTipoActivo tipoActivo, float valorSalvamento) {
        this.nombre = nombre;
        this.valorActivo = valorActivo;
        this.tipoActivo = tipoActivo;
        this.valorSalvamento = valorSalvamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValorActivo() {
        return valorActivo;
    }

    public void setValorActivo(float valorActivo) {
        this.valorActivo = valorActivo;
    }

    public EnumTipoActivo getTipoActivo() {
        return tipoActivo;
    }

    public void setTipoActivo(EnumTipoActivo tipoActivo) {
        this.tipoActivo = tipoActivo;
    }

    public float getValorSalvamento() {
        return valorSalvamento;
    }

    public void setValorSalvamento(float valorSalvamento) {
        this.valorSalvamento = valorSalvamento;
    }
    
}
