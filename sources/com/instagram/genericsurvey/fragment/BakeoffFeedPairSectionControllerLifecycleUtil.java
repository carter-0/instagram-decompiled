package com.instagram.genericsurvey.fragment;

public final class BakeoffFeedPairSectionControllerLifecycleUtil {
    public static void cleanupReferences(BakeoffFeedPairSectionController bakeoffFeedPairSectionController) {
        bakeoffFeedPairSectionController.fixedTabBar = null;
        bakeoffFeedPairSectionController.fragmentPager = null;
        bakeoffFeedPairSectionController.pagerAdapter = null;
    }
}
