package X;

import java.util.Arrays;

/* renamed from: X.2hf  reason: invalid class name and case insensitive filesystem */
public final class C226672hf {
    public static final C226672hf A04 = new C226672hf((float[]) null, 0.0f, true, false);
    public static final C226672hf A05 = new C226672hf((float[]) null, 0.0f, true, true);
    public final float A00;
    public final boolean A01;
    public final boolean A02;
    public final float[] A03;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!0qQ.A0K(cls2, cls)) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.options.RoundingOptions");
        C226672hf r4 = (C226672hf) obj;
        return this.A02 == r4.A02 && this.A00 == r4.A00 && Arrays.equals(this.A03, r4.A03) && this.A01 == r4.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RoundingOptions(isCircular=");
        sb.append(this.A02);
        sb.append(C66579MXk.A00(79));
        sb.append(this.A00);
        sb.append(", cornerRadii=");
        sb.append(Arrays.toString(this.A03));
        sb.append(", isAntiAliased=");
        sb.append(this.A01);
        sb.append(", isForceRoundAtDecode=");
        sb.append(false);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int floatToIntBits = ((((i * 31) + Float.floatToIntBits(this.A00)) * 31) + Arrays.hashCode(this.A03)) * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return ((floatToIntBits + i2) * 31) + 1237;
    }

    public C226672hf(float[] fArr, float f, boolean z, boolean z2) {
        this.A02 = z;
        this.A00 = f;
        this.A03 = fArr;
        this.A01 = z2;
    }
}
