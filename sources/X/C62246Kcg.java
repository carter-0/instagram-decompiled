package X;

import com.instagram.user.model.User;

/* renamed from: X.Kcg  reason: case insensitive filesystem */
public final class C62246Kcg extends C62247Kch implements G7P {
    public C262204Co A00;
    public final F3J A01;
    public final C62287KdL A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62246Kcg(android.view.View r11, X.AnonymousClass4DH r12, com.instagram.common.session.UserSession r13, boolean r14) {
        /*
            r10 = this;
            r0 = 2
            r7 = r13
            X.0qQ.A0B(r13, r0)
            r0 = 25
            X.GL3 r5 = new X.GL3
            r6 = r12
            r5.<init>(r0, r12, r13, r14)
            r0 = 8
            X.MMN r3 = new X.MMN
            r3.<init>(r12, r0)
            X.0eO r2 = X.0eO.A02
            r1 = 9
            X.MMN r0 = new X.MMN
            r0.<init>(r3, r1)
            X.0eM r4 = X.AnonymousClass0eN.A00(r2, r0)
            java.lang.Class<X.KdL> r0 = X.C62287KdL.class
            X.0Yh r3 = X.DbS.A0z(r0)
            r0 = 10
            X.MMN r2 = new X.MMN
            r2.<init>(r4, r0)
            r1 = 0
            r0 = 0
            X.MMn r0 = X.C66304MMn.A01(r4, r1, r0)
            X.2kA r0 = X.DbS.A0I(r2, r5, r0, r3)
            java.lang.Object r9 = r0.getValue()
            X.KdL r9 = (X.C62287KdL) r9
            r0 = 4
            X.0qQ.A0B(r9, r0)
            X.6go r8 = X.C313666go.BROADCASTER
            r4 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A02 = r9
            X.F3J r0 = new X.F3J
            r0.<init>(r12, r13)
            r10.A01 = r0
            r10.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62246Kcg.<init>(android.view.View, X.4DH, com.instagram.common.session.UserSession, boolean):void");
    }

    public final void Dc5(User user, boolean z) {
    }

    public final void CuA() {
        C62287KdL kdL = this.A02;
        C66184MGv.A02(kdL, C318116oQ.A00(kdL), 20);
    }

    public final void DXE(M0V m0v) {
        String str;
        C62287KdL kdL = this.A02;
        C61013JvD A0Q = JTQ.A0Q(kdL.A07);
        if (A0Q != null && (str = A0Q.A08) != null) {
            AnonymousClass7TE.A1Z(new C66173MGk(m0v, kdL, str, (AnonymousClass4D7) null, 18), C318116oQ.A00(kdL));
        }
    }

    public final void Dc4() {
        this.A07.A01();
    }

    public final void A06() {
        super.A06();
        this.A00 = JTQ.A0n(this.A00);
    }

    public final void A07() {
        super.A07();
        if (this.A00 == null) {
            this.A00 = AnonymousClass11O.A03(DbV.A0J(this.A04), C66186MGx.A01(this, this.A02.A04, 45));
        }
    }
}
