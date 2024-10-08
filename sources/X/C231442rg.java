package X;

/* renamed from: X.2rg  reason: invalid class name and case insensitive filesystem */
public final class C231442rg implements C231452rh {
    public final 2Rw A00;

    public final void D1O(int i, int i2, Object obj) {
        this.A00.notifyItemRangeChanged(i, i2, obj);
    }

    public final void DKr(int i, int i2) {
        this.A00.notifyItemRangeInserted(i, i2);
    }

    public final void DSU(int i, int i2) {
        this.A00.notifyItemMoved(i, i2);
    }

    public final void Ddf(int i, int i2) {
        this.A00.notifyItemRangeRemoved(i, i2);
    }

    public C231442rg(2Rw r1) {
        this.A00 = r1;
    }
}
