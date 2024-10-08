package com.aiplatform.processors.segmentanything;

import X.AnonymousClass8CN;
import X.C22025XtK;
import X.C348037xm;
import X.XZI;
import X.YAP;

public final class SegmentAnythingOnDeviceProcessorV2 extends C22025XtK implements YAP {
    public XZI A00;
    public String A01;
    public C348037xm A02;
    public final AnonymousClass8CN A03;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02cf, code lost:
        r3.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x033f, code lost:
        r1 = new X.XH8(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C391749ta E3U(X.A9Y r31, java.util.List r32) {
        /*
            r30 = this;
            r8 = 0
            r7 = 1
            r10 = r30
            java.lang.String r0 = r10.A01
            if (r0 == 0) goto L_0x0363
            boolean r0 = r10.A08()
            if (r0 == 0) goto L_0x0363
            X.7xm r6 = r10.A02
            if (r6 != 0) goto L_0x0030
            java.lang.String r0 = r10.A01     // Catch:{ Exception -> 0x001b }
            X.7xm r6 = X.C347997xi.A00(r0)     // Catch:{ Exception -> 0x001b }
            r10.A02 = r6     // Catch:{ Exception -> 0x001b }
            goto L_0x0030
        L_0x001b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Load model failed "
            r1.append(r0)
            r1.append(r2)
            r1.toString()
            X.XHE r0 = X.C22025XtK.A03()
            return r0
        L_0x0030:
            r5 = 0
            r9 = r32
            android.graphics.Bitmap r29 = X.C22025XtK.A01(r9)
            int r28 = r29.getWidth()
            int r4 = r29.getHeight()
            java.lang.Object r0 = r9.get(r7)
            boolean r0 = r0 instanceof X.XH7
            java.lang.String r27 = "null cannot be cast to non-null type com.aiplatform.inputs.AiInputListPointFs"
            if (r0 == 0) goto L_0x0096
            r26 = 1
        L_0x004b:
            X.Xr7 r25 = X.C22014Xr7.A00
            int r0 = r28 * 3
            int r0 = r0 * r4
            java.nio.FloatBuffer r14 = org.pytorch.Tensor.allocateFloatBuffer(r0)
            X.0qQ.A07(r14)
            int r3 = r4 * r28
            int[] r12 = new int[r3]
            r15 = r29
            r16 = r12
            r17 = r8
            r18 = r28
            r19 = r8
            r20 = r8
            r21 = r28
            r22 = r4
            r15.getPixels(r16, r17, r18, r19, r20, r21, r22)
            r11 = 0
        L_0x006f:
            if (r11 >= r3) goto L_0x00a5
            r1 = r12[r11]
            int r0 = r1 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r13 = (float) r0
            r15 = 1132396544(0x437f0000, float:255.0)
            float r13 = r13 / r15
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r2 = (float) r0
            float r2 = r2 / r15
            r0 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r0
            float r1 = r1 / r15
            r14.put(r11, r13)
            int r0 = r3 + r11
            r14.put(r0, r2)
            int r0 = r3 * 2
            int r0 = r0 + r11
            r14.put(r0, r1)
            int r11 = r11 + 1
            goto L_0x006f
        L_0x0096:
            r0 = r27
            java.lang.Object r0 = X.C22025XtK.A04(r0, r9, r7)
            X.XH5 r0 = (X.XH5) r0
            java.util.List r0 = r0.A00
            int r26 = r0.size()
            goto L_0x004b
        L_0x00a5:
            r0 = 3
            r2 = 2
            r11 = 3
            r13 = 4
            long[] r12 = new long[r13]
            r22 = 1
            r12[r8] = r22
            r12[r7] = r0
            long r0 = (long) r4
            r12[r2] = r0
            r0 = r28
            long r0 = (long) r0
            r12[r11] = r0
            X.XF6 r24 = X.XF6.CONTIGUOUS
            r0 = r24
            org.pytorch.Tensor r21 = org.pytorch.Tensor.fromBlob((java.nio.FloatBuffer) r14, (long[]) r12, (X.XF6) r0)
            java.lang.Object r0 = r9.get(r7)
            boolean r0 = r0 instanceof X.XH7
            java.lang.String r20 = "null cannot be cast to non-null type com.aiplatform.inputs.AiInputRect"
            java.lang.Object r1 = r9.get(r7)
            if (r0 == 0) goto L_0x0177
            r0 = r20
            X.0qQ.A0C(r1, r0)
            X.XH7 r1 = (X.XH7) r1
            android.graphics.Rect r1 = r1.A00
            X.0qQ.A0B(r1, r8)
            float[] r12 = new float[r13]
            int r0 = r1.left
            float r0 = (float) r0
            r12[r8] = r0
            int r0 = r1.top
            float r0 = (float) r0
            r12[r7] = r0
            int r0 = r1.right
            float r0 = (float) r0
            r12[r2] = r0
            int r0 = r1.bottom
            float r0 = (float) r0
            r12[r11] = r0
            long[] r13 = new long[r13]
            r13 = {1, 1, 2, 2} // fill-array
        L_0x00f7:
            r0 = r24
            org.pytorch.Tensor r16 = org.pytorch.Tensor.fromBlob((float[]) r12, (long[]) r13, (X.XF6) r0)
            java.lang.Object r0 = r9.get(r7)
            boolean r0 = r0 instanceof X.XH7
            if (r0 == 0) goto L_0x0120
            java.lang.Object r1 = r9.get(r7)
            r0 = r20
            X.0qQ.A0C(r1, r0)
            float[] r12 = new float[r2]
            r12 = {1073741824, 1077936128} // fill-array
            long[] r11 = new long[r11]
            r11 = {1, 1, 2} // fill-array
        L_0x0118:
            r0 = r24
            org.pytorch.Tensor r0 = org.pytorch.Tensor.fromBlob((float[]) r12, (long[]) r11, (X.XF6) r0)
            goto L_0x0213
        L_0x0120:
            r0 = r27
            java.lang.Object r0 = X.C22025XtK.A04(r0, r9, r7)
            X.XH5 r0 = (X.XH5) r0
            java.util.List r0 = r0.A00
            X.0qQ.A0B(r0, r8)
            int r14 = r0.size()
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0139:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014d
            java.lang.Object r0 = r1.next()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            X.AnonymousClass7TF.A1M(r12, r0)
            goto L_0x0139
        L_0x014d:
            java.lang.Comparable r0 = X.00k.A04(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            int r13 = X.AnonymousClass7TG.A0A(r0)
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            int r12 = r14 * r13
            r1 = 0
        L_0x015e:
            if (r1 >= r12) goto L_0x0168
            r0 = 1065353216(0x3f800000, float:1.0)
            X.JTP.A1V(r15, r0)
            int r1 = r1 + 1
            goto L_0x015e
        L_0x0168:
            float[] r12 = X.00k.A0w(r15)
            long[] r11 = new long[r11]
            r11[r8] = r22
            long r0 = (long) r14
            r11[r7] = r0
            long r0 = (long) r13
            r11[r2] = r0
            goto L_0x0118
        L_0x0177:
            r0 = r27
            X.0qQ.A0C(r1, r0)
            X.XH5 r1 = (X.XH5) r1
            java.util.List r14 = r1.A00
            X.0qQ.A0B(r14, r8)
            int r19 = r14.size()
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r14)
            java.util.Iterator r12 = r14.iterator()
        L_0x018f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r0 = r12.next()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            X.AnonymousClass7TF.A1M(r1, r0)
            goto L_0x018f
        L_0x01a3:
            java.lang.Comparable r0 = X.00k.A04(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r18 = X.AnonymousClass7TG.A0A(r0)
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            int r17 = r14.size()
            r1 = 0
        L_0x01b6:
            r0 = r17
            if (r1 >= r0) goto L_0x01fb
            java.lang.Object r0 = r14.get(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r16 = r0.iterator()
        L_0x01c4:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01db
            java.lang.Object r15 = r16.next()
            android.graphics.PointF r15 = (android.graphics.PointF) r15
            float r0 = r15.x
            X.JTP.A1V(r12, r0)
            float r0 = r15.y
            X.JTP.A1V(r12, r0)
            goto L_0x01c4
        L_0x01db:
            java.lang.Object r0 = r14.get(r1)
            java.util.List r0 = (java.util.List) r0
            int r15 = r0.size()
        L_0x01e5:
            r0 = r18
            if (r15 >= r0) goto L_0x01f8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r12.add(r0)
            r12.add(r0)
            int r15 = r15 + 1
            goto L_0x01e5
        L_0x01f8:
            int r1 = r1 + 1
            goto L_0x01b6
        L_0x01fb:
            float[] r12 = X.00k.A0w(r12)
            long[] r13 = new long[r13]
            r13[r8] = r22
            r0 = r19
            long r0 = (long) r0
            r13[r7] = r0
            r0 = r18
            long r0 = (long) r0
            r13[r2] = r0
            r0 = 2
            r13[r11] = r0
            goto L_0x00f7
        L_0x0213:
            org.pytorch.IValue r11 = org.pytorch.IValue.from((org.pytorch.Tensor) r21)     // Catch:{ CppException -> 0x0353, Exception -> 0x034b }
            org.pytorch.IValue r2 = org.pytorch.IValue.from((org.pytorch.Tensor) r16)     // Catch:{ CppException -> 0x0353, Exception -> 0x034b }
            org.pytorch.IValue r1 = org.pytorch.IValue.from((org.pytorch.Tensor) r0)     // Catch:{ CppException -> 0x0353, Exception -> 0x034b }
            org.pytorch.IValue r0 = org.pytorch.IValue.from((boolean) r7)     // Catch:{ CppException -> 0x0353, Exception -> 0x034b }
            org.pytorch.IValue[] r1 = new org.pytorch.IValue[]{r11, r2, r1, r0}     // Catch:{ CppException -> 0x0353, Exception -> 0x034b }
            X.8EJ r0 = r6.A00     // Catch:{ CppException -> 0x0353, Exception -> 0x034b }
            org.pytorch.IValue r0 = r0.forward(r1)     // Catch:{ CppException -> 0x0353, Exception -> 0x034b }
            org.pytorch.IValue[] r6 = r0.toTuple()     // Catch:{ CppException -> 0x0353, Exception -> 0x034b }
            X.XZI r0 = r10.A00
            if (r0 == 0) goto L_0x0241
            X.XaQ r0 = r0.A00
            X.02m r2 = r0.A01
            r1 = 900939300(0x35b33e24, float:1.3354625E-6)
            java.lang.String r0 = "segmentation_finished"
            r2.markerPoint(r1, r0)
        L_0x0241:
            r0 = r6[r8]
            org.pytorch.Tensor r13 = r0.toTensor()
            r0 = r6[r7]
            org.pytorch.Tensor r0 = r0.toTensor()
            float[] r11 = r0.getDataAsFloatArray()
            int r6 = r11.length
            r12 = 0
            r2 = 0
            r10 = 0
            r8 = 0
        L_0x0256:
            if (r2 >= r6) goto L_0x0263
            r1 = r11[r2]
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0260
            r10 = r2
            r8 = r1
        L_0x0260:
            int r2 = r2 + 1
            goto L_0x0256
        L_0x0263:
            int r6 = r6 / r26
            int r6 = r10 / r6
            float[] r2 = r13.getDataAsFloatArray()
            int r1 = r3 * r10
            int r0 = r10 + 1
            int r3 = r3 * r0
            if (r1 < 0) goto L_0x0363
            int r0 = r2.length
            if (r1 >= r0) goto L_0x0363
            if (r3 < 0) goto L_0x0363
            if (r3 > r0) goto L_0x0363
            X.AnonymousClass0gZ.A0b(r3, r0)
            float[] r10 = java.util.Arrays.copyOfRange(r2, r1, r3)
            X.0qQ.A07(r10)
            int r11 = r10.length
        L_0x0284:
            if (r5 >= r11) goto L_0x02a7
            r0 = r10[r5]
            float r0 = -r0
            double r0 = (double) r0
            double r0 = java.lang.Math.exp(r0)
            float r2 = (float) r0
            double r2 = (double) r2
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 + r0
            double r0 = r0 / r2
            float r2 = (float) r0
            r10[r5] = r2
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a4
            r0 = 1065353216(0x3f800000, float:1.0)
            r10[r5] = r0
        L_0x02a1:
            int r5 = r5 + 1
            goto L_0x0284
        L_0x02a4:
            r10[r5] = r12
            goto L_0x02a1
        L_0x02a7:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r0 = r31
            java.util.List r0 = r0.A00
            java.util.Iterator r11 = r0.iterator()
        L_0x02b3:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0345
            java.lang.Object r2 = r11.next()
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r2.hashCode()
            switch(r0) {
                case -1630362878: goto L_0x02d3;
                case -726741246: goto L_0x02e5;
                case -432379959: goto L_0x02f6;
                case -213090439: goto L_0x0307;
                case 667846867: goto L_0x0320;
                case 1725137378: goto L_0x0331;
                default: goto L_0x02c6;
            }
        L_0x02c6:
            float[] r0 = r13.getDataAsFloatArray()
            X.JqQ r1 = new X.JqQ
            r1.<init>(r2, r0)
        L_0x02cf:
            r3.add(r1)
            goto L_0x02b3
        L_0x02d3:
            java.lang.String r0 = "CUTOUT_BITMAP"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02c6
            r5 = 0
            X.XqK r1 = X.C22004XqK.A00
            r0 = r29
            android.graphics.Bitmap r0 = r1.A01(r0, r5, r10)
            goto L_0x033f
        L_0x02e5:
            java.lang.String r0 = "MASK_AND_ORIGINAL_BITMAP"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02c6
            r1 = r25
            r0 = r29
            android.graphics.Bitmap r0 = r1.A02(r0, r10)
            goto L_0x033f
        L_0x02f6:
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02c6
            X.JqQ r1 = X.C22025XtK.A02(r2, r3, r10, r8)
            goto L_0x02cf
        L_0x0307:
            java.lang.String r0 = "POINTS_AND_ORIGINAL_BITMAP"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02c6
            r0 = r27
            java.lang.Object r0 = X.C22025XtK.A04(r0, r9, r7)
            X.XH5 r0 = (X.XH5) r0
            java.util.List r1 = r0.A00
            r0 = r29
            android.graphics.Bitmap r0 = X.C22014Xr7.A00(r0, r1, r6)
            goto L_0x033f
        L_0x0320:
            java.lang.String r0 = "CUTOUT_BITMAP_INPUT_SIZE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02c6
            X.XqK r1 = X.C22004XqK.A00
            r0 = r29
            android.graphics.Bitmap r0 = r1.A02(r0, r10)
            goto L_0x033f
        L_0x0331:
            java.lang.String r0 = "MASK_BITMAP"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02c6
            r0 = r28
            android.graphics.Bitmap r0 = X.C22014Xr7.A01(r10, r0, r4)
        L_0x033f:
            X.XH8 r1 = new X.XH8
            r1.<init>(r0, r2)
            goto L_0x02cf
        L_0x0345:
            X.9ZE r0 = new X.9ZE
            r0.<init>(r3)
            return r0
        L_0x034b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "SAM prediction java error: "
            goto L_0x035a
        L_0x0353:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "SAM prediction native error: "
        L_0x035a:
            r1.append(r0)
            r1.append(r2)
            r1.toString()
        L_0x0363:
            X.XHE r0 = X.C22025XtK.A03()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aiplatform.processors.segmentanything.SegmentAnythingOnDeviceProcessorV2.E3U(X.A9Y, java.util.List):X.9ta");
    }

    public final void CgM() {
        C22025XtK.A05(this.A03, this, 5);
    }

    public SegmentAnythingOnDeviceProcessorV2(AnonymousClass8CN r1) {
        this.A03 = r1;
    }

    public final void Efa(XZI xzi) {
        this.A00 = xzi;
    }
}
