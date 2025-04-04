package BT01;

public class BT01 {
    public static void main(String[] args) {
        Account account1 = Account.getInstance();
        Account account2 = Account.getInstance();
        account1.setId(1);
        account1.setName("Xuan Nhat");
        account1.setAge(30);
        System.out.println("Account 2 ID: " + account2.getId());
        System.out.println("Account 2 Name: " + account2.getName());
        System.out.println("Account 2 Age: " + account2.getAge());
    }
}
