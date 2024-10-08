package X;

import android.os.ConditionVariable;

/* renamed from: X.7t0  reason: invalid class name and case insensitive filesystem */
public final class C345147t0 implements C344887sa {
    public final /* synthetic */ C344767sO A00;

    public C345147t0(C344767sO r1) {
        this.A00 = r1;
    }

    public final void APC() {
        C344927se r3 = this.A00.A0L;
        if (r3 != null && r3.A02) {
            C344947sg r0 = r3.A04;
            r0.A0G = false;
            r0.A08.post(r0.A0A);
            C345087su r1 = r3.A00;
            if (r1 != null) {
                r3.A01.A04(r1);
            }
            r3.A02 = false;
        }
    }

    public final void ARH() {
        C344927se r4 = this.A00.A0L;
        if (r4 != null && !r4.A02) {
            C344947sg r2 = r4.A04;
            r2.A0G = true;
            r2.A08.post(r2.A09);
            if (r2.A05) {
                ConditionVariable conditionVariable = r2.A07;
                conditionVariable.block();
                conditionVariable.close();
            }
            C345087su r22 = r4.A00;
            if (r22 != null) {
                C345037sp r1 = r4.A01;
                r1.A02(r1.A01, r22);
            }
            r4.A02 = true;
            r4.A03 = false;
        }
    }

    public final C344877sZ Blu() {
        return C344877sZ.INPUT_PREVIEW;
    }
}
