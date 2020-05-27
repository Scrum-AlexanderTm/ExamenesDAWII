package com.caso01.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caso01.entidad.CategoriaProveedor;
import com.caso01.repositorio.CategoriaProveedorRepositorio;

@Service
public class CategoriaProveedorServicioImpl implements CategoriaProveedorServicio{

	@Autowired
	private CategoriaProveedorRepositorio repositorio; 
	
	@Override
	public List<CategoriaProveedor> listaCategoria() {
		return repositorio.findAll();
	}

}


