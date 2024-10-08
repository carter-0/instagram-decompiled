package X;

import android.content.Context;

/* renamed from: X.TzC  reason: case insensitive filesystem */
public final class C14606TzC implements X7M {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ C276544tV A03;

    public C14606TzC(Context context, C307786Rm r2, C276544tV r3, C276544tV r4) {
        this.A03 = r3;
        this.A00 = context;
        this.A02 = r4;
        this.A01 = r2;
    }

    public final void Dli() {
        C276544tV r1 = this.A03;
        C277014uI A0A = r1.A0A(42);
        if (A0A != null) {
            C276544tV r2 = this.A02;
            C308276Tl A0T = DbU.A0T(r2);
            C307786Rm r0 = this.A01;
            A0T.A02(r0);
            DbT.A1R(r0, r2, A0T, A0A);
            return;
        }
        C277014uI A09 = r1.A09();
        if (A09 != null) {
            C307886Rw.A03(this.A01, this.A02, new C308276Tl().A00(), A09);
        }
    }

    public final void Dlj(int i) {
        C277014uI A0A = this.A03.A0A(38);
        if (A0A != null) {
            C276544tV r4 = this.A02;
            C308276Tl A0T = DbU.A0T(r4);
            C307786Rm r2 = this.A01;
            A0T.A02(r2);
            A0T.A03(Integer.valueOf((int) C18183Vmx.A01(this.A00, (float) i)), 2);
            DbT.A1R(r2, r4, A0T, A0A);
        }
    }

    public final void Dlk(int i) {
        C276544tV r1 = this.A03;
        C277014uI A0A = r1.A0A(43);
        if (A0A != null) {
            C276544tV r4 = this.A02;
            C308276Tl A0T = DbU.A0T(r4);
            C307786Rm r2 = this.A01;
            A0T.A02(r2);
            A0T.A03(Integer.valueOf((int) C18183Vmx.A01(this.A00, (float) i)), 2);
            DbT.A1R(r2, r4, A0T, A0A);
            return;
        }
        C277014uI A08 = r1.A08();
        if (A08 != null) {
            C307886Rw.A03(this.A01, this.A02, new C308276Tl().A00(), A08);
        }
    }
}
