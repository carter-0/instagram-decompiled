package com.instagram.archive.fragment;

public final class HighlightsMetadataFragmentLifecycleUtil {
    public static void cleanupReferences(HighlightsMetadataFragment highlightsMetadataFragment) {
        highlightsMetadataFragment.rootView = null;
        highlightsMetadataFragment.pogCoverImageView = null;
        highlightsMetadataFragment.cardCoverView = null;
        highlightsMetadataFragment.editCoverImageButton = null;
    }
}
