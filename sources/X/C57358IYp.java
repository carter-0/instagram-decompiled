package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IYp  reason: case insensitive filesystem */
public final class C57358IYp implements C230422pb {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ C249763kK A02;

    public C57358IYp(UserSession userSession, AnonymousClass4DU r2, C249763kK r3) {
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ C253533qw AUN(C230472pg r25, Object obj, Object obj2, float f, long j, long j2) {
        1Xj r2 = (1Xj) obj;
        C230472pg r4 = r25;
        AnonymousClass7TG.A1T(r2, obj2, r4);
        UserSession userSession = this.A00;
        String A04 = C254373sN.A04(userSession, r2);
        String sessionId = this.A02.getSessionId();
        String id = r2.getId();
        if (id == null) {
            id = "n/a";
        }
        return new C253533qw(r4, A04, sessionId, id, this.A01.getModuleName(), C51971G9r.A0r(r2), C254373sN.A03(userSession, r2), f, 0, -1, -1, -1, -1, -1, -1, C254373sN.A00(r2), j, j2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUM(Object obj, Object obj2) {
        return C254373sN.A01(C51968G9o.A0m(obj));
    }
}
