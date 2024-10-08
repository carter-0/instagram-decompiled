package com.instagram.business.fragment;

public final class ProfessionalAccountDescriptionFragmentLifecycleUtil {
    public static void cleanupReferences(ProfessionalAccountDescriptionFragment professionalAccountDescriptionFragment) {
        professionalAccountDescriptionFragment.mMainView = null;
        professionalAccountDescriptionFragment.mBusinessNavBar = null;
        professionalAccountDescriptionFragment.mBusinessNavBarHelper = null;
    }
}
