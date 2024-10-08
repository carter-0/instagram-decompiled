package com.instagram.profile.edit.controller.editcontrollerexpression;

public final class EditProfileExpressionControllerLifecycleUtil {
    public static void cleanupReferences(EditProfileExpressionController editProfileExpressionController) {
        editProfileExpressionController.usernameField = null;
        editProfileExpressionController.nameField = null;
    }
}
