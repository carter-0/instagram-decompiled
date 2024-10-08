package X;

import android.content.Context;

public final class WJr implements C20880X2h {
    public final Context A00;
    public final C307786Rm A01;
    public final C276544tV A02;
    public final C245603dB[] A03;

    public final C307996Sh Blm(C307996Sh r7, long j) {
        C308006Si r0 = C307996Sh.A04;
        C307786Rm r3 = this.A01;
        if (r3 != null) {
            return r0.A03(r0.A01(this.A00, r7, r3, this.A03, -1), this.A02, (Object) null, j);
        }
        throw DbU.A0h();
    }

    public WJr(Context context, C307786Rm r2, C276544tV r3, C245603dB[] r4) {
        this.A00 = context;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
