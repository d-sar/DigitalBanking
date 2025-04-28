package ma.damri.digitalbanking_backend.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
@DiscriminatorColumn(name = "TYPE",length = 4)

public class BankAccount {

    @Id
    private String id;
    private double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @ManyToOne
    private Customer  customer;

    @OneToMany(mappedBy = "bankAccount",fetch = FetchType.LAZY)
    private List<AccountOperation> accountOperations;



}
