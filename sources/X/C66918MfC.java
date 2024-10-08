package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MfC  reason: case insensitive filesystem */
public final class C66918MfC implements C74504Pvz {
    public final 1aU A00;
    public final 1aT A01;
    public final 1aT A02;
    public final C269794fh A03;
    public final 1aT A04 = 1aF.A00();
    public final UserSession A05;
    public final C67246Mkg A06 = new C67246Mkg();
    public final C66937MfW A07;

    public C66918MfC(1aU r11, 1aU r12, C269794fh r13, C269794fh r14, UserSession userSession, C67250Mkk mkk, 2EM r17, C2611948q r18, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r14, 3);
        this.A05 = userSession;
        this.A03 = r14;
        this.A00 = r11;
        2EM r6 = r17;
        this.A02 = 1aF.A01(new N4R(r6, AnonymousClass7TE.A0u()));
        this.A01 = 1aF.A01(r18);
        1aU r3 = this.A00;
        1aU A0D = this.A01.A0D();
        C269794fh r1 = this.A03;
        this.A07 = new C66937MfW(C72120Owf.A00(1aU.A03(C66916MfA.A00, r3, A0D.A0P(r1), this.A02.A0D().A0P(r1)), this, 30), r12, r13, userSession, mkk, r6, z, z2, z3);
    }

    public final 1aU AE3() {
        return 1aU.A09(new C66920MfE(3, 3, false));
    }

    public final void EoV(C2611948q r2) {
        0qQ.A0B(r2, 0);
        this.A01.accept(r2);
    }

    public static final C257443xP A00(C66917MfB mfB, C66918MfC mfC) {
        Integer num;
        if (mfB.A01 != C2611948q.ALL || (((num = mfB.A02) == null || !(num.intValue() == -1 || num.intValue() == 0)) && !AnonymousClass6FC.A00(mfC.A05))) {
            C74549Pwi pwi = C74549Pwi.A01;
            pwi.getClass();
            return new C257453xQ(pwi);
        }
        C257443xP r0 = mfB.A00;
        0qQ.A06(r0);
        return r0;
    }

    public final 1aU AV8() {
        return this.A01.A0D();
    }

    public final 1aU AW9() {
        return this.A02.A0D();
    }

    public final C74565PxE B6g() {
        return this.A06;
    }

    public final C74566PxF C6W() {
        return this.A07;
    }

    public final 1aU E2O() {
        return this.A04;
    }

    public final void EWx(N4R n4r) {
        this.A02.accept(n4r);
    }

    public final void EfW(int i) {
        this.A04.accept(Integer.valueOf(i));
    }

    public final 1aU Ezk() {
        1aU r3 = this.A00;
        1aU A0D = this.A01.A0D();
        C269794fh r1 = this.A03;
        return C72120Owf.A00(1aU.A03(C66916MfA.A00, r3, A0D.A0P(r1), this.A02.A0D().A0P(r1)), this, 31);
    }
}
