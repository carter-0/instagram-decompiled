package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gtz  reason: case insensitive filesystem */
public final class C53770Gtz extends C251343mx {
    public final C232722uK A00;
    public final C62320sa A01;
    public final 2WX A02;
    public final UserSession A03;
    public final String A04;

    public final C251263mp A0X(AnonymousClass3Y5 r7) {
        Integer num;
        0qQ.A0B(r7, 0);
        2Wa A002 = C243643Zq.A00(r7, new C58179Inj(this, 1));
        C243773a4.A00(r7, new C58186Inq(35, A002, this), new Object[]{this.A04});
        Object obj = A002.A03;
        AnonymousClass4Lc r1 = (AnonymousClass4Lc) obj;
        if (r1 == AnonymousClass4Lc.ZERO_RATING_NUX) {
            return new C53652Gs5(this.A02, this.A03);
        }
        int ordinal = r1.ordinal();
        if (ordinal == 0) {
            num = AnonymousClass05K.A00;
        } else if (ordinal == 1) {
            num = AnonymousClass05K.A01;
        } else if (ordinal == 2) {
            num = AnonymousClass05K.A0C;
        } else {
            throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(obj, AnonymousClass000.A00(2524), AnonymousClass7TE.A1A()));
        }
        2WX r2 = this.A02;
        AnonymousClass9JS A0e = C51968G9o.A0e(AnonymousClass05K.A1F, new J6K(this, 41));
        if (r2 == 2WX.A02) {
            r2 = null;
        }
        return new C53651Gs4(C51965G9l.A0X(r2, A0e), num);
    }

    public C53770Gtz(2WX r1, UserSession userSession, C232722uK r3, String str, C62320sa r5) {
        AnonymousClass7TG.A1U(str, userSession, r3);
        this.A04 = str;
        this.A03 = userSession;
        this.A00 = r3;
        this.A01 = r5;
        this.A02 = r1;
    }
}
