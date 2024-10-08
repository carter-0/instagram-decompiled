package com.instagram.wellbeing.fundraiser.coverphotopicker;

public final class FundraiserPhotoPickerGalleryTabFragmentLifecycleUtil {
    public static void cleanupReferences(FundraiserPhotoPickerGalleryTabFragment fundraiserPhotoPickerGalleryTabFragment) {
        fundraiserPhotoPickerGalleryTabFragment.mRecyclerView = null;
    }
}
