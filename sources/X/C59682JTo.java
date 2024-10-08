package X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.JTo  reason: case insensitive filesystem */
public final class C59682JTo implements Runnable {
    public final /* synthetic */ AnonymousClass2rI A00;
    public final /* synthetic */ C228532lp A01;

    public C59682JTo(AnonymousClass2rI r1, C228532lp r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        1Xj A02 = 1Xi.A02(this.A00.A03(0).A05);
        Context context = this.A01.A00.getContext();
        if (context != null && A02 != null) {
            0nY.A00().ATE(new C59684JTq(context, this, A02.getId(), now));
        }
    }
}
