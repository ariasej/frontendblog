/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendblog;

/**
 *
 * @author jony1
 */
class Direccion {
    private String calle; 
    private String suite;
    private String ciudad; 

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    public Direccion(String calle, String suite, String ciudad) {
        this.calle = calle;
        this.suite = suite;
        this.ciudad = ciudad;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the suite
     */
    public String getSuite() {
        return suite;
    }

    /**
     * @param suite the suite to set
     */
    public void setSuite(String suite) {
        this.suite = suite;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
   
}
