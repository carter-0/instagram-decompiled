package X;

import android.graphics.Path;

/* renamed from: X.VwP  reason: case insensitive filesystem */
public abstract class C18667VwP {
    public static void A01(Path path, C18728Vz3[] vz3Arr) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float[] fArr = new float[6];
        int length = vz3Arr.length;
        char c = 'm';
        for (int i2 = 0; i2 < length; i2++) {
            C18728Vz3 vz3 = vz3Arr[i2];
            C18728Vz3 vz32 = vz3;
            char c2 = vz32.A00;
            float[] fArr2 = vz32.A01;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            Path path2 = path;
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    f12 = f16;
                    float f18 = f17;
                    path2.moveTo(f12, f18);
                    f14 = f12;
                    f13 = f18;
                    f15 = f18;
                    break;
            }
            i = 2;
            int i3 = 0;
            while (i3 < fArr2.length) {
                if (c2 == 'A') {
                    int i4 = i3 + 5;
                    int i5 = i3 + 6;
                    C18728Vz3.A00(path2, f4, f3, fArr2[i4], fArr2[i5], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], AnonymousClass7TF.A1P((fArr2[i3 + 3] > 0.0f ? 1 : (fArr2[i3 + 3] == 0.0f ? 0 : -1))), AnonymousClass7TF.A1P((fArr2[i3 + 4] > 0.0f ? 1 : (fArr2[i3 + 4] == 0.0f ? 0 : -1))));
                    f5 = fArr2[i4];
                    f3 = fArr2[i5];
                    f2 = f3;
                    f = f4;
                } else if (c2 == 'C') {
                    int i6 = i3 + 2;
                    int i7 = i3 + 3;
                    int i8 = i3 + 4;
                    int i9 = i3 + 5;
                    path2.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                    f4 = fArr2[i8];
                    f3 = fArr2[i9];
                    f = fArr2[i6];
                    f2 = fArr2[i7];
                } else if (c2 == 'H') {
                    path2.lineTo(fArr2[i3], f3);
                    f4 = fArr2[i3];
                } else if (c2 == 'Q') {
                    int i10 = i3 + 1;
                    int i11 = i3 + 2;
                    int i12 = i3 + 3;
                    path2.quadTo(fArr2[i3], fArr2[i10], fArr2[i11], fArr2[i12]);
                    f = fArr2[i3];
                    f2 = fArr2[i10];
                    f4 = fArr2[i11];
                    f3 = fArr2[i12];
                } else if (c2 == 'V') {
                    path2.lineTo(f4, fArr2[i3]);
                    f3 = fArr2[i3];
                } else if (c2 != 'a') {
                    if (c2 == 'c') {
                        int i13 = i3 + 2;
                        int i14 = i3 + 3;
                        int i15 = i3 + 4;
                        int i16 = i3 + 5;
                        path2.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        f = fArr2[i13] + f4;
                        f2 = fArr2[i14] + f3;
                        f4 += fArr2[i15];
                        f6 = fArr2[i16];
                    } else if (c2 == 'h') {
                        path2.rLineTo(fArr2[i3], 0.0f);
                        f4 += fArr2[i3];
                    } else if (c2 != 'q') {
                        if (c2 == 'v') {
                            path2.rLineTo(0.0f, fArr2[i3]);
                            f7 = fArr2[i3];
                        } else if (c2 != 'L') {
                            if (c2 == 'M') {
                                f4 = fArr2[i3];
                                f3 = fArr2[i3 + 1];
                                if (i3 > 0) {
                                    path2.lineTo(f4, f3);
                                } else {
                                    path2.moveTo(f4, f3);
                                }
                            } else if (c2 == 'S') {
                                if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                    f4 = (f4 * 2.0f) - f;
                                    f3 = (f3 * 2.0f) - f2;
                                }
                                int i17 = i3 + 1;
                                int i18 = i3 + 2;
                                int i19 = i3 + 3;
                                path2.cubicTo(f4, f3, fArr2[i3], fArr2[i17], fArr2[i18], fArr2[i19]);
                                f = fArr2[i3];
                                f2 = fArr2[i17];
                                f4 = fArr2[i18];
                                f3 = fArr2[i19];
                            } else if (c2 == 'T') {
                                if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                    f4 = (f4 * 2.0f) - f;
                                    f3 = (f3 * 2.0f) - f2;
                                }
                                int i20 = i3 + 1;
                                path2.quadTo(f4, f3, fArr2[i3], fArr2[i20]);
                                float f19 = fArr2[i3];
                                float f20 = fArr2[i20];
                                f2 = f3;
                                f = f4;
                                f4 = f19;
                                f3 = f20;
                            } else if (c2 == 'l') {
                                int i21 = i3 + 1;
                                path2.rLineTo(fArr2[i3], fArr2[i21]);
                                f4 += fArr2[i3];
                                f7 = fArr2[i21];
                            } else if (c2 == 'm') {
                                float f21 = fArr2[i3];
                                f4 += f21;
                                float f22 = fArr2[i3 + 1];
                                f3 += f22;
                                if (i3 > 0) {
                                    path2.rLineTo(f21, f22);
                                } else {
                                    path2.rMoveTo(f21, f22);
                                }
                            } else if (c2 == 's') {
                                if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                    f8 = f4 - f;
                                    f9 = f3 - f2;
                                } else {
                                    f8 = 0.0f;
                                    f9 = 0.0f;
                                }
                                int i22 = i3 + 1;
                                int i23 = i3 + 2;
                                int i24 = i3 + 3;
                                path2.rCubicTo(f8, f9, fArr2[i3], fArr2[i22], fArr2[i23], fArr2[i24]);
                                f = fArr2[i3] + f4;
                                f2 = fArr2[i22] + f3;
                                f4 += fArr2[i23];
                                f6 = fArr2[i24];
                            } else if (c2 == 't') {
                                if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                    f10 = f4 - f;
                                    f11 = f3 - f2;
                                } else {
                                    f11 = 0.0f;
                                    f10 = 0.0f;
                                }
                                int i25 = i3 + 1;
                                path2.rQuadTo(f10, f11, fArr2[i3], fArr2[i25]);
                                f = f10 + f4;
                                f2 = f11 + f3;
                                f4 += fArr2[i3];
                                f3 += fArr2[i25];
                            }
                            f17 = f3;
                            f16 = f4;
                        } else {
                            int i26 = i3 + 1;
                            path2.lineTo(fArr2[i3], fArr2[i26]);
                            f4 = fArr2[i3];
                            f3 = fArr2[i26];
                        }
                        f3 += f7;
                    } else {
                        int i27 = i3 + 1;
                        int i28 = i3 + 2;
                        int i29 = i3 + 3;
                        path2.rQuadTo(fArr2[i3], fArr2[i27], fArr2[i28], fArr2[i29]);
                        f = fArr2[i3] + f4;
                        f2 = fArr2[i27] + f3;
                        f4 += fArr2[i28];
                        f6 = fArr2[i29];
                    }
                    f3 += f6;
                } else {
                    int i30 = i3 + 5;
                    int i31 = i3 + 6;
                    C18728Vz3.A00(path2, f4, f3, fArr2[i30] + f4, fArr2[i31] + f3, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], AnonymousClass7TF.A1P((fArr2[i3 + 3] > 0.0f ? 1 : (fArr2[i3 + 3] == 0.0f ? 0 : -1))), AnonymousClass7TF.A1P((fArr2[i3 + 4] > 0.0f ? 1 : (fArr2[i3 + 4] == 0.0f ? 0 : -1))));
                    f5 = f4 + fArr2[i30];
                    f3 += fArr2[i31];
                    f2 = f3;
                    f = f4;
                }
                i3 += i;
                c = c2;
            }
            C13989Tnp.A1V(fArr, f4, f3);
            fArr[2] = f;
            fArr[3] = f2;
            fArr[4] = f16;
            fArr[5] = f17;
            c = vz3.A00;
        }
    }

    public static Path A00(String str) {
        Path path = new Path();
        try {
            A01(path, A02(str));
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(002.A0R("Error in parsing ", str), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0095, code lost:
        r13 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C18728Vz3[] A02(java.lang.String r15) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8 = 1
            r5 = 0
            r7 = 1
            r6 = 0
        L_0x0009:
            int r3 = r15.length()
            if (r7 < r3) goto L_0x002b
            int r7 = r7 - r6
            if (r7 != r8) goto L_0x0022
            if (r6 >= r3) goto L_0x0022
            char r2 = r15.charAt(r6)
            float[] r1 = new float[r5]
            X.Vz3 r0 = new X.Vz3
            r0.<init>(r1, r2)
            r4.add(r0)
        L_0x0022:
            X.Vz3[] r0 = new X.C18728Vz3[r5]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.Vz3[] r0 = (X.C18728Vz3[]) r0
            return r0
        L_0x002b:
            if (r7 >= r3) goto L_0x0047
            char r2 = r15.charAt(r7)
            int r1 = r2 + -65
            int r0 = r2 + -90
            int r1 = r1 * r0
            if (r1 <= 0) goto L_0x003f
            int r1 = r2 + -97
            int r0 = r2 + -122
            int r1 = r1 * r0
            if (r1 > 0) goto L_0x0066
        L_0x003f:
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L_0x0066
            r0 = 69
            if (r2 == r0) goto L_0x0066
        L_0x0047:
            java.lang.String r0 = r15.substring(r6, r7)
            java.lang.String r3 = r0.trim()
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00cd
            char r1 = r3.charAt(r5)
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L_0x00bf
            char r1 = r3.charAt(r5)
            r0 = 90
            if (r1 == r0) goto L_0x00bf
            goto L_0x0069
        L_0x0066:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0069:
            int r10 = r3.length()     // Catch:{ NumberFormatException -> 0x00d9 }
            float[] r6 = new float[r10]     // Catch:{ NumberFormatException -> 0x00d9 }
            r11 = 1
            r9 = 0
        L_0x0071:
            if (r11 >= r10) goto L_0x00b3
            r14 = 0
            r2 = r11
            r13 = 0
            r12 = 0
        L_0x0077:
            if (r2 >= r10) goto L_0x0087
            char r1 = r3.charAt(r2)     // Catch:{ NumberFormatException -> 0x00d9 }
            r0 = 32
            if (r1 == r0) goto L_0x0087
            goto L_0x008a
        L_0x0082:
            if (r2 == r11) goto L_0x0095
            if (r13 != 0) goto L_0x0095
        L_0x0086:
            r14 = 1
        L_0x0087:
            if (r11 >= r2) goto L_0x00ad
            goto L_0x00a0
        L_0x008a:
            r0 = 69
            if (r1 == r0) goto L_0x009e
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x009e
            switch(r1) {
                case 44: goto L_0x0087;
                case 45: goto L_0x0082;
                case 46: goto L_0x0099;
                default: goto L_0x0095;
            }     // Catch:{ NumberFormatException -> 0x00d9 }
        L_0x0095:
            r13 = 0
        L_0x0096:
            int r2 = r2 + 1
            goto L_0x0077
        L_0x0099:
            if (r12 != 0) goto L_0x0086
            r13 = 0
            r12 = 1
            goto L_0x0096
        L_0x009e:
            r13 = 1
            goto L_0x0096
        L_0x00a0:
            int r1 = r9 + 1
            java.lang.String r0 = r3.substring(r11, r2)     // Catch:{ NumberFormatException -> 0x00d9 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x00d9 }
            r6[r9] = r0     // Catch:{ NumberFormatException -> 0x00d9 }
            r9 = r1
        L_0x00ad:
            int r11 = r2 + 1
            if (r14 == 0) goto L_0x0071
            r11 = r2
            goto L_0x0071
        L_0x00b3:
            if (r5 > r9) goto L_0x00d3
            int r1 = java.lang.Math.min(r9, r10)     // Catch:{ NumberFormatException -> 0x00d9 }
            float[] r0 = new float[r9]     // Catch:{ NumberFormatException -> 0x00d9 }
            java.lang.System.arraycopy(r6, r5, r0, r5, r1)     // Catch:{ NumberFormatException -> 0x00d9 }
            goto L_0x00c1
        L_0x00bf:
            float[] r0 = new float[r5]
        L_0x00c1:
            char r2 = r3.charAt(r5)
            X.Vz3 r1 = new X.Vz3
            r1.<init>(r0, r2)
            r4.add(r1)
        L_0x00cd:
            int r0 = r7 + 1
            r6 = r7
            r7 = r0
            goto L_0x0009
        L_0x00d3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ NumberFormatException -> 0x00d9 }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x00d9 }
            throw r0     // Catch:{ NumberFormatException -> 0x00d9 }
        L_0x00d9:
            r2 = move-exception
            java.lang.String r1 = "error in parsing \""
            java.lang.String r0 = "\""
            java.lang.String r1 = X.002.A0g(r1, r3, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18667VwP.A02(java.lang.String):X.Vz3[]");
    }
}
