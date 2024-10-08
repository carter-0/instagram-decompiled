package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

public final class Py6 implements C61110lV {
    public final /* synthetic */ 2Io A00;

    public Py6(2Io r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(1554033369);
        2Io r2 = this.A00;
        r2.A05.set(false);
        r2.A00 = AwakeTimeSinceBootClock.INSTANCE.now();
        AnonymousClass0fD.A0A(751243773, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(-994410647);
        2Io r2 = this.A00;
        r2.A05.set(true);
        r2.A01 = AwakeTimeSinceBootClock.INSTANCE.now();
        AnonymousClass0fD.A0A(686082652, A03);
    }
}
