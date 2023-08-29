package com.aularequest.controlsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/func")
public class FuncionarioController {
	
	@GetMapping
	public String exibeFuncionario() {
		return "funcionario";
	}
}
