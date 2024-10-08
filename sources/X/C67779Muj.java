package X;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.Muj  reason: case insensitive filesystem */
public final class C67779Muj extends AnonymousClass52S {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;

    public final int A09() {
        return -1;
    }

    public final void A05(View view, AnonymousClass52U r7, AnonymousClass3AW r8) {
        int i;
        C252553pI r0 = this.A02;
        if (r0 != null) {
            C238673Cy r4 = new C238673Cy(r0);
            int A0D = r4.A0D(view) + (r4.A0B(view) / 2);
            int A06 = r4.A06() + (r4.A07() / 2);
            float A032 = ((float) (r4.A03() - r4.A06())) * 0.8f;
            int i2 = A0D - A06;
            if (i2 > 0) {
                i2 = (int) (((float) i2) - A032);
            }
            int i3 = ((int) A032) - this.A01;
            if (Math.abs(i2) > i3) {
                int i4 = -1;
                if (i2 > 0) {
                    i4 = 1;
                }
                i2 = i3 * i4;
            }
            if (i2 < 0) {
                i = this.A02;
            } else {
                i = this.A00;
            }
            int i5 = i2 - i;
            int A0A = A0A(i5);
            if (A0A > 0) {
                r7.A00(this.A06, 0, i5, A0A);
            }
        }
    }

    public final void A06(AnonymousClass52U r6, AnonymousClass3AW r7, int i, int i2) {
        this.A01 += i2;
        C252553pI r2 = this.A02;
        if (r2 != null) {
            if (((double) this.A01) >= Math.floor((double) (((float) ((r2.A00 - r2.Ba8()) - r2.BaC())) * 0.8f))) {
                A02();
                return;
            }
        }
        super.A06(r6, r7, i, i2);
    }

    public final float A07(DisplayMetrics displayMetrics) {
        float f;
        float f2;
        if (!this.A03) {
            f2 = (float) displayMetrics.densityDpi;
            f = 25.0f;
        } else {
            f = 5.5f;
            f2 = (float) displayMetrics.densityDpi;
        }
        return f / f2;
    }

    public final int A0A(int i) {
        int A0A = super.A0A(i);
        if (!this.A03) {
            return A0A;
        }
        return (int) (((float) (((int) ((((float) this.A02.A00) * 0.8f) / ((float) (i + this.A01)))) * A0A)) * 0.75f);
    }
}
