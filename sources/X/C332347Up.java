package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Up  reason: invalid class name and case insensitive filesystem */
public final class C332347Up {
    public final UserSession A00;
    public final C332357Uq A01;
    public final C332427Uz A02;

    public /* synthetic */ C332347Up(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        this.A00 = userSession;
        this.A01 = (C332357Uq) userSession.A01(C332357Uq.class, new C73914Plp(userSession, 19));
        this.A02 = (C332427Uz) userSession.A01(C332427Uz.class, new C73914Plp(userSession, 22));
    }

    public final boolean A01() {
        UserSession userSession = this.A00;
        0Tu r2 = 0Tu.A06;
        if (!182.A06(r2, userSession, 36317182598189895L)) {
            r2 = 0Tu.A05;
        }
        Boolean valueOf = Boolean.valueOf(182.A06(r2, userSession, 36317182598058821L));
        0qQ.A0A(valueOf);
        return valueOf.booleanValue();
    }

    public final AnonymousClass0r6 A00(C67559Mpt mpt, C67555Mpp mpp, C67557Mpr mpr) {
        if (!A01()) {
            return C62190rs.A00;
        }
        C332357Uq r3 = this.A01;
        C332377Us r2 = r3.A01;
        return new AnonymousClass9VC(r3, 10q.A04(new AnonymousClass0r6[]{new C59835JaA(r2, mpr, new C59834Ja9(r2, mpt, new C59833Ja8(r2, mpp, r2.A05))), C62190rs.A00}));
    }
}
