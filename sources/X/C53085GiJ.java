package X;

/* renamed from: X.GiJ  reason: case insensitive filesystem */
public final class C53085GiJ extends C231402rc {
    public final /* synthetic */ C3254772o A00;

    public final void onItemRangeChanged(int i, int i2) {
        C3254772o r2 = this.A00;
        C3254772o.A04(r2, "range_changed", new MJB(r2, i, this, i2, 1));
    }

    public final void onItemRangeInserted(int i, int i2) {
        C3254772o r2 = this.A00;
        C3254772o.A04(r2, "insert", new MJB(r2, i, this, i2, 2));
    }

    public final void onItemRangeMoved(int i, int i2, int i3) {
        C3254772o r2 = this.A00;
        C3254772o.A04(r2, "moved", new TTX(r2, this, i, i2, i3, 1));
    }

    public final void onItemRangeRemoved(int i, int i2) {
        C3254772o r2 = this.A00;
        C3254772o.A04(r2, "remove", new MJB(r2, i, this, i2, 3));
    }

    public C53085GiJ(C3254772o r1) {
        this.A00 = r1;
    }

    public final void onChanged() {
        C3254772o r2 = this.A00;
        C3254772o.A04(r2, "all_changed", new GNG(11, this, r2));
    }

    public final void onItemRangeChanged(int i, int i2, Object obj) {
        C3254772o r6 = this.A00;
        int i3 = i2;
        C3254772o.A04(r6, "changed_with_payload", new C58217IoL(i3, i, 1, this, r6, obj));
    }
}
