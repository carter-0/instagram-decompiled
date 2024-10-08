package X;

import android.os.PerformanceHintManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.THt  reason: case insensitive filesystem */
public final class C13011THt implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    public C13011THt(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        PerformanceHintManager A002 = C11344SOb.A00();
        if (A002 != null) {
            int i = this.A00;
            int i2 = this.A01;
            A002.createHintSession(new int[]{i2}, TimeUnit.MINUTES.toNanos((long) i));
        }
    }
}
