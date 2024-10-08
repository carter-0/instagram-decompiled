package X;

import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* renamed from: X.Fr5  reason: case insensitive filesystem */
public final class C51250Fr5 implements Runnable {
    public final /* synthetic */ EditProfileFieldsController A00;

    public C51250Fr5(EditProfileFieldsController editProfileFieldsController) {
        this.A00 = editProfileFieldsController;
    }

    public final void run() {
        EditProfileFieldsController editProfileFieldsController = this.A00;
        if (editProfileFieldsController.linksTextCell != null && editProfileFieldsController.A08().isAttachedToWindow()) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(editProfileFieldsController.A06(), AnonymousClass7TF.A0d(editProfileFieldsController.A06().getResources(), 2131967740));
            A0f.A04(editProfileFieldsController.A08(), 0, 0, true);
            A0f.A02();
            A0f.A07(C283255Gu.A06);
            A0f.A0B = false;
            A0f.A0A = true;
            C47898ELs.A00(A0f, editProfileFieldsController, 11).A07(editProfileFieldsController.A0A);
        }
    }
}
