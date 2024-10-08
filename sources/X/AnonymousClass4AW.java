package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4AW  reason: invalid class name */
public final class AnonymousClass4AW implements C231452rh {
    public final /* synthetic */ 2Rw A00;
    public final /* synthetic */ RecyclerView A01;

    public AnonymousClass4AW(2Rw r1, RecyclerView recyclerView) {
        this.A00 = r1;
        this.A01 = recyclerView;
    }

    public final void D1O(int i, int i2, Object obj) {
        this.A00.notifyItemRangeChanged(i, i2, obj);
    }

    public final void DKr(int i, int i2) {
        this.A00.notifyItemRangeInserted(i, i2);
        if (i <= 1) {
            RecyclerView recyclerView = this.A01;
            recyclerView.post(new AnonymousClass9UT(recyclerView));
        }
    }

    public final void DSU(int i, int i2) {
        this.A00.notifyItemMoved(i, i2);
    }

    public final void Ddf(int i, int i2) {
        this.A00.notifyItemRangeRemoved(i, i2);
    }
}
