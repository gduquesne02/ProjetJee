package com.univlittoral.projetback.mapper;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.univlittoral.projetback.dto.GraphiqueDTO;
import com.univlittoral.projetback.repository.LivreRepository;

public class GraphiqueMapper {

	
	
	public static Map<String, Integer> map() {
		GraphiqueDTO graph = new GraphiqueDTO();
		Map<String, Integer> map = new HashMap<String, Integer>();
        
		map.put("BD", 4);
		map.put("ROMAN", 4);
		map.put("POESIE", 4);
		map.put("MANGA", 4);
		map.put("NOUVELLE", 4);

        return map;
    }
}
