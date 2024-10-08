package com.instagram.discovery.mediamap.fragment;

public final class LocationListFragmentLifecycleUtil {
    public static void cleanupReferences(LocationListFragment locationListFragment) {
        locationListFragment.mAdapter = null;
        locationListFragment.mRecyclerView = null;
        locationListFragment.mEmptyStateView = null;
        locationListFragment.mExploreAllLink = null;
        locationListFragment.mRefinementsController = null;
        locationListFragment.mActionBarHelper = null;
    }
}
