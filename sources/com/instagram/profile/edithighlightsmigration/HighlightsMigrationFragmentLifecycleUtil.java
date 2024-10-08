package com.instagram.profile.edithighlightsmigration;

public final class HighlightsMigrationFragmentLifecycleUtil {
    public static void cleanupReferences(HighlightsMigrationFragment highlightsMigrationFragment) {
        highlightsMigrationFragment.recyclerView = null;
        highlightsMigrationFragment.shareHighlightsButton = null;
        highlightsMigrationFragment.scrollToHighlightsButton = null;
        highlightsMigrationFragment.highlightsMigrationScreenBodyText = null;
    }
}
