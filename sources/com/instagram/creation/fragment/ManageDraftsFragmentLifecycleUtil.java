package com.instagram.creation.fragment;

public final class ManageDraftsFragmentLifecycleUtil {
    public static void cleanupReferences(ManageDraftsFragment manageDraftsFragment) {
        manageDraftsFragment.cancelButton = null;
        manageDraftsFragment.actionButton = null;
        manageDraftsFragment.titleView = null;
    }
}
