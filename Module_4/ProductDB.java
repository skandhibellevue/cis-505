/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/ 
import java.util.*;

public class ProductDB {

    /**
     * GetProducts method with one argument, which is used to return generic product queue object.
     * @param code int
     * @return returns a generic Product queue object
     */
    public static GenericQueue<Product> getProducts(String code) {
        GenericQueue<Product> products = new GenericQueue<Product>();

        String[] ballCodes = {"B100", "B200", "B300", "B400", "B500"};
        String[] ballDescriptions = {"Hammer Black Widow", "Brunswick Rhino", "Brunswick TZone", "Storm Phase II", "Motiv Venom"};
        double[] ballPrices = {150.99, 145.99, 159.99, 169.95, 152.95};

        if(code.equalsIgnoreCase("b")) {
            // Creates 5 instances of Ball and adds it to generic products queue
            String[] ballColors = {"Black and Red", "Pink Pearl", "Golden Black", "Deep Blue", "White Pearl"};
            for(int i = 0; i < 5; i++) {
                Ball ball = new Ball();
                ball.setCode(ballCodes[i]);
                ball.setDescription(ballDescriptions[i]);
                ball.setPrice(ballPrices[i]);
                ball.setColor(ballColors[i]);
                products.enqueue(ball);
            }
        } else if(code.equalsIgnoreCase("s")) {
            // Creates 5 instances of Shoe and adds it to generic products queue
            double[] shoeSizes = {10, 8.5, 9.5, 11, 11.5};
            for(int i = 0; i < 5; i++) {
                Shoe shoe = new Shoe();
                shoe.setCode(ballCodes[i]);
                shoe.setDescription(ballDescriptions[i]);
                shoe.setPrice(ballPrices[i]);
                shoe.setSize(shoeSizes[i]);
                products.enqueue(shoe);
            }
        } else if(code.equalsIgnoreCase("a")) {
            // Creates 3 instances of Bag and adds it to generic products queue
            String[] bagTypes = {"Single", "Double", "Triple"};
            for(int i = 0; i < 3; i++) {
                Bag bag = new Bag();
                bag.setCode(ballCodes[i]);
                bag.setDescription(ballDescriptions[i]);
                bag.setPrice(ballPrices[i]);
                bag.setBagType(bagTypes[i]);
                products.enqueue(bag);
            }
        } else {
            Product emptyProduct = new Product();
            products.enqueue(emptyProduct);
        }

        return products;
    } // end getProducts
} // end ProductDB
