package com.instagram.discovery.mediamap.fragment;

public final class LocationDetailFragmentLifecycleUtil {
    public static void cleanupReferences(LocationDetailFragment locationDetailFragment) {
        locationDetailFragment.mLocationDetailRedesignExperimentHelper = null;
        locationDetailFragment.mDirectionsBottomSheetController = null;
    }
}
