
package com.mycompany.woodcrafters.logica;

import com.mycompany.woodcrafters.persistencia.controladoraPersistencia;
import java.util.List;


public class controladora {

    controladoraPersistencia controlPersi = new controladoraPersistencia();

    public void guardar(int documento, String nombre, String apellido, int telefono, String direccion, String correo, String contrasena) {

        Clientes cliente = new Clientes();

        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);

        // Crear un usuario asociado al cliente
        Usuarios usuario = new Usuarios();
        usuario.setNombre(nombre);
        usuario.setCorreo(correo);
        usuario.setContrasena(contrasena);
        usuario.setRol("cliente"); 

        // Asociar el usuario al cliente
        cliente.setUnUsuario(usuario);

        controlPersi.guardar(cliente, usuario);

    }

    public void registroCliente(int documento, String nombre, String apellido, int telefono, String direccion) {
        
        Clientes cliente = new Clientes();
        
        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);

        // Crear un usuario asociado al cliente
        Usuarios usuario = new Usuarios();
        usuario.setNombre(nombre);
        usuario.setRol("cliente"); 

        // Asociar el usuario al cliente
        cliente.setUnUsuario(usuario);

        controlPersi.registroCliente(cliente, usuario);
    }

     public void registroProveedor(String nombre, String direccion, int telefono) {
        
        Proveedores proveedor = new Proveedores();
        
        proveedor.setNombre(nombre);
        proveedor.setTelefono(telefono);
        proveedor.setDireccion(direccion);
        
        controlPersi.registroProveedor(proveedor);
    }


    public void registoProducto(String nombre, String descripcion, double precio, int stock) {
        
        Productos producto = new Productos();
        
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setStock(stock);
        
        controlPersi.registroProducto(producto);
    }

    public List<Clientes> traerClientes() {
        
        return controlPersi.traerClientes();
 
    }

    public List<Productos> Productos() {
         return controlPersi.traerProductos();
    }

    public List<Proveedores> Proveedores() {
        return controlPersi.traerProveedores();
    }

    public void borrarCliente(int id) {
        controlPersi.borrarCliente(id);
    }

    public void borrarProducto(int id) {
        controlPersi.borrarProducto(id);
    }

   public void borrarProveedor(int id) {
        controlPersi.borrarProveedor(id);
    }


    public Clientes traerCliente(int id) {
        return controlPersi.traerCliente(id);
    }

    public void modificarCliente(Clientes cliente, String nombre, String apellido, String direccion, String correo, String contrasena, int documento, int telefono) {
        
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        
        controlPersi.modificarCliente(cliente);
        
        Usuarios usuario = this.buscarUsuarios(cliente.getUnUsuario().getId());
        usuario.setCorreo(correo);
        usuario.setContrasena(contrasena);
        
        this.modificarUsuarios(usuario);
        
    
    }

    private Usuarios buscarUsuarios(int id) {
        return controlPersi.traerUsuarios(id);
    }

    private void modificarUsuarios(Usuarios usuario) {
        controlPersi.modificarUsuarios(usuario);
        
    }

    public Productos traerProducto(int id) {
        return controlPersi.traerProducto(id);
    }


    public void modificarProducto(Productos producto, String nombre, String descripcion, int stock, double precio) {
       producto.setNombre(nombre);
       producto.setDescripcion(descripcion);
       producto.setStock(stock);
       producto.setPrecio(precio);
       
       controlPersi.modificarProducto(producto);
    }

    public void modificarProveedor(Proveedores proveedor, String nombre, String direccion, int telefono) {
        proveedor.setNombre(nombre);
        proveedor.setDireccion(direccion);
        proveedor.setTelefono(telefono);
        
        controlPersi.modificarProveedor(proveedor);
    }

    public Proveedores traerProveedor(int id) {
       return controlPersi.traerProveedor(id);
    }

  
    

    

   

    

 

   


   


    
}



