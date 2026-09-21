/* Skriv en klasse til at håndtere bankkonti */

Account account1 = new Account();

void main() {
    account1.deposit(1000);
    account1.withdraw(1200);
    account1.deposit(100);
    IO.println(account1);
}


