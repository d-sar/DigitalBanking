package ma.damri.digitalbanking_backend.DTOs;
import lombok.Data;
import ma.damri.digitalbanking_backend.entities.OperationType;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;

import java.util.Date;
@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
