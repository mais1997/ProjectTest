

public class InvoiceTest {


    public static void main (String[]args){
        System.out.println("new change for local repository ");
        Invoice invoice = new Invoice("1","mais",12,20);

       double invoiceamount= invoice.get_Invoice_Amount();
       System.out.println(invoiceamount);


    }
}
