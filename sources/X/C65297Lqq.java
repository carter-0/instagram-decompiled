package X;

import android.view.View;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lqq  reason: case insensitive filesystem */
public final class C65297Lqq implements C66574MXf {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public final void Dhj() {
    }

    public final void DpA(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
    }

    public C65297Lqq(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    public final ImmutableSet B2X() {
        return ImmutableSet.A03(this.A00.A1K);
    }

    public final void DjG(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        UserSession userSession = directPrivateStoryRecipientController.A0B;
        AnonymousClass4DH r3 = directPrivateStoryRecipientController.A0w;
        FZ0 fz0 = directPrivateStoryRecipientController.A1E;
        if (fz0 == null) {
            str = null;
            str2 = null;
        } else {
            str = fz0.A07;
            str2 = fz0.A05;
        }
        1iA r0 = directPrivateStoryRecipientController.A0M;
        if (r0 != null) {
            str3 = r0.name();
        } else {
            str3 = null;
        }
        DirectShareTarget directShareTarget2 = directShareTarget;
        int i4 = i2;
        C48836Eky.A00(directPrivateStoryRecipientController.A07, r3, userSession, directShareTarget2, (String) null, str, str2, str3, (String) null, (String) null, i4, 3, true);
        DirectPrivateStoryRecipientController.A09(directPrivateStoryRecipientController, directShareTarget2, i, i4, i3);
        JTU.A1C(directPrivateStoryRecipientController);
    }

    public final void DuZ(DirectShareTarget directShareTarget, int i, int i2) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        FZ0 fz0 = directPrivateStoryRecipientController.A1E;
        if (fz0 != null && fz0.A09) {
            fz0.A0G.remove(directShareTarget);
        }
        JTU.A1C(directPrivateStoryRecipientController);
    }
}
