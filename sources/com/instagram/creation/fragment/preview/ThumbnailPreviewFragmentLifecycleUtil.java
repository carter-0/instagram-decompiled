package com.instagram.creation.fragment.preview;

public final class ThumbnailPreviewFragmentLifecycleUtil {
    public static void cleanupReferences(ThumbnailPreviewFragment thumbnailPreviewFragment) {
        thumbnailPreviewFragment.mContainer = null;
        thumbnailPreviewFragment.mEmptyStateView = null;
    }
}
