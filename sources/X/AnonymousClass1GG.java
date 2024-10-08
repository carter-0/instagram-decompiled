package X;

import android.os.SystemClock;

/* renamed from: X.1GG  reason: invalid class name */
public final class AnonymousClass1GG implements C61110lV {
    public final /* synthetic */ 1GF A00;

    public AnonymousClass1GG(1GF r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-2103191842);
        1GF r2 = this.A00;
        if (r2.A03) {
            r2.A00 = SystemClock.elapsedRealtime();
        } else {
            r2.A01 = null;
        }
        AnonymousClass0fD.A0A(-101248391, A03);
    }

    public final void onAppForegrounded() {
        int i;
        int A03 = AnonymousClass0fD.A03(-392165990);
        1GF r6 = this.A00;
        if (!r6.A03) {
            i = 260035646;
        } else {
            long j = r6.A02;
            if (j < 0) {
                i = 1353020832;
            } else {
                if (SystemClock.elapsedRealtime() - r6.A00 > j) {
                    r6.A01 = null;
                }
                i = -1271058572;
            }
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
