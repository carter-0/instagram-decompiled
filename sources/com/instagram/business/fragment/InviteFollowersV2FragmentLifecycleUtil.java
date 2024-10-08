package com.instagram.business.fragment;

public final class InviteFollowersV2FragmentLifecycleUtil {
    public static void cleanupReferences(InviteFollowersV2Fragment inviteFollowersV2Fragment) {
        inviteFollowersV2Fragment.mLoadingIndicator = null;
    }
}
