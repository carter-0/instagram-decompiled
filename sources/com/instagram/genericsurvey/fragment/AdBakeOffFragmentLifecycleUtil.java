package com.instagram.genericsurvey.fragment;

public final class AdBakeOffFragmentLifecycleUtil {
    public static void cleanupReferences(AdBakeOffFragment adBakeOffFragment) {
        adBakeOffFragment.answerButtonController = null;
        adBakeOffFragment.bakeoffFeedPairSectionController = null;
        adBakeOffFragment.bakeoffStoryPairSectionController = null;
        adBakeOffFragment.navbarController = null;
        adBakeOffFragment.contentContainer = null;
        adBakeOffFragment.retryViewStub = null;
        adBakeOffFragment.retryViewGroup = null;
        adBakeOffFragment.loadingSpinner = null;
    }
}
