package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7he  reason: invalid class name and case insensitive filesystem */
public final class C338247he implements Runnable {
    public final /* synthetic */ 2We A00;

    public C338247he(2We r1) {
        this.A00 = r1;
    }

    public final void run() {
        2We r3 = this.A00;
        RecyclerView recyclerView = r3.A08;
        if (recyclerView == null || !recyclerView.A1D()) {
            C338317hl r1 = r3.A0Y;
            if (r1.A02()) {
                r1.A00(1);
            }
        } else if (recyclerView.A0T && recyclerView.getVisibility() != 8) {
            int i = r3.A07;
            if (i >= 3) {
                r3.A07 = 0;
                C338317hl r12 = r3.A0Y;
                if (r12.A02()) {
                    r12.A00(1);
                    return;
                }
                return;
            }
            r3.A07 = i + 1;
            r3.A08.postOnAnimation(r3.A0d);
            return;
        }
        r3.A07 = 0;
    }
}
