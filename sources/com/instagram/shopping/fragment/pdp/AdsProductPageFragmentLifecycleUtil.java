package com.instagram.shopping.fragment.pdp;

public final class AdsProductPageFragmentLifecycleUtil {
    public static void cleanupReferences(AdsProductPageFragment adsProductPageFragment) {
        adsProductPageFragment.mBaseFrameLayout = null;
        adsProductPageFragment.mRecyclerView = null;
    }
}
