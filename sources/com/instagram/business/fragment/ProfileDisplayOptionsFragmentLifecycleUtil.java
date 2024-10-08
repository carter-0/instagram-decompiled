package com.instagram.business.fragment;

public final class ProfileDisplayOptionsFragmentLifecycleUtil {
    public static void cleanupReferences(ProfileDisplayOptionsFragment profileDisplayOptionsFragment) {
        profileDisplayOptionsFragment.rootView = null;
        profileDisplayOptionsFragment.categoryToggle = null;
        profileDisplayOptionsFragment.contactsToggle = null;
        profileDisplayOptionsFragment.discountToggle = null;
        profileDisplayOptionsFragment.saveButton = null;
    }
}
