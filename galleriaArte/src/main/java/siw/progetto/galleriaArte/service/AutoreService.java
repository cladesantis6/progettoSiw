package siw.progetto.galleriaArte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import siw.progetto.galleriaArte.model.Autore;
import siw.progetto.galleriaArte.repository.AutoreRepository;

@Service
public class AutoreService {
	
	@Autowired
    private AutoreRepository autoreRepository;


    
    public Iterable<Autore> findAll() {
        return this.autoreRepository.findAllByOrderByCognomeAsc();
    }
  

    @Transactional
    public void add(final Autore autore) {
        this.autoreRepository.save(autore);
    }

	public Autore findbyId(Long id) {
		return this.autoreRepository.findOne(id);
	}

	
	@Transactional
	public void delete(final Autore autore) {
		this.autoreRepository.delete(autore);
	}
	
	
}

