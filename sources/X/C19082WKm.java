package X;

import android.view.Surface;

/* renamed from: X.WKm  reason: case insensitive filesystem */
public class C19082WKm implements XBl {
    public final X68[] A00;

    public C19082WKm(X68... x68Arr) {
        0qQ.A0B(x68Arr, 1);
        this.A00 = x68Arr;
    }

    public final void DpW(Surface surface) {
        for (X68 x68 : this.A00) {
            if (x68 != null) {
                x68.DpW(surface);
            }
        }
    }

    public final void Dpc(Surface surface) {
        for (X68 x68 : this.A00) {
            if (x68 != null) {
                x68.Dpc(surface);
            }
        }
    }
}
