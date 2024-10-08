package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

public class ST4 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public PointF A05;
    public PointF A06;
    public Float A07;
    public Object A08;
    public float A09;
    public final float A0A;
    public final Interpolator A0B;
    public final Interpolator A0C;
    public final Interpolator A0D;
    public final Object A0E;
    public final S7N A0F;

    public final float A01() {
        S7N s7n = this.A0F;
        if (s7n == null) {
            return 1.0f;
        }
        float f = this.A09;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        Float f2 = this.A07;
        if (f2 == null) {
            this.A09 = 1.0f;
            return 1.0f;
        }
        float A022 = A02() + ((f2.floatValue() - this.A0A) / (s7n.A00 - s7n.A03));
        this.A09 = A022;
        return A022;
    }

    public final float A02() {
        S7N s7n = this.A0F;
        if (s7n == null) {
            return 0.0f;
        }
        float f = this.A01;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float f2 = this.A0A;
        float f3 = s7n.A03;
        float f4 = (f2 - f3) / (s7n.A00 - f3);
        this.A01 = f4;
        return f4;
    }

    public final boolean A03() {
        if (this.A0B == null && this.A0C == null && this.A0D == null) {
            return true;
        }
        return false;
    }

    public ST4(Object obj, Object obj2) {
        float A002 = A00(this);
        this.A09 = A002;
        this.A05 = null;
        this.A06 = null;
        this.A0F = null;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = A002;
        this.A07 = Float.valueOf(Float.MAX_VALUE);
    }

    public static float A00(ST4 st4) {
        st4.A02 = -3987645.8f;
        st4.A00 = -3987645.8f;
        st4.A04 = 784923401;
        st4.A03 = 784923401;
        st4.A01 = Float.MIN_VALUE;
        return Float.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Keyframe{startValue=");
        A1A.append(this.A0E);
        A1A.append(", endValue=");
        A1A.append(this.A08);
        A1A.append(", startFrame=");
        A1A.append(this.A0A);
        A1A.append(", endFrame=");
        A1A.append(this.A07);
        A1A.append(", interpolator=");
        return Pxg.A0p(this.A0B, A1A);
    }

    public ST4(Object obj) {
        float A002 = A00(this);
        this.A09 = A002;
        this.A05 = null;
        this.A06 = null;
        this.A0F = null;
        this.A0E = obj;
        this.A08 = obj;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = A002;
        this.A07 = Float.valueOf(Float.MAX_VALUE);
    }

    public ST4(Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, S7N s7n, Float f, Object obj, Object obj2, float f2) {
        this.A09 = A00(this);
        this.A05 = null;
        this.A06 = null;
        this.A0F = s7n;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = interpolator;
        this.A0C = interpolator2;
        this.A0D = interpolator3;
        this.A0A = f2;
        this.A07 = f;
    }

    public ST4(Interpolator interpolator, S7N s7n, Float f, Object obj, Object obj2, float f2) {
        this.A09 = A00(this);
        this.A05 = null;
        this.A06 = null;
        this.A0F = s7n;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = interpolator;
        this.A0C = null;
        this.A0D = null;
        this.A0A = f2;
        this.A07 = f;
    }

    public ST4(Interpolator interpolator, Interpolator interpolator2, S7N s7n, Object obj, Object obj2, float f) {
        this.A09 = A00(this);
        this.A05 = null;
        this.A06 = null;
        this.A0F = s7n;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = null;
        this.A0C = interpolator;
        this.A0D = interpolator2;
        this.A0A = f;
        this.A07 = null;
    }
}
