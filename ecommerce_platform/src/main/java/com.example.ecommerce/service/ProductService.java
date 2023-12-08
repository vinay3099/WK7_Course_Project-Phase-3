package ecommerce_platform.src.main.java.com.example.ecommerce.service;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // other service methods
}
