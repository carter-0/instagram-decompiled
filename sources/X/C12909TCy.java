package X;

import java.util.concurrent.TimeoutException;

/* renamed from: X.TCy  reason: case insensitive filesystem */
public final class C12909TCy implements Runnable {
    public final /* synthetic */ C12356Ss2 A00;

    public C12909TCy(C12356Ss2 ss2) {
        this.A00 = ss2;
    }

    public final void run() {
        C12356Ss2 ss2 = this.A00;
        if (ss2.A0x && !ss2.A0Z) {
            C12356Ss2.A0C(ss2, new TimeoutException("release timed out: check after 5 secs"));
        }
    }
}
