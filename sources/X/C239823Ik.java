package X;

import android.os.SystemClock;

/* renamed from: X.3Ik  reason: invalid class name and case insensitive filesystem */
public final class C239823Ik implements Runnable {
    public final /* synthetic */ AnonymousClass3EB A00;
    public final /* synthetic */ Object A01;

    public C239823Ik(AnonymousClass3EB r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public final void run() {
        AnonymousClass3EB r3 = this.A00;
        Object obj = this.A01;
        if (r3.A01.get()) {
            r3.A04.A0A(r3);
        } else {
            C228962mc r1 = r3.A04;
            if (r1.A01 != r3) {
                r1.A0A(r3);
            } else if (!r1.A03) {
                r1.A05 = false;
                SystemClock.uptimeMillis();
                r1.A01 = null;
                r1.A03(obj);
            }
        }
        r3.A03 = AnonymousClass05K.A0C;
    }
}
