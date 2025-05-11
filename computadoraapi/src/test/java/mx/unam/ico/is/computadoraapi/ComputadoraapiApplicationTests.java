package mx.unam.ico.is.computadoraapi;

import mx.unam.ico.is.computadoraapi.entities.Computadora;
import mx.unam.ico.is.computadoraapi.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraapiApplicationTests {
	@Autowired
	private ComputadoraRepository computadoraRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertarComputadora(){
		Computadora computadora = new Computadora(0, "no se","HP", "pavillion 2000", 13000.0f );
		computadoraRepository.save(computadora);
	}

	@Test
	void leerComputadoraPorClave(){
		Long claveTmp=2l;
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
		System.out.println(tmp);
	}

	@Test
	public void eliminarComputadora(){
		Long claveTmp=2l;
		computadoraRepository.deleteById(claveTmp);
	}

	@Test
	public void actualizarComputadora(){
		Long claveTmp = 4l;
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
		tmp.setModelo("holapatito3000");
		computadoraRepository.save(
				tmp
		);
	}

}
