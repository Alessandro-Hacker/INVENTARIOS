package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();
    public Producto buscarProductoPorId(Integer idProducto);
    public Producto agregarProducto(Producto producto);
    public void eliminarProductoPorId(Integer idProducto);
}
