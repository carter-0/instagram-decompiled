package com.instagram.direct.fragment.icebreaker;

public final class ImportMsgrIceBreakersFragmentLifecycleUtil {
    public static void cleanupReferences(ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment) {
        importMsgrIceBreakersFragment.mEmptyStateView = null;
        importMsgrIceBreakersFragment.mBottomButton = null;
    }
}
