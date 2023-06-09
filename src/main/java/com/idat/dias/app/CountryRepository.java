package com.idat.dias.app;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dia;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    
    private static final Map<String, Dia> dias = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dia sabado = new Dia();
		sabado.setName("Sabado");
		sabado.setTraduccion("Saturday");

		dias.put(sabado.getName(), sabado);

		Dia domingo = new Dia();
		domingo.setName("Domingo");
		domingo.setTraduccion("Sunday");

		dias.put(domingo.getName(), domingo);

	}

	public Dia findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return dias.get(name);
	}


}
