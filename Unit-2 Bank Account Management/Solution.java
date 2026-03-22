import java.util.*; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String accountNumber = sc.nextLine(); 
        String holderName = sc.nextLine(); 
        double balance = sc.nextDouble(); 
        sc.nextLine(); 
        String accountType = sc.nextLine(); 
        String bankName = sc.nextLine(); 
        String branchName = sc.nextLine(); 
        String ifsc = sc.nextLine(); 
        String mobile = sc.nextLine(); 
        String email = sc.nextLine(); 
        String aadhaar = sc.nextLine(); 
        String address = sc.nextLine(); 
        String openingDate = sc.nextLine(); 
        BankAccount p = new BankAccount(); 
        p.setAccountNumber(accountNumber); 
        p.setHoldername(holderName); 
        p.setBalance(balance); 
        p.setAccountType(accountType); 
        p.setBankName(bankName); 
        p.setBranchName(branchName); 
        p.setIFSC(ifsc); 
        p.setMobile(mobile); 
        p.setEmail(email); 
        p.setAadhaar(aadhaar); 
        p.setAddress(address); 
        p.setOpeningDate(openingDate); 
        p.display(); 
        double depositAmount = sc.nextDouble(); 
        p.deposit(depositAmount); 
        double withdrawAmount = sc.nextDouble(); 
        p.withdraw(withdrawAmount); 
        p.display(); 
        sc.close(); 
    } 
} 
class BankAccount { 
    private String accountNumber; 
    private String holderName; 
    private double balance; 
    private String accountType; 
    private String bankName; 
    private String branchName; 
    private String ifsc; 
    private String mobile; 
    private String email; 
    private String aadhaar; 
    private String address; 
    private String openingDate; 
    public void setAccountNumber(String accountNumber) { 
        this.accountNumber = accountNumber; 
    } 
    public void setHoldername(String holderName) { 
        this.holderName = holderName; 
    } 
    public void setBalance(double balance) { 
        this.balance = balance; 
    } 
    public void setAccountType(String accountType) { 
        this.accountType = accountType; 
    } 
    public void setBankName(String bankName) { 
        this.bankName = bankName; 
    } 
    public void setBranchName(String branchName) { 
        this.branchName = branchName; 
    } 
    public void setIFSC(String ifsc) { 
        this.ifsc = ifsc; 
    } 
    public void setMobile(String mobile) { 
        this.mobile = mobile; 
    } 
    public void setEmail(String email) { 
        this.email = email; 
    } 
    public void setAadhaar(String aadhaar) { 
        this.aadhaar = aadhaar; 
    } 
    public void setAddress(String address) { 
        this.address = address; 
    } 
    public void setOpeningDate(String openingDate) { 
        this.openingDate = openingDate; 
    } 
    public void display() { 
        System.out.println("----- Account Details -----"); 
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder Name: " + holderName); 
        System.out.println("Account Type: " + accountType); 
        System.out.println("Bank Name: " + bankName); 
        System.out.println("Branch Name: " + branchName); 
        System.out.println("IFSC Code: " + ifsc); 
        System.out.println("Mobile Number: " + mobile); 
        System.out.println("Email: " + email); 
        System.out.println("Aadhaar Number: " + aadhaar); 
        System.out.println("Address: " + address); 
        System.out.println("Account Opening Date: " + openingDate); 
        System.out.printf("Balance: $%.2f\n", balance); 
    } 
    void deposit(double amount) { 
        if (amount <= 0) { 
            System.out.println("Invalid Transaction"); 
        } else { 
            balance += amount; 
            System.out.printf("Deposit Successful. Updated Balance: $%.2f\n", balance); 
        } 
    } 
    void withdraw(double amount) { 
        if (amount <= 0 || balance < amount) { 
            System.out.println("Invalid Transaction"); 
        } else { 
            balance -= amount; 
            System.out.printf("Withdrawal Successful. Updated Balance: $%.2f\n", 
balance); 
        } 
    } 
} 