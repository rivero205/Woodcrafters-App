
package com.mycompany.woodcrafters.persistencia;

import com.mycompany.woodcrafters.logica.Clientes;
import com.mycompany.woodcrafters.logica.Productos;
import com.mycompany.woodcrafters.logica.Proveedores;
import com.mycompany.woodcrafters.logica.Usuarios;
import com.mycompany.woodcrafters.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;





public class controladoraPersistencia {
    
    private EntityManager entityManager;
    
    public controladoraPersistencia() {
        entityManager = Persistence.createEntityManagerFactory("woodcraftersPU").createEntityManager();
    }
    
    ClientesJpaController clientesJpa = new ClientesJpaController();
    ProductosJpaController productosJpa = new ProductosJpaController();
    ProveedoresJpaController proveedoresJpa = new ProveedoresJpaController();
    UsuariosJpaController usuariosJpa = new UsuariosJpaController();

   

    public void guardar(Clientes cliente, Usuarios usuario) {
        
        clientesJpa.create(cliente); 
    }
    
    public void registroCliente(Clientes cliente, Usuarios usuario){
        clientesJpa.create(cliente); 
    }
    
    public void registroProveedor(Proveedores proveedor) {
        proveedoresJpa.create(proveedor);
    }
    
    public void registroProducto(Productos producto) {
        productosJpa.create(producto);
    }

    
    
    
    public Usuarios buscarUsuarioPorCorreoYContrasena(String correo, String contrasena) {
        // Crear la consulta usando JPQL (Java Persistence Query Language)
        String jpql = "SELECT u FROM Usuarios u WHERE u.correo = :correo AND u.contrasena = :contrasena";

        // Crear la consulta tipada
        TypedQuery<Usuarios> query = entityManager.createQuery(jpql, Usuarios.class);
        query.setParameter("correo", correo);
        query.setParameter("contrasena", contrasena);

        // Ejecutar la consulta y obtener el resultado
        Usuarios usuario = null;
        try {
            usuario = query.getSingleResult();
        } catch (Exception ex) {
            // Manejar la excepción si no se encuentra ningún usuario
            ex.printStackTrace(); 
        }
        
        return usuario;
    }

    public List<Clientes> traerClientes() {
       return clientesJpa.findClientesEntities();
    }

    public List<Productos> traerProductos() {
        return productosJpa.findProductosEntities();
    }

    public List<Proveedores> traerProveedores() {
        return proveedoresJpa.findProveedoresEntities();
    }

    public void borrarCliente(int id) {
        try {
            clientesJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void borrarProducto(int id) {
        try {
            productosJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void borrarProveedor(int id) {
        try {
            proveedoresJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Clientes traerCliente(int id) {
        
       return  clientesJpa.findClientes(id);
    }

    public void modificarCliente(Clientes cliente) {
        try {
            clientesJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuarios traerUsuarios(int id) {
         return usuariosJpa.findUsuarios(id);
    }

    public void modificarUsuarios(Usuarios usuario) {
        try {
            usuariosJpa.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Productos traerProducto(int id) {
        return productosJpa.findProductos(id);
    }

    public void modificarProducto(Productos producto) {
        try {
            productosJpa.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarProveedor(Proveedores proveedor) {
        try {
            proveedoresJpa.edit(proveedor);
        } catch (Exception ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Proveedores traerProveedor(int id) {
        return proveedoresJpa.findProveedores(id);
    }
    
    

    
    
    

    
    
    }


   
        
        
        
        
    
       
    

