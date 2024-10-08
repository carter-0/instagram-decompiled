package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class IVK implements C66491MTu {
    public final /* synthetic */ H1V A00;
    public final /* synthetic */ C247733gp A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ boolean A03;

    public final void D1x(Context context) {
        0qQ.A0B(context, 0);
        1Xj r2 = this.A02;
        String id = r2.getId();
        if (id != null) {
            C56057Hs6 A002 = C3018960m.A00().A00();
            FragmentActivity A06 = 2MD.A01().A06();
            if (A06 != null) {
                H1V h1v = this.A00;
                UserSession A0l = AnonymousClass7TE.A0l(h1v.A0D);
                AnonymousClass4DU r8 = h1v.A01;
                if (r8 == null) {
                    0qQ.A0F("insightsHost");
                    throw AnonymousClass00P.createAndThrow();
                }
                A002.A02(A06, AnonymousClass5OB.NOTIFICATIONS, A0l, r8, id, this.A01.A0G, (String) null, this.A03, true, false, true, false, r2.CcK());
            }
        }
    }

    public final void onDismiss() {
    }

    public IVK(H1V h1v, C247733gp r2, 1Xj r3, boolean z) {
        this.A02 = r3;
        this.A00 = h1v;
        this.A01 = r2;
        this.A03 = z;
    }
}
