package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Fv9  reason: case insensitive filesystem */
public final class C51501Fv9 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RecyclerView A02;
    public final /* synthetic */ EEP A03;

    public C51501Fv9(RecyclerView recyclerView, EEP eep, int i, int i2) {
        this.A03 = eep;
        this.A02 = recyclerView;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        C249703kE A0W = this.A02.A0W(this.A00 + this.A01);
        if (A0W != null) {
            A0W.itemView.sendAccessibilityEvent(8);
        }
    }
}
