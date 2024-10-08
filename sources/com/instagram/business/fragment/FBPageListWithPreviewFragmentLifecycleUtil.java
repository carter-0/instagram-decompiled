package com.instagram.business.fragment;

public final class FBPageListWithPreviewFragmentLifecycleUtil {
    public static void cleanupReferences(FBPageListWithPreviewFragment fBPageListWithPreviewFragment) {
        fBPageListWithPreviewFragment.mBusinessNavBar = null;
        fBPageListWithPreviewFragment.mBusinessNavBarHelper = null;
        fBPageListWithPreviewFragment.mStepperHeader = null;
        fBPageListWithPreviewFragment.mRecyclerView = null;
        fBPageListWithPreviewFragment.mLoadingSpinner = null;
    }
}
