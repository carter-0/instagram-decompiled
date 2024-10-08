package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.AkI  reason: case insensitive filesystem */
public final class C40848AkI implements Runnable {
    public final /* synthetic */ C359318cb A00;

    public C40848AkI(C359318cb r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8d3 r0;
        C359318cb r2 = this.A00;
        FragmentActivity fragmentActivity = r2.A0X;
        if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed() && (r0 = r2.A09) != null) {
            r0.A00();
        }
    }
}
