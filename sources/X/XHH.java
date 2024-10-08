package X;

public final class XHH extends C22025XtK implements C22554YAd {
    public XHJ A00;
    public XHI A01;
    public XZH A02;
    public String A03;
    public String A04;
    public final AnonymousClass8CN A05;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03a0, code lost:
        r8 = new X.XH8(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014e, code lost:
        if (r13 > 0.01f) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e2, code lost:
        if (r11 <= 0.01f) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0252, code lost:
        r20.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ed, code lost:
        X.0qQ.A0A(r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0212  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C391749ta E3U(X.A9Y r30, java.util.List r31) {
        /*
            r29 = this;
            r7 = 0
            r4 = 1
            r9 = r29
            boolean r0 = r9.CaO()
            if (r0 == 0) goto L_0x0139
            r12 = r31
            android.graphics.Bitmap r3 = X.C22025XtK.A01(r12)
            int r8 = r3.getWidth()
            int r5 = r3.getHeight()
            X.XHI r6 = r9.A01
            if (r6 == 0) goto L_0x03aa
            X.XH4 r0 = new X.XH4
            r0.<init>(r3)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r0 = "RAW_MASK"
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            X.A9Y r0 = new X.A9Y
            r0.<init>(r1)
            X.9ta r1 = r6.E3U(r0, r2)
            boolean r0 = r1 instanceof X.XHE
            if (r0 != 0) goto L_0x0139
            java.lang.String r0 = "null cannot be cast to non-null type com.aiplatform.outputs.AiOutputResult.Success"
            X.0qQ.A0C(r1, r0)
            X.9ZE r1 = (X.AnonymousClass9ZE) r1
            java.util.List r0 = r1.A00
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r6 = "null cannot be cast to non-null type com.aiplatform.outputs.AiOutputFloatArray"
            X.0qQ.A0C(r0, r6)
            X.JqQ r0 = (X.C60733JqQ) r0
            float[] r13 = r0.A00
            if (r13 == 0) goto L_0x0139
            int r11 = r13.length
            int[] r10 = new int[r11]
            r2 = 0
        L_0x0054:
            if (r2 >= r11) goto L_0x0061
            r1 = r13[r2]
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r10[r2] = r0
            int r2 = r2 + 1
            goto L_0x0054
        L_0x0061:
            r0 = 320(0x140, float:4.48E-43)
            X.Xcz r1 = X.XUK.A00(r10, r8, r5, r0, r0)
            if (r1 == 0) goto L_0x0139
            java.util.List r0 = r1.A02
            r28 = r0
            android.graphics.Rect r2 = r1.A01
            int r0 = r2.left
            float r1 = (float) r0
            int r0 = r2.width()
            float r0 = (float) r0
            r27 = 0
            float r0 = r0 * r27
            float r1 = r1 - r0
            int r0 = (int) r1
            int r13 = java.lang.Math.max(r0, r7)
            int r0 = r2.right
            float r1 = (float) r0
            int r0 = r2.width()
            float r0 = (float) r0
            float r0 = r0 * r27
            float r1 = r1 + r0
            int r0 = (int) r1
            int r11 = java.lang.Math.min(r0, r8)
            int r0 = r2.top
            float r1 = (float) r0
            int r0 = r2.height()
            float r0 = (float) r0
            float r0 = r0 * r27
            float r1 = r1 - r0
            int r0 = (int) r1
            int r10 = java.lang.Math.max(r0, r7)
            int r0 = r2.bottom
            float r1 = (float) r0
            int r0 = r2.height()
            float r0 = (float) r0
            float r0 = r0 * r27
            float r1 = r1 + r0
            int r0 = (int) r1
            int r1 = java.lang.Math.min(r0, r5)
            android.graphics.Rect r26 = new android.graphics.Rect
            r0 = r26
            r0.<init>(r13, r10, r11, r1)
            X.XZH r0 = r9.A02
            if (r0 == 0) goto L_0x00c8
            X.Xaw r0 = r0.A00
            X.02m r10 = r0.A02
            r1 = 900937641(0x35b337a9, float:1.3352739E-6)
            java.lang.String r0 = "saliency_finished"
            r10.markerPoint(r1, r0)
        L_0x00c8:
            X.XHJ r11 = r9.A00
            if (r11 == 0) goto L_0x03a7
            r25 = 2
            X.XH4 r10 = new X.XH4
            r10.<init>(r3)
            X.XH7 r1 = new X.XH7
            r0 = r26
            r1.<init>(r0)
            X.XSt[] r0 = new X.C21288XSt[]{r10, r1}
            java.util.List r10 = X.0sr.A1P(r0)
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r24 = X.AnonymousClass000.A00(r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r24)
            X.A9Y r0 = new X.A9Y
            r0.<init>(r1)
            X.9ta r1 = r11.E3U(r0, r10)
            boolean r0 = r1 instanceof X.AnonymousClass9ZE
            java.lang.String r11 = "null cannot be cast to non-null type com.aiplatform.outputs.AiOutputFloatValue"
            if (r0 == 0) goto L_0x0122
            X.9ZE r1 = (X.AnonymousClass9ZE) r1
            java.util.List r1 = r1.A00
            java.lang.Object r0 = X.C22025XtK.A04(r11, r1, r7)
            X.XH9 r0 = (X.XH9) r0
            java.lang.Float r0 = r0.A00
            if (r0 == 0) goto L_0x0139
            float r15 = r0.floatValue()
            java.lang.Object r0 = X.C22025XtK.A04(r6, r1, r4)
            X.JqQ r0 = (X.C60733JqQ) r0
            float[] r10 = r0.A00
            if (r10 == 0) goto L_0x0139
            int r14 = r10.length
            r13 = 0
            r1 = 0
        L_0x011a:
            if (r1 >= r14) goto L_0x013e
            r0 = r10[r1]
            float r13 = r13 + r0
            int r1 = r1 + 1
            goto L_0x011a
        L_0x0122:
            boolean r0 = r1 instanceof X.XHE
            if (r0 == 0) goto L_0x0150
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "segment anything bounding box prediction failed: "
        L_0x012c:
            r2.append(r0)
            X.XHE r1 = (X.XHE) r1
            X.XUJ r0 = r1.A00
            r2.append(r0)
        L_0x0136:
            r2.toString()
        L_0x0139:
            X.XHE r1 = X.C22025XtK.A03()
            return r1
        L_0x013e:
            int r0 = r8 * r5
            float r0 = (float) r0
            float r13 = r13 / r0
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0150
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0152
        L_0x0150:
            r10 = 0
            r15 = 0
        L_0x0152:
            int r0 = r28.size()
            int r23 = r0 + -1
            int r0 = r12.size()
            if (r0 <= r4) goto L_0x0161
            r12.get(r4)
        L_0x0161:
            r0 = 1062836634(0x3f59999a, float:0.85)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e4
            X.XHJ r13 = r9.A00
            if (r13 == 0) goto L_0x03a7
            X.XH4 r12 = new X.XH4
            r12.<init>(r3)
            r1 = r28
            r0 = r23
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            X.XH6 r0 = new X.XH6
            r0.<init>(r1)
            X.XSt[] r0 = new X.C21288XSt[]{r12, r0}
            java.util.List r12 = X.0sr.A1P(r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r24)
            X.A9Y r0 = new X.A9Y
            r0.<init>(r1)
            X.9ta r1 = r13.E3U(r0, r12)
            boolean r0 = r1 instanceof X.AnonymousClass9ZE
            if (r0 == 0) goto L_0x01c4
            X.9ZE r1 = (X.AnonymousClass9ZE) r1
            java.util.List r1 = r1.A00
            java.lang.Object r0 = X.C22025XtK.A04(r11, r1, r7)
            X.XH9 r0 = (X.XH9) r0
            java.lang.Float r0 = r0.A00
            if (r0 == 0) goto L_0x0139
            float r7 = r0.floatValue()
            java.lang.Object r0 = X.C22025XtK.A04(r6, r1, r4)
            X.JqQ r0 = (X.C60733JqQ) r0
            float[] r6 = r0.A00
            if (r6 == 0) goto L_0x0139
            int r0 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e4
            int r12 = r6.length
            r11 = 0
            r1 = 0
        L_0x01bc:
            if (r1 >= r12) goto L_0x01d0
            r0 = r6[r1]
            float r11 = r11 + r0
            int r1 = r1 + 1
            goto L_0x01bc
        L_0x01c4:
            boolean r0 = r1 instanceof X.XHE
            if (r0 == 0) goto L_0x01e4
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "u2net segment anything single point prediction failed: "
            goto L_0x012c
        L_0x01d0:
            int r0 = r8 * r5
            float r0 = (float) r0
            float r11 = r11 / r0
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e4
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r22 = 1
            if (r0 > 0) goto L_0x01e8
        L_0x01e4:
            r6 = r10
            r7 = r15
            r22 = 0
        L_0x01e8:
            X.XZH r0 = r9.A02
            if (r0 == 0) goto L_0x01f8
            X.Xaw r0 = r0.A00
            X.02m r9 = r0.A02
            r1 = 900937641(0x35b337a9, float:1.3352739E-6)
            java.lang.String r0 = "segmentation_finished"
            r9.markerPoint(r1, r0)
        L_0x01f8:
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0212
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Confidence score "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " is lower than the threshold."
            r2.append(r0)
            goto L_0x0136
        L_0x0212:
            if (r6 == 0) goto L_0x0139
            X.XqC r21 = X.C22002XqC.A00
            int r0 = r6.length
            float[] r0 = java.util.Arrays.copyOf(r6, r0)
            X.0qQ.A07(r0)
            X.LRI r1 = X.LRI.A00
            float[] r0 = r1.A02(r0, r8, r5)
            float[] r0 = r1.A01(r0, r8, r5)
            float[] r0 = X.LRI.A00(r0, r8, r5)
            float[] r5 = X.C21948Xmd.A00(r0, r8, r5)
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            r0 = r30
            java.util.List r0 = r0.A00
            java.util.Iterator r19 = r0.iterator()
        L_0x023c:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x03b4
            java.lang.String r1 = X.AnonymousClass7TE.A18(r19)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1630362878: goto L_0x0392;
                case -1457429379: goto L_0x037f;
                case -726741246: goto L_0x0370;
                case -446759521: goto L_0x0302;
                case -432379959: goto L_0x02f2;
                case -213090439: goto L_0x0294;
                case 1239239334: goto L_0x02d1;
                case 1364496006: goto L_0x026e;
                case 1725137378: goto L_0x0258;
                default: goto L_0x024d;
            }
        L_0x024d:
            X.JqQ r8 = new X.JqQ
            r8.<init>(r1, r6)
        L_0x0252:
            r0 = r20
            r0.add(r8)
            goto L_0x023c
        L_0x0258:
            java.lang.String r0 = "MASK_BITMAP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            int r8 = r3.getWidth()
            int r0 = r3.getHeight()
            android.graphics.Bitmap r11 = X.C22002XqC.A00(r5, r8, r0)
            goto L_0x03a0
        L_0x026e:
            r0 = 1023(0x3ff, float:1.434E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            if (r22 == 0) goto L_0x028c
            r1 = r28
            r0 = r23
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            X.XHB r8 = new X.XHB
            r8.<init>(r0)
            goto L_0x0252
        L_0x028c:
            java.lang.String r0 = "SELECTED_SAM_INPUT_BOUNDING_BOX"
            X.XHD r8 = new X.XHD
            r8.<init>(r2, r0)
            goto L_0x0252
        L_0x0294:
            java.lang.String r0 = "POINTS_AND_ORIGINAL_BITMAP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            int r0 = r28.size()
            int r8 = r0 + -1
            r0 = r28
            java.lang.Object r8 = r0.get(r8)
            java.util.List r8 = (java.util.List) r8
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r11 = r3.copy(r0, r4)
            android.graphics.Canvas r12 = new android.graphics.Canvas
            r12.<init>(r11)
            android.graphics.Paint r10 = X.C21056XCh.A04()
            java.util.Iterator r9 = r8.iterator()
        L_0x02bd:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02ed
            java.lang.Object r0 = r9.next()
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r8 = r0.x
            float r0 = r0.y
            r12.drawPoint(r8, r0, r10)
            goto L_0x02bd
        L_0x02d1:
            java.lang.String r0 = "BOUNDING_BOX_AND_ORIGINAL_BITMAP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r11 = r3.copy(r0, r4)
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r11)
            android.graphics.Paint r8 = X.C21056XCh.A04()
            r0 = r26
            r9.drawRect(r0, r8)
        L_0x02ed:
            X.0qQ.A0A(r11)
            goto L_0x03a0
        L_0x02f2:
            r0 = r24
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            r0 = r20
            X.JqQ r8 = X.C22025XtK.A02(r1, r0, r5, r7)
            goto L_0x0252
        L_0x0302:
            java.lang.String r0 = "MASK_OUTLINE_BITMAP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            int r12 = r3.getWidth()
            int r10 = r3.getHeight()
            android.graphics.Bitmap r11 = X.AnonymousClass7TF.A0B(r12, r10)
            r9 = 0
        L_0x0317:
            if (r9 >= r12) goto L_0x03a0
            r8 = 0
        L_0x031a:
            if (r8 >= r10) goto L_0x036d
            int r13 = r8 * r12
            int r13 = r13 + r9
            int r0 = r5.length
            r18 = 1
            int r0 = r0 - r4
            int r17 = java.lang.Math.min(r13, r0)
            r13 = -1
            r16 = 0
        L_0x032a:
            r14 = -1
        L_0x032b:
            int r15 = r9 + r13
            if (r15 < 0) goto L_0x036b
            if (r15 >= r12) goto L_0x036b
            int r0 = r8 + r14
            if (r0 < 0) goto L_0x036b
            if (r0 >= r10) goto L_0x036b
            int r0 = r0 * r12
            int r15 = r15 + r0
            r15 = r5[r15]
        L_0x033b:
            r0 = r5[r17]
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0343
            r16 = 1
        L_0x0343:
            int r14 = r14 + 1
            r0 = r25
            if (r14 < r0) goto L_0x032b
            int r13 = r13 + 1
            if (r13 < r0) goto L_0x032a
            r13 = r5[r17]
            int r0 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0355
            r18 = 0
        L_0x0355:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r13
            int r13 = (int) r0
            r0 = 0
            if (r16 == 0) goto L_0x035d
            r0 = r13
        L_0x035d:
            if (r18 != 0) goto L_0x0361
            r13 = 100
        L_0x0361:
            int r0 = android.graphics.Color.argb(r13, r0, r0, r0)
            r11.setPixel(r9, r8, r0)
            int r8 = r8 + 1
            goto L_0x031a
        L_0x036b:
            r15 = 0
            goto L_0x033b
        L_0x036d:
            int r9 = r9 + 1
            goto L_0x0317
        L_0x0370:
            java.lang.String r0 = "MASK_AND_ORIGINAL_BITMAP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            r0 = r21
            android.graphics.Bitmap r11 = r0.A01(r3, r5)
            goto L_0x03a0
        L_0x037f:
            java.lang.String r0 = "CONFIDENCE_SCORE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            java.lang.Float r0 = java.lang.Float.valueOf(r7)
            X.XH9 r8 = new X.XH9
            r8.<init>(r1, r0)
            goto L_0x0252
        L_0x0392:
            java.lang.String r0 = "CUTOUT_BITMAP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            X.XqK r0 = X.C22004XqK.A00
            android.graphics.Bitmap r11 = r0.A02(r3, r5)
        L_0x03a0:
            X.XH8 r8 = new X.XH8
            r8.<init>(r11, r1)
            goto L_0x0252
        L_0x03a7:
            java.lang.String r0 = "segmentAnythingProcessor"
            goto L_0x03ac
        L_0x03aa:
            java.lang.String r0 = "uTwoNetProcessor"
        L_0x03ac:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03b4:
            X.9ZE r1 = new X.9ZE
            r0 = r20
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XHH.E3U(X.A9Y, java.util.List):X.9ta");
    }

    public final boolean CaO() {
        if (this.A04 == null || this.A03 == null || this.A00 == null || this.A01 == null || !A08()) {
            return false;
        }
        return true;
    }

    public final void CgM() {
        C22025XtK.A05(this.A05, this, 8);
    }

    public XHH(AnonymousClass8CN r1) {
        this.A05 = r1;
    }

    public final void EfZ(XZH xzh) {
        this.A02 = xzh;
    }
}
