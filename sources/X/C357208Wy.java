package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.8Wy  reason: invalid class name and case insensitive filesystem */
public final class C357208Wy implements C357218Wz {
    public double A00;
    public boolean A01;
    public final View A02;
    public final C353858Jp A03;

    public C357208Wy(View view, C353858Jp r3) {
        0qQ.A0B(view, 2);
        this.A03 = r3;
        this.A02 = view;
    }

    public final boolean DHp() {
        2cs r1;
        if (!this.A01) {
            return false;
        }
        C354128Kt r11 = (C354128Kt) this.A03.A00.getValue();
        double d = this.A00;
        double d2 = 0.0d;
        if (d < 0.0d || (d == 0.0d && r11.A01 < ((double) r11.A05) / 2.0d)) {
            r1 = r11.A06;
            r1.A07(d);
        } else {
            r1 = r11.A06;
            r1.A07(d);
            d2 = (double) r11.A05;
        }
        r1.A06(d2);
        this.A01 = false;
        return true;
    }

    public final void DhF(double d) {
        double d2;
        if (!this.A01) {
            ViewParent parent = this.A02.getParent();
            if (parent != null) {
                d = 0.0d;
                this.A00 = 0.0d;
                this.A01 = true;
                parent.requestDisallowInterceptTouchEvent(true);
            } else {
                return;
            }
        }
        C354128Kt r6 = (C354128Kt) this.A03.A00.getValue();
        if (!r6.A04) {
            r6.A04 = true;
            r6.A06.A01();
            C354058Km r0 = r6.A02;
            if (r0 != null) {
                r0.onStart();
            }
        }
        double d3 = r6.A00 - d;
        r6.A00 = d3;
        if (d3 < 0.0d) {
            r6.A03 = AnonymousClass05K.A00;
            d2 = ((double) r6.A05) + d3;
            r6.A01 = d2;
        } else {
            r6.A03 = AnonymousClass05K.A01;
            r6.A01 = d3;
            d2 = d3;
        }
        r6.A06.A08(d2, true);
    }

    public final void DG1(double d) {
        this.A00 = d;
    }
}
