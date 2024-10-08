package X;

import androidx.recyclerview.widget.RecyclerView;

public final class M8H implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C54134H0d A01;

    public M8H(RecyclerView recyclerView, C54134H0d h0d) {
        this.A00 = recyclerView;
        this.A01 = h0d;
    }

    public final void run() {
        this.A00.A0p(this.A01.A00 + 1);
    }
}
