package X;

import java.util.List;

/* renamed from: X.GLm  reason: case insensitive filesystem */
public final class C52271GLm extends C324596za {
    public final /* synthetic */ C52259GLa A00;
    public final /* synthetic */ GLR A01;
    public final /* synthetic */ 0rk A02;
    public final /* synthetic */ boolean A03;

    public C52271GLm(C52259GLa gLa, GLR glr, 0rk r3, boolean z) {
        this.A01 = glr;
        this.A00 = gLa;
        this.A03 = z;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-818348083);
        C298835u7 r9 = (C298835u7) obj;
        int A033 = AnonymousClass0fD.A03(1179818210);
        0qQ.A0B(r9, 0);
        GLR glr = this.A01;
        C276114sa BaP = r9.BaP();
        C52259GLa gLa = this.A00;
        String str = gLa.A02;
        glr.A00 = GLR.A00(BaP, str, false, false);
        List A05 = GLR.A05(glr, C51973G9u.A0m(r9));
        GLR.A07(r9, glr, A05, true, false);
        C320446sO r0 = glr.A03;
        if (r0 != null) {
            r0.A03();
        }
        boolean z = this.A03;
        if (!z) {
            glr.A08.A00();
            glr.A02 = false;
        }
        C52262GLd gLd = glr.A08;
        0rk r1 = this.A02;
        int i = r1.A00;
        r1.A00 = i + 1;
        gLd.A02(r9, A05, i, true, gLa.A06, true, z, true, false, false);
        GLR.A08(glr, r9.BaG());
        GLR.A06(r9.BaP(), glr, str, A05, gLa.A04);
        AnonymousClass0fD.A0A(-1997708683, A033);
        AnonymousClass0fD.A0A(295606116, A032);
    }

    public final void onFail(C268654dm r13) {
        int A032 = AnonymousClass0fD.A03(-1420450988);
        C268654dm r5 = r13;
        0qQ.A0B(r13, 0);
        boolean z = this.A03;
        if (!z) {
            this.A01.A08.A00();
        }
        GLR glr = this.A01;
        C52262GLd gLd = glr.A08;
        0rk r1 = this.A02;
        int i = r1.A00;
        r1.A00 = i + 1;
        gLd.A03(r5, i, true, this.A00.A06, true, z, false);
        glr.A02 = false;
        AnonymousClass0fD.A0A(1536578841, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-2072357231);
        if (this.A03) {
            GLR glr = this.A01;
            glr.A08.A00();
            glr.A02 = false;
        }
        AnonymousClass0fD.A0A(1766868309, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1326631060);
        GLR glr = this.A01;
        glr.A08.A04(((C270744hE) glr.A04).Bec(glr.A06), true, this.A00.A06, this.A03, false);
        AnonymousClass0fD.A0A(654606723, A032);
    }
}
