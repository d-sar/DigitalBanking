package ma.damri.digitalbanking_backend.DTOs;

import lombok.Data;

@Data
public class DebitDTO {
        private String accountId;
        private double amount;
        private String description;
}
