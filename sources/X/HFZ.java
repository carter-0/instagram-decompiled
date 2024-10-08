package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

public final class HFZ extends C262934Go {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public HFZ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.1qK, java.lang.Object] */
    public final void D9d() {
        switch (this.A00) {
            case 0:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                1Xj r3 = directShareSheetFragment.A0b;
                if (r3 != null) {
                    HWR.A00((Context) this.A02, new C57040IMg(this), directShareSheetFragment.A0G, r3);
                    return;
                }
                0wb.A03(AnonymousClass000.A00(439), AnonymousClass000.A00(2384));
                return;
            case 1:
                ((Activity) this.A02).onBackPressed();
                return;
            case 2:
                UserSession userSession = (UserSession) this.A01;
                boolean A012 = C238173Av.A01(userSession, 1Au.A00(userSession));
                C59559JOf jOf = (C59559JOf) this.A02;
                if (!A012) {
                    jOf.CxA();
                    return;
                }
                return;
            default:
                C52034GCg gCg = (C52034GCg) this.A02;
                UserSession userSession2 = gCg.A0B;
                1Av A002 = 1Au.A00(userSession2);
                0s0 r5 = A002.A3G;
                AnonymousClass0YZ[] r4 = 1Av.A8a;
                if (AnonymousClass7TG.A1a(A002, r5, r4, 375) && !AnonymousClass7TG.A1a(A002, A002.A5j, r4, 374)) {
                    AnonymousClass4DU r32 = gCg.A0C;
                    1Xj r0 = gCg.A02;
                    if (r0 != null) {
                        String id = r0.getId();
                        1Xj r02 = gCg.A02;
                        if (r02 != null) {
                            C22031Xty.A0B(r32, userSession2, id, C51972G9s.A0q(userSession2, r02), "clips_action_sheet");
                            AnonymousClass1Nd.A00(userSession2).A00(new Object());
                        }
                    }
                    0qQ.A0F("media");
                    throw AnonymousClass00P.createAndThrow();
                }
                AnonymousClass7TF.A1J(A002, r5, r4, 375, false);
                A002.A0P();
                gCg.A0H.A00();
                2eQ.A06((View) this.A01, 1000);
                return;
        }
    }
}
