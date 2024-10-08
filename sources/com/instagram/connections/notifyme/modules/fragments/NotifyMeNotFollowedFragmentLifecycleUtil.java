package com.instagram.connections.notifyme.modules.fragments;

public final class NotifyMeNotFollowedFragmentLifecycleUtil {
    public static void cleanupReferences(NotifyMeNotFollowedFragment notifyMeNotFollowedFragment) {
        notifyMeNotFollowedFragment.avatar = null;
        notifyMeNotFollowedFragment.title = null;
        notifyMeNotFollowedFragment.message = null;
        notifyMeNotFollowedFragment.followButton = null;
        notifyMeNotFollowedFragment.loadingIndicator = null;
    }
}
