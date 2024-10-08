package X;

/* renamed from: X.6T2  reason: invalid class name */
public final class AnonymousClass6T2 {
    public static final AnonymousClass6T3 A00 = new AnonymousClass6T3();

    public static C276544tV A02(AnonymousClass2TS r3) {
        if (!(r3 instanceof C276544tV)) {
            return null;
        }
        C276544tV r32 = (C276544tV) r3;
        if (r32.A07(132) == null || r32.A07(132).A04 != 13368) {
            return null;
        }
        return r32.A07(132);
    }

    public static void A03(AnonymousClass6T6 r5, Integer num, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (str.endsWith("%")) {
                A01 = AnonymousClass6Su.A00(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    AnonymousClass6T6.A00(r5, 3);
                    fArr = r5.A01;
                    int i2 = r5.A00;
                    int i3 = i2 + 1;
                    r5.A00 = i3;
                    fArr[i2] = 8.0f;
                    i = i3 + 1;
                    r5.A00 = i;
                    fArr[i3] = (float) AnonymousClass6TS.A00(num);
                } else {
                    return;
                }
            } else {
                A01 = AnonymousClass6Su.A01(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    AnonymousClass6T6.A00(r5, 3);
                    fArr = r5.A01;
                    int i4 = r5.A00;
                    int i5 = i4 + 1;
                    r5.A00 = i5;
                    fArr[i4] = 7.0f;
                    i = i5 + 1;
                    r5.A00 = i;
                    fArr[i5] = (float) AnonymousClass6TS.A00(num);
                } else {
                    return;
                }
            }
            r5.A00 = i + 1;
            fArr[i] = A01;
        } catch (C258053yO e) {
            1Kn.A00((C307786Rm) null, "BloksFlexLayoutProvider", "Error parsing padding value", e);
        }
    }

    public static void A04(AnonymousClass6T3 r5, Integer num, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (str.endsWith("%")) {
                A01 = AnonymousClass6Su.A00(str);
                if (!AnonymousClass6T3.A01(A01)) {
                    AnonymousClass6T3.A00(r5, 3);
                    fArr = r5.A01;
                    int i2 = r5.A00;
                    int i3 = i2 + 1;
                    r5.A00 = i3;
                    fArr[i2] = 25.0f;
                    i = i3 + 1;
                    r5.A00 = i;
                    fArr[i3] = (float) AnonymousClass6TS.A00(num);
                } else {
                    return;
                }
            } else if (str.equals("auto")) {
                AnonymousClass6T3.A00(r5, 2);
                float[] fArr2 = r5.A01;
                int i4 = r5.A00;
                int i5 = i4 + 1;
                r5.A00 = i5;
                fArr2[i4] = 26.0f;
                r5.A00 = i5 + 1;
                fArr2[i5] = (float) AnonymousClass6TS.A00(num);
                return;
            } else {
                A01 = AnonymousClass6Su.A01(str);
                if (!AnonymousClass6T3.A01(A01)) {
                    AnonymousClass6T3.A00(r5, 3);
                    fArr = r5.A01;
                    int i6 = r5.A00;
                    int i7 = i6 + 1;
                    r5.A00 = i7;
                    fArr[i6] = 24.0f;
                    i = i7 + 1;
                    r5.A00 = i;
                    fArr[i7] = (float) AnonymousClass6TS.A00(num);
                } else {
                    return;
                }
            }
            r5.A00 = i + 1;
            fArr[i] = A01;
        } catch (C258053yO e) {
            1Kn.A00((C307786Rm) null, "BloksFlexLayoutProvider", "Error parsing margin value", e);
        }
    }

    public static void A05(AnonymousClass6T3 r5, Integer num, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (str.endsWith("%")) {
                A01 = AnonymousClass6Su.A00(str);
                if (!AnonymousClass6T3.A01(A01)) {
                    AnonymousClass6T3.A00(r5, 3);
                    fArr = r5.A01;
                    int i2 = r5.A00;
                    int i3 = i2 + 1;
                    r5.A00 = i3;
                    fArr[i2] = 28.0f;
                    i = i3 + 1;
                    r5.A00 = i;
                    fArr[i3] = (float) AnonymousClass6TS.A00(num);
                } else {
                    return;
                }
            } else {
                A01 = AnonymousClass6Su.A01(str);
                if (!AnonymousClass6T3.A01(A01)) {
                    AnonymousClass6T3.A00(r5, 3);
                    fArr = r5.A01;
                    int i4 = r5.A00;
                    int i5 = i4 + 1;
                    r5.A00 = i5;
                    fArr[i4] = 27.0f;
                    i = i5 + 1;
                    r5.A00 = i;
                    fArr[i5] = (float) AnonymousClass6TS.A00(num);
                } else {
                    return;
                }
            }
            r5.A00 = i + 1;
            fArr[i] = A01;
        } catch (C258053yO e) {
            1Kn.A00((C307786Rm) null, "BloksFlexLayoutProvider", "Error parsing position value", e);
        }
    }

    public static float A00(C276544tV r2, float f, int i, boolean z) {
        String A0K = r2.A0K(i);
        if (A0K == null || (z && A0K.equals("auto"))) {
            return Float.NaN;
        }
        try {
            if (A0K.endsWith("%")) {
                return AnonymousClass6Su.A00(A0K) * 0.01f * f;
            }
            return AnonymousClass6Su.A01(A0K);
        } catch (C258053yO e) {
            1Kn.A00((C307786Rm) null, "BloksFlexLayoutProvider", "Error parsing size dimension value", e);
            return Float.NaN;
        }
    }

    public static float A01(C276544tV r3, int i) {
        String A0K = r3.A0K(i);
        if (A0K == null) {
            return Float.NaN;
        }
        try {
            return AnonymousClass6Su.A01(A0K);
        } catch (C258053yO e) {
            1Kn.A00((C307786Rm) null, "BloksFlexLayoutProvider", "Error parsing padding value", e);
            return Float.NaN;
        }
    }
}
