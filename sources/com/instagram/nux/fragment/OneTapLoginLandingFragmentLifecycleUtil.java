package com.instagram.nux.fragment;

public final class OneTapLoginLandingFragmentLifecycleUtil {
    public static void cleanupReferences(OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        oneTapLoginLandingFragment.mRootView = null;
    }
}
