package X;

/* renamed from: X.JkF  reason: case insensitive filesystem */
public final class C60367JkF extends C320806sz {
    public final /* synthetic */ C61427K7c A00;
    public final /* synthetic */ boolean A01;

    public C60367JkF(C61427K7c k7c, boolean z) {
        this.A01 = z;
        this.A00 = k7c;
    }

    public final int A00(int i) {
        int itemViewType;
        if (this.A01 || (itemViewType = ((2Rw) this.A00.A07.getValue()).getItemViewType(i)) == 0 || itemViewType == 2) {
            return 1;
        }
        return 3;
    }
}
