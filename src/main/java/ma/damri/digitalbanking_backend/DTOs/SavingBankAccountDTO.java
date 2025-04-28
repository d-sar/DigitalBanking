package ma.damri.digitalbanking_backend.DTOs;
import lombok.Data;
import ma.damri.digitalbanking_backend.entities.AccountStatus;

import java.util.Date;
@Data
public class SavingBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
