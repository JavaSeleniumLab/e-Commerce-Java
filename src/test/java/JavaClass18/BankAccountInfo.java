package JavaClass18;

public class BankAccountInfo {

    static  int totalBankAsset = 600500;

    static int countsOfCustomerInquiries = 120;

    static int customerCount = 0;

    String name,  emailAddress;

    int id = 0, age = 0;

    private int ssn;

    private int customerAsset;

    //================================================================================//
    // Setter Methods;


    public void setName(String customerName) {
        ++customerCount;
        this.name = customerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int customerId) {
        this.id = customerId;
    }

    void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setEmailAddress(String customerEmail) {
        this.emailAddress = customerEmail;
    }

    public void setCustomerAsset(int customerAsset) {
        this.customerAsset = customerAsset;
    }

    //==========================================================
    // Getter Methods:

    public String getName(){
        return name;
    }

    public int getAge (){
        return age;
    }

    public int getId(){
        return id;
    }

    public int getSsn(){
        return ssn;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public int getCustomerAsset(){
        return customerAsset;
    }


    //==========================================================================

    // This is Setter Method in the BankAccountInfo class; Not going to turn anything.
    public void signUp (String customerName, int customerAsset){
        this.id= ++customerCount;
        this.name = customerName;
        this.customerAsset = customerAsset;
    }


    public void signUp (String customerName, String customerEmailAddress,int customerAge, int customerAssetIn){
        this.id = ++customerCount;
        this.name = customerName;
        this.emailAddress = customerEmailAddress;
        this.age = customerAge;
        this.customerAsset = customerAssetIn;
        totalBankAsset+=customerAssetIn;
    }


    public void signUp (int customerAge, String customerName, String customerEmailAddress, int ssn){
        this.id = ++customerCount;
        this.age = customerAge;
        this.name = customerName;
        this.emailAddress = customerEmailAddress;
        this.ssn = ssn;

    }

    //This is "Getter" Method in the BankAccountInfo class, return Customer Info;
    public void getCustomerDetails(){
        ++countsOfCustomerInquiries;
        System.out.println("This is newly joined Client : " + name );
        System.out.println("This is newly created ID : " + id );
        System.out.println("This Client's asset is : " + customerAsset );
    }


    static void getBankDetails (){
        System.out.println("Number of Clients : " + customerCount );
        System.out.println("Bank Total assets : " + totalBankAsset);
    }


    static void getCountsOfCustomerInquiries(){
        System.out.println("Internal inquiries is : " + countsOfCustomerInquiries );
    }





    public static void main(String[] args) {



    }



}
