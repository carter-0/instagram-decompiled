package X;

import java.util.Arrays;

/* renamed from: X.XOb  reason: case insensitive filesystem */
public final class C21195XOb extends XOX {
    public final XOY A00;
    public final XOZ A01;
    public final XOa A02;
    public final Xnl A03;

    public final boolean A00() {
        return C51969G9p.A1a(this.A03, Xnl.A02);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21195XOb)) {
            return false;
        }
        C21195XOb xOb = (C21195XOb) obj;
        if (this.A02 == xOb.A02 && this.A01 == xOb.A01 && this.A00 == xOb.A00 && this.A03 == xOb.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C21195XOb.class, this.A02, this.A01, this.A00, this.A03});
    }

    public C21195XOb(XOY xoy, XOZ xoz, XOa xOa, Xnl xnl) {
        this.A02 = xOa;
        this.A01 = xoz;
        this.A00 = xoy;
        this.A03 = xnl;
    }
}
