package com.instagram.music.search;

public final class MusicOverlayResultsListControllerLifecycleUtil {
    public static void cleanupReferences(MusicOverlayResultsListController musicOverlayResultsListController) {
        musicOverlayResultsListController.parentView = null;
        musicOverlayResultsListController.recyclerView = null;
        musicOverlayResultsListController.layoutManager = null;
        musicOverlayResultsListController.dropFrameWatcher = null;
        musicOverlayResultsListController.eligibilityWarningView = null;
    }
}
