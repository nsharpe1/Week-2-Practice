public class TestInvoice {
     public static void main(String[] args) {
        Invoice I1 = new Invoice();

        Invoice I2 = new Invoice();

        Invoice I3 = new Invoice();

        Invoice I4 = new Invoice();

        Invoice I5 = new Invoice();

        Invoice I6 = new Invoice();
        
        I1.setID("1");
        I1.setDesc("Computer");
        I1.setQty(2);
        I1.setUnitPrice(2000);
        I2.setID("2");
        I2.setDesc("TV");
        I2.setQty(3);
        I2.setUnitPrice(3000);
        I3.setID("3");
        I3.setDesc("Headphones");
        I3.setQty(4);
        I3.setUnitPrice(4000);
        I4.setID("4");
        I4.setDesc("iPhone");
        I4.setQty(5);
        I4.setUnitPrice(5000);
        I5.setID("5");
        I5.setDesc("Sound Bar");
        I5.setQty(6);
        I5.setUnitPrice(6000);
        I6.setID("6");
        I6.setDesc("Keyboard");
        I6.setQty(7);
        I6.setUnitPrice(7000);

        System.out.println(I1);
        System.out.println(I2);
        System.out.println(I3);
        System.out.println(I4);
        System.out.println(I5);
        System.out.println(I6);
        System.out.println("The number of invoices that have been generated are: " + Invoice.getInvoiceCount());
     }
}
