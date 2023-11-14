package Lab_12.sampleprogram;

public class TestProduct {
    public static void main(String[] args) {
        LineItem[] allLineItems = new LineItem[10];

        Product p1 = new Product(1, "Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4,"Marker","This is a black permanent marker");


        LineItem item1 = new LineItem(1,3,p1);
        LineItem item2 = new LineItem(2,4,p2);
        LineItem item3 = new LineItem(3,2,p3);

        allLineItems[0] = item1;
        allLineItems[1] = item2;
        allLineItems[2] = item3;

        System.out.println("\nDisplaying the state of all line-items ...\n");
        for (int i = 0; i < allLineItems.length;i++)
            if (allLineItems[i] != null)
                System.out.println(allLineItems[i]);

        System.out.println("Now changing product associated with first line-item to a marker...\n\n");
        item1.setProduct(p4);

        System.out.println("Displaying the state of all line-items again...\n\n");
        for(int i = 0; i < allLineItems.length; i++)
            if(allLineItems[i] != null)
                System.out.println(allLineItems[i]);

        System.out.println("Now destroying the second line item (the 4 pencils)...\n");
        item2 = null; //destroy the 2nd LineItem object in the array
        allLineItems[1] = null;

        System.out.println("Displaying the state of the second product ...\n");
        System.out.println(p2); //and yet the Product associated with it still exists

    }


}
