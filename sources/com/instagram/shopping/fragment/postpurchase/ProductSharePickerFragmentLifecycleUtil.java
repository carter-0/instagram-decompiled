package com.instagram.shopping.fragment.postpurchase;

public final class ProductSharePickerFragmentLifecycleUtil {
    public static void cleanupReferences(ProductSharePickerFragment productSharePickerFragment) {
        productSharePickerFragment.recyclerView = null;
    }
}
