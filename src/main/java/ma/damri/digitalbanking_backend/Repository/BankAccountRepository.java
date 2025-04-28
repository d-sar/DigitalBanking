package ma.damri.digitalbanking_backend.Repository;

import ma.damri.digitalbanking_backend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
