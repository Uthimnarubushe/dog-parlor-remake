package za.ac.cput.dogparlor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.dogparlor.domain.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
}
