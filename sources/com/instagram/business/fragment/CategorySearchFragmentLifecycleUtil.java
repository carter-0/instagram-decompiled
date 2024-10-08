package com.instagram.business.fragment;

public final class CategorySearchFragmentLifecycleUtil {
    public static void cleanupReferences(CategorySearchFragment categorySearchFragment) {
        categorySearchFragment.container = null;
        categorySearchFragment.mainScreenContainer = null;
        categorySearchFragment.actionButton = null;
        categorySearchFragment.businessNavBar = null;
        categorySearchFragment.categoryToggleContainer = null;
        categorySearchFragment.categoryToggle = null;
        categorySearchFragment.searchBox = null;
        categorySearchFragment.headline = null;
        categorySearchFragment.suggestedCategoriesHeader = null;
        categorySearchFragment.categoriesListView = null;
        categorySearchFragment.selectedCategoryView = null;
        categorySearchFragment.selectedCategoryDivider = null;
    }
}
