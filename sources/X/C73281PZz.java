package X;

import android.util.Pair;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PZz  reason: case insensitive filesystem */
public final /* synthetic */ class C73281PZz implements Runnable {
    public final /* synthetic */ 19s A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C73281PZz(19s r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void run() {
        19s r5 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        AtomicBoolean atomicBoolean = r5.A06;
        if (atomicBoolean.get()) {
            r5.A01(str, str2);
            return;
        }
        synchronized (r5.A04) {
            if (atomicBoolean.get()) {
                r5.A01(str, str2);
            } else {
                r5.A05.add(new Pair(str, str2));
            }
        }
    }
}
