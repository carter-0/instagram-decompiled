package com.instagram.creation.sharesheet.coverphoto;

public final class ClipsCoverPhotoPickerControllerLifecycleUtil {
    public static void cleanupReferences(ClipsCoverPhotoPickerController clipsCoverPhotoPickerController) {
        clipsCoverPhotoPickerController.coverPhotoContainer = null;
        clipsCoverPhotoPickerController.coverPhotoContainerVideoPreview = null;
        clipsCoverPhotoPickerController.currentCoverPhotoImage = null;
        clipsCoverPhotoPickerController.filmStripFramesContainer = null;
        clipsCoverPhotoPickerController.seekBar = null;
        clipsCoverPhotoPickerController.addFromGalleryButton = null;
        clipsCoverPhotoPickerController.addTextView = null;
        clipsCoverPhotoPickerController.playCountContainer = null;
    }
}
