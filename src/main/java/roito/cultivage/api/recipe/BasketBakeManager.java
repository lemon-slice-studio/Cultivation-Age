package roito.cultivage.api.recipe;

import roito.silveroakoutpost.recipe.ISingleInRecipe;
import roito.silveroakoutpost.recipe.SingleInRecipeManager;

import java.util.ArrayList;
import java.util.Collection;

public class BasketBakeManager extends SingleInRecipeManager
{
    private static ArrayList<ISingleInRecipe> recipes = new ArrayList<>();

    @Override
    public Collection<ISingleInRecipe> getRecipes()
    {
        return recipes;
    }
}
