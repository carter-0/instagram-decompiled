package com.instagram.creation.fragment;

public final class ShareLaterFragmentLifecycleUtil {
    public static void cleanupReferences(ShareLaterFragment shareLaterFragment) {
        shareLaterFragment.appShareTable = null;
    }
}
