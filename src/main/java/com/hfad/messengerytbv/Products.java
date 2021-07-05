package com.hfad.messengerytbv;

public class Products {
    private String name;
    private String description;
    private String bullet;
    private int imageResourceId;

    public static final Products[] allproducts = {
            new Products("Energy Drinks",
                        "A BLAST OF ENERGY AND NONE OF THE SUGAR!™ \n\n Positive energy to fuel your next adventure. Packed with 80 mg of caffeine, mega doses of B vitamins, 1–2 g of carbs and only 10 calories per can.",
                        "• Made with a blend of premium ingredients and B-vitamins.\n" +
                                "• Only 10 calories per can.\n" +
                                "• 80 mg of caffeine per can, comparable to a small cup of coffee.\n" +
                                "• No carbs and sugar-free. \n\n" +
                                "Each case includes:\n" +
                                "\n" +
                                "• 3 - XS™ Energy Drink - Citrus\n" +
                                "• 3 - XS™ Energy Drink - Cranberry-Grape\n" +
                                "• 3 - XS™ Sparkling Energy - Pink Grapefruit\n" +
                                "• 3 - XS™ Energy Drink - Tropical\n\n" +
                                "Flavors and assortment are subject to change.\n\n" +
                                "High caffeine content\n\n" +
                                "Caution: Do not consume more than 2 cans daily. Not recommended for children, pregnant or breastfeeding women and individuals sensitive to caffeine.\n\n"+
                                "Do not mix with alcohol.",
                        R.drawable.energydrinks),
            new Products("Protein Shakes",
                        "BUILD LEAN MUSCLE \n\n A delicious chocolate protein shake that helps build and maintain lean muscle mass. 25g of whey and casein proteins. Conveniently ready to drink.",
                    "• Made with a blend of premium ingredients and B-vitamins.\n" +
                            "• 25 grams of protein per serving\n" +
                            "• 40% of Daily Calcium value, comparable to a cup of milk.\n" +
                            "• Zero grams of sugar per pack \n\n" +
                            "4 flavours to choose from:\n" +
                            "\n" +
                            "• XS™ Protein Shake - Chocolate\n" +
                            "• XS™ Protein Shake - Vanilla\n" +
                            "• XS™ Protein Shake - Strawberry\n" +
                            "• XS™ Protein Shake - Unflavoured\n\n" +
                            "Flavors and assortment are subject to change.\n\n",
                        R.drawable.proteinshakes),
            new Products("Mass Gainer",
                        "DELICIOUS AND FILLING \n\n Creamy flavor satisfies hunger. Replace one to two meals per day. 20 grams of protein and 25 vitamins and minerals. Gluten free and soy free.",
                    "• Made with a blend of premium ingredients and B-vitamins.\n" +
                            "• No artificial colors, flavors or preservative.\n" +
                            "• Support digestive health and keep you feeling energized.\n" +
                            "• Healthy weight-loss. \n\n" +
                            "Each serving includes:\n" +
                            "\n" +
                            "• Calories - 230 \n" +
                            "• Fat - 5 grams\n" +
                            "• Carbohydrates - 25 grams\n" +
                            "• Protein - 20 grams\n\n" +
                            "Flavors and assortment are subject to change.\n\n" +
                            "This shake is ideal for individuals engaged in a weight-management program, like the BodyKey™ SmartLoss™ plan, who are looking for a safe, effective and great-tasting product to help them reach their ideal body weight (when combined with a calorie-restricted diet).\n\n",
                        R.drawable.protien01),
            new Products("Zesty Protein",
                        "Zesty and Fiesty \n\n A delicious, savory snack with 7g of protein. BodyKey by Nutrilite™ Zesty Protein Snacks are perfectly portioned and conveniently packaged to keep you on track and help satisfy cravings.",
                    "• 14 Single-Serve Pouches\n" +
                            "• Only 3.5 grams of fat per pack.\n" +
                            "• Made from Pea protein isolate and brown rice \n" +
                            "• Good source of protein and carbohydrates \n\n" +
                            "Each Serving Provides:\n" +
                            "\n" +
                            "• 120 calories\n" +
                            "• 7 g protein\n" +
                            "• Gluten free\n" +
                            "• Soy Free\n" +
                            "• No artificial colors, flavors or preservatives\n\n"+
                            "Flavors and assortment are subject to change.\n\n" +
                            "Not recommended for children under age 5\n\n" +
                            "Use as part of the BodyKey™ SmartLoss™ program – a personalized weight-loss solution designed to work with you every step of the way.\n\n",
                        R.drawable.zestyprotein),
            new Products("Plant Protein",
                    "AN IMPORTANT BUILDING BLOCK \n\n Get what your body needs by adding this fine, flavorless powder to beverages. All-vegetarian base, derived from soy, wheat and yellow peas, provides all essential amino acids.",
                    "• 10 grams of protein in one 12.5-gram serving.\n\n" +
                            "• Dairy free, lactose free.\n\n" +
                            "• Cholesterol free and low fat.\n\n" +
                            "• All nine essential amino acids.\n\n" ,
                    R.drawable.plantprotein)
    };

    public Products(String name, String description, String bullet, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.bullet = bullet;
        this.imageResourceId = imageResourceId; }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBullet() {
        return bullet;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
