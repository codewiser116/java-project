package day4;

public class ContainsPractice {
    public static void main(String[] args) {
        String bottle = "coffee and tea";

        // contains() method returns true if String contains given argument, else it returns false

        boolean doesItContain = bottle.contains("Coffee");
        System.out.println(doesItContain); //false

        System.out.println(bottle.contains(" coffee")); //false

        System.out.println(bottle.contains("tea ")); //false

        System.out.println(bottle.contains("TEA".toLowerCase().trim())); //true

        System.out.println(bottle.contains("coffee and tea".replace('a', 'a')));

        String article = "Skip to content\n" +
                "Check out my brand new cookbook! Available NOW!\n" +
                "\n" +
                "ABOUT\n" +
                "MEET THE TEAM\n" +
                "CONTACT US\n" +
                "All Recipes\n" +
                "\n" +
                "ALL CATEGORIES\n" +
                "MEAL PLANS\n" +
                "BREAKFAST\n" +
                "APPETIZERS\n" +
                "SIDE DISHES\n" +
                "DINNER\n" +
                "DESSERTS\n" +
                "BEVERAGES\n" +
                "SOUP\n" +
                "SALADS\n" +
                "SAUCES\n" +
                "HOLIDAY/SEASON\n" +
                "\n" +
                "EASTER\n" +
                "SPRING\n" +
                "SUMMER\n" +
                "FALL\n" +
                "THANKSGIVING\n" +
                "WINTER\n" +
                "CHRISTMAS\n" +
                "VALENTINE’S DAY\n" +
                "By Ingredient\n" +
                "\n" +
                "CHICKEN\n" +
                "BEEF\n" +
                "PORK\n" +
                "TURKEY\n" +
                "VEGETABLES\n" +
                "FRUITS\n" +
                "CHEESES\n" +
                "CHOCOLATE\n" +
                "CINNAMON\n" +
                "SEAFOOD\n" +
                "FISH\n" +
                "PASTA\n" +
                "NUTS\n" +
                "BACON\n" +
                "By Cooking Type\n" +
                "\n" +
                "AIR FRYER\n" +
                "INSTANT POT\n" +
                "SLOW COOKER\n" +
                "BAKED\n" +
                "30-MINUTE MEALS\n" +
                "SMOKED\n" +
                "SKILLET\n" +
                "GRILLING\n" +
                "Newest Recipes\n" +
                "Join Our Newsletter\n" +
                "Cookbook\n" +
                "My Favorites\n" +
                "\n" +
                "HOME › DINNER\n" +
                "\n" +
                "The Best Lobster Tail Recipe Ever!\n" +
                "\n" +
                "By Alyssa Rivers\n" +
                "\n" +
                "on Jan 19, 2020, Updated Feb 06, 2021\n" +
                "\n" +
                "4.93 from 54 votes\n" +
                "JUMP TO RECIPE\n" +
                "JUMP TO VIDEO\n" +
                "This website may contain affiliate links and advertising so that we can provide recipes to you. Read my disclosure policy.\n" +
                "\n" +
                "This lobster tail recipe is a decadent dinner made with large lobster tails smothered with a buttery garlic herb sauce then broiled under high heat making these lobster tails tender and juicy. The ultimate indulgence!\n" +
                "\n" +
                "Skip the restaurants and make your own fancy meal at home! Start off with Easiest Crab Cakes, add a side of Parmesan Herb Asparagus Fries with Creamy Greek Yogurt and Dad’s Famous Mashed Potatoes making this a complete meal.\n" +
                "\n" +
                "Lobster tails broiled on a sheet pan.\n" +
                "My Latest Videos\n" +
                "The Best Lobster Tail Recipe\n" +
                "Butter Garlic Herb Broiled Lobster is a decadent dinner that comes together quickly and easily. Impress your sweetheart or family with this beautiful lobster tail recipe. I love how simple it is to prepare and broil. Staying home and enjoying this AMAZING dinner together is just what we want to do this year for Valentine’s Day. It is perfect for us and we still get to enjoy a delicious meal without paying the price and having to wait or make reservations in advance.\n" +
                "\n" +
                "Lobster tail is one of my favorite meals when eating out. I knew I needed something special this Valentine’s Day. It is full of a buttery garlic herb dip that is slathered on each one. Once you taste the thick, tender, juicy lobster tail it will melt in your mouth. This seafood recipe is mouthwatering! Don’t let this recipe scare you. It is easier than you think!\n" +
                "\n" +
                "\n" +
                "How to Buy Lobster:\n" +
                "It all starts with a great lobster. This is important! Lobster can be expensive but it doesn’t have to be. You will want to purchase the best without over paying. It is best to buy cold water lobster. You will want to avoid tails that are soaked in sodium tripolyphosphate. This will ensure that is doesn’t taste like ammonia. Make sure that it is not discolored on the meat. When cooking it will turn out mushy and sometimes flavorless. These are great things to look for when purchasing high end seafood.\n" +
                "\n" +
                "What you need to Make Perfect Lobster Tail:\n" +
                "Everything is right in your pantry and ready to go. All you need to do is purchase your lobster! This recipe is simple to make and comes together so quickly. It takes less than 20 minutes from preparing to broiling them. I love how simple it is and yet it is decadent and beautiful on a plate. Enjoy this seafood recipe with your loved one or family this Valentine’s Day!\n" +
                "\n" +
                "\n" +
                "Lobster Tails\n" +
                "Salt and Pepper\n" +
                "Butter\n" +
                "Garlic Cloves\n" +
                "Paprika\n" +
                "Thyme\n" +
                "Rosemary\n" +
                "Parsley \n" +
                "Butterflying the lobster tails down the middle of their shell.\n" +
                "\n" +
                "How to Cook Lobster:\n" +
                "I can’t stress enough on how simple this lobster tail recipe is. Lobster tails can be intimidating when starring at them in a case at a grocery store but I am here to tell you they are easy and make a holiday or dinner turn into an extra special night. Most ingredients you already have at home even!\n" +
                "\n" +
                "After preparing your lobster tails, you will make a butter garlic herb that will be brushed over each of the meat sticking out. I can’t tell you how delicious this is! It is the best part and what makes this lobster meat turn to a golden yellow when baking. It truly just melts in your mouth leaving you speechless.\n" +
                "\n" +
                "Get Prepare: Preheat the oven to broil or 500 degrees. Start by preparing the lobster. Using kitchen shears butterfly the tail by cutting down the center. Loosen the meat and pull the lobster meat upward. Salt and pepper the meat and set on a baking sheet.\n" +
                "Whisk together the garlic herb butter: In a small bowl whisk together the melted butter, garlic, paprika, thyme, rosemary, and parsley. Spread evenly on each one.\n" +
                "Broil: Broil the lobster for about 8-10 minutes or until the meat is opaque and lightly brown on the top. Serve with melted butter if desired.\n" +
                "\n" +
                "How to Butterfly a Lobster Tail:\n" +
                "This is a simple process that is only used with scissors. If you prefer not to butterfly your lobster tail that is great too. By butterflying your lobster tail it makes it easier to eat and also has a more elegant look when serving it.\n" +
                "\n" +
                "With sharp kitchen shears it is best to cut down the middle of the back towards the lobster tail. The shell side will be up and the lobster tail will be pointed away from you.\n" +
                "Flip the tail over and carefully pull apart the middle of the cut shell and gently place your fingers underneath the lobster meat.\n" +
                "Flip the lobster back over, slowly and carefully pull up the lobster meat in one piece. The meat should still be attached at the bottom of the tail.\n" +
                "Once the lobster meat is on top of the shell take the shell and close it around the bottom of the meat.\n" +
                "As the lobster is being broiled it will expand and have an elegant fan shape presentation similar to the restaurants.\n" +
                "Pulling the meat out of the lobster shell while butterflying them. \n" +
                "How Long to Broil Lobster:\n" +
                "I love to broil lobster tails because it is quick and easy plus you still have that beautiful coloring over the meat. It is easy to over cook lobster tails so you will want to be paying close attention to them as they are being broiled. It is best to broil the lobster tails for about one minute per ounce and having the lobster tail about 4 to 5 inches from the heat on the top rack in the oven. The lobster will turn a beautiful opaque in color with a white center. It is best to use a meat thermometer to make sure it doesn’t overcook. The center of the lobster will reach 145*F for best results.\n" +
                "\n" +
                "Broiling Times for Seafood:\n" +
                "Broiling times can vary depending on size and length of the lobster tails. For a smaller lobster tail it is best to cook them about 7 to 9 minutes. Anything over 6 ounces will takes about 7 to 10 minutes long broiling them. The one thing I always have near me when cooking any type of meat is my meat thermometer. I am very cautious on making sure I do not overcook my meat. If you are broiling a larger lobster tail you will want to adjust the oven rack down another inch so it can cook more evenly.\n" +
                "\n" +
                "Different Ways of Cooking Lobster Tails:\n" +
                "There are several different variations when cooking lobster tails. I love how simple each of them are and how they all taste just about the same. It is all about preference and what is easiest for you in your kitchen. Lobster tails are cooked quickly and easily. In less than 10 minutes you will have a beautiful and decadent meal on your table anyway you cook them.\n" +
                "\n" +
                "Broiled: This is my go-to way. It is quick and easy and simple broiled on high heat and up close to top of the over. This makes a tender lobster tail ever time.\n" +
                "Baked: Very similar to broiling except under average heat and extra time when cooking.\n" +
                "Poached: This is more of a simmer in a layer of butter. It is also known as butter poaching.\n" +
                "Boiled: For the easiest and simplest way of cooking lobster boiling it is the way to go. Boil water in a large pot and the lobster tails soak in and boil for minutes. Sometimes the lobster is not quite as tasty though and doesn’t have that rich buttery herb flavor attached to it compared to other ways of cooking.\n" +
                "Grilled: If you love to grill, this is for you! Simply add the lobster tails to your grill and let the heat cook the tails evenly and quickly.\n" +
                "Spreading a buttery garlic herb sauce over top of the lobster tail. \n" +
                "Tips for the BEST Cooked Lobster:\n" +
                "Making it ahead: To help save time, butterfly your lobster tails the day of. Too early will discolor the lobster meat.\n" +
                "Types of Lobster: Any type of lobster works well. If you prefer spiny lobster that is great too. Just be careful!\n" +
                "Butterflying the lobster: If you cut through your meat, it will be okay. Sometimes this will help ensure it is cooked more evenly anyways. You will want to avoid cutting through the bottom shell though.\n" +
                "Meat thermometer: Try your best not to overcook the lobster tails. This will help by using a meat thermometer.\n" +
                "How long to broil your lobster tail: It is best to broil your lobster tail for about one minute per ounce of lobster tail.\n" +
                "Oven settings: Move your oven rack down to the middle setting if you are cooking a large or oversized lobster tail.\n" +
                "Female Lobster: It is fun to see a slightly pink lobster meat once it is cooked. This only tells you that it is a female lobster.\n" +
                "Can you make lobster tails ahead of time? It is best to enjoy the lobster tail right when it is done broiling. Lobster meat becomes tougher when reheating it.\n" +
                "Serving your lobster tail: Serve with lemon wedges and fresh parsley for garnishing the lobster tails.\n" +
                "Lobster tails broiled on a sheet pan with lemon slices. \n" +
                "Make a Complete Meal!\n" +
                "Make this a complete meal with all the right sides! It is the perfect date night in with these lobster tails. Even a fun and decadent family meal to spoil them all with this special dinner. With Valentine’s Day around the corner, I thought this is the perfect dinner to surprise my family with and have them know how much I love them with this AMAZING meal. My family is going to be so surprised and love everything about it.\n" +
                "\n" +
                "This is a simple meal that can start off with a side salad or soup, add a side of vegetables, potatoes and even some Copycat Red Lobster Cheddar Bay Biscuits. End with a Death by Chocolate Cheesecake or a Red Velvet Cake Recipe for a delicious dessert. I am bringing home a restaurant style meal to our family dinner.\n" +
                "\n" +
                "Garlic Butter String Beans\n" +
                "Garlic Herb Mashed Potatoes \n" +
                "Parmesan Roasted Cauliflower\n" +
                "Creamy Grape Salad Recipe\n" +
                "Parmesan Garlic Roasted Potatoes\n" +
                "A lobster tail butterflied, and served on a plate with a buttery garlic herb sauce with lemon slices.\n" +
                "More Yummy Seafood Recipes to Try:\n" +
                "Sticky Honey Garlic Butter Shrimp\n" +
                "Mexican Shrimp Skillet\n" +
                "Creamy Lemon Parmesan Scallops (Insanely Good!)\n" +
                "Creamy Shrimp and Mushroom Pasta\n" +
                "Garlic Butter Herb Scallops\n" +
                "Pin this now to find it later\n" +
                "\n" +
                "PIN IT\n" +
                "\n" +
                "SAVE\n" +
                "PIN\n" +
                "PRINT\n" +
                "The Best Lobster Tail Recipe Ever!\n" +
                "4.93 from 54 votes\n" +
                "By: Alyssa Rivers\n" +
                "The Best Lobster Tail Recipe Ever is a decadent dinner made with large lobster tails smothered with a buttery garlic herb sauce then broiled under high heat making these lobster tails tender and juicy. The ultimate indulgence!\n" +
                "PREP TIME:\n" +
                "10minutes minutes\n" +
                "COOK TIME:\n" +
                "10minutes minutes\n" +
                "TOTAL TIME:\n" +
                "20minutes minutes\n" +
                "SERVINGS:\n" +
                "4 people\n" +
                "Ingredients \n" +
                "1X\n" +
                "2X\n" +
                "3X\n" +
                "▢4 lobster tails\n" +
                "▢salt and pepper\n" +
                "▢1/4 cup butter melted\n" +
                "▢3 garlic cloves minced\n" +
                "▢1/2 teaspoon paprika\n" +
                "▢1 teaspoon thyme minced\n" +
                "▢1 teaspoon rosemary minced\n" +
                "▢1 teaspoon parsley chopped\n" +
                "Instructions \n" +
                "\n" +
                "Preheat the oven to broil or 500 degrees. Start by preparing the lobster. Using kitchen shears butterfly the tail by cutting down the center. Loosen the meat and pull the lobster meat upward. Salt and pepper the meat and set on a baking sheet.\n" +
                "In a small bowl whisk together the melted butter, garlic, paprika, thyme, rosemary, and parsley. Spread evenly on each lobster tail.\n" +
                "Broil the lobster tails for about 8-10 minutes or until the meat is opaque and lightly brown on the top. Serve with melted butter if desired.\n" +
                "Video\n" +
                "Nutrition\n" +
                "Calories: 155kcal\n" +
                "Carbohydrates: 1g\n" +
                "Protein: 11g\n" +
                "Fat: 12g\n" +
                "Saturated Fat: 7g\n" +
                "Cholesterol: 111mg\n" +
                "Sodium: 370mg\n" +
                "Potassium: 136mg\n" +
                "Fiber: 1g\n" +
                "Sugar: 1g\n" +
                "Vitamin A: 501IU\n" +
                "Vitamin C: 2mg\n" +
                "Calcium: 61mg\n" +
                "Iron: 1mg\n" +
                "Nutrition information is automatically calculated, so should only be used as an approximation.\n" +
                "\n" +
                "Additional Info\n" +
                "Course: Dinner, Main Course\n" +
                "Cuisine: American, Caribbean, Mediterranean\n" +
                "Tried this recipe?\n" +
                "Mention @alyssa_therecipecritic or tag #therecipecritic!\n" +
                " \n" +
                "\n" +
                "Lobster meat on a fork being dipped in a buttery herb garlic sauce. \n" +
                "Like this recipe? Share it!\n" +
                "PinFacebookTweetYummlyEmail\n" +
                "Categorized as:\n" +
                "American, Baked, Dinner, Fathers Day, Holiday, Lobster, Oven, Seafood, Valentine's Day\n" +
                "\n" +
                "\n" +
                "About Alyssa Rivers\n" +
                "\n" +
                "Alyssa Rivers is the author of 'The Tried and True Cookbook', a professional food photographer and experienced recipe-developer. Having a passion for cooking, her tried and true recipes have been featured on Good Morning America, Today Food, Buzzfeed and more.\n" +
                "\n" +
                "READ MORE ABOUT ME\n" +
                "More Ideas\n" +
                "\n" +
                "SOUP\n" +
                "\n" +
                "Ham and Bean Soup\n" +
                "35 mins\n" +
                "\n" +
                "\n" +
                "APPETIZERS\n" +
                "\n" +
                "Copycat Bang Bang Shrimp\n" +
                "30 mins\n" +
                "\n" +
                "\n" +
                "DINNER\n" +
                "\n" +
                "White Cheddar Mac and Cheese\n" +
                "40 mins\n" +
                "\n" +
                "Leave a comment\n" +
                "Your email address will not be published. Required fields are marked *\n" +
                "\n" +
                "RECIPE RATING\n" +
                "Recipe Rating\n" +
                "COMMENT *\n" +
                "\n" +
                "NAME *\n" +
                "\n" +
                "EMAIL *\n" +
                "\n" +
                "113 Comments\n" +
                "Missie\n" +
                "February 25, 2024 at 2:22 pm\n" +
                "I have frozen lobster do I just thaw the day before?\n" +
                "\n" +
                "REPLY\n" +
                "Alyssa Rivers\n" +
                "February 26, 2024 at 11:37 am\n" +
                "Yep! That should work just fine!\n" +
                "\n" +
                "REPLY\n" +
                "Bobbie\n" +
                "February 19, 2024 at 12:58 pm\n" +
                "5 starsThe best lobster I have ever made\n" +
                "\n" +
                "REPLY\n" +
                "Joan\n" +
                "March 14, 2024 at 12:58 pm\n" +
                "I used your recipe “The Best Lobster Tail Recipe Ever!” and you are 100% correct and I thank you for it. I have never cooked lobster before and it was excellent!\n" +
                "I broiled it the first time for several people and it was perfect. Generally it is just me so I cooked it in the air fryer – 380 degrees for 15 minutes (my air fryer) – it was just as good.\n" +
                "\n" +
                "REPLY\n" +
                "Tricia\n" +
                "February 13, 2024 at 6:25 pm\n" +
                "5 starsAs good as any fine seafood restaurant and I’ve tried many all over! Super easy and quick too, made this after work and it was as quick as throwing in a frozen pizza and tasted like we were fine dining out!\n" +
                "\n" +
                "REPLY\n" +
                "Kitti Hammons\n" +
                "February 11, 2024 at 4:05 am\n" +
                "5 starsAbsolutely delicious! Family said better than a restaurant\n" +
                "\n" +
                "REPLY\n" +
                "Alyssa Rivers\n" +
                "February 11, 2024 at 4:14 am\n" +
                "The best compliment! So happy you and your family enjoyed it!\n" +
                "\n" +
                "REPLY\n" +
                "Becky P\n" +
                "January 2, 2024 at 7:27 pm\n" +
                "5 starsThis recipe is THE BEST! I had never made lobster tail before and by reading this thorough recipe and tips, my first attempt was melting in our mouths delicious! Thank you for so much detail. Why would anyone need to or want to dip it in the melted butter after preparing it as directed in this recipe? WAY better than restaurant lobster.\n" +
                "\n" +
                "REPLY\n" +
                "Kay\n" +
                "January 1, 2024 at 8:46 am\n" +
                "Way too much seasoning, overpowering the lobster\n" +
                "\n" +
                "REPLY\n" +
                "Tom Goucher\n" +
                "December 31, 2023 at 5:57 pm\n" +
                "We used this recipe for our New Year’s Eve dinner, lucked into cooking them just enough, and they were delicious!\n" +
                "\n" +
                "REPLY\n" +
                "Ralph\n" +
                "December 22, 2023 at 5:54 pm\n" +
                "5 starsLobster \uD83E\uDD9E was amazing thanks\n" +
                "\n" +
                "REPLY\n" +
                "Fahad\n" +
                "November 19, 2023 at 9:22 am\n" +
                "Such a great recipie\n" +
                "\n" +
                "REPLY\n" +
                "Comment navigation\n" +
                "OLDER COMMENTS\n" +
                "\n" +
                "Meet Alyssa\n" +
                "\n" +
                "Alyssa Rivers is the author of 'The Tried and True Cookbook', a professional food photographer and experienced recipe-developer. Having a passion for cooking, her tried and true recipes have been featured on Good Morning America, Today Food, Buzzfeed and more.\n" +
                "\n" +
                "READ MORE ABOUT ME\n" +
                "\n" +
                "\n" +
                "My New Cookbook is Available NOW!\n" +
                "\n" +
                "It’s here!! My first cookbook The Tried and True Cookbook is available to order! It’s packed with family recipes, favorites from readers, and 25 brand-new exclusive recipes. \n" +
                "\n" +
                "ORDER NOW\n" +
                "Popular\n" +
                "\n" +
                "DINNER\n" +
                "\n" +
                "Crockpot Bourbon Chicken\n" +
                "4 hrs 35 mins\n" +
                "\n" +
                "\n" +
                "DRESSINGS, SAUCES, AND DIPS\n" +
                "\n" +
                "The Best Homemade Alfredo Sauce Recipe Ever!\n" +
                "15 mins\n" +
                "\n" +
                "\n" +
                "DINNER\n" +
                "\n" +
                "The Best Swedish Meatballs\n" +
                "30 mins\n" +
                "\n" +
                "16 Quick & Easy 30 Minute Recipes!\n" +
                "(Plus weekly recipe updates)\n" +
                "YOUR FIRST NAME *\n" +
                "YOUR EMAIL ADDRESS *\n" +
                "SIGN ME UP!\n" +
                "As Seen In\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Back to top\n" +
                "The Recipe Critic\n" +
                "Recipe Box\n" +
                "Appetizers\n" +
                "Breakfast\n" +
                "Dinner\n" +
                "Salads\n" +
                "Sides\n" +
                "Desserts\n" +
                "©2024 THE RECIPE CRITIC. ALL RIGHTS RESERVED. PRIVACY POLICY • POWERED BY CULTIVATEWP.\n" +
                "\n" +
                "Talk to our AI Chatbot\n" +
                "Notice to Users\n" +
                "\n" +
                "\n" +
                "Air Fryer Lobster Tails\n" +
                "Grilled Cajun Garlic Butter Lobster Tails\n" +
                "Lobster Pasta\n" +
                "Lobster Ravioli Sauce\n" +
                "Lobster Bisque\n" +
                "Incredible Lobster Mac and Cheese\n" +
                "Easy Lobster Roll\n" +
                "Copycat Red Lobster Cheddar Bay Biscuits\n" +
                "Garlic Butter Herb Scallops\n" +
                "Ribeye Roast\n" +
                "Powered by Slickstream\n" +
                "search text\n" +
                "\n" +
                "\n" +
                "Information from your device can be used to personalize your ad experience.\n" +
                "\n" +
                "Do not sell or share my personal information.\n" +
                "A RAPTIVE PARTNER SITE\n";

        System.out.println(article.contains("recipe"));



    }
}
