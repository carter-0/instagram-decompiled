package X;

import com.instagram.common.session.UserSession;

public final class GHZ extends C251343mx {
    public final float A00;
    public final long A01;
    public final long A02;
    public final C52058GDe A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final JTC A06;
    public final JN4 A07;
    public final JQV A08;
    public final 0sP A09;

    public GHZ(C52058GDe gDe, UserSession userSession, AnonymousClass4DU r4, JTC jtc, JN4 jn4, JQV jqv, 0sP r8, float f, long j, long j2) {
        0qQ.A0B(jn4, 1);
        C51974G9v.A0d(2, jqv, r4, gDe, jtc);
        0qQ.A0B(r8, 9);
        this.A07 = jn4;
        this.A08 = jqv;
        this.A04 = userSession;
        this.A05 = r4;
        this.A03 = gDe;
        this.A06 = jtc;
        this.A01 = j;
        this.A02 = j2;
        this.A09 = r8;
        this.A00 = f;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r15) {
        0qQ.A0B(r15, 0);
        JN4 jn4 = this.A07;
        if (jn4 instanceof C57656IeL) {
            return null;
        }
        if (jn4 instanceof C52082GEc) {
            AnonymousClass3W1 r4 = this.A03.A0E;
            if (r4 == null) {
                return null;
            }
            JQV jqv = this.A08;
            UserSession userSession = this.A04;
            AnonymousClass4DU r3 = this.A05;
            JTC jtc = this.A06;
            long j = this.A01;
            long j2 = this.A02;
            return new C52159GHb(userSession, r3, r4, jtc, (C52082GEc) jn4, jqv, this.A09, this.A00, j, j2);
        }
        throw AnonymousClass7TE.A1K();
    }
}
