package X;

import android.view.View;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lqp  reason: case insensitive filesystem */
public final class C65296Lqp implements C66574MXf {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public C65296Lqp(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    public final ImmutableSet B2X() {
        return ImmutableSet.A03(this.A00.A1K);
    }

    public final void Dhj() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        if (directPrivateStoryRecipientController.A0O.CT5()) {
            C337257fy r1 = directPrivateStoryRecipientController.A0O;
            r1.EhX(r1.BiY());
        }
    }

    public final void DjG(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A02++;
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
        int i4 = i;
        int i5 = i2;
        C48836Eky.A00(directPrivateStoryRecipientController.A07, r3, userSession, directShareTarget2, (String) null, str, str2, str3, (String) null, (String) null, i5, i4, true);
        DirectPrivateStoryRecipientController.A09(directPrivateStoryRecipientController, directShareTarget2, i4, i5, i3);
        JTU.A1C(directPrivateStoryRecipientController);
    }

    public final void DpA(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        C51899G6t g6t = directPrivateStoryRecipientController.A11;
        2el r2 = directPrivateStoryRecipientController.A10;
        if (r2 != null) {
            C2354830a A002 = AnonymousClass30Y.A00(directShareTarget, new ExU(i, i2, i3), String.valueOf(directShareTarget.A09()));
            A002.A00(new FZM(g6t));
            C51967G9n.A0z(view, A002, r2);
        }
    }

    public final void DuZ(DirectShareTarget directShareTarget, int i, int i2) {
        String str;
        String str2;
        String str3;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        UserSession userSession = directPrivateStoryRecipientController.A0B;
        AnonymousClass4DH r4 = directPrivateStoryRecipientController.A0w;
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
        C48836Eky.A00(directPrivateStoryRecipientController.A07, r4, userSession, directShareTarget2, (String) null, str, str2, str3, (String) null, (String) null, i2, i, false);
        if (fz0 != null && fz0.A09) {
            fz0.A0G.remove(directShareTarget2);
        }
        JTU.A1C(directPrivateStoryRecipientController);
    }
}
