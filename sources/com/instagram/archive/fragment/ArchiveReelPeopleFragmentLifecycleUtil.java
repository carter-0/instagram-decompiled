package com.instagram.archive.fragment;

public final class ArchiveReelPeopleFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelPeopleFragment archiveReelPeopleFragment) {
        archiveReelPeopleFragment.mLoadingSpinner = null;
        archiveReelPeopleFragment.mRecyclerView = null;
        archiveReelPeopleFragment.mLayoutManager = null;
    }
}
