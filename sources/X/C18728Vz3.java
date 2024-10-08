package X;

import android.graphics.Path;
import android.util.Log;

/* renamed from: X.Vz3  reason: case insensitive filesystem */
public final class C18728Vz3 {
    public char A00;
    public final float[] A01;

    public static void A00(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        float f8 = f7;
        double radians = Math.toRadians((double) f8);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        float f9 = f;
        double d3 = (double) f9;
        double d4 = d3;
        double d5 = d3 * cos;
        float f10 = f2;
        double d6 = (double) f10;
        double d7 = (double) f5;
        double d8 = (d5 + (d6 * sin)) / d7;
        double d9 = (double) f6;
        double d10 = ((((double) (-f9)) * sin) + (d6 * cos)) / d9;
        float f11 = f3;
        float f12 = f4;
        double d11 = (double) f12;
        double d12 = ((((double) f11) * cos) + (d11 * sin)) / d7;
        double d13 = ((((double) (-f11)) * sin) + (d11 * cos)) / d9;
        double d14 = d8 - d12;
        double d15 = d10 - d13;
        double d16 = (d8 + d12) / 2.0d;
        double d17 = (d10 + d13) / 2.0d;
        double d18 = (d14 * d14) + (d15 * d15);
        if (d18 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        Path path2 = path;
        boolean z3 = z;
        boolean z4 = z2;
        if (d19 < 0.0d) {
            Log.w("PathParser", 002.A0M("Points are too far apart ", d18));
            float sqrt = (float) (Math.sqrt(d18) / 1.99999d);
            A00(path2, f9, f10, f11, f12, f5 * sqrt, f6 * sqrt, f8, z3, z4);
            return;
        }
        double sqrt2 = Math.sqrt(d19);
        double d20 = d14 * sqrt2;
        double d21 = sqrt2 * d15;
        boolean z5 = z4;
        if (z3 == z5) {
            d = d16 - d21;
            d2 = d17 + d20;
        } else {
            d = d16 + d21;
            d2 = d17 - d20;
        }
        double atan2 = Math.atan2(d10 - d2, d8 - d);
        double atan22 = Math.atan2(d13 - d2, d12 - d) - atan2;
        if (z5 != Pxf.A1R((atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1)))) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d22 = d * d7;
        double d23 = d2 * d9;
        double d24 = (d22 * cos) - (d23 * sin);
        double d25 = (d22 * sin) + (d23 * cos);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(atan2);
        double sin2 = Math.sin(atan2);
        double d26 = -d7;
        double d27 = d26 * cos;
        double d28 = d9 * sin;
        double d29 = (d27 * sin2) - (d28 * cos2);
        double d30 = d26 * sin;
        double d31 = d9 * cos;
        double d32 = (sin2 * d30) + (cos2 * d31);
        double d33 = atan22 / ((double) ceil);
        int i = 0;
        while (true) {
            double d34 = d6;
            if (i < ceil) {
                double d35 = atan2 + d33;
                double sin3 = Math.sin(d35);
                double cos3 = Math.cos(d35);
                double d36 = (d24 + ((d7 * cos) * cos3)) - (d28 * sin3);
                d6 = d25 + (d7 * sin * cos3) + (d31 * sin3);
                double d37 = (d27 * sin3) - (d28 * cos3);
                double d38 = (sin3 * d30) + (cos3 * d31);
                double d39 = d35 - atan2;
                double tan = Math.tan(d39 / 2.0d);
                double sin4 = (Math.sin(d39) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d40 = d36 - (sin4 * d37);
                double d41 = d6 - (sin4 * d38);
                path2.rLineTo(0.0f, 0.0f);
                path2.cubicTo((float) (d4 + (d29 * sin4)), (float) (d34 + (d32 * sin4)), (float) d40, (float) d41, (float) d36, (float) d6);
                i++;
                d4 = d36;
                atan2 = d35;
                d32 = d38;
                d29 = d37;
            } else {
                return;
            }
        }
    }

    public C18728Vz3(C18728Vz3 vz3) {
        this.A00 = vz3.A00;
        float[] fArr = vz3.A01;
        int length = fArr.length;
        int min = Math.min(length, length);
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        this.A01 = fArr2;
    }

    public C18728Vz3(float[] fArr, char c) {
        this.A00 = c;
        this.A01 = fArr;
    }
}
