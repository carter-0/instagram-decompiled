package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AkV  reason: case insensitive filesystem */
public final class C40861AkV implements Runnable {
    public final /* synthetic */ AnonymousClass8QZ A00;

    public C40861AkV(AnonymousClass8QZ r1) {
        this.A00 = r1;
    }

    public final void run() {
        int computeHorizontalScrollRange;
        AnonymousClass8QZ r4 = this.A00;
        RecyclerView recyclerView = r4.A0L;
        if (recyclerView.computeHorizontalScrollRange() > recyclerView.computeHorizontalScrollExtent()) {
            if (r4.A0Z) {
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                computeHorizontalScrollRange = 0;
                if (computeHorizontalScrollOffset > 0) {
                    computeHorizontalScrollRange = -computeHorizontalScrollOffset;
                }
            } else {
                computeHorizontalScrollRange = (recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollExtent()) - recyclerView.computeHorizontalScrollOffset();
            }
            recyclerView.A0u(computeHorizontalScrollRange, 0);
            return;
        }
        r4.A0B = false;
    }
}
