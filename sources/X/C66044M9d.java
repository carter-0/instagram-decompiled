package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.M9d  reason: case insensitive filesystem */
public final class C66044M9d implements Runnable {
    public final /* synthetic */ C60474Jm6 A00;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ K6H A02;
    public final /* synthetic */ boolean A03;

    public C66044M9d(C60474Jm6 jm6, RecyclerView recyclerView, K6H k6h, boolean z) {
        this.A01 = recyclerView;
        this.A02 = k6h;
        this.A03 = z;
        this.A00 = jm6;
    }

    public final void run() {
        RecyclerView recyclerView = this.A01;
        AnonymousClass2t9 r0 = this.A02.A03;
        if (r0 == null) {
            0qQ.A0F("recyclerAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        C249703kE A0W = recyclerView.A0W(r0.getItemCount() - 1);
        if (this.A03 && (A0W instanceof KUL)) {
            C60692Jpd jpd = (C60692Jpd) A0W;
            C60692Jpd.A01(jpd, new C51793G2c(jpd, 7));
        }
        recyclerView.A16(this.A00);
    }
}
