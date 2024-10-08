package com.instagram.creation.fragment.followersshare;

public final class FollowersShareFragmentLifecycleUtil {
    public static void cleanupReferences(FollowersShareFragment followersShareFragment) {
        followersShareFragment.mViewHolder = null;
        followersShareFragment.mAppShareTable = null;
        followersShareFragment.xpostRowItemView = null;
        followersShareFragment.xpostRowItem = null;
        followersShareFragment.mUploadHeaderButtonView = null;
        followersShareFragment.mUploadHeaderSpinnerView = null;
        followersShareFragment.mFooterButtonContainer = null;
        followersShareFragment.mUploadFooterButtonView = null;
        followersShareFragment.mUploadListener = null;
        followersShareFragment.mCaptionAddOnView = null;
        followersShareFragment.pollPreviewText = null;
        followersShareFragment.promptPreviewText = null;
        followersShareFragment.mThumbnailContainer = null;
        followersShareFragment.mCaptionBoxContainer = null;
        followersShareFragment.shareToBarcelonaViewBinder = null;
    }
}
