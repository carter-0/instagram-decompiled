package X;

import android.graphics.RectF;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Mod  reason: case insensitive filesystem */
public final class C67483Mod implements C74456PvB {
    public final /* synthetic */ C66633Ma2 A00;

    public C67483Mod(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void D1R(DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, Integer num) {
        if (directShareTarget != null) {
            C71140Odl A01 = OPT.A01(this.A00);
            String A012 = C71140Odl.A01(directShareTarget);
            if (A012 != null) {
                String A08 = directShareTarget.A08();
                Long A0c = DbZ.A0c(num);
                HashMap A03 = C71140Odl.A03(A01, directShareTarget);
                0Aj A002 = C71140Odl.A00(A01);
                if (A002.isSampled()) {
                    C71140Odl.A04(A002, A01);
                    DbS.A1I(A002, "channel_invitation_removed");
                    DbS.A1M(A002, "inbox");
                    Dba.A1B(A002, "source", "channel_invite_item");
                    A002.A9F("suggestion_position", A0c);
                    A002.AAJ("ig_thread_id", A08);
                    A002.AAJ("channel_type", A012);
                    if (A03 != null) {
                        A002.A9H("extra", A03);
                    }
                    A002.Cgf();
                }
            }
        }
    }

    public final void E0o(DirectShareTarget directShareTarget, C254743sy r5) {
        C66633Ma2.A09((RectF) null, 28D.A2K, this.A00, directShareTarget, r5);
    }

    public final void EFQ(RectF rectF, DirectThreadKey directThreadKey) {
        C66633Ma2 ma2 = this.A00;
        if (directThreadKey != null) {
            AnonymousClass0eM r2 = ma2.A1t;
            ((C67095MiF) r2.getValue()).A00(rectF, directThreadKey, true);
            2Dm A0v = ma2.A0v();
            String str = ((C67095MiF) r2.getValue()).A01;
            if (str != null) {
                List CFn = A0v.CFn(directThreadKey, str);
                if (CFn == null || CFn.size() <= 100) {
                    C67095MiF miF = (C67095MiF) r2.getValue();
                    miF.A01 = null;
                    miF.A00 = null;
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }
}
