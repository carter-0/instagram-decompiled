package com.instagram.business.fragment;

public final class SupportProfileDisplayOptionsFragmentLifecycleUtil {
    public static void cleanupReferences(SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment) {
        supportProfileDisplayOptionsFragment.mRecyclerView = null;
        supportProfileDisplayOptionsFragment.mBusinessNavBar = null;
        supportProfileDisplayOptionsFragment.mLoadingIndicator = null;
    }
}
