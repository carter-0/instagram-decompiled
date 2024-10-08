package com.instagram.creation.publishscreen.fragment.clips;

public final class ClipsProfileVisibilityFragmentLifecycleUtil {
    public static void cleanupReferences(ClipsProfileVisibilityFragment clipsProfileVisibilityFragment) {
        clipsProfileVisibilityFragment.includeInProfileToggle = null;
        clipsProfileVisibilityFragment.clipsOnlyToggle = null;
        clipsProfileVisibilityFragment.footerText = null;
        clipsProfileVisibilityFragment.bottomButton = null;
    }
}
