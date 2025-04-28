package ma.damri.digitalbanking_backend.exceptions;

public class BankAccountNotFoundException extends RuntimeException {
  public BankAccountNotFoundException(String message) {
    super(message);
  }
}
