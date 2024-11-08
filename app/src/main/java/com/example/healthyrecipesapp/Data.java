package com.example.healthyrecipesapp;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private ArrayList<Cook> cook = new ArrayList<>();

    public Data() {
        cook.add(new Cook("food1", "Food","Creamy Garlic Salmon" , "* 4 (4-6oz) salmon filets\n" +
                "* 2 tablespoons ghee\n" +
                "* 1 cup yellow onion, diced\n" +
                "* 1 whole head of garlic, peeled\n" +
                "* 1 tablespoon lemon juice\n" +
                "* 1/2 cup chicken broth\n" +
                "* 15 oz. can of full fat coconut milk, unsweetened\n" +
                "* 1 teaspoon fresh thyme\n" +
                "* 1/4 teaspoon salt\n" +
                "* 1/8 teaspoon black pepper" , "1. Pat salmon filets dry with a paper towel. Season flesh side with salt and pepper.\n" +
                "2. Heat a large skillet to medium high heat. Add 1 tablespoon of ghee and add salmon to skillet skin side down.\n" +
                "3. Pan sear salmon for 4-5 minutes. Gently flip salmon and sear on the flesh side for 2 minutes. Remove salmon from pan and let rest of a plate.\n" +
                "4. Reduce heat to medium, then immediately add remaining tablespoon of ghee and all of your whole garlic cloves. Saute cloves for 3-4 minutes, stirring around the pan occasionally to brown the outside.\n" +
                "5. Once garlic is slightly browned, add yellow onion to pan.\n" +
                "Saute for 1-2 minutes, until translucent.\n" +
                "6. Next, add in chicken broth, lemon juice and fresh thyme.\n" +
                "Stir and bring to a simmer, reduce by the mixture by half.\n" +
                "7. Slowly add in coconut milk and stir until combined.\n" +
                "Season with salt to taste.\n" +
                "8. Add salmon back to pan and simmer for an additional 2 minutes.\n" +
                "9. Garnish with chopped parsley or basil and serve!"));

        cook.add(new Cook("food2","Food","Crispy Parmesan Garlic Chicken with Zucchini", "* 2 Chicken Breasts sliced in half, or 4 thin chicken breasts\n" +
                "* 8 Tablespoons butter divided\n" +
                "* ½ cup Italian Bread Crumbs\n" +
                "* ½ cup plus 1 Tablespoon grated parmesan divided\n" +
                "* ¼ cup flour\n" +
                "* 2 medium zucchini sliced\n" +
                "* 2 garlic cloves minced", "In a large skillet over medium heat melt 2 Tablespoons butter. To make the chicken: Melt the remaining 4 tablespoons of butter" +
                " in a shallow dish. In another shallow dish combine bread crumbs, parmesan cheese, and flour.\n" +
                "Dip the chicken in the butter and then coat in the bread crumb mixture and place in skillet.\n" +
                "Cook on each side for about 3-4 minutes until the outside is crispy and the chicken is cooked throughout. Set aside on plate.\n" +
                "Add 2 Tablespoons of butter back to the skillet and saute the minced garlic for a minute. Add the zucchini to the skillet and saute until tender. Salt and pepper to taste and add " +
                "1 Tablespoon parmesan. Add the chicken back to the skillet and heat for a minute or so. Serve immediately."));

        cook.add(new Cook("food3","Food","Spinach & Feta Cheese Muffins", "Dry ingredients:--\n" +
                "* 1 medium sweet potato, chopped using food processor\n" +
                "* 1 cup flour, whole wheat\n" +
                "* 1/2 cup rolled oats\n" +
                "* Salt & pepper, garlic powder\n" +
                "* 3 tsp baking powder\n" +
                "Liquid ingredients:--\n" +
                "* 1/2 (or 1 like me) pack Emborg frozen spinach, defrosted, water squeezed\n" +
                "* 1/4 cup olive oil\n" +
                "* 1/2 cup low-fat yogurt\n" +
                "* 2 medium eggs\n" +
                "* 1/4 cup sundried tomato, chopped\n" +
                "* Feta cheese, crumbled", "Mix liquid ingredients in a bowl. Add sweet potato, spinach and then dry ingredients. Mix all ingredients until batter is homogenous. Add sundried tomato. Scoop batter into lined muffin tin, " +
                "garnish with more feta, and bake in a preheated oven (190C) for 35 minutes."));


        cook.add(new Cook("sweet1","Sweet","Tiramisu Chia Pudding", "* 1/4c chia seeds\n" +
                "* 3/4c almond milk\n" +
                "* 1/4c cold coffee\n" +
                "* 2 medjool dates\n" +
                "* 1tbsp cacao powder\n" +
                "* 1 scoop collagen\n" +
                "* Pinch salt\n" +
                "Ganache:--\n" +
                "* 1/4c greek yogurt\n" +
                "* 1tbsp cocoa powder\n" +
                "* 1tbsp almond milk\n" +
                "* Cacao nibs (optional for topping)", " blend all ingredients until almost smooth, scraping down sides as needed\n" +
                "2) divide between 2 jars, seal and set in the fridge 2hrs-overnight to thicken\n" +
                "3) when ready to eat, combine topping ingredients and spoon overtop. Top with cacao nibs and devour!\n" +
                "*makes one large jar or two small"));

        cook.add(new Cook("sweet2","Sweet","Apple Pancake Huck", "* 1 apple\n" +
                "* 1/2 cup pancake mix\n" +
                "* 1/2 tsp cinnamon", "Step 1: Prepare Pancake Batter\n" +
                "* Mix pancake batter with cinnamon.\n" +
                "Step 2: Slice the Apple\n" +
                "* Thinly slice the apple and remove the core.\n" +
                "Step 3: Coat Apple Slices\n" +
                "* Dip the apple slices into the pancake batter until evenly coated.\n" +
                "Step 4: Cook Pancakes\n" +
                "* Cook the slices on medium heat until golden on both sides."));

        cook.add(new Cook("sweet3","Sweet","Flourless Brownies with Avocado", "* 1 Ripe Avocado, mashed \n" +
                "* 1/2 Cup Cocoa Powder \n" +
                "* 2 Eggs \n" +
                "* 1 Cup Coconut Sugar \n" +
                "* 2 Tbs Cashew Butter \n" +
                "* 1 tsp Baking Powder \n" +
                "* 1 tsp Vanilla Extract \n" +
                "* 1/4 tsp Salt \n" +
                "* 1/3 Cup Chocolate Chips", "1) Preheat oven you 325°F and line a 8x8 pan with parchment paper\n" +
                "2) Mix together all ingredients and pour into the pan; sprinkle some additional chocolate chips on top and bake for 45 minutes\n" +
                "3) Let cool completely (refrigerate for 30 minutes to speed up the process) and then cut into squares - finish with a sprinkle of Malden salt on top!\n" +
                "10 minute prep time + 45 minute cook time"));

    }

    public List<Cook> getCook(String type){
        ArrayList<Cook> result = new ArrayList<>();
        for (Cook c:cook){
            if(c.getType().equals(type)){
                result.add(c);
            }
        }
        return result;
    }
}
