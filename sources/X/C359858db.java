package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.8db  reason: invalid class name and case insensitive filesystem */
public final class C359858db implements AnonymousClass0lh {
    public final 01e A00 = new 01e(10);
    public final AnonymousClass0JR A01;
    public final C359778dT A02;

    public final void A00(C361098ff r12, String str, long j, long j2) {
        C361098ff r4 = r12;
        0qQ.A0B(r12, 1);
        synchronized (this.A02) {
            this.A00.A05(str, new C360718f2(r4, this.A01.now(), j, j2));
        }
    }

    public final void onSessionWillEnd() {
        synchronized (this.A02) {
            this.A00.A04(-1);
        }
    }

    public C359858db() {
        C359778dT r0 = C359778dT.A00;
        0qQ.A07(r0);
        this.A02 = r0;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.A01 = awakeTimeSinceBootClock;
    }
}
