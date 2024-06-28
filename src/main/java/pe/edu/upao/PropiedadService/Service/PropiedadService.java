package pe.edu.upao.PropiedadService.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upao.PropiedadService.Entity.Propiedad;
import pe.edu.upao.PropiedadService.Repository.PropiedadRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class PropiedadService {

    private final PropiedadRepository propiedadRepository;

    public List<Propiedad> listarPropiedades(){
        return propiedadRepository.findAll();
    }

    public Propiedad obtenerPropiedadPorId(Long id){
        return propiedadRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("No se encontró la propiedad con el id: " + id));
    }
}
