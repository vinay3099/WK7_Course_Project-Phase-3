package ecommerce_platform.src.main.java.com.example.ecommerce.repository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
