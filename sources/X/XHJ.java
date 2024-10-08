package X;

public final class XHJ extends C22025XtK implements YAP {
    public XZI A00;
    public String A01;
    public C39660A4a A02;
    public final AnonymousClass8CN A03;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C391749ta E3U(X.A9Y r23, java.util.List r24) {
        /*
            r22 = this;
            r9 = 0
            r6 = 1
            r7 = r22
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x02f3
            boolean r0 = r7.A08()
            if (r0 == 0) goto L_0x02f3
            X.A4a r8 = r7.A02
            if (r8 != 0) goto L_0x0021
            java.lang.String r0 = r7.A01     // Catch:{ Exception -> 0x02e3 }
            X.A4a r8 = X.C39660A4a.A00(r0, r9)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r1 = "forward"
            org.pytorch.executorch.NativePeer r0 = r8.A00     // Catch:{ Exception -> 0x02e3 }
            r0.loadMethod(r1)     // Catch:{ Exception -> 0x02e3 }
            r7.A02 = r8     // Catch:{ Exception -> 0x02e3 }
        L_0x0021:
            r11 = r24
            android.graphics.Bitmap r3 = X.C22025XtK.A01(r11)
            int r2 = r3.getWidth()
            int r1 = r3.getHeight()
            r4 = 512(0x200, float:7.175E-43)
            if (r2 != r4) goto L_0x01d4
            if (r1 != r4) goto L_0x01d4
            android.graphics.Bitmap$Config r0 = r3.getConfig()
            X.0qQ.A0A(r0)
            android.graphics.Bitmap r13 = r3.copy(r0, r6)
        L_0x0040:
            X.0qQ.A0A(r13)
            X.XqC r21 = X.C22002XqC.A00
            X.0qQ.A0B(r13, r9)
            r0 = 3145728(0x300000, float:4.408104E-39)
            java.nio.ByteBuffer r0 = X.Pxg.A13(r0)
            java.nio.FloatBuffer r10 = r0.asFloatBuffer()
            X.0qQ.A07(r10)
            r12 = 262144(0x40000, float:3.67342E-40)
            int[] r5 = new int[r12]
            r14 = r5
            r15 = r9
            r16 = r4
            r17 = r9
            r18 = r9
            r19 = r4
            r20 = r4
            r13.getPixels(r14, r15, r16, r17, r18, r19, r20)
            r13 = 0
        L_0x0069:
            r4 = r5[r13]
            int r0 = r4 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r15 = (float) r0
            r16 = 1132396544(0x437f0000, float:255.0)
            float r15 = r15 / r16
            int r0 = r4 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r14 = (float) r0
            float r14 = r14 / r16
            r0 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r0
            float r4 = r4 / r16
            r10.put(r13, r15)
            int r0 = r12 + r13
            r10.put(r0, r14)
            r0 = 524288(0x80000, float:7.34684E-40)
            int r0 = r0 + r13
            r10.put(r0, r4)
            int r13 = r13 + 1
            if (r13 < r12) goto L_0x0069
            r12 = 4
            long[] r0 = new long[r12]
            r4 = 1
            r0[r9] = r4
            r4 = 3
            r0[r6] = r4
            r4 = 512(0x200, double:2.53E-321)
            r20 = 2
            r0[r20] = r4
            r17 = 3
            r0[r17] = r4
            org.pytorch.executorch.Tensor r19 = org.pytorch.executorch.Tensor.fromBlob((java.nio.FloatBuffer) r10, (long[]) r0)
            java.lang.Object r0 = r11.get(r6)
            boolean r0 = r0 instanceof X.XH7
            java.lang.String r18 = "null cannot be cast to non-null type com.aiplatform.inputs.AiInputRect"
            java.lang.String r10 = "null cannot be cast to non-null type com.aiplatform.inputs.AiInputPointFs"
            if (r0 == 0) goto L_0x017c
            r0 = r18
            java.lang.Object r0 = X.C22025XtK.A04(r0, r11, r6)
            X.XH7 r0 = (X.XH7) r0
            android.graphics.Rect r5 = r0.A00
            X.0qQ.A0B(r5, r9)
            int r0 = r5.left
            float r15 = (float) r0
            float r0 = (float) r2
            float r15 = r15 / r0
            r16 = 1140850688(0x44000000, float:512.0)
            float r15 = r15 * r16
            int r4 = r5.top
            float r14 = (float) r4
            float r4 = (float) r1
            float r14 = r14 / r4
            float r14 = r14 * r16
            int r13 = r5.right
            float r13 = (float) r13
            float r13 = r13 / r0
            float r13 = r13 * r16
            int r0 = r5.bottom
            float r5 = (float) r0
            float r5 = r5 / r4
            float r5 = r5 * r16
            r0 = 10
            float[] r4 = new float[r0]
            r4[r9] = r15
            r4[r6] = r14
            r4[r20] = r13
            r4[r17] = r5
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4[r12] = r5
            r0 = 5
            r4[r0] = r5
            r0 = 6
            r4[r0] = r5
            r0 = 7
            r4[r0] = r5
            r0 = 8
            r4[r0] = r5
            r0 = 9
            r4[r0] = r5
            long[] r0 = new long[r12]
            r0 = {1, 1, 5, 2} // fill-array
        L_0x0106:
            org.pytorch.executorch.Tensor r16 = org.pytorch.executorch.Tensor.fromBlob((float[]) r4, (long[]) r0)
            java.lang.Object r0 = r11.get(r6)
            boolean r0 = r0 instanceof X.XH7
            java.lang.Object r4 = r11.get(r6)
            if (r0 == 0) goto L_0x0152
            r0 = r18
            X.0qQ.A0C(r4, r0)
            r0 = 5
            int[] r11 = new int[r0]
            r11 = {2, 3, -1, -1, -1} // fill-array
            r15 = 3
            long[] r10 = new long[r15]
            r10 = {1, 1, 5} // fill-array
        L_0x0127:
            org.pytorch.executorch.Tensor.checkShape(r10)
            int r0 = r11.length
            org.pytorch.executorch.Tensor.checkShapeAndDataCapacityConsistency(r0, r10)
            org.pytorch.executorch.Tensor.checkShape(r10)
            r14 = 1
            r0 = 0
        L_0x0133:
            r12 = r10[r0]
            long r4 = (long) r14
            long r4 = r4 * r12
            int r14 = (int) r4
            int r0 = r0 + 1
            if (r0 < r15) goto L_0x0133
            long r4 = (long) r14
            int r0 = (int) r4
            int r0 = r0 * 4
            java.nio.ByteBuffer r0 = X.Pxg.A13(r0)
            java.nio.IntBuffer r4 = r0.asIntBuffer()
            r4.put(r11)
            X.Y7e r0 = new X.Y7e
            r0.<init>(r4, r10)
            goto L_0x01da
        L_0x0152:
            X.0qQ.A0C(r4, r10)
            X.XH6 r4 = (X.XH6) r4
            java.util.List r11 = r4.A00
            X.0qQ.A0B(r11, r9)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            r5 = 0
        L_0x0161:
            int r4 = r11.size()
            r0 = -1
            if (r5 >= r4) goto L_0x0169
            r0 = 1
        L_0x0169:
            X.AnonymousClass7TF.A1M(r10, r0)
            int r5 = r5 + 1
            r0 = 5
            if (r5 < r0) goto L_0x0161
            int[] r11 = X.00k.A0x(r10)
            r15 = 3
            long[] r10 = new long[r15]
            r10 = {1, 1, 5} // fill-array
            goto L_0x0127
        L_0x017c:
            java.lang.Object r0 = X.C22025XtK.A04(r10, r11, r6)
            X.XH6 r0 = (X.XH6) r0
            java.util.List r0 = r0.A00
            X.0qQ.A0B(r0, r9)
            r13 = 5
            java.util.List r0 = X.00k.A0h(r0, r13)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r0.iterator()
            r4 = 0
        L_0x0195:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r0 = r17.next()
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r15 = r0.x
            float r14 = (float) r2
            float r15 = r15 / r14
            r16 = 1140850688(0x44000000, float:512.0)
            float r15 = r15 * r16
            float r14 = r0.y
            float r0 = (float) r1
            float r14 = r14 / r0
            float r14 = r14 * r16
            X.JTP.A1V(r5, r15)
            X.JTP.A1V(r5, r14)
            int r4 = r4 + 1
            goto L_0x0195
        L_0x01b8:
            if (r4 >= r13) goto L_0x01c9
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            r5.add(r0)
            int r4 = r4 + 1
            goto L_0x01b8
        L_0x01c9:
            float[] r4 = X.00k.A0w(r5)
            long[] r0 = new long[r12]
            r0 = {1, 1, 5, 2} // fill-array
            goto L_0x0106
        L_0x01d4:
            android.graphics.Bitmap r13 = X.0fO.A00(r3, r4, r4, r6)
            goto L_0x0040
        L_0x01da:
            org.pytorch.executorch.EValue r5 = org.pytorch.executorch.EValue.from((org.pytorch.executorch.Tensor) r19)     // Catch:{ CppException -> 0x02db, Exception -> 0x02d3 }
            r12 = 0
            org.pytorch.executorch.EValue r4 = org.pytorch.executorch.EValue.from((org.pytorch.executorch.Tensor) r16)     // Catch:{ CppException -> 0x02db, Exception -> 0x02d3 }
            org.pytorch.executorch.EValue r0 = org.pytorch.executorch.EValue.from((org.pytorch.executorch.Tensor) r0)     // Catch:{ CppException -> 0x02db, Exception -> 0x02d3 }
            org.pytorch.executorch.EValue[] r4 = new org.pytorch.executorch.EValue[]{r5, r4, r0}     // Catch:{ CppException -> 0x02db, Exception -> 0x02d3 }
            org.pytorch.executorch.NativePeer r0 = r8.A00     // Catch:{ CppException -> 0x02db, Exception -> 0x02d3 }
            org.pytorch.executorch.EValue[] r8 = r0.forward(r4)     // Catch:{ CppException -> 0x02db, Exception -> 0x02d3 }
            if (r8 == 0) goto L_0x02f3
            int r0 = r8.length
            if (r0 == 0) goto L_0x02f3
            X.XZI r0 = r7.A00
            if (r0 == 0) goto L_0x0206
            X.XaQ r0 = r0.A00
            X.02m r5 = r0.A01
            r4 = 900939300(0x35b33e24, float:1.3354625E-6)
            java.lang.String r0 = "segmentation_finished"
            r5.markerPoint(r4, r0)
        L_0x0206:
            r7 = 0
            r0 = r8[r9]
            org.pytorch.executorch.Tensor r0 = r0.toTensor()
            float[] r11 = r0.getDataAsFloatArray()
            r0 = r8[r6]
            org.pytorch.executorch.Tensor r0 = r0.toTensor()
            float[] r10 = r0.getDataAsFloatArray()
            int r9 = r10.length
            r8 = 0
            r6 = 0
            r5 = 0
        L_0x021f:
            if (r12 >= r9) goto L_0x022c
            r4 = r10[r12]
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0229
            r6 = r12
            r5 = r4
        L_0x0229:
            int r12 = r12 + 1
            goto L_0x021f
        L_0x022c:
            r0 = 65536(0x10000, float:9.18355E-41)
            int r5 = r6 * r0
            int r4 = r6 + 1
            int r4 = r4 * r0
            if (r5 < 0) goto L_0x02f3
            int r0 = r11.length
            if (r5 >= r0) goto L_0x02f3
            if (r4 < 0) goto L_0x02f3
            if (r4 > r0) goto L_0x02f3
            X.AnonymousClass0gZ.A0b(r4, r0)
            float[] r10 = java.util.Arrays.copyOfRange(r11, r5, r4)
            X.0qQ.A07(r10)
            X.XqD r9 = X.C22003XqD.A00
            r11 = 256(0x100, float:3.59E-43)
            r12 = r11
            r13 = r2
            r14 = r1
            float[] r6 = r9.A01(r10, r11, r12, r13, r14)
            int r4 = r6.length
        L_0x0252:
            if (r7 >= r4) goto L_0x0264
            r0 = r6[r7]
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0261
            r0 = 1065353216(0x3f800000, float:1.0)
            r6[r7] = r0
        L_0x025e:
            int r7 = r7 + 1
            goto L_0x0252
        L_0x0261:
            r6[r7] = r8
            goto L_0x025e
        L_0x0264:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r0 = r23
            java.util.List r0 = r0.A00
            java.util.Iterator r8 = r0.iterator()
        L_0x0270:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02cd
            java.lang.String r4 = X.AnonymousClass7TE.A18(r8)
            int r0 = r4.hashCode()
            switch(r0) {
                case -1630362878: goto L_0x028e;
                case -726741246: goto L_0x029d;
                case -432379959: goto L_0x02ac;
                case 1725137378: goto L_0x02c0;
                default: goto L_0x0281;
            }
        L_0x0281:
            android.graphics.Bitmap r0 = X.C22002XqC.A00(r6, r11, r11)
        L_0x0285:
            X.XH8 r7 = new X.XH8
            r7.<init>(r0, r4)
        L_0x028a:
            r5.add(r7)
            goto L_0x0270
        L_0x028e:
            java.lang.String r0 = "CUTOUT_BITMAP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0281
            X.XqK r0 = X.C22004XqK.A00
            android.graphics.Bitmap r0 = r0.A02(r3, r6)
            goto L_0x0285
        L_0x029d:
            java.lang.String r0 = "MASK_AND_ORIGINAL_BITMAP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0281
            r0 = r21
            android.graphics.Bitmap r0 = r0.A01(r3, r6)
            goto L_0x0285
        L_0x02ac:
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0281
            r0 = 1063675494(0x3f666666, float:0.9)
            X.JqQ r7 = X.C22025XtK.A02(r4, r5, r6, r0)
            goto L_0x028a
        L_0x02c0:
            java.lang.String r0 = "MASK_BITMAP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0281
            android.graphics.Bitmap r0 = X.C22002XqC.A00(r6, r2, r1)
            goto L_0x0285
        L_0x02cd:
            X.9ZE r0 = new X.9ZE
            r0.<init>(r5)
            return r0
        L_0x02d3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "SAM prediction java error: "
            goto L_0x02ea
        L_0x02db:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "SAM prediction native error: "
            goto L_0x02ea
        L_0x02e3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Load model failed "
        L_0x02ea:
            r1.append(r0)
            r1.append(r2)
            r1.toString()
        L_0x02f3:
            X.XHE r0 = X.C22025XtK.A03()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XHJ.E3U(X.A9Y, java.util.List):X.9ta");
    }

    public final void CgM() {
        C22025XtK.A05(this.A03, this, 3);
    }

    public XHJ(AnonymousClass8CN r1) {
        this.A03 = r1;
    }

    public final void Efa(XZI xzi) {
        this.A00 = xzi;
    }
}
