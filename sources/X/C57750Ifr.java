package X;

/* renamed from: X.Ifr  reason: case insensitive filesystem */
public final class C57750Ifr implements Runnable {
    public final /* synthetic */ H5L A00;

    public C57750Ifr(H5L h5l) {
        this.A00 = h5l;
    }

    public final void run() {
        H5L h5l = this.A00;
        if (h5l.A00 == 0) {
            h5l.A00 = h5l.A0A.getScrollingViewProxy().CEd().getHeight();
        }
        C56080HsT hsT = h5l.A01;
        if (h5l.A02 && hsT != null) {
            hsT.A00.setVisibility(0);
            hsT.A02(AnonymousClass7TF.A1R(h5l.A06.A02.size()));
            0nA.A0p(hsT.A00, new C57749Ifq(this));
        }
    }
}
