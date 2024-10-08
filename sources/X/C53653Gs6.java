package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gs6  reason: case insensitive filesystem */
public final class C53653Gs6 extends C251343mx {
    public final 2WX A00;
    public final UserSession A01;

    public C53653Gs6(2WX r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r9) {
        long j;
        0qQ.A0B(r9, 0);
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36318973599619869L)) {
            return null;
        }
        if (AnonymousClass3HA.A00(C243803a8.A00(r9))) {
            j = 37163398529679642L;
        } else {
            j = 37163398529614105L;
        }
        int A002 = C55020Har.A00(182.A00(r2, userSession, j));
        2WX r3 = this.A00;
        Integer num = AnonymousClass05K.A00;
        AnonymousClass9JQ A0b = C51965G9l.A0b(num, 100.0f, 0);
        if (r3 == 2WX.A02) {
            r3 = null;
        }
        2WX A0X = C51965G9l.A0X(r3, A0b);
        Integer num2 = AnonymousClass05K.A01;
        return C243563Zg.A09(r9, C51971G9r.A0Y(C51971G9r.A0Y(C51971G9r.A0Y(C51971G9r.A0X(A0X, num2, 100.0f, 0), num2, false, 4), AnonymousClass05K.A0u, false, 4), num, C51965G9l.A0Y(A002), 4));
    }
}
