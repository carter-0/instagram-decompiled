package com.instagram.profile.fragment;

public final class UserDetailFragmentLifecycleUtil {
    public static void cleanupReferences(UserDetailFragment userDetailFragment) {
        userDetailFragment.mTopAccountInsightsDialog = null;
        userDetailFragment.mWelcomeToBusinessDialog = null;
        userDetailFragment.mRemoveFollowerDialog = null;
        userDetailFragment.mRequestFollowDialog = null;
    }
}
