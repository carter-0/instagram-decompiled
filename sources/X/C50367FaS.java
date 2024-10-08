package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FaS  reason: case insensitive filesystem */
public final class C50367FaS implements C51899G6t {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public final void Dbm(DirectShareTarget directShareTarget) {
    }

    public C50367FaS(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    public final void Dbn(ExU exU, DirectShareTarget directShareTarget, float f) {
        long j;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        FZ0 fz0 = directPrivateStoryRecipientController.A1E;
        if (fz0 != null) {
            UserSession userSession = directPrivateStoryRecipientController.A0B;
            ExU exU2 = exU;
            int i = exU2.A02;
            long j2 = (long) exU2.A01;
            long j3 = (long) exU2.A00;
            1iA r0 = directPrivateStoryRecipientController.A0M;
            if (r0 != null) {
                j = (long) r0.A00;
            } else {
                j = -1;
            }
            String str = directPrivateStoryRecipientController.A0U;
            C48136EZe eZe = directPrivateStoryRecipientController.A07;
            AnonymousClass4DH r10 = directPrivateStoryRecipientController.A0w;
            C337257fy r7 = directPrivateStoryRecipientController.A0O;
            long j4 = j2;
            int i2 = i;
            fz0.A09(eZe, r10, userSession, directShareTarget, str, (String) null, (String) null, r7.BiY(), r7.BnF(), i2, j4, j3, j, false);
        }
    }
}
