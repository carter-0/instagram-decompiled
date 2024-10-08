package com.instagram.business.fragment;

public final class SupportServiceEditUrlFragmentLifecycleUtil {
    public static void cleanupReferences(SupportServiceEditUrlFragment supportServiceEditUrlFragment) {
        supportServiceEditUrlFragment.mURLEditText = null;
        supportServiceEditUrlFragment.mURLTitleTextView = null;
        supportServiceEditUrlFragment.mBusinessNavBar = null;
    }
}
