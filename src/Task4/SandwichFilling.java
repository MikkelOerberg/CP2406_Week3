package Task4;

class SandwichFilling {
    private String filling;
    private int Calories;
    SandwichFilling()
    {
        filling = "egg-salad";
        Calories = 100;
    }
    SandwichFilling(String MyFilling, int MyCalories) {
        filling = MyFilling;
        Calories = MyCalories;
    }
    String getFilling()
    {
        return filling;
    }
    int getCalories()
    {
        return Calories;
    }
}
