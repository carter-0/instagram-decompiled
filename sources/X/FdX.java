package X;

import android.view.View;
import com.instagram.profile.edit.controller.EditProfileFieldsController;

public final class FdX implements AnonymousClass70R {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 1Ln A01;
    public final /* synthetic */ EditProfileFieldsController A02;

    public final void Cj4(C51954G8x g8x) {
    }

    public final void DLB(View view, C61082JwK jwK, boolean z) {
    }

    public FdX(1Ln r1, EditProfileFieldsController editProfileFieldsController, long j) {
        this.A02 = editProfileFieldsController;
        this.A01 = r1;
        this.A00 = j;
    }

    public final void DLC(C61082JwK jwK) {
        EditProfileFieldsController editProfileFieldsController = this.A02;
        1Ln r3 = this.A01;
        0qQ.A0A(r3);
        EditProfileFieldsController.A04(r3, editProfileFieldsController, "tap", this.A00);
        C46447Df9.A03().A02(editProfileFieldsController.A06(), editProfileFieldsController.A0A, "edit_profile");
    }
}
