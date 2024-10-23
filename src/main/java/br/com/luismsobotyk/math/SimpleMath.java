package br.com.luismsobotyk.math;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.luismsobotyk.converters.NumberConverter;
import br.com.luismsobotyk.exception.UnsupportedMathOperationException;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne+numberTwo;
	}
	
	public Double sub(Double numberOne, Double numberTwo) {
		return numberOne-numberTwo;
	}
	
	public Double mult(Double numberOne, Double numberTwo) {
		return numberOne*numberTwo;
	}
	
	public Double div(Double numberOne, Double numberTwo) {
		return numberOne/numberTwo;
	}

	public Double pow(Double number){
		return number*number;
	}

	public Double rest(Double numberOne, Double numberTwo){
		return numberOne%numberTwo;
	}

}
