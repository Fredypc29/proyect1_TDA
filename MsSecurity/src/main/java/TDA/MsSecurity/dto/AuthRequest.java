package TDA.MsSecurity.dto;

import java.io.Serializable;
 
public class AuthRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private String usuario;
    private String clave;
    private String dni;
    private String edad;
    

    private String DNI  ;
 
>>>>>>> 1ee0e3b921edb818ac7cad632e7d7c0287e53527
    public AuthRequest() {
 
    }
 
    public AuthRequest(String usuario, String clave) {
        this.setUsuario(usuario);
        this.setClave(clave);
    }
 
    public String getClave() {
        return clave;
    }
 
    public void setClave(String clave) {
        this.clave = clave;
    }
 
    public String getUsuario() {
        return usuario;
    }
 
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

