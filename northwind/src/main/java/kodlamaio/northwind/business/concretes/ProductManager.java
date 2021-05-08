package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao produrctDao;

	@Autowired
	public ProductManager(ProductDao produrctDao) {
		super();
		this.produrctDao = produrctDao;
	}

	@Override
	public List<Product> getAll() {

		return this.produrctDao.findAll();
		
	}

}
