package com.instagram.business.fragment;

public final class SupportLinksFragmentLifecycleUtil {
    public static void cleanupReferences(SupportLinksFragment supportLinksFragment) {
        supportLinksFragment.mSelectButtonRow = null;
        supportLinksFragment.mProfileDisplayRow = null;
        supportLinksFragment.mPartnerTypeRowsContainer = null;
        supportLinksFragment.mLoadingIndicator = null;
    }
}
