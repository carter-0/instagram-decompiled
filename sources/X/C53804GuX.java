package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GuX  reason: case insensitive filesystem */
public final class C53804GuX extends C251343mx {
    public final long A00;
    public final long A01;
    public final C61047Jvl A02;
    public final UserSession A03;
    public final JTC A04;
    public final C59603JPx A05;

    public C53804GuX(C61047Jvl jvl, UserSession userSession, JTC jtc, C59603JPx jPx, long j, long j2) {
        0qQ.A0B(jvl, 2);
        AnonymousClass7TG.A1S(jtc, jPx);
        this.A03 = userSession;
        this.A02 = jvl;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = jtc;
        this.A05 = jPx;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r10) {
        C61047Jvl jvl = this.A02;
        if (C61047Jvl.A00(3, jvl)) {
            return new C53805GuY(jvl, this.A03, this.A04, this.A05, this.A00, this.A01);
        }
        throw AnonymousClass7TE.A1K();
    }
}
