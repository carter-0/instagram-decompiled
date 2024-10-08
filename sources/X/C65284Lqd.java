package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lqd  reason: case insensitive filesystem */
public final /* synthetic */ class C65284Lqd implements MSM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ DirectPrivateStoryRecipientController A03;
    public final /* synthetic */ DirectShareTarget A04;

    public /* synthetic */ C65284Lqd(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        this.A03 = directPrivateStoryRecipientController;
        this.A04 = directShareTarget;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void DuY() {
        C48136EZe eZe;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A03;
        DirectShareTarget directShareTarget = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        FZ0 fz0 = directPrivateStoryRecipientController.A1E;
        if (fz0 != null) {
            UserSession userSession = directPrivateStoryRecipientController.A0B;
            long j = (long) i2;
            long j2 = (long) i3;
            Y44 y44 = directPrivateStoryRecipientController.A0v;
            String str = (String) y44.get(directShareTarget);
            String moduleName = directPrivateStoryRecipientController.A0w.getModuleName();
            String str2 = directPrivateStoryRecipientController.A0U;
            if (y44.containsKey(directShareTarget)) {
                eZe = C48136EZe.CREATE_GROUP_NULL_STATE;
            } else {
                eZe = directPrivateStoryRecipientController.A07;
            }
            fz0.A0A(eZe, userSession, directShareTarget, directPrivateStoryRecipientController.A0M, str, moduleName, str2, (String) null, i, j, j2, false);
        }
    }
}
