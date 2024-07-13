package org.dnyanyog.controller;

import java.sql.SQLException;

import org.dnyanyog.dto.AddProductRequest;
import org.dnyanyog.dto.AddProductResponse;
import org.dnyanyog.service.AddProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddProductController {
	
	@PostMapping("/addproduct")
	public AddProductResponse addProduct(@RequestBody AddProductRequest addProductBody) throws SQLException {
		
		return new AddProductService().addProduct(addProductBody);
	}
}
