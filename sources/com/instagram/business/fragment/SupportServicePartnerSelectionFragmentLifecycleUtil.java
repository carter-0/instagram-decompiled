package com.instagram.business.fragment;

public final class SupportServicePartnerSelectionFragmentLifecycleUtil {
    public static void cleanupReferences(SupportServicePartnerSelectionFragment supportServicePartnerSelectionFragment) {
        supportServicePartnerSelectionFragment.mLoadingSpinner = null;
        supportServicePartnerSelectionFragment.mRecyclerView = null;
    }
}
