package com.instagram.arlink.fragment;

public final class NametagControllerLifecycleUtil {
    public static void cleanupReferences(NametagController nametagController) {
        nametagController.mRootView = null;
        nametagController.mTopBar = null;
        nametagController.mGradientOverlay = null;
        nametagController.mCardView = null;
        nametagController.mBottomBar = null;
        nametagController.mProfileShareCardView = null;
        nametagController.mTopBarScanQRButton = null;
        nametagController.mTopBarGalleryButton = null;
        nametagController.mTopBarCloseButton = null;
        nametagController.mBackgroundModeButton = null;
    }
}
