
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Rara", "Malfoy");
        bank.addCustomer("Zhyla", "Amanda");
        bank.addCustomer("Rizka", "Safira");
        Customer customer = bank.getCustomer(0);
        Account account = new Account(100000);
        customer.setAccount(account);
        System.out.println("=== DATA BANK ===");
        System.out.println("Jumlah Customer: " + bank.getNumOfCustomers());
        System.out.println();
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer c = bank.getCustomer(i);
            System.out.println("Customer ke-" + (i + 1));
            System.out.println("Nama Depan: " + c.getFirstName());
            System.out.println("Nama Belakang: " + c.getLastName());
            System.out.println("Jumlah Akun: " + c.getNumOfAccounts());
            for (int j = 0; j < c.getNumOfAccounts(); j++) {
                System.out.println("Saldo Akun: " + c.getAccount(j).getBalance());
            }
            System.out.println();
        }
        System.out.println("=== DEPOSIT ===");
        if (account.deposit(50000)) {
            System.out.println("Deposit berhasil.");
        } else {
            System.out.println("Deposit gagal.");
        }
        System.out.println("Saldo sekarang: " + account.getBalance());
        System.out.println();
        System.out.println("=== WITHDRAW ===");
        if (account.withdraw(25000)) {
            System.out.println("Withdraw berhasil.");
        } else {
            System.out.println("Withdraw gagal.");
        }
        System.out.println("Saldo sekarang: " + account.getBalance());
    }
}