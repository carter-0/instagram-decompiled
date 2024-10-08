package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

public final class HK6 extends HK8 {
    public View A00;
    public TextView A01;
    public C227232is A02;
    public final GD6 A03;
    public final UserSession A04;

    public final void onDestroyView() {
        this.A00 = null;
        this.A01 = null;
    }

    public HK6(UserSession userSession, GD6 gd6) {
        this.A03 = gd6;
        this.A04 = userSession;
    }

    public static final void A00(HK6 hk6) {
        int intValue;
        C267324bN A0E;
        C295365o2 r1;
        Integer A08 = C52050GCw.A08(hk6);
        if (A08 != null && (intValue = A08.intValue()) >= 0) {
            C52009GBg gBg = hk6.A03.A0A;
            if (!(intValue >= gBg.A0A() || (A0E = gBg.A0E(intValue)) == null || (r1 = A0E.A01) == C295365o2.PREVIEW || r1 == C295365o2.GHOST || AnonymousClass3ZC.A0B(A0E) || r1 == C295365o2.MIDCARD)) {
                AnonymousClass7TF.A16(hk6.A00);
                return;
            }
        }
        AnonymousClass7TH.A0R(hk6.A00);
    }

    public final void DW8(int i, int i2) {
        A00(this);
    }
}
