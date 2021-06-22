/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author jenni
 */
public class CLIENTE {
    
    private String ID;
    private String NOMBRE;
    private String APELLIDO_P;
    private String APELLIDO_M;
    private int EDAD;
    private String CORREO;
    private String DIRECCION;
    private String TELEFONO;
    
    
    public CLIENTE(){
        ID="";
        NOMBRE ="";
        APELLIDO_P="";
        APELLIDO_M="";
        EDAD=0;
        CORREO="";
        DIRECCION="";
        TELEFONO="";
    }
    public CLIENTE(String I,String N, String P, String M, int E, String C, String D, String T){
        ID=I;
        NOMBRE = N;
        APELLIDO_P=P;
        APELLIDO_M=M;
        EDAD=E;
        CORREO=C;
        DIRECCION=D;
        TELEFONO=T;
    }

    public String getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO_P() {
        return APELLIDO_P;
    }

    public void setAPELLIDO_P(String APELLIDO_P) {
        this.APELLIDO_P = APELLIDO_P;
    }

    public String getAPELLIDO_M() {
        return APELLIDO_M;
    }

    public void setAPELLIDO_M(String APELLIDO_M) {
        this.APELLIDO_M = APELLIDO_M;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }
    
}
