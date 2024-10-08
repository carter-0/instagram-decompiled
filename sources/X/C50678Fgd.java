package X;

import com.instagram.igds.components.form.IgFormField;
import com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController;

/* renamed from: X.Fgd  reason: case insensitive filesystem */
public final class C50678Fgd implements G6D {
    public final /* synthetic */ EditProfileExpressionController A00;

    public C50678Fgd(EditProfileExpressionController editProfileExpressionController) {
        this.A00 = editProfileExpressionController;
    }

    public final void E2e() {
        EditProfileExpressionController editProfileExpressionController = this.A00;
        IgFormField igFormField = editProfileExpressionController.usernameField;
        if (igFormField != null) {
            String A0o = DbU.A0o(igFormField);
            0sP r3 = editProfileExpressionController.A02;
            1OC A002 = C318486p2.A00(editProfileExpressionController.A00, editProfileExpressionController.A01, A0o);
            A002.A00 = new C47645EBf(A0o, new C51763G0f(igFormField, 20));
            r3.invoke(A002);
        }
    }
}
