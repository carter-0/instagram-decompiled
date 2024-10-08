package X;

public final class XHI extends C22025XtK implements C22554YAd {
    public String A00;
    public C348037xm A01;
    public XZH A02;
    public final AnonymousClass8CN A03;

    public static final boolean A00(float[] fArr) {
        int length = fArr.length;
        int i = 1;
        if (length == 0) {
            return false;
        }
        float f = fArr[0];
        float f2 = f;
        int i2 = length - 1;
        if (1 <= i2) {
            while (true) {
                f = Math.max(f, fArr[i]);
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        Float valueOf = Float.valueOf(f);
        if (valueOf == null) {
            return false;
        }
        float floatValue = valueOf.floatValue();
        int i3 = 1;
        if (1 <= i2) {
            while (true) {
                f2 = Math.min(f2, fArr[i3]);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        Float valueOf2 = Float.valueOf(f2);
        if (valueOf2 == null) {
            return false;
        }
        float floatValue2 = valueOf2.floatValue();
        for (int i4 = 0; i4 < length; i4++) {
            float f3 = (fArr[i4] - floatValue2) / (floatValue - floatValue2);
            fArr[i4] = f3;
            float f4 = 0.0f;
            if (f3 > 0.5f) {
                f4 = 1.0f;
            }
            fArr[i4] = f4;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017c, code lost:
        r8.add(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C391749ta E3U(X.A9Y r30, java.util.List r31) {
        /*
            r29 = this;
            r3 = 0
            r12 = 1
            r1 = r29
            boolean r0 = r1.CaO()
            if (r0 == 0) goto L_0x019f
            X.7xm r7 = r1.A01
            if (r7 != 0) goto L_0x0016
            java.lang.String r0 = r1.A00     // Catch:{ Exception -> 0x018f }
            X.7xm r7 = X.C347997xi.A00(r0)     // Catch:{ Exception -> 0x018f }
            r1.A01 = r7     // Catch:{ Exception -> 0x018f }
        L_0x0016:
            android.graphics.Bitmap r20 = X.C22025XtK.A01(r31)
            int r5 = r20.getWidth()
            int r4 = r20.getHeight()
            r2 = 320(0x140, float:4.48E-43)
            r0 = r20
            android.graphics.Bitmap r21 = X.0fO.A00(r0, r2, r2, r12)
            X.0qQ.A07(r21)
            int r13 = r21.getWidth()     // Catch:{ Exception -> 0x0187 }
            int r11 = r21.getHeight()     // Catch:{ Exception -> 0x0187 }
            int r10 = r11 * r13
            int[] r0 = new int[r10]     // Catch:{ Exception -> 0x0187 }
            r19 = r0
            r24 = r13
            r25 = r3
            r26 = r3
            r27 = r13
            r28 = r11
            r22 = r0
            r23 = r3
            r21.getPixels(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0187 }
            int r18 = r10 * 2
            int r0 = r13 * 3
            int r0 = r0 * r11
            java.nio.FloatBuffer r9 = org.pytorch.Tensor.allocateFloatBuffer(r0)     // Catch:{ Exception -> 0x0187 }
            r15 = 0
        L_0x0056:
            r14 = 2
            if (r15 >= r10) goto L_0x008e
            r6 = r19[r15]     // Catch:{ Exception -> 0x0187 }
            int r0 = r6 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0     // Catch:{ Exception -> 0x0187 }
            r16 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r16
            int r1 = r6 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1     // Catch:{ Exception -> 0x0187 }
            float r1 = r1 / r16
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r8 = (float) r6     // Catch:{ Exception -> 0x0187 }
            float r8 = r8 / r16
            float[] r17 = X.XYS.A00     // Catch:{ Exception -> 0x0187 }
            r6 = r17[r3]     // Catch:{ Exception -> 0x0187 }
            float r0 = r0 - r6
            float[] r6 = X.XYS.A01     // Catch:{ Exception -> 0x0187 }
            X.C22025XtK.A06(r9, r6, r0, r3, r15)     // Catch:{ Exception -> 0x0187 }
            int r0 = r10 + r15
            r16 = r17[r12]     // Catch:{ Exception -> 0x0187 }
            float r1 = r1 - r16
            X.C22025XtK.A06(r9, r6, r1, r12, r0)     // Catch:{ Exception -> 0x0187 }
            int r1 = r18 + r15
            r0 = r17[r14]     // Catch:{ Exception -> 0x0187 }
            float r8 = r8 - r0
            X.C22025XtK.A06(r9, r6, r8, r14, r1)     // Catch:{ Exception -> 0x0187 }
            int r15 = r15 + 1
            goto L_0x0056
        L_0x008e:
            long[] r1 = X.C22025XtK.A07(r11, r13)     // Catch:{ Exception -> 0x0187 }
            X.XF6 r0 = X.XF6.CONTIGUOUS     // Catch:{ Exception -> 0x0187 }
            org.pytorch.Tensor r0 = org.pytorch.Tensor.fromBlob((java.nio.FloatBuffer) r9, (long[]) r1, (X.XF6) r0)     // Catch:{ Exception -> 0x0187 }
            org.pytorch.IValue r0 = org.pytorch.IValue.from((org.pytorch.Tensor) r0)     // Catch:{ Exception -> 0x0187 }
            org.pytorch.IValue[] r1 = new org.pytorch.IValue[]{r0}     // Catch:{ Exception -> 0x0187 }
            X.8EJ r0 = r7.A00     // Catch:{ Exception -> 0x0187 }
            org.pytorch.IValue r0 = r0.forward(r1)     // Catch:{ Exception -> 0x0187 }
            org.pytorch.IValue[] r0 = r0.toTuple()     // Catch:{ Exception -> 0x0187 }
            r0 = r0[r3]     // Catch:{ Exception -> 0x0187 }
            org.pytorch.Tensor r0 = r0.toTensor()     // Catch:{ Exception -> 0x0187 }
            float[] r7 = r0.getDataAsFloatArray()     // Catch:{ Exception -> 0x0187 }
            X.XqD r6 = X.C22003XqD.A00     // Catch:{ Exception -> 0x0187 }
            X.0qQ.A0A(r7)     // Catch:{ Exception -> 0x0187 }
            r8 = r2
            r9 = r2
            r10 = r5
            r11 = r4
            float[] r3 = r6.A01(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0187 }
            boolean r0 = A00(r3)     // Catch:{ Exception -> 0x0187 }
            if (r0 != 0) goto L_0x00cc
            X.XHE r0 = X.C22025XtK.A03()     // Catch:{ Exception -> 0x0187 }
            return r0
        L_0x00cc:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x0187 }
            r0 = r30
            java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x0187 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ Exception -> 0x0187 }
        L_0x00d8:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x0181
            java.lang.Object r6 = r12.next()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0187 }
            int r0 = r6.hashCode()     // Catch:{ Exception -> 0x0187 }
            switch(r0) {
                case -1630362878: goto L_0x0158;
                case -716660709: goto L_0x0145;
                case -222102746: goto L_0x0137;
                case 1315553475: goto L_0x0126;
                case 1725137378: goto L_0x00f0;
                default: goto L_0x00eb;
            }     // Catch:{ Exception -> 0x0187 }
        L_0x00eb:
            X.XHE r0 = X.C22025XtK.A03()     // Catch:{ Exception -> 0x0187 }
            return r0
        L_0x00f0:
            java.lang.String r0 = "MASK_BITMAP"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x00eb
            int r0 = r5 * r4
            int[] r11 = new int[r0]     // Catch:{ Exception -> 0x0187 }
            r10 = 0
        L_0x00fd:
            if (r10 >= r4) goto L_0x0117
            r9 = 0
        L_0x0100:
            if (r9 >= r5) goto L_0x0114
            int r2 = r10 * r5
            int r2 = r2 + r9
            r1 = r3[r2]     // Catch:{ Exception -> 0x0187 }
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1     // Catch:{ Exception -> 0x0187 }
            int r0 = android.graphics.Color.rgb(r0, r0, r0)     // Catch:{ Exception -> 0x0187 }
            r11[r2] = r0     // Catch:{ Exception -> 0x0187 }
            int r9 = r9 + 1
            goto L_0x0100
        L_0x0114:
            int r10 = r10 + 1
            goto L_0x00fd
        L_0x0117:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0187 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r11, r5, r4, r0)     // Catch:{ Exception -> 0x0187 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x0187 }
            X.XH8 r1 = new X.XH8     // Catch:{ Exception -> 0x0187 }
            r1.<init>(r0, r6)     // Catch:{ Exception -> 0x0187 }
            goto L_0x017c
        L_0x0126:
            java.lang.String r0 = "RAW_MASK"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x00eb
            A00(r7)     // Catch:{ Exception -> 0x0187 }
            X.JqQ r1 = new X.JqQ     // Catch:{ Exception -> 0x0187 }
            r1.<init>(r6, r7)     // Catch:{ Exception -> 0x0187 }
            goto L_0x017c
        L_0x0137:
            java.lang.String r0 = "MASK_ARRAY"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x00eb
            X.JqQ r1 = new X.JqQ     // Catch:{ Exception -> 0x0187 }
            r1.<init>(r6, r3)     // Catch:{ Exception -> 0x0187 }
            goto L_0x017c
        L_0x0145:
            r0 = 1022(0x3fe, float:1.432E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x0187 }
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x00eb
            r0 = 1065353216(0x3f800000, float:1.0)
            X.JqQ r1 = X.C22025XtK.A02(r6, r8, r3, r0)     // Catch:{ Exception -> 0x0187 }
            goto L_0x017c
        L_0x0158:
            java.lang.String r0 = "CUTOUT_BITMAP"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x00eb
            X.LRI r0 = X.LRI.A00     // Catch:{ Exception -> 0x0187 }
            float[] r0 = r0.A02(r3, r5, r4)     // Catch:{ Exception -> 0x0187 }
            float[] r0 = X.LRI.A00(r0, r5, r4)     // Catch:{ Exception -> 0x0187 }
            float[] r3 = X.C21948Xmd.A00(r0, r5, r4)     // Catch:{ Exception -> 0x0187 }
            X.XqK r2 = X.C22004XqK.A00     // Catch:{ Exception -> 0x0187 }
            r1 = 0
            r0 = r20
            android.graphics.Bitmap r0 = r2.A01(r0, r1, r3)     // Catch:{ Exception -> 0x0187 }
            X.XH8 r1 = new X.XH8     // Catch:{ Exception -> 0x0187 }
            r1.<init>(r0, r6)     // Catch:{ Exception -> 0x0187 }
        L_0x017c:
            r8.add(r1)     // Catch:{ Exception -> 0x0187 }
            goto L_0x00d8
        L_0x0181:
            X.9ZE r0 = new X.9ZE     // Catch:{ Exception -> 0x0187 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0187 }
            return r0
        L_0x0187:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Prediction Error "
            goto L_0x0196
        L_0x018f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Load model failed "
        L_0x0196:
            r1.append(r0)
            r1.append(r2)
            r1.toString()
        L_0x019f:
            X.XHE r0 = X.C22025XtK.A03()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XHI.E3U(X.A9Y, java.util.List):X.9ta");
    }

    public final boolean CaO() {
        if (this.A00 == null || !A08()) {
            return false;
        }
        return true;
    }

    public final void CgM() {
        C22025XtK.A05(this.A03, this, 7);
    }

    public XHI(AnonymousClass8CN r1) {
        this.A03 = r1;
    }

    public final void EfZ(XZH xzh) {
        this.A02 = xzh;
    }
}
