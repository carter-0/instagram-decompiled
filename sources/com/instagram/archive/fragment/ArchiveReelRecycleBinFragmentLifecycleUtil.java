package com.instagram.archive.fragment;

public final class ArchiveReelRecycleBinFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment) {
        archiveReelRecycleBinFragment.downloadAllButtonStubHolder = null;
        archiveReelRecycleBinFragment.fastScrollStubHolder = null;
        archiveReelRecycleBinFragment.viewPortObserver = null;
    }
}
