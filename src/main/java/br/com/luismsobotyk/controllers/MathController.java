package br.com.luismsobotyk.controllers;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.luismsobotyk.converters.NumberConverter;
import br.com.luismsobotyk.exception.UnsupportedMathOperationException;
import br.com.luismsobotyk.math.SimpleMath;

@RestController
public class MathController {
	
	private static final AtomicLong counter = new AtomicLong();
	private SimpleMath math = new SimpleMath();
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value= "numberOne") String numberOne,
			@PathVariable(value= "numberTwo") String numberTwo) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
	
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/sub/{numberOne}/{numberTwo}")
	public Double sub(@PathVariable(value= "numberOne") String numberOne,
			@PathVariable(value= "numberTwo") String numberTwo) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
	
		return math.sub(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/mult/{numberOne}/{numberTwo}")
	public Double mult(@PathVariable(value= "numberOne") String numberOne,
			@PathVariable(value= "numberTwo") String numberTwo) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
	
		return math.mult(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable(value= "numberOne") String numberOne,
			@PathVariable(value= "numberTwo") String numberTwo) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return math.div(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/avg/{numberOne}/{numberTwo}")
	public Double avg(@PathVariable(value= "numberOne") String numberOne,
			@PathVariable(value= "numberTwo") String numberTwo) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return math.avg(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/sqrt/{numberOne}")
	public Double sqrt(@PathVariable(value= "numberOne") String numberOne) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return math.sqrt(NumberConverter.convertToDouble(numberOne));
	}

	
}
