package X;

import com.facebook.android.maps.model.LatLng;

public final class W2R {
    public final WFU A00;
    public final AnonymousClass2R4 A01 = new Object();
    public final float[] A02 = new float[2];

    public static double A01(double d) {
        return (d + 180.0d) / 360.0d;
    }

    public static double A02(double d) {
        return (d * 360.0d) - 180.0d;
    }

    public static C18606Vuz A03(WFU wfu) {
        W2R w2r = wfu.A0J;
        C14723U4m u4m = w2r.A00.A0I;
        LatLng A04 = w2r.A04(0.0f, (float) u4m.A0E);
        LatLng A042 = w2r.A04((float) u4m.A0G, (float) u4m.A0E);
        LatLng A043 = w2r.A04(0.0f, 0.0f);
        LatLng A044 = w2r.A04((float) u4m.A0G, 0.0f);
        C18606Vuz vuz = new C18606Vuz();
        vuz.A02(A04);
        vuz.A02(A043);
        vuz.A02(A042);
        vuz.A02(A044);
        return vuz;
    }

    public final LatLng A04(float f, float f2) {
        float[] fArr = this.A02;
        A08(fArr, f, f2);
        return new LatLng(C13990Tnq.A00((double) fArr[1]), A02((double) fArr[0]));
    }

    public final void A05(AnonymousClass2R4 r9) {
        C14723U4m u4m = this.A00.A0I;
        double d = u4m.A03;
        double d2 = u4m.A01;
        r9.A03 = d - d2;
        r9.A00 = d + d2;
        double d3 = u4m.A02;
        double d4 = u4m.A00;
        double d5 = d3 - d4;
        r9.A01 = d5;
        double d6 = d3 + d4;
        r9.A02 = d6;
        if (d5 < 0.0d) {
            double ceil = (double) ((int) Math.ceil(-d5));
            r9.A01 = d5 + ceil;
            r9.A02 = d6 + ceil;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if ((r4 - r12) < (r2 - r8)) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(float[] r11, double r12, double r14) {
        /*
            r10 = this;
            X.2R4 r6 = r10.A01
            r10.A05(r6)
            double r4 = r6.A01
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0011
            double r1 = r6.A02
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002b
        L_0x0011:
            double r0 = r4 - r12
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            double r2 = (double) r0
            double r2 = r2 + r12
            double r8 = r6.A02
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            double r6 = r2 - r8
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r2 - r0
            double r4 = r4 - r12
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
        L_0x002b:
            r10.A07(r11, r12, r14)
            return
        L_0x002f:
            r12 = r2
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2R.A06(float[], double, double):void");
    }

    public final void A07(float[] fArr, double d, double d2) {
        C14723U4m u4m = this.A00.A0I;
        double d3 = u4m.A02;
        AnonymousClass2R4 r6 = this.A01;
        A05(r6);
        double d4 = r6.A01;
        if (d4 > d3 || d3 > r6.A02) {
            d3 += (double) ((int) Math.ceil(d4 - d3));
        }
        float f = (float) u4m.A0K;
        fArr[0] = ((float) (d - d3)) * f;
        fArr[1] = ((float) (d2 - u4m.A03)) * f;
        u4m.A0g.mapVectors(fArr);
        fArr[0] = fArr[0] + u4m.A04;
        fArr[1] = fArr[1] + u4m.A05;
    }

    public final void A08(float[] fArr, float f, float f2) {
        C14723U4m u4m = this.A00.A0I;
        fArr[0] = f - u4m.A04;
        fArr[1] = f2 - u4m.A05;
        u4m.A0h.mapVectors(fArr);
        double d = u4m.A02;
        double d2 = (double) fArr[0];
        double d3 = (double) u4m.A0K;
        double d4 = d + (d2 / d3);
        double d5 = u4m.A03 + (((double) fArr[1]) / d3);
        if (d4 > 1.0d) {
            d4 -= 1.0d;
        } else if (d4 < 0.0d) {
            d4 += 1.0d;
        }
        fArr[0] = (float) d4;
        fArr[1] = (float) d5;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2R4, java.lang.Object] */
    public W2R(WFU wfu) {
        this.A00 = wfu;
    }

    public static double A00(double d) {
        double sin = Math.sin(C13989Tnp.A00(d));
        return 0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d);
    }
}
