package xyz.supercoders.bank

class InsufficientFundsException extends Exception {
  InsufficientFundsException(String message) {
    super(message)
  }
}
