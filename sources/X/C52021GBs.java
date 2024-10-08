package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBs  reason: case insensitive filesystem */
public final class C52021GBs implements C230422pb {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C249763kK A01;
    public final /* synthetic */ String A02;

    public C52021GBs(UserSession userSession, C249763kK r2, String str) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ C253533qw AUN(C230472pg r25, Object obj, Object obj2, float f, long j, long j2) {
        C267324bN r2 = (C267324bN) obj;
        C230472pg r4 = r25;
        AnonymousClass7TG.A1T(r2, obj2, r4);
        1Xj r0 = r2.A02;
        UserSession userSession = this.A00;
        return new C253533qw(r4, C254373sN.A04(userSession, r0), this.A01.getSessionId(), C52020GBr.A02(r2), this.A02, C254373sN.A06(G9t.A1B(r2.A02)), C254373sN.A03(userSession, r2.A02), f, 0, -1, -1, -1, -1, -1, -1, C254373sN.A00(r2.A02), j, j2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUM(Object obj, Object obj2) {
        return C51973G9u.A0I(obj);
    }
}
