package com.instagram.archive.fragment;

public final class ArchiveReelHighlightsFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelHighlightsFragment archiveReelHighlightsFragment) {
        archiveReelHighlightsFragment.recyclerView = null;
        archiveReelHighlightsFragment.layoutManager = null;
    }
}
