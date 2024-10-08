package X;

import android.util.Property;

/* renamed from: X.6Xz  reason: invalid class name and case insensitive filesystem */
public final class C309366Xz extends Property {
    public C309366Xz() {
        super(Float.class, "animationFraction");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Property property = C309346Xx.A08;
        return Float.valueOf(((C309346Xx) obj).A00);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        C3020561i r7;
        float interpolation;
        C309346Xx r6 = (C309346Xx) obj;
        float floatValue = ((Number) obj2).floatValue();
        r6.A00 = floatValue;
        int i = (int) (5400.0f * floatValue);
        float[] fArr = r6.A01;
        float f = floatValue * 1520.0f;
        fArr[0] = -20.0f + f;
        fArr[1] = f;
        int i2 = 0;
        do {
            float f2 = fArr[1];
            r7 = r6.A06;
            fArr[1] = f2 + (r7.getInterpolation(((float) (i - C309346Xx.A0B[i2])) / 667.0f) * 250.0f);
            interpolation = fArr[0] + (r7.getInterpolation(((float) (i - C309346Xx.A0A[i2])) / 667.0f) * 250.0f);
            fArr[0] = interpolation;
            i2++;
        } while (i2 < 4);
        float f3 = interpolation + ((fArr[1] - interpolation) * r6.A01);
        fArr[0] = f3;
        fArr[0] = f3 / 360.0f;
        fArr[1] = fArr[1] / 360.0f;
        int i3 = 0;
        while (true) {
            float f4 = ((float) (i - C309346Xx.A0C[i3])) / 333.0f;
            if (f4 >= 0.0f && f4 <= 1.0f) {
                int i4 = i3 + r6.A02;
                C309276Xq r4 = r6.A07;
                int[] iArr = r4.A05;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int A01 = C18108Vlc.A01(iArr[i5], r6.A00.A01);
                int A012 = C18108Vlc.A01(r4.A05[i6], r6.A00.A01);
                float interpolation2 = r7.getInterpolation(f4);
                int[] iArr2 = r6.A02;
                Integer valueOf = Integer.valueOf(A01);
                Integer valueOf2 = Integer.valueOf(A012);
                int intValue = valueOf.intValue();
                float f5 = ((float) ((intValue >> 24) & 255)) / 255.0f;
                int intValue2 = valueOf2.intValue();
                float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
                float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
                float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
                float pow5 = (float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d);
                iArr2[0] = (Math.round(((float) Math.pow((double) (pow + ((pow4 - pow) * interpolation2)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f5 + (((((float) ((intValue2 >> 24) & 255)) / 255.0f) - f5) * interpolation2)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((pow5 - pow2) * interpolation2)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) (pow3 + (interpolation2 * (((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d)) - pow3))), 0.45454545454545453d)) * 255.0f);
                break;
            }
            i3++;
            if (i3 >= 4) {
                break;
            }
        }
        r6.A00.invalidateSelf();
    }
}
