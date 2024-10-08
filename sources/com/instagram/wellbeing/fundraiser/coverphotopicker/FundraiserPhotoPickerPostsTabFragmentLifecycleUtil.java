package com.instagram.wellbeing.fundraiser.coverphotopicker;

public final class FundraiserPhotoPickerPostsTabFragmentLifecycleUtil {
    public static void cleanupReferences(FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment) {
        fundraiserPhotoPickerPostsTabFragment.mRecyclerView = null;
    }
}
