package com.instagram.profile.fragment;

public final class UserDetailTabControllerLifecycleUtil {
    public static void cleanupReferences(UserDetailTabController userDetailTabController) {
        userDetailTabController.mViewHolder = null;
        userDetailTabController.mOverFlowFollowButton = null;
        userDetailTabController.mUpsellFollowButtonView = null;
        userDetailTabController.mPVFollowSecondaryCTAView = null;
        userDetailTabController.mUserDetailEmptyStateController = null;
        userDetailTabController.mOpalSwitchIndicatorHelper = null;
    }
}
