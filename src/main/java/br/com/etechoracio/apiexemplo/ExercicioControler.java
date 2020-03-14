package br.com.etechoracio.apiexemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/exercicios")
@RestController
public class ExercicioControler {
	
	@GetMapping("/dobro")
	public double dobro(@RequestParam("num") int num) {
		return num *2;
		
		
	}
	

}
