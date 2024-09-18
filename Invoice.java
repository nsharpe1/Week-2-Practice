import java.text.DecimalFormat;

public class Invoice {
    private int id;
    private String desc;
    private int qty;
    private double unitPrice;
    private static int invoiceCount = 0;

    public Invoice()
    {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }
    
    public Invoice(int id, String desc, int qty, double unitPrice)
    {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }

    public Invoice(Invoice C)
    {
        this.id = C.id;
        this.desc = C.desc;
        this.qty = C.qty;
        this.unitPrice = C.unitPrice;
        invoiceCount++;
    }

    public int getID()
    {
        return this.id;
    }
    
    public String getDesc()
    {
        return this.desc;
    }

    public int getQty()
    {
        return this.qty;
    }

    public void setID(int id)
    {
        this.id = id;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public String getUnitPrice()
    {
        double un = this.unitPrice;
        return String.format("$%,.2f", un);
    }

    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public String getTotal()
    {
        double unitTotal = this.unitPrice * this.qty;
        return String.format("$%,.2f", unitTotal);
    }

    public static int getInvoiceCount() {
        return invoiceCount;
    }

    public String toString()
    {
        return("InvoiceItem[id=" + this.id + " , desc=" + this.desc + " , qty=" + this.qty + " , unitPrice=" + getUnitPrice() + "]");
    }
}
