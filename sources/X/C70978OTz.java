package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OTz  reason: case insensitive filesystem */
public final class C70978OTz {
    public final UserSession A00;
    public final O9L A01;
    public final C70989OVd A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C73855Pks.A00);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C73856Pkt.A00);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C73895PlW(this, 0));
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new C73895PlW(this, 1));
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(C73857Pku.A00);
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(new C73895PlW(this, 2));
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(C73858Pkv.A00);
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(C73860Pkx.A00);
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0r6 A0G;

    public C70978OTz(Context context, UserSession userSession, O9L o9l, C70989OVd oVd) {
        this.A00 = userSession;
        this.A02 = oVd;
        this.A01 = o9l;
        this.A07 = AnonymousClass0eN.A01(new C58691Iw0(1, context, this));
        this.A0E = AnonymousClass0eN.A01(new C58691Iw0(2, context, this));
        this.A05 = AnonymousClass0eN.A01(new C58691Iw0(0, context, this));
        this.A0C = AnonymousClass0eN.A01(C73859Pkw.A00);
        this.A0G = oVd.A0i;
        this.A0F = C73895PlW.A00(this, 8);
    }

    public static final boolean A00(C70978OTz oTz) {
        OVL ovl = oTz.A02.A0D;
        AnonymousClass3U9 A002 = OVL.A00(ovl);
        if (A002 == null || !C66648MaH.A01(ovl.A01, A002)) {
            return false;
        }
        return true;
    }
}
