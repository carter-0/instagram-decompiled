package X;

import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Ffa  reason: case insensitive filesystem */
public final class C50619Ffa implements G64 {
    public AtomicBoolean A00 = new AtomicBoolean(false);
    public final G64 A01;

    public final void CHr(FragmentActivity fragmentActivity) {
        0qQ.A0B(fragmentActivity, 0);
        if (!this.A00.getAndSet(true)) {
            this.A01.CHr(fragmentActivity);
        }
    }

    public C50619Ffa(G64 g64) {
        this.A01 = g64;
    }
}
