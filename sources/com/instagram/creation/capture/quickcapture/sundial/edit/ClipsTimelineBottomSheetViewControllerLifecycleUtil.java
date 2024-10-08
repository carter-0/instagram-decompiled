package com.instagram.creation.capture.quickcapture.sundial.edit;

public final class ClipsTimelineBottomSheetViewControllerLifecycleUtil {
    public static void cleanupReferences(ClipsTimelineBottomSheetViewController clipsTimelineBottomSheetViewController) {
        clipsTimelineBottomSheetViewController.bottomSheetContentContainer = null;
        clipsTimelineBottomSheetViewController.bottomSheetCancelButton = null;
        clipsTimelineBottomSheetViewController.bottomSheetDoneButton = null;
    }
}
