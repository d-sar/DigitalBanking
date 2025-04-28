package ma.damri.digitalbanking_backend.DTOs;

import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}
