package xyz.supercoders.bank

class Account {
  String name
  String type
  Double balance

  // default constructor in a groovy bean
  /* Account(Map params) {
    this.name = params['name']
    this.type = params['type']
    this.balance = params['balance']
  }

  Account(String name, String type, Double balance) {
    this.name = name
    this.type = type
    this.balance = balance
  } */

  Double withdraw(Double amt) {
    if (amt <= 0) {
      throw new IllegalArgumentException('Amt to withdraw shud be positive non zero')
    }

    if (this.balance - amt < 1000) {
      throw new InsufficientFundsException('Acc balance not getting maintained')
    }

    this.balance -= amt
    this.balance
  }
}
