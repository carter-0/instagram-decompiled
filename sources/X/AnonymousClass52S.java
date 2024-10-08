package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.webrtc.CameraCapturer;

/* renamed from: X.52S  reason: invalid class name */
public class AnonymousClass52S extends AnonymousClass52T {
    public float A00;
    public int A01 = 0;
    public int A02 = 0;
    public PointF A03;
    public boolean A04 = false;
    public final DisplayMetrics A05;
    public final DecelerateInterpolator A06 = new DecelerateInterpolator();
    public final LinearInterpolator A07 = new LinearInterpolator();

    public void A03() {
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
    }

    public int A0C(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 >= 0) {
                return 0;
            }
            return i7;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int A0D(View view, int i) {
        C252553pI r2 = this.A02;
        if (r2 == null || !r2.A1X()) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return A0C((view.getLeft() - C252553pI.A05(view)) - marginLayoutParams.leftMargin, view.getRight() + C252553pI.A07(view) + marginLayoutParams.rightMargin, r2.Ba9(), r2.A03 - r2.BaB(), i);
    }

    public int A0E(View view, int i) {
        C252553pI r2 = this.A02;
        if (r2 == null || !r2.A1Y()) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return A0C(r2.A0W(view) - marginLayoutParams.topMargin, r2.A0V(view) + marginLayoutParams.bottomMargin, r2.BaC(), r2.A00 - r2.Ba8(), i);
    }

    public void A06(AnonymousClass52U r7, AnonymousClass3AW r8, int i, int i2) {
        if (this.A03.A0D.A0T() != 0) {
            int i3 = this.A01;
            int i4 = i3 - i;
            if (i3 * i4 <= 0) {
                i4 = 0;
            }
            this.A01 = i4;
            int i5 = this.A02;
            int i6 = i5 - i2;
            if (i5 * i6 <= 0) {
                i6 = 0;
            }
            this.A02 = i6;
            if (i4 == 0 && i6 == 0) {
                PointF A002 = A00(this.A00);
                if (A002 != null) {
                    float f = A002.x;
                    if (!(f == 0.0f && A002.y == 0.0f)) {
                        float f2 = A002.y;
                        float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
                        float f3 = f / sqrt;
                        A002.x = f3;
                        float f4 = f2 / sqrt;
                        A002.y = f4;
                        this.A03 = A002;
                        this.A01 = (int) (f3 * 10000.0f);
                        this.A02 = (int) (f4 * 10000.0f);
                        int A0B = A0B(CameraCapturer.OPEN_CAMERA_TIMEOUT);
                        r7.A00(this.A07, (int) (((float) this.A01) * 1.2f), (int) (((float) this.A02) * 1.2f), (int) (((float) A0B) * 1.2f));
                        return;
                    }
                }
                r7.A04 = this.A00;
            } else {
                return;
            }
        }
        A02();
    }

    public float A07(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int A08() {
        PointF pointF = this.A03;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        if (f > 0.0f) {
            return 1;
        }
        return -1;
    }

    public int A09() {
        PointF pointF = this.A03;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        if (f > 0.0f) {
            return 1;
        }
        return -1;
    }

    public AnonymousClass52S(Context context) {
        this.A05 = context.getResources().getDisplayMetrics();
    }

    public void A05(View view, AnonymousClass52U r8, AnonymousClass3AW r9) {
        int A0D = A0D(view, A08());
        int A0E = A0E(view, A09());
        int A0A = A0A((int) Math.sqrt((double) ((A0D * A0D) + (A0E * A0E))));
        if (A0A > 0) {
            r8.A00(this.A06, -A0D, -A0E, A0A);
        }
    }

    public int A0A(int i) {
        return (int) Math.ceil(((double) A0B(i)) / 0.3356d);
    }

    public int A0B(int i) {
        float abs = (float) Math.abs(i);
        if (!this.A04) {
            this.A00 = A07(this.A05);
            this.A04 = true;
        }
        return (int) Math.ceil((double) (abs * this.A00));
    }
}
