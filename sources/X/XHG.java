package X;

import com.aiplatform.processors.segmentanything.SegmentAnythingOnDeviceProcessorV2;
import com.aiplatform.processors.smartcrop.SaliencyDetectionProcessor;

public final class XHG extends C22025XtK implements C22554YAd {
    public SegmentAnythingOnDeviceProcessorV2 A00;
    public SaliencyDetectionProcessor A01;
    public XZH A02;
    public String A03;
    public String A04;
    public final AnonymousClass8CN A05;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x045a, code lost:
        if (r11 <= 0.01f) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04f0, code lost:
        r20.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0628, code lost:
        r1 = new X.XH8(r10, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x03a2, code lost:
        if (r12 > 0.01f) goto L_0x03c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C391749ta E3U(X.A9Y r36, java.util.List r37) {
        /*
            r35 = this;
            r6 = 0
            r3 = 1
            r7 = r35
            boolean r0 = r7.CaO()
            if (r0 == 0) goto L_0x03bc
            r34 = r37
            r0 = r34
            java.lang.Object r1 = r0.get(r6)
            r0 = 330(0x14a, float:4.62E-43)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r9)
            X.XH4 r1 = (X.XH4) r1
            android.graphics.Bitmap r4 = r1.A00
            int r8 = r4.getWidth()
            int r5 = r4.getHeight()
            com.aiplatform.processors.smartcrop.SaliencyDetectionProcessor r10 = r7.A01
            if (r10 == 0) goto L_0x0632
            X.XH4 r0 = new X.XH4
            r0.<init>(r4)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r0)
            r25 = 2
            java.lang.String r22 = "CENTROIDS"
            java.lang.String r1 = "RECT"
            r0 = r22
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r1 = X.0sr.A1P(r0)
            X.A9Y r21 = new X.A9Y
            r0 = r21
            r0.<init>(r1)
            java.lang.String r0 = r10.A00
            if (r0 == 0) goto L_0x03bc
            X.7xm r11 = r10.A01
            if (r11 != 0) goto L_0x0059
            X.7xm r11 = X.C347997xi.A00(r0)
            r10.A01 = r11
        L_0x0059:
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.lang.Object r0 = X.C22025XtK.A04(r9, r2, r6)
            X.XH4 r0 = (X.XH4) r0
            android.graphics.Bitmap r0 = r0.A00
            r23 = r0
            int r10 = r23.getWidth()
            int r9 = r23.getHeight()
            float r2 = (float) r10
            float r0 = (float) r9
            float r2 = r2 / r0
            r0 = 1130364928(0x43600000, float:224.0)
            r1 = 224(0xe0, float:3.14E-43)
            if (r10 < r9) goto L_0x00ff
            float r2 = r2 * r0
            int r1 = (int) r2
            r0 = 224(0xe0, float:3.14E-43)
        L_0x007c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r0)
            java.lang.Object r0 = r1.A00
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r1.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r0 = r23
            android.graphics.Bitmap r26 = X.0fO.A00(r0, r2, r1, r3)
            X.0qQ.A07(r26)
            int r13 = r26.getWidth()
            int r12 = r26.getHeight()
            int r10 = r12 * r13
            int[] r0 = new int[r10]
            r19 = r0
            r27 = r0
            r28 = r6
            r29 = r13
            r30 = r6
            r31 = r6
            r32 = r13
            r33 = r12
            r26.getPixels(r27, r28, r29, r30, r31, r32, r33)
            int r18 = r10 * 2
            int r0 = r13 * 3
            int r0 = r0 * r12
            java.nio.FloatBuffer r15 = org.pytorch.Tensor.allocateFloatBuffer(r0)
            r14 = 0
        L_0x00c6:
            if (r14 >= r10) goto L_0x0103
            r2 = r19[r14]
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            r16 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r16
            int r1 = r2 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r1 = r1 / r16
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r9 = (float) r2
            float r9 = r9 / r16
            float[] r17 = X.XYR.A00
            r2 = r17[r6]
            float r0 = r0 - r2
            float[] r2 = X.XYR.A01
            X.C22025XtK.A06(r15, r2, r0, r6, r14)
            int r0 = r10 + r14
            r16 = r17[r3]
            float r1 = r1 - r16
            X.C22025XtK.A06(r15, r2, r1, r3, r0)
            int r1 = r18 + r14
            r0 = r17[r25]
            float r9 = r9 - r0
            r0 = r25
            X.C22025XtK.A06(r15, r2, r9, r0, r1)
            int r14 = r14 + 1
            goto L_0x00c6
        L_0x00ff:
            float r0 = r0 / r2
            int r0 = (int) r0
            goto L_0x007c
        L_0x0103:
            long[] r1 = X.C22025XtK.A07(r12, r13)
            X.XF6 r0 = X.XF6.CONTIGUOUS
            org.pytorch.Tensor r0 = org.pytorch.Tensor.fromBlob((java.nio.FloatBuffer) r15, (long[]) r1, (X.XF6) r0)
            org.pytorch.IValue r0 = org.pytorch.IValue.from((org.pytorch.Tensor) r0)
            org.pytorch.IValue[] r1 = new org.pytorch.IValue[]{r0}
            X.8EJ r0 = r11.A00
            org.pytorch.IValue r0 = r0.forward(r1)
            org.pytorch.Tensor r10 = r0.toTensor()
            X.0qQ.A0A(r10)
            int r17 = r23.getWidth()
            int r16 = r23.getHeight()
            X.0qQ.A0B(r10, r6)
            long[] r1 = r10.shape
            int r0 = r1.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            if (r0 == 0) goto L_0x03bc
            long[] r1 = r10.shape
            int r0 = r1.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            int r1 = r0.length
            r0 = r25
            if (r1 != r0) goto L_0x03bc
            long[] r1 = r10.shape
            int r0 = r1.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r11 = 0
            r0 = r0[r6]
            int r9 = (int) r0
            long[] r1 = r10.shape
            int r0 = r1.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r0 = r0[r3]
            int r2 = (int) r0
            float[] r13 = r10.getDataAsFloatArray()
            int r0 = r13.length
            if (r0 != 0) goto L_0x0164
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0164:
            r15 = r13[r6]
            int r12 = r0 + -1
            if (r3 > r12) goto L_0x0176
            r1 = 1
        L_0x016b:
            r0 = r13[r1]
            float r15 = java.lang.Math.min(r15, r0)
            if (r1 == r12) goto L_0x0176
            int r1 = r1 + 1
            goto L_0x016b
        L_0x0176:
            float[] r14 = r10.getDataAsFloatArray()
            int r0 = r14.length
            if (r0 != 0) goto L_0x0183
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0183:
            r13 = r14[r6]
            int r12 = r0 + -1
            if (r3 > r12) goto L_0x0195
            r1 = 1
        L_0x018a:
            r0 = r14[r1]
            float r13 = java.lang.Math.max(r13, r0)
            if (r1 == r12) goto L_0x0195
            int r1 = r1 + 1
            goto L_0x018a
        L_0x0195:
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x03bc
            float[] r12 = r10.getDataAsFloatArray()
            int r10 = r12.length
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
        L_0x01a3:
            if (r11 >= r10) goto L_0x01b5
            r0 = r12[r11]
            float r0 = r0 - r15
            float r14 = r13 - r15
            float r0 = r0 / r14
            r14 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r14
            int r0 = (int) r0
            X.AnonymousClass7TF.A1M(r1, r0)
            int r11 = r11 + 1
            goto L_0x01a3
        L_0x01b5:
            int[] r10 = X.00k.A0x(r1)
            r1 = r17
            r0 = r16
            X.Xcz r11 = X.XUK.A00(r10, r1, r0, r2, r9)
            if (r11 == 0) goto L_0x03bc
            r0 = r21
            java.util.List r0 = r0.A00
            java.util.Iterator r16 = r0.iterator()
        L_0x01cb:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02be
            java.lang.String r13 = X.AnonymousClass7TE.A18(r16)
            int r0 = r13.hashCode()
            switch(r0) {
                case -1929424669: goto L_0x01e9;
                case 1239239334: goto L_0x024c;
                case 1473706185: goto L_0x0298;
                case 2143277715: goto L_0x02ad;
                default: goto L_0x01dc;
            }
        L_0x01dc:
            android.graphics.Rect r0 = r11.A01
            X.XHD r1 = new X.XHD
            r1.<init>(r0, r13)
        L_0x01e3:
            r0 = r20
            r0.add(r1)
            goto L_0x01cb
        L_0x01e9:
            java.lang.String r0 = "POINTS"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01dc
            android.graphics.Rect r12 = r11.A01
            X.0qQ.A0B(r12, r6)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            int r2 = r12.centerX()
            int r10 = r12.centerY()
            X.Vk9 r0 = new X.Vk9
            r0.<init>(r2, r10)
            r9.add(r0)
            int r1 = r12.centerX()
            int r0 = r12.left
            int r1 = r1 + r0
            int r1 = r1 / 2
            X.Vk9 r0 = new X.Vk9
            r0.<init>(r1, r10)
            r9.add(r0)
            int r1 = r12.centerX()
            int r0 = r12.right
            int r1 = r1 + r0
            int r1 = r1 / 2
            X.Vk9 r0 = new X.Vk9
            r0.<init>(r1, r10)
            r9.add(r0)
            int r0 = r12.top
            int r0 = r0 + r10
            int r1 = r0 / 2
            X.Vk9 r0 = new X.Vk9
            r0.<init>(r2, r1)
            r9.add(r0)
            int r0 = r12.bottom
            int r10 = r10 + r0
            int r1 = r10 / 2
            X.Vk9 r0 = new X.Vk9
            r0.<init>(r2, r1)
            r9.add(r0)
            X.XHC r1 = new X.XHC
            r1.<init>(r13, r9)
            goto L_0x01e3
        L_0x024c:
            java.lang.String r0 = "BOUNDING_BOX_AND_ORIGINAL_BITMAP"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01dc
            android.graphics.Rect r1 = r11.A01
            X.0qQ.A0B(r1, r3)
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r0 = r23
            android.graphics.Bitmap r15 = r0.copy(r2, r3)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            r14.<init>(r15)
            android.graphics.Paint r12 = new android.graphics.Paint
            r12.<init>()
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r12.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r12.setStyle(r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            r12.setStrokeWidth(r0)
            int r0 = r1.left
            float r10 = (float) r0
            int r0 = r1.top
            float r9 = (float) r0
            int r0 = r1.right
            float r2 = (float) r0
            int r0 = r1.bottom
            float r1 = (float) r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r10, r9, r2, r1)
            r14.drawRect(r0, r12)
            X.0qQ.A0A(r15)
            X.XH8 r1 = new X.XH8
            r1.<init>(r15, r13)
            goto L_0x01e3
        L_0x0298:
            java.lang.String r0 = "BLOB_RATIO"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01dc
            float r0 = r11.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.XH9 r1 = new X.XH9
            r1.<init>(r13, r0)
            goto L_0x01e3
        L_0x02ad:
            r0 = r22
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01dc
            java.util.List r0 = r11.A02
            X.XHA r1 = new X.XHA
            r1.<init>(r13, r0)
            goto L_0x01e3
        L_0x02be:
            r0 = r20
            java.lang.Object r1 = r0.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.aiplatform.outputs.AiOutputListPointFs"
            X.0qQ.A0C(r1, r0)
            X.XHA r1 = (X.XHA) r1
            java.util.List r0 = r1.A00
            r26 = r0
            if (r0 == 0) goto L_0x03bc
            r0 = r20
            java.lang.Object r1 = r0.get(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.aiplatform.outputs.AiOutputRect"
            X.0qQ.A0C(r1, r0)
            X.XHD r1 = (X.XHD) r1
            android.graphics.Rect r2 = r1.A00
            if (r2 == 0) goto L_0x03bc
            int r0 = r2.left
            float r1 = (float) r0
            int r0 = r2.width()
            float r0 = (float) r0
            r12 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 * r12
            float r1 = r1 - r0
            int r0 = (int) r1
            int r11 = java.lang.Math.max(r0, r6)
            int r0 = r2.right
            float r1 = (float) r0
            int r0 = r2.width()
            float r0 = (float) r0
            float r0 = r0 * r12
            float r1 = r1 + r0
            int r0 = (int) r1
            int r10 = java.lang.Math.min(r0, r8)
            int r0 = r2.top
            float r1 = (float) r0
            int r0 = r2.height()
            float r0 = (float) r0
            float r0 = r0 * r12
            float r1 = r1 - r0
            int r0 = (int) r1
            int r9 = java.lang.Math.max(r0, r6)
            int r0 = r2.bottom
            float r1 = (float) r0
            int r0 = r2.height()
            float r0 = (float) r0
            float r0 = r0 * r12
            float r1 = r1 + r0
            int r0 = (int) r1
            int r1 = java.lang.Math.min(r0, r5)
            android.graphics.Rect r24 = new android.graphics.Rect
            r0 = r24
            r0.<init>(r11, r9, r10, r1)
            X.XZH r0 = r7.A02
            if (r0 == 0) goto L_0x0338
            X.Xaw r0 = r0.A00
            X.02m r9 = r0.A02
            r1 = 900937641(0x35b337a9, float:1.3352739E-6)
            java.lang.String r0 = "saliency_finished"
            r9.markerPoint(r1, r0)
        L_0x0338:
            com.aiplatform.processors.segmentanything.SegmentAnythingOnDeviceProcessorV2 r10 = r7.A00
            if (r10 == 0) goto L_0x062f
            X.XH4 r9 = new X.XH4
            r9.<init>(r4)
            X.XH7 r1 = new X.XH7
            r0 = r24
            r1.<init>(r0)
            X.XSt[] r0 = new X.C21288XSt[]{r9, r1}
            java.util.List r9 = X.0sr.A1P(r0)
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r23 = X.AnonymousClass000.A00(r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r23)
            X.A9Y r0 = new X.A9Y
            r0.<init>(r1)
            X.9ta r1 = r10.E3U(r0, r9)
            boolean r0 = r1 instanceof X.AnonymousClass9ZE
            java.lang.String r11 = "null cannot be cast to non-null type com.aiplatform.outputs.AiOutputFloatArray"
            java.lang.String r9 = "null cannot be cast to non-null type com.aiplatform.outputs.AiOutputFloatValue"
            if (r0 == 0) goto L_0x03a5
            X.9ZE r1 = (X.AnonymousClass9ZE) r1
            java.util.List r1 = r1.A00
            java.lang.Object r0 = X.C22025XtK.A04(r9, r1, r6)
            X.XH9 r0 = (X.XH9) r0
            java.lang.Float r0 = r0.A00
            if (r0 == 0) goto L_0x03bc
            float r14 = r0.floatValue()
            java.lang.Object r0 = X.C22025XtK.A04(r11, r1, r3)
            X.JqQ r0 = (X.C60733JqQ) r0
            float[] r10 = r0.A00
            if (r10 == 0) goto L_0x03bc
            int r13 = r10.length
            r12 = 0
            r1 = 0
        L_0x038a:
            if (r1 >= r13) goto L_0x0392
            r0 = r10[r1]
            float r12 = r12 + r0
            int r1 = r1 + 1
            goto L_0x038a
        L_0x0392:
            int r0 = r8 * r5
            float r0 = (float) r0
            float r12 = r12 / r0
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x03c1
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x03c1
            goto L_0x03c3
        L_0x03a5:
            boolean r0 = r1 instanceof X.XHE
            if (r0 == 0) goto L_0x03c1
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "segment anything bounding box prediction failed: "
        L_0x03af:
            r2.append(r0)
            X.XHE r1 = (X.XHE) r1
            X.XUJ r0 = r1.A00
            r2.append(r0)
            r2.toString()
        L_0x03bc:
            X.XHE r1 = X.C22025XtK.A03()
            return r1
        L_0x03c1:
            r10 = 0
            r14 = 0
        L_0x03c3:
            int r0 = r26.size()
            int r22 = r0 + -1
            int r0 = r34.size()
            if (r0 <= r3) goto L_0x03d4
            r0 = r34
            r0.get(r3)
        L_0x03d4:
            r0 = 1062836634(0x3f59999a, float:0.85)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x045c
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            r1 = r26
            r0 = r22
            java.lang.Object r0 = r1.get(r0)
            r12.add(r0)
            com.aiplatform.processors.segmentanything.SegmentAnythingOnDeviceProcessorV2 r13 = r7.A00
            if (r13 == 0) goto L_0x062f
            X.XH4 r1 = new X.XH4
            r1.<init>(r4)
            X.XH5 r0 = new X.XH5
            r0.<init>(r12)
            X.XSt[] r0 = new X.C21288XSt[]{r1, r0}
            java.util.List r12 = X.0sr.A1P(r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r23)
            X.A9Y r0 = new X.A9Y
            r0.<init>(r1)
            X.9ta r1 = r13.E3U(r0, r12)
            boolean r0 = r1 instanceof X.AnonymousClass9ZE
            if (r0 == 0) goto L_0x043c
            X.9ZE r1 = (X.AnonymousClass9ZE) r1
            java.util.List r1 = r1.A00
            java.lang.Object r0 = X.C22025XtK.A04(r9, r1, r6)
            X.XH9 r0 = (X.XH9) r0
            java.lang.Float r0 = r0.A00
            if (r0 == 0) goto L_0x03bc
            float r9 = r0.floatValue()
            java.lang.Object r0 = X.C22025XtK.A04(r11, r1, r3)
            X.JqQ r0 = (X.C60733JqQ) r0
            float[] r6 = r0.A00
            if (r6 == 0) goto L_0x03bc
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x045c
            int r12 = r6.length
            r11 = 0
            r1 = 0
        L_0x0434:
            if (r1 >= r12) goto L_0x0448
            r0 = r6[r1]
            float r11 = r11 + r0
            int r1 = r1 + 1
            goto L_0x0434
        L_0x043c:
            boolean r0 = r1 instanceof X.XHE
            if (r0 == 0) goto L_0x045c
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "segment anything single point prediction failed: "
            goto L_0x03af
        L_0x0448:
            int r0 = r8 * r5
            float r0 = (float) r0
            float r11 = r11 / r0
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x045c
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r21 = 1
            if (r0 > 0) goto L_0x0460
        L_0x045c:
            r9 = r14
            r6 = r10
            r21 = 0
        L_0x0460:
            X.XZH r0 = r7.A02
            if (r0 == 0) goto L_0x0470
            X.Xaw r0 = r0.A00
            X.02m r10 = r0.A02
            r1 = 900937641(0x35b337a9, float:1.3352739E-6)
            java.lang.String r0 = "segmentation_finished"
            r10.markerPoint(r1, r0)
        L_0x0470:
            r0 = 1060320051(0x3f333333, float:0.7)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0480
            java.lang.String r1 = "Confidence score "
            java.lang.String r0 = " is lower than the threshold."
            X.002.A0Z(r1, r0, r9)
            goto L_0x03bc
        L_0x0480:
            if (r6 == 0) goto L_0x03bc
            int r0 = r6.length
            float[] r0 = java.util.Arrays.copyOf(r6, r0)
            X.0qQ.A07(r0)
            X.LRI r12 = X.LRI.A00
            float[] r11 = r12.A02(r0, r8, r5)
            X.XZH r0 = r7.A02
            if (r0 == 0) goto L_0x04a0
            X.Xaw r0 = r0.A00
            X.02m r10 = r0.A02
            r1 = 900937641(0x35b337a9, float:1.3352739E-6)
            java.lang.String r0 = "noise_removal_finished"
            r10.markerPoint(r1, r0)
        L_0x04a0:
            float[] r11 = r12.A01(r11, r8, r5)
            X.XZH r0 = r7.A02
            if (r0 == 0) goto L_0x04b4
            X.Xaw r0 = r0.A00
            X.02m r10 = r0.A02
            r1 = 900937641(0x35b337a9, float:1.3352739E-6)
            java.lang.String r0 = "hole_filling_finished"
            r10.markerPoint(r1, r0)
        L_0x04b4:
            float[] r10 = X.LRI.A00(r11, r8, r5)
            X.XZH r0 = r7.A02
            if (r0 == 0) goto L_0x04c8
            X.Xaw r0 = r0.A00
            X.02m r7 = r0.A02
            r1 = 900937641(0x35b337a9, float:1.3352739E-6)
            java.lang.String r0 = "mask_filtering_finished"
            r7.markerPoint(r1, r0)
        L_0x04c8:
            float[] r5 = X.C21948Xmd.A00(r10, r8, r5)
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            r0 = r36
            java.util.List r0 = r0.A00
            java.util.Iterator r19 = r0.iterator()
        L_0x04d8:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x063c
            java.lang.Object r7 = r19.next()
            java.lang.String r7 = (java.lang.String) r7
            int r0 = r7.hashCode()
            switch(r0) {
                case -1630362878: goto L_0x04f6;
                case -1457429379: goto L_0x0507;
                case -726741246: goto L_0x0519;
                case -446759521: goto L_0x0529;
                case -432379959: goto L_0x0598;
                case -213090439: goto L_0x05a8;
                case 667846867: goto L_0x05bd;
                case 1239239334: goto L_0x05cc;
                case 1364496006: goto L_0x05ec;
                case 1725137378: goto L_0x0614;
                default: goto L_0x04eb;
            }
        L_0x04eb:
            X.JqQ r1 = new X.JqQ
            r1.<init>(r7, r6)
        L_0x04f0:
            r0 = r20
            r0.add(r1)
            goto L_0x04d8
        L_0x04f6:
            java.lang.String r0 = "CUTOUT_BITMAP"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04eb
            r1 = 0
            X.XqK r0 = X.C22004XqK.A00
            android.graphics.Bitmap r10 = r0.A01(r4, r1, r5)
            goto L_0x0628
        L_0x0507:
            java.lang.String r0 = "CONFIDENCE_SCORE"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04eb
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            X.XH9 r1 = new X.XH9
            r1.<init>(r7, r0)
            goto L_0x04f0
        L_0x0519:
            java.lang.String r0 = "MASK_AND_ORIGINAL_BITMAP"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04eb
            X.Xr7 r0 = X.C22014Xr7.A00
            android.graphics.Bitmap r10 = r0.A02(r4, r5)
            goto L_0x0628
        L_0x0529:
            java.lang.String r0 = "MASK_OUTLINE_BITMAP"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04eb
            int r12 = r4.getWidth()
            int r11 = r4.getHeight()
            android.graphics.Bitmap r10 = X.AnonymousClass7TF.A0B(r12, r11)
            r8 = 0
        L_0x053e:
            if (r8 >= r12) goto L_0x0628
            r1 = 0
        L_0x0541:
            if (r1 >= r11) goto L_0x0595
            int r13 = r1 * r12
            int r13 = r13 + r8
            int r0 = r5.length
            r18 = 1
            int r0 = r0 - r3
            int r17 = java.lang.Math.min(r13, r0)
            r13 = -1
            r16 = 0
        L_0x0551:
            r14 = -1
        L_0x0552:
            int r15 = r8 + r13
            if (r15 < 0) goto L_0x0593
            if (r15 >= r12) goto L_0x0593
            int r0 = r1 + r14
            if (r0 < 0) goto L_0x0593
            if (r0 >= r11) goto L_0x0593
            int r0 = r0 * r12
            int r15 = r15 + r0
            r15 = r5[r15]
        L_0x0562:
            r0 = r5[r17]
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x056a
            r16 = 1
        L_0x056a:
            int r14 = r14 + 1
            r0 = r25
            if (r14 < r0) goto L_0x0552
            int r13 = r13 + 1
            r14 = 0
            if (r13 < r0) goto L_0x0551
            r13 = r5[r17]
            int r0 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x057d
            r18 = 0
        L_0x057d:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r13
            int r13 = (int) r0
            r0 = 0
            if (r16 == 0) goto L_0x0585
            r0 = r13
        L_0x0585:
            if (r18 != 0) goto L_0x0589
            r13 = 100
        L_0x0589:
            int r0 = android.graphics.Color.argb(r13, r0, r0, r0)
            r10.setPixel(r8, r1, r0)
            int r1 = r1 + 1
            goto L_0x0541
        L_0x0593:
            r15 = 0
            goto L_0x0562
        L_0x0595:
            int r8 = r8 + 1
            goto L_0x053e
        L_0x0598:
            r0 = r23
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04eb
            r0 = r20
            X.JqQ r1 = X.C22025XtK.A02(r7, r0, r5, r9)
            goto L_0x04f0
        L_0x05a8:
            java.lang.String r0 = "POINTS_AND_ORIGINAL_BITMAP"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04eb
            int r0 = r26.size()
            int r1 = r0 + -1
            r0 = r26
            android.graphics.Bitmap r10 = X.C22014Xr7.A00(r4, r0, r1)
            goto L_0x0628
        L_0x05bd:
            java.lang.String r0 = "CUTOUT_BITMAP_INPUT_SIZE"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04eb
            X.XqK r0 = X.C22004XqK.A00
            android.graphics.Bitmap r10 = r0.A02(r4, r5)
            goto L_0x0628
        L_0x05cc:
            java.lang.String r0 = "BOUNDING_BOX_AND_ORIGINAL_BITMAP"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04eb
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = r4.copy(r0, r3)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r10)
            android.graphics.Paint r1 = X.C21056XCh.A04()
            r0 = r24
            r8.drawRect(r0, r1)
            X.0qQ.A0A(r10)
            goto L_0x0628
        L_0x05ec:
            r0 = 1023(0x3ff, float:1.434E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04eb
            if (r21 == 0) goto L_0x060b
            r1 = r26
            r0 = r22
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            X.XHB r1 = new X.XHB
            r1.<init>(r0)
            goto L_0x04f0
        L_0x060b:
            java.lang.String r0 = "SELECTED_SAM_INPUT_BOUNDING_BOX"
            X.XHD r1 = new X.XHD
            r1.<init>(r2, r0)
            goto L_0x04f0
        L_0x0614:
            java.lang.String r0 = "MASK_BITMAP"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04eb
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            android.graphics.Bitmap r10 = X.C22014Xr7.A01(r5, r1, r0)
        L_0x0628:
            X.XH8 r1 = new X.XH8
            r1.<init>(r10, r7)
            goto L_0x04f0
        L_0x062f:
            java.lang.String r0 = "segmentAnythingProcessor"
            goto L_0x0634
        L_0x0632:
            java.lang.String r0 = "saliencyDetectionProcessor"
        L_0x0634:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x063c:
            X.9ZE r1 = new X.9ZE
            r0 = r20
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XHG.E3U(X.A9Y, java.util.List):X.9ta");
    }

    public final boolean CaO() {
        if (this.A03 == null || this.A04 == null || this.A00 == null || this.A01 == null || !A08()) {
            return false;
        }
        return true;
    }

    public final void CgM() {
        C22025XtK.A05(this.A05, this, 4);
    }

    public XHG(AnonymousClass8CN r1) {
        this.A05 = r1;
    }

    public final void EfZ(XZH xzh) {
        this.A02 = xzh;
    }
}
