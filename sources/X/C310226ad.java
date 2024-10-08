package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6ad  reason: invalid class name and case insensitive filesystem */
public final class C310226ad {
    public boolean A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C273384mU A03;
    public final C317116mk A04;

    public C310226ad(AnonymousClass4DH r2, UserSession userSession, C273384mU r4, C317116mk r5) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r5, 4);
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void A00(C255773uh r4, String str, Map map) {
        0qQ.A0B(str, 0);
        0qQ.A0B(map, 1);
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass4DH r2 = this.A01;
            C360678ey A05 = C359988do.A05(this.A02, str, map);
            A05.A00(new E81(r4, this));
            r2.schedule(A05);
        }
    }
}
