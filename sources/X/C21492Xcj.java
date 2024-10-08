package X;

/* renamed from: X.Xcj  reason: case insensitive filesystem */
public final class C21492Xcj {
    public C21500Xd1 A00;
    public Y7U A01;
    public C21404XaC A02;
    public boolean A03;
    public final C21504XdI A04;
    public final C21946Xmb A05;
    public final Y1T A06;
    public final Xnx A07;
    public final Xb9 A08;
    public final C21988Xp1 A09;

    public final void A00() {
        synchronized (this.A07) {
            this.A03 = true;
        }
    }

    public final boolean A01() {
        boolean z;
        synchronized (this.A07) {
            z = true;
            if (this.A00 == null) {
                Y7U y7u = this.A09.A04;
                if (y7u != null && y7u.A02 == 0) {
                    C21500Xd1 xd1 = y7u.A0E;
                    if (SUS.A0D(xd1.A02.A0A, this.A04.A0A)) {
                        this.A00 = xd1;
                    }
                }
                C21404XaC xaC = this.A02;
                if (xaC == null || xaC.A00 >= xaC.A01.size()) {
                    Xb9 xb9 = this.A08;
                    if (xb9.A00 >= xb9.A02.size() && xb9.A03.isEmpty()) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    public C21492Xcj(C21504XdI xdI, C21946Xmb xmb, Y1T y1t, Xnx xnx, C21988Xp1 xp1) {
        this.A09 = xp1;
        this.A07 = xnx;
        this.A04 = xdI;
        this.A06 = y1t;
        this.A05 = xmb;
        this.A08 = new Xb9(xdI, xmb, y1t, xnx.A05);
    }
}
