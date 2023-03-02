package InvoiceItem;

public class InvoiceItemRunner {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("pam2","khorog", 15, 3.5);
        System.out.println(invoiceItem.toString());
        System.out.println(invoiceItem.getTotal());

    }
}
