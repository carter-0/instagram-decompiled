package X;

/* renamed from: X.3D3  reason: invalid class name */
public final class AnonymousClass3D3 extends C231402rc {
    public final /* synthetic */ C227812jx A00;
    public final /* synthetic */ C231272rL A01;

    public AnonymousClass3D3(C227812jx r1, C231272rL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onChanged() {
        int itemCount = this.A01.getItemCount();
        C227812jx r0 = this.A00;
        if (itemCount == 0) {
            r0.showEmptyView();
        } else {
            r0.hideEmptyView();
        }
    }

    public final void onItemRangeInserted(int i, int i2) {
        if (this.A01.getItemCount() > 0) {
            this.A00.hideEmptyView();
        }
    }

    public final void onItemRangeRemoved(int i, int i2) {
        if (this.A01.getItemCount() == 0) {
            this.A00.showEmptyView();
        }
    }
}
