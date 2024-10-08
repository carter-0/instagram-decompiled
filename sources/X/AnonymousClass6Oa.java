package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: X.6Oa  reason: invalid class name */
public final class AnonymousClass6Oa extends C306916Ob {
    public final AnonymousClass0JR A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ C277014uI A03;

    public AnonymousClass6Oa(C307786Rm r2, C276544tV r3, C277014uI r4) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        0qQ.A07(realtimeSinceBootClock);
        this.A00 = realtimeSinceBootClock;
    }

    public final void DFY(Drawable drawable, C240493Lc r9, int i, long j) {
        AnonymousClass6QD.A03(this.A01, this.A02, this.A03, "ImageFinalRendered", this.A00.now());
    }
}
