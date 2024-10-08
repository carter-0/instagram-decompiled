package X;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Interpolator;

/* renamed from: X.7Dt  reason: invalid class name and case insensitive filesystem */
public final class C328167Dt {
    public float A00;
    public float A01;
    public float A02;
    public 2cs A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public boolean A0A;
    public final Handler A0B = new Handler(Looper.getMainLooper());
    public final C252203oj A0C = new C328187Dv(this);
    public final C328157Ds A0D;
    public final Runnable A0E = new C328197Dw(this);
    public final Interpolator A0F = new Object();
    public final C71392co A0G = new C71392co(100.0d, 5.0d);
    public final 2cp A0H;

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.animation.Interpolator, java.lang.Object] */
    public C328167Dt(2cp r6, C328157Ds r7) {
        0qQ.A0B(r6, 1);
        this.A0H = r6;
        this.A0D = r7;
    }

    public final void A02(float f, float f2, boolean z) {
        this.A05 = f;
        this.A04 = f - 0.0f;
        boolean z2 = false;
        if (f2 == 0.0f) {
            z2 = true;
        }
        this.A0A = !z2;
        this.A06 = f2;
        A00(this, this.A00, this.A02);
        if (z) {
            2cs A022 = this.A0H.A02();
            A022.A09(this.A0G);
            A022.A06 = true;
            A022.A05(0.0d);
            this.A03 = A022;
            C252203oj r0 = this.A0C;
            A022.A0B(r0);
            A022.A0A(r0);
            this.A0B.postDelayed(this.A0E, 100);
            return;
        }
        this.A03 = null;
    }

    public static final void A00(C328167Dt r13, float f, float f2) {
        float f3;
        float f4 = f2;
        float f5 = f;
        if (r13.A01 == f2) {
            r13.A0D.DvS(f4, f5, r13.A07, r13.A08, r13.A09);
            return;
        }
        float f6 = (r13.A04 * f2) + 0.0f;
        float interpolation = r13.A0F.getInterpolation(f2);
        C328157Ds r7 = r13.A0D;
        float Abj = (interpolation * (r7.Abj() - 0.0f)) + 0.0f;
        if (r13.A0A) {
            f3 = (float) Math.toDegrees(Math.atan(((double) Math.abs(Abj - r13.A08)) / ((double) Math.abs(f6 - r13.A07))));
            if (f2 < 0.5f) {
                f3 = Math.max(f3, Math.abs(r13.A06));
            } else if (f2 >= 1.0f) {
                f3 = 0.0f;
            }
            if (r13.A05 >= 0.0f) {
                f3 = -f3;
            }
        } else {
            f3 = r13.A06;
        }
        r7.DvS(f2, f, f6, Abj, f3);
        r13.A01 = f2;
        r13.A07 = f6;
        r13.A08 = Abj;
        r13.A09 = f3;
    }

    public final void A01() {
        2cs r0 = this.A03;
        if (r0 != null) {
            r0.A0D.clear();
            this.A03 = null;
            this.A0B.removeCallbacks(this.A0E);
        }
        this.A00 = 0.0f;
    }
}
