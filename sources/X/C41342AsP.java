package X;

import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: X.AsP  reason: case insensitive filesystem */
public final /* synthetic */ class C41342AsP implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass9RJ A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C41342AsP(AnonymousClass9RJ r1, long j, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = j;
    }

    public final Object call() {
        AnonymousClass9RJ r7 = this.A01;
        boolean z = this.A02;
        long j = this.A00;
        if (r7.A0d) {
            C21986Xoh xoh = r7.A08;
            xoh.getClass();
            xoh.A02(C21986Xoh.A0Y, Long.valueOf(SystemClock.elapsedRealtime()));
            AnonymousClass9RJ.A06(r7);
            if (z) {
                AnonymousClass9RJ.A05(r7);
            }
            C21986Xoh xoh2 = r7.A08;
            xoh2.getClass();
            xoh2.A02(C21986Xoh.A0X, Long.valueOf(j));
            return r7.A08;
        }
        throw AnonymousClass7TE.A0z("Not recording video.");
    }
}
