package X;

/* renamed from: X.VhR  reason: case insensitive filesystem */
public final class C17874VhR {
    public boolean A00;
    public boolean A01;
    public final C17994VjW A02;
    public final boolean[] A03;
    public final /* synthetic */ C19866Wgt A04;

    public C17874VhR(C17994VjW vjW, C19866Wgt wgt) {
        boolean[] zArr;
        this.A04 = wgt;
        this.A02 = vjW;
        if (vjW.A01) {
            zArr = null;
        } else {
            zArr = new boolean[wgt.A06];
        }
        this.A03 = zArr;
    }

    public final void A00() {
        C19866Wgt.A00(this, this.A04, false);
    }
}
