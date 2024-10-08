package X;

import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* renamed from: X.Fr4  reason: case insensitive filesystem */
public final class C51249Fr4 implements Runnable {
    public final /* synthetic */ EditProfileFieldsController A00;

    public C51249Fr4(EditProfileFieldsController editProfileFieldsController) {
        this.A00 = editProfileFieldsController;
    }

    public final void run() {
        EditProfileFieldsController editProfileFieldsController = this.A00;
        if (editProfileFieldsController.bioField != null && editProfileFieldsController.A07().isAttachedToWindow()) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(editProfileFieldsController.A06(), AnonymousClass7TF.A0d(editProfileFieldsController.A06().getResources(), 2131961433));
            A0f.A04(editProfileFieldsController.A07(), 0, 0, true);
            A0f.A02();
            A0f.A07(C283255Gu.A06);
            A0f.A0B = false;
            A0f.A0A = true;
            C47898ELs.A00(A0f, editProfileFieldsController, 10).A07(editProfileFieldsController.A0A);
        }
    }
}
