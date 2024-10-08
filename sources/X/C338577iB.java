package X;

import android.os.SystemClock;
import java.util.Deque;

/* renamed from: X.7iB  reason: invalid class name and case insensitive filesystem */
public final class C338577iB implements Runnable {
    public final /* synthetic */ 2We A00;
    public final /* synthetic */ Deque A01;
    public final /* synthetic */ boolean A02;

    public C338577iB(2We r1, Deque deque, boolean z) {
        this.A00 = r1;
        this.A01 = deque;
        this.A02 = z;
    }

    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        while (true) {
            Deque deque = this.A01;
            if (!deque.isEmpty()) {
                ((C338387hs) deque.pollFirst()).D7p(this.A02, uptimeMillis);
            } else {
                return;
            }
        }
    }
}
