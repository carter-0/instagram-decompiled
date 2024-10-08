package com.instagram.reels.recentlydeleted;

public final class ReelRecentlyDeletedViewerControllerLifecycleUtil {
    public static void cleanupReferences(ReelRecentlyDeletedViewerController reelRecentlyDeletedViewerController) {
        reelRecentlyDeletedViewerController.mHideAnimationCoordinator = null;
    }
}
