package com.instagram.shopping.fragment.cart;

public final class ShoppingCartFragmentLifecycleUtil {
    public static void cleanupReferences(ShoppingCartFragment shoppingCartFragment) {
        shoppingCartFragment.mRecyclerView = null;
        shoppingCartFragment.mProductCollectionStub = null;
    }
}
