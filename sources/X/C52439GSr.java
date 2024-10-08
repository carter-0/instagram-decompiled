package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GSr  reason: case insensitive filesystem */
public final class C52439GSr implements AnonymousClass342 {
    public final RecyclerView A00;

    public final void FND(AnonymousClass345 r4, AnonymousClass343 r5) {
        C252553pI r0 = this.A00.A0D;
        r0.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r0;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a != -1 && A1b != -1) {
            while (A1a <= A1b) {
                r5.A02(r4, A1a);
                A1a++;
            }
        }
    }

    public C52439GSr(RecyclerView recyclerView) {
        17k.A0G(recyclerView.A0D instanceof LinearLayoutManager, "VisibleItemTracker's RecyclerPositionTracked isn't implemented to support recycler views not using LinearLayoutManager.");
        this.A00 = recyclerView;
    }
}
