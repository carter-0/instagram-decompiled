package com.instagram.wellbeing.limitedprofile.fragment;

public final class LimitedCommentsFragmentLifecycleUtil {
    public static void cleanupReferences(LimitedCommentsFragment limitedCommentsFragment) {
        limitedCommentsFragment.mRootView = null;
        limitedCommentsFragment.mScrollingViewProxy = null;
    }
}
