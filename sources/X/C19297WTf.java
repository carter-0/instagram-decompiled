package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Queue;

/* renamed from: X.WTf  reason: case insensitive filesystem */
public final class C19297WTf implements AnonymousClass0m6 {
    public final /* synthetic */ C313136fw A00;

    public C19297WTf(C313136fw r1) {
        this.A00 = r1;
    }

    public final void DKT(ViewGroup viewGroup, View view, int i) {
        0qQ.A0B(view, 0);
        C313136fw r2 = this.A00;
        Queue queue = r2.A07;
        queue.offer(view);
        if (queue.size() == r2.A04) {
            r2.A01 = false;
        }
    }
}
