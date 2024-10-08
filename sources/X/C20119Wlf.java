package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Wlf  reason: case insensitive filesystem */
public final class C20119Wlf implements Runnable {
    public final int A00;
    public final RecyclerView A01;

    public final void run() {
        this.A01.A0p(this.A00);
    }

    public C20119Wlf(RecyclerView recyclerView, int i) {
        this.A00 = i;
        this.A01 = recyclerView;
    }
}
