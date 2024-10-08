package X;

import com.facebook.android.maps.model.LatLng;

/* renamed from: X.Wh5  reason: case insensitive filesystem */
public final class C19876Wh5 implements Comparable, X2C {
    public double A00;
    public double A01;
    public C19879Wh8 A02;
    public LatLng A03;
    public final C20944X5n A04;

    private void A00() {
        LatLng Bdm = this.A04.Bdm();
        if (!Bdm.equals(this.A03)) {
            this.A03 = Bdm;
            this.A00 = C19879Wh8.A00(W2R.A01(Bdm.A01));
            this.A01 = W2R.A00(Bdm.A00);
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C19876Wh5 wh5 = (C19876Wh5) obj;
        C20944X5n x5n = this.A04;
        if (x5n instanceof Comparable) {
            return ((Comparable) x5n).compareTo(wh5.A04);
        }
        A00();
        wh5.A00();
        double d = this.A00;
        double d2 = wh5.A00;
        if (d == d2) {
            d = this.A01;
            d2 = wh5.A01;
            if (d == d2) {
                if (hashCode() == wh5.hashCode()) {
                    return 0;
                }
                if (hashCode() > wh5.hashCode()) {
                    return 1;
                }
                return -1;
            }
        }
        if (d > d2) {
            return 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19876Wh5)) {
            return false;
        }
        return this.A04.equals(((C19876Wh5) obj).A04);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public C19876Wh5(C20944X5n x5n) {
        this.A04 = x5n;
    }

    public final void AmS(double[] dArr) {
        A00();
        dArr[0] = this.A00;
        dArr[1] = this.A01;
    }
}
