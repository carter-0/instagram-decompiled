package X;

import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: X.Wpy  reason: case insensitive filesystem */
public final class C20359Wpy implements Runnable {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public Matrix A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public float A0B;
    public float A0C;
    public float[] A0D = new float[2];
    public final View A0E;
    public final OverScroller A0F;
    public final X0M A0G;

    public final void run() {
        boolean z;
        int i;
        int i2;
        if (!this.A06) {
            if (!this.A0A) {
                if (this.A07) {
                    this.A0F.forceFinished(true);
                    this.A01 = 0.0f;
                } else if (this.A08) {
                    this.A0F.forceFinished(true);
                    this.A00 = 0.0f;
                }
                this.A08 = false;
                this.A07 = false;
                this.A0A = true;
            }
            OverScroller overScroller = this.A0F;
            if (overScroller.computeScrollOffset()) {
                float[] fArr = this.A0D;
                fArr[0] = (float) overScroller.getCurrX();
                fArr[1] = (float) overScroller.getCurrY();
                Matrix matrix = this.A04;
                if (matrix != null) {
                    matrix.mapPoints(fArr);
                }
                float f = fArr[0];
                float f2 = fArr[1];
                if (this.A09) {
                    this.A09 = false;
                    this.A0B = f;
                    this.A0C = f2;
                }
                X0M x0m = this.A0G;
                float f3 = f - this.A0B;
                float f4 = f2 - this.A0C;
                C14723U4m u4m = (C14723U4m) x0m;
                double d = u4m.A02;
                long j = u4m.A0K;
                float f5 = (float) j;
                u4m.A02 = C14723U4m.A00(d - ((double) (f3 / f5)));
                u4m.A03 = u4m.A0E(j, u4m.A03 - ((double) (f4 / f5)));
                this.A0B = f;
                this.A0C = f2;
                z = true;
            } else {
                z = false;
            }
            double d2 = (double) this.A01;
            if (d2 < -0.01d || d2 > 0.01d) {
                long j2 = this.A03;
                int i3 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                long uptimeMillis = SystemClock.uptimeMillis();
                if (i3 == 0) {
                    this.A03 = uptimeMillis;
                    i2 = 1;
                } else {
                    i2 = ((int) (uptimeMillis - j2)) / 10;
                    this.A03 = j2 + ((long) (i2 * 10));
                }
                float pow = (float) (d2 * Math.pow(0.9150000214576721d, (double) i2));
                this.A01 = pow;
                C14723U4m u4m2 = (C14723U4m) this.A0G;
                float f6 = u4m2.A08;
                float f7 = u4m2.A09;
                float f8 = u4m2.A0C * (pow + 1.0f);
                int i4 = u4m2.A0H;
                while (f8 > 2.0f) {
                    f8 /= 2.0f;
                    i4++;
                }
                while (f8 < 1.0f) {
                    f8 *= 2.0f;
                    i4--;
                }
                if (u4m2.A0H((((float) i4) + f8) - 1.0f, f6, f7)) {
                    z = true;
                } else {
                    this.A01 = 0.0f;
                }
            }
            double d3 = (double) this.A00;
            if (d3 < -0.01d || d3 > 0.01d) {
                long j3 = this.A02;
                int i5 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
                long uptimeMillis2 = SystemClock.uptimeMillis();
                if (i5 == 0) {
                    this.A02 = uptimeMillis2;
                    i = 1;
                } else {
                    i = ((int) (uptimeMillis2 - j3)) / 10;
                    this.A02 = j3 + ((long) (i * 10));
                }
                float pow2 = (float) (d3 * Math.pow(0.8500000238418579d, (double) i));
                this.A00 = pow2;
                C14723U4m u4m3 = (C14723U4m) this.A0G;
                u4m3.A0F(u4m3.A0B + pow2, u4m3.A08, u4m3.A09);
            } else if (!z) {
                this.A0A = false;
                this.A05 = false;
            }
            View view = this.A0E;
            view.invalidate();
            view.postOnAnimation(this);
            return;
        }
        C14723U4m u4m4 = (C14723U4m) this.A0G;
        u4m4.A0M.A05();
        C14723U4m.A0A(u4m4);
    }

    public C20359Wpy(View view, X0M x0m) {
        this.A0E = view;
        this.A0G = x0m;
        OverScroller overScroller = new OverScroller(view.getContext());
        this.A0F = overScroller;
        overScroller.setFriction(0.035f);
    }
}
