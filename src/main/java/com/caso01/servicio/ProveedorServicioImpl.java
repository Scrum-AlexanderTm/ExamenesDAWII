package com.caso01.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caso01.entidad.Proveedor;
import com.caso01.repositorio.ProveedorRepositorio;

@Service
public class ProveedorServicioImpl implements ProveedorServicio{

	@Autowired
	private ProveedorRepositorio repositorio; 
	
	@Override
	public Proveedor insertaProveedor(Proveedor obj) {
		return repositorio.save(obj);
	}

}


