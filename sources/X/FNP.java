package X;

import android.view.View;
import com.instagram.profile.edit.controller.EditProfileFieldsController;

public final class FNP implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 1Ln A01;
    public final /* synthetic */ EditProfileFieldsController A02;

    public FNP(1Ln r1, EditProfileFieldsController editProfileFieldsController, long j) {
        this.A02 = editProfileFieldsController;
        this.A01 = r1;
        this.A00 = j;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1996115389);
        EditProfileFieldsController editProfileFieldsController = this.A02;
        1Ln r3 = this.A01;
        0qQ.A0A(r3);
        EditProfileFieldsController.A04(r3, editProfileFieldsController, "tap", this.A00);
        C46447Df9.A03().A02(editProfileFieldsController.A06(), editProfileFieldsController.A0A, "edit_profile");
        AnonymousClass0fD.A0C(-1867187071, A05);
    }
}
