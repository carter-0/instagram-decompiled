package X;

import android.os.SystemClock;

/* renamed from: X.4RB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4RB implements AnonymousClass4RC {
    public final /* synthetic */ AnonymousClass4R6 A00;

    public /* synthetic */ AnonymousClass4RB(AnonymousClass4R6 r1) {
        this.A00 = r1;
    }

    public final void DTs(int i) {
        int i2;
        AnonymousClass4R6 r6 = this.A00;
        AnonymousClass4R6 r0 = AnonymousClass4R6.A0E;
        synchronized (r6) {
            int i3 = r6.A00;
            if (i3 == 0 || r6.A0A) {
                if (i3 != i) {
                    r6.A00 = i;
                    if (!(i == 1 || i == 0 || i == 8)) {
                        long A002 = AnonymousClass4R6.A00(r6, i);
                        r6.A02 = A002;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (r6.A01 > 0) {
                            i2 = (int) (elapsedRealtime - r6.A04);
                        } else {
                            i2 = 0;
                        }
                        AnonymousClass4R6.A01(r6, i2, r6.A03, A002);
                        r6.A04 = elapsedRealtime;
                        r6.A03 = 0;
                        r6.A05 = 0;
                        r6.A06 = 0;
                        AnonymousClass281 r1 = r6.A09;
                        r1.A04.clear();
                        r1.A00 = -1;
                        r1.A01 = 0;
                        r1.A02 = 0;
                    }
                }
            }
        }
    }
}
