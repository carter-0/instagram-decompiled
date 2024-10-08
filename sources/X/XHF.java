package X;

public final class XHF extends C22025XtK implements C22554YAd {
    public String A00;
    public C39660A4a A01;
    public XZH A02;
    public final AnonymousClass8CN A03;

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0188, code lost:
        r8.add(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C391749ta E3U(X.A9Y r30, java.util.List r31) {
        /*
            r29 = this;
            r3 = 0
            r12 = 1
            r2 = r29
            boolean r0 = r2.CaO()
            if (r0 == 0) goto L_0x01b8
            X.A4a r8 = r2.A01
            if (r8 != 0) goto L_0x001d
            java.lang.String r0 = r2.A00     // Catch:{ Exception -> 0x01a8 }
            X.A4a r8 = X.C39660A4a.A00(r0, r3)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r1 = "forward"
            org.pytorch.executorch.NativePeer r0 = r8.A00     // Catch:{ Exception -> 0x01a8 }
            r0.loadMethod(r1)     // Catch:{ Exception -> 0x01a8 }
            r2.A01 = r8     // Catch:{ Exception -> 0x01a8 }
        L_0x001d:
            android.graphics.Bitmap r20 = X.C22025XtK.A01(r31)
            int r5 = r20.getWidth()
            int r4 = r20.getHeight()
            r2 = 320(0x140, float:4.48E-43)
            r0 = r20
            android.graphics.Bitmap r21 = X.0fO.A00(r0, r2, r2, r12)
            X.0qQ.A07(r21)
            int r13 = r21.getWidth()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            int r11 = r21.getHeight()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            int r10 = r11 * r13
            int[] r0 = new int[r10]     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r19 = r0
            r24 = r13
            r25 = r3
            r26 = r3
            r27 = r13
            r28 = r11
            r22 = r0
            r23 = r3
            r21.getPixels(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            int r18 = r10 * 2
            int r0 = r13 * 3
            int r0 = r0 * r11
            int r0 = r0 * 4
            java.nio.ByteBuffer r0 = X.Pxg.A13(r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            java.nio.FloatBuffer r14 = r0.asFloatBuffer()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r15 = 0
        L_0x0063:
            r9 = 2
            if (r15 >= r10) goto L_0x009b
            r6 = r19[r15]     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            int r0 = r6 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r16 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r16
            int r1 = r6 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            float r1 = r1 / r16
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r7 = (float) r6     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            float r7 = r7 / r16
            float[] r17 = X.C21947Xmc.A00     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r6 = r17[r3]     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            float r0 = r0 - r6
            float[] r6 = X.C21947Xmc.A01     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            X.C22025XtK.A06(r14, r6, r0, r3, r15)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            int r0 = r10 + r15
            r16 = r17[r12]     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            float r1 = r1 - r16
            X.C22025XtK.A06(r14, r6, r1, r12, r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            int r1 = r18 + r15
            r0 = r17[r9]     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            float r7 = r7 - r0
            X.C22025XtK.A06(r14, r6, r7, r9, r1)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            int r15 = r15 + 1
            goto L_0x0063
        L_0x009b:
            long[] r0 = X.C22025XtK.A07(r11, r13)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            org.pytorch.executorch.Tensor r0 = org.pytorch.executorch.Tensor.fromBlob((java.nio.FloatBuffer) r14, (long[]) r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            org.pytorch.executorch.EValue r0 = org.pytorch.executorch.EValue.from((org.pytorch.executorch.Tensor) r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            org.pytorch.executorch.EValue[] r1 = new org.pytorch.executorch.EValue[]{r0}     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            org.pytorch.executorch.NativePeer r0 = r8.A00     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            org.pytorch.executorch.EValue[] r1 = r0.forward(r1)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            if (r1 == 0) goto L_0x0193
            int r0 = r1.length     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            if (r0 == 0) goto L_0x0193
            r0 = r1[r3]     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            org.pytorch.executorch.Tensor r0 = r0.toTensor()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            float[] r7 = r0.getDataAsFloatArray()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            X.XqD r6 = X.C22003XqD.A00     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            X.0qQ.A0A(r7)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r8 = r2
            r9 = r2
            r10 = r5
            r11 = r4
            float[] r3 = r6.A01(r7, r8, r9, r10, r11)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            boolean r0 = X.C21947Xmc.A00(r3)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            if (r0 != 0) goto L_0x00d8
            X.XHE r0 = X.C22025XtK.A03()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            return r0
        L_0x00d8:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r0 = r30
            java.util.List r0 = r0.A00     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
        L_0x00e4:
            boolean r0 = r12.hasNext()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            if (r0 == 0) goto L_0x018d
            java.lang.Object r6 = r12.next()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            int r0 = r6.hashCode()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            switch(r0) {
                case -1630362878: goto L_0x0164;
                case -716660709: goto L_0x0151;
                case -222102746: goto L_0x0143;
                case 1315553475: goto L_0x0132;
                case 1725137378: goto L_0x00fc;
                default: goto L_0x00f7;
            }     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
        L_0x00f7:
            X.XHE r0 = X.C22025XtK.A03()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            return r0
        L_0x00fc:
            java.lang.String r0 = "MASK_BITMAP"
            boolean r0 = r6.equals(r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            if (r0 == 0) goto L_0x00f7
            int r0 = r5 * r4
            int[] r11 = new int[r0]     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r10 = 0
        L_0x0109:
            if (r10 >= r4) goto L_0x0123
            r9 = 0
        L_0x010c:
            if (r9 >= r5) goto L_0x0120
            int r2 = r10 * r5
            int r2 = r2 + r9
            r1 = r3[r2]     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            int r0 = android.graphics.Color.rgb(r0, r0, r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r11[r2] = r0     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            int r9 = r9 + 1
            goto L_0x010c
        L_0x0120:
            int r10 = r10 + 1
            goto L_0x0109
        L_0x0123:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r11, r5, r4, r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            X.0qQ.A07(r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            X.XH8 r1 = new X.XH8     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r1.<init>(r0, r6)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            goto L_0x0188
        L_0x0132:
            java.lang.String r0 = "RAW_MASK"
            boolean r0 = r6.equals(r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            if (r0 == 0) goto L_0x00f7
            X.C21947Xmc.A00(r7)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            X.JqQ r1 = new X.JqQ     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r1.<init>(r6, r7)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            goto L_0x0188
        L_0x0143:
            java.lang.String r0 = "MASK_ARRAY"
            boolean r0 = r6.equals(r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            if (r0 == 0) goto L_0x00f7
            X.JqQ r1 = new X.JqQ     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r1.<init>(r6, r3)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            goto L_0x0188
        L_0x0151:
            r0 = 1022(0x3fe, float:1.432E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            boolean r0 = r6.equals(r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            if (r0 == 0) goto L_0x00f7
            r0 = 1065353216(0x3f800000, float:1.0)
            X.JqQ r1 = X.C22025XtK.A02(r6, r8, r3, r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            goto L_0x0188
        L_0x0164:
            java.lang.String r0 = "CUTOUT_BITMAP"
            boolean r0 = r6.equals(r0)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            if (r0 == 0) goto L_0x00f7
            X.LRI r0 = X.LRI.A00     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            float[] r0 = r0.A02(r3, r5, r4)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            float[] r0 = X.LRI.A00(r0, r5, r4)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            float[] r3 = X.C21948Xmd.A00(r0, r5, r4)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            X.XqK r2 = X.C22004XqK.A00     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r1 = 0
            r0 = r20
            android.graphics.Bitmap r0 = r2.A01(r0, r1, r3)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            X.XH8 r1 = new X.XH8     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r1.<init>(r0, r6)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
        L_0x0188:
            r8.add(r1)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            goto L_0x00e4
        L_0x018d:
            X.9ZE r0 = new X.9ZE     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            r0.<init>(r8)     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            return r0
        L_0x0193:
            X.XHE r0 = X.C22025XtK.A03()     // Catch:{ CppException -> 0x01a0, Exception -> 0x0198 }
            return r0
        L_0x0198:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ETU2Net prediction java error: "
            goto L_0x01af
        L_0x01a0:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ETU2Net prediction native error: "
            goto L_0x01af
        L_0x01a8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Load model failed "
        L_0x01af:
            r1.append(r0)
            r1.append(r2)
            r1.toString()
        L_0x01b8:
            X.XHE r0 = X.C22025XtK.A03()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XHF.E3U(X.A9Y, java.util.List):X.9ta");
    }

    public final boolean CaO() {
        if (this.A00 == null || !A08()) {
            return false;
        }
        return true;
    }

    public final void CgM() {
        this.A03.AUy(new C22130Xvu(this, 1), true);
    }

    public XHF(AnonymousClass8CN r1) {
        this.A03 = r1;
    }

    public final void EfZ(XZH xzh) {
        this.A02 = xzh;
    }
}
