package gm.inventarios.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND )
public class RecursoNoEncontradoExpecion extends RuntimeException{
    public RecursoNoEncontradoExpecion(String mensaje){
        super(mensaje);
    }
}
