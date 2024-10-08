package com.instagram.profile.edit.fragment;

public final class CompleteYourProfileFragmentLifecycleUtil {
    public static void cleanupReferences(CompleteYourProfileFragment completeYourProfileFragment) {
        completeYourProfileFragment.mAvatarImageView = null;
        completeYourProfileFragment.mChangeAvatarButton = null;
        completeYourProfileFragment.mSaveButton = null;
    }
}
