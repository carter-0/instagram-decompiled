package com.instagram.shopping.fragment.cart;

public final class MerchantShoppingCartFragmentLifecycleUtil {
    public static void cleanupReferences(MerchantShoppingCartFragment merchantShoppingCartFragment) {
        merchantShoppingCartFragment.mRecyclerView = null;
    }
}
