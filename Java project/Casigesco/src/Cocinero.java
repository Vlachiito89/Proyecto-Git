public class Cocinero {
    private String IdCliente;
    private String Nombre_Cocinero;
    private String Apellido_Cocinero;
    private String Direccion;
    private String Empresa;


    //Creación del CO(NS)TRUCTOR - público - sin parámetros
    public Cocinero()
    
    {

    }

    //Creación del constructor con parámetros - público

    public Cocinero(String IdCliente, String Nombre_Cocinero, String Apellido_Cocinero, String Direccion, String Empresa )
    {
        this.IdCliente=IdCliente;
        this.Nombre_Cocinero=Nombre_Cocinero;
        this.Apellido_Cocinero=Apellido_Cocinero;
        this.Direccion=Direccion;
        this.Empresa=Empresa;
    }
}
