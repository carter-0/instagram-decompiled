package com.instagram.profile.edit.controller.editcontrollerbarcelona;

public final class EditProfileBarcelonaControllerLifecycleUtil {
    public static void cleanupReferences(EditProfileBarcelonaController editProfileBarcelonaController) {
        editProfileBarcelonaController.toggleBarcelonaViewStubber = null;
        editProfileBarcelonaController.toggleBarcelonaSwitchCell = null;
    }
}
