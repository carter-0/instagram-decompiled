package com.instagram.creation.capture.quickcapture.sundial;

public final class ClipsTimelineEditorDrawerControllerLifecycleUtil {
    public static void cleanupReferences(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        clipsTimelineEditorDrawerController.drawerContainerViewStubHolder = null;
        clipsTimelineEditorDrawerController.postCaptureVideoContainer = null;
    }
}
