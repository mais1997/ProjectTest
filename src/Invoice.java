public class Invoice {


    private String PartNumber ;
    private  String PartDescription ;
    private int Quantity ;
    private double PricePerItem ;


    public Invoice (String PartNumber , String PartDescription , int Quantity  , double PricePerItem ){
        this.PartNumber=PartNumber;
        this.PartDescription=PartDescription;
        this.Quantity=Quantity;
        this.PricePerItem=PricePerItem;


    }

    public double get_Invoice_Amount (){
        if (Quantity<0 && PricePerItem<0)
            return 0 ;
        else
            return (Quantity*PricePerItem);


    }

    public String getPartNumber() {
        return PartNumber;
    }

    public void setPartNumber(String partNumber) {
        PartNumber = partNumber;
    }

    public String getPartDescription() {
        return PartDescription;
    }

    public void setPartDescription(String partDescription) {
        PartDescription = partDescription;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getPricePerItem() {
        return PricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        PricePerItem = pricePerItem;
    }
}
