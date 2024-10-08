package X;

import com.instagram.ui.widget.drawing.FloatingIndicator;

/* renamed from: X.5xr  reason: invalid class name and case insensitive filesystem */
public final class C300795xr implements Runnable {
    public final /* synthetic */ FloatingIndicator A00;

    public C300795xr(FloatingIndicator floatingIndicator) {
        this.A00 = floatingIndicator;
    }

    public final void run() {
        FloatingIndicator floatingIndicator = this.A00;
        2cs r2 = (2cs) floatingIndicator.A04.getValue();
        r2.A01();
        r2.A06(1.0d);
        floatingIndicator.A06 = true;
        floatingIndicator.A05 = false;
    }
}
