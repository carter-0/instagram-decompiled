package X;

import android.os.SystemClock;

/* renamed from: X.4SE  reason: invalid class name */
public final class AnonymousClass4SE {
    public final /* synthetic */ AnonymousClass4OS A00;

    public final void A00(int i, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass4OS r5 = this.A00;
        AnonymousClass4OS.A07(r5.A0G.obtainMessage(9, new Object[]{Integer.valueOf(z ? 1 : 0), Integer.valueOf(i), Long.valueOf(elapsedRealtime), false}), r5);
    }

    public AnonymousClass4SE(AnonymousClass4OS r1) {
        this.A00 = r1;
    }
}
