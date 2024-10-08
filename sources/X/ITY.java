package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.androidlink.AndroidLink;

public final class ITY implements AnonymousClass4Zh {
    public final /* synthetic */ C334677bg A00;

    public final void D2K(IgImageView igImageView, 1Xl r13, int i, int i2, boolean z, boolean z2) {
        AnonymousClass3OA r0;
        AnonymousClass47L r1;
        AnonymousClass7TF.A1C(r13, 0, igImageView);
        C334677bg r3 = this.A00;
        UserSession userSession = r3.A03;
        C271794jb r8 = new C271794jb(userSession, r13);
        r8.A00 = i2;
        r8.A01 = i;
        Q03 q03 = new Q03(r3.A01, userSession, r8, r3.A04, 2EG.A1F);
        q03.A01(r13.BPf());
        q03.A09 = i2;
        q03.A0B = i;
        q03.A00(igImageView, r8, r13.BPf());
        AnonymousClass47L r4 = null;
        if (r13 instanceof AnonymousClass3OA) {
            r0 = (AnonymousClass3OA) r13;
            q03.A0O = r0;
        } else {
            r0 = null;
        }
        C51969G9p.A1L(q03);
        if (!(r0 == null || r0.A0l == null)) {
            r3.A06.invoke();
        }
        AndroidLink A02 = AnonymousClass47K.A02(q03.A0z, userSession, r13.BPf(), i2, false);
        if (A02 != null) {
            r1 = C271714jT.A01(A02);
        } else {
            r1 = null;
        }
        if (r1 != AnonymousClass47L.AD_DESTINATION_CANVAS) {
            if (A02 != null) {
                r4 = C271714jT.A01(A02);
            }
            if (r4 != AnonymousClass47L.AD_DESTINATION_CLIPS_VIEWER) {
                return;
            }
        }
        Activity activity = (Activity) r3.A05.invoke();
        if (activity != null) {
            DbX.A10(activity, AnonymousClass37D.A00);
        }
    }

    public ITY(C334677bg r1) {
        this.A00 = r1;
    }
}
