package com.instagram.sharetofriendsstory.v2.drawer;

public final class ShareToFriendsStoryDrawerControllerLifecycleUtil {
    public static void cleanupReferences(ShareToFriendsStoryDrawerController shareToFriendsStoryDrawerController) {
        shareToFriendsStoryDrawerController.drawerContainerViewStubber = null;
        shareToFriendsStoryDrawerController.postCaptureVideoContainer = null;
    }
}
