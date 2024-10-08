package X;

/* renamed from: X.2rb  reason: invalid class name and case insensitive filesystem */
public final class C231392rb extends C231402rc {
    public final /* synthetic */ 2Rv A00;

    public C231392rb(2Rv r1) {
        this.A00 = r1;
    }

    public final void onChanged() {
        this.A00.mDataSetObservable.notifyChanged();
    }

    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    public final void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }

    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }
}
