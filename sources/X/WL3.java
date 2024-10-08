package X;

import com.facebook.react.views.text.ReactTextShadowNode;

public final class WL3 implements AnonymousClass2T1 {
    public final /* synthetic */ ReactTextShadowNode A00;

    public WL3(ReactTextShadowNode reactTextShadowNode) {
        this.A00 = reactTextShadowNode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0218, code lost:
        if (r2 > r28) goto L_0x021a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long Cnu(X.C245103cK r24, X.C245103cK r25, X.C245003c8 r26, float r27, float r28) {
        /*
            r23 = this;
            r0 = r23
            r9 = r27
            com.facebook.react.views.text.ReactTextShadowNode r7 = r0.A00
            android.text.TextPaint r0 = com.facebook.react.views.text.ReactTextShadowNode.A04
            android.text.Spannable r6 = r7.A00
            java.lang.String r0 = "Spannable element has not been prepared in onBeforeLayout"
            X.0Sd.A01(r6, r0)
            r11 = r24
            android.text.Layout r5 = com.facebook.react.views.text.ReactTextShadowNode.A01(r6, r7, r11, r9)
            boolean r0 = r7.A05
            r16 = -1
            r2 = 0
            r8 = 1
            r22 = r25
            if (r0 == 0) goto L_0x0080
            X.Vkp r1 = r7.A04
            int r0 = r1.A02()
            int r12 = r1.A02()
            float r1 = r7.A00
            float r10 = (float) r0
            float r1 = r1 * r10
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = X.W2U.A01(r0)
            float r0 = java.lang.Math.max(r1, r0)
            int r4 = (int) r0
        L_0x0038:
            if (r12 <= r4) goto L_0x0080
            int r1 = r7.A01
            r0 = r16
            if (r1 == r0) goto L_0x0048
            int r1 = r5.getLineCount()
            int r0 = r7.A01
            if (r1 > r0) goto L_0x0057
        L_0x0048:
            X.3cK r1 = X.C245103cK.UNDEFINED
            r0 = r22
            if (r0 == r1) goto L_0x0080
            int r0 = r5.getHeight()
            float r0 = (float) r0
            int r0 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
        L_0x0057:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.W2U.A01(r0)
            int r0 = (int) r0
            int r0 = java.lang.Math.max(r8, r0)
            int r12 = r12 - r0
            float r5 = (float) r12
            float r5 = r5 / r10
            int r1 = r6.length()
            java.lang.Class<com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan> r0 = com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan.class
            java.lang.Object[] r3 = r6.getSpans(r2, r1, r0)
            com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan[] r3 = (com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan[]) r3
            int r1 = r3.length
            r0 = 0
        L_0x0073:
            if (r0 >= r1) goto L_0x007b
            X.C13990Tnq.A0s(r6, r3, r5, r0, r4)
            int r0 = r0 + 1
            goto L_0x0073
        L_0x007b:
            android.text.Layout r5 = com.facebook.react.views.text.ReactTextShadowNode.A01(r6, r7, r11, r9)
            goto L_0x0038
        L_0x0080:
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x01a6
            X.QZL r0 = r7.A0A
            r21 = r0
            X.0Sd.A00(r21)
            android.text.TextPaint r0 = com.facebook.react.views.text.ReactTextShadowNode.A04
            android.util.DisplayMetrics r4 = X.AnonymousClass7TF.A0E(r21)
            com.facebook.react.bridge.WritableNativeArray r15 = new com.facebook.react.bridge.WritableNativeArray
            r15.<init>()
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>(r0)
            float r0 = r3.getTextSize()
            r10 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r10
            r3.setTextSize(r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            java.lang.String r0 = "T"
            r3.getTextBounds(r0, r2, r8, r1)
            int r0 = r1.height()
            float r1 = (float) r0
            float r1 = r1 / r10
            float r0 = r4.density
            float r1 = r1 / r0
            double r0 = (double) r1
            r19 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.String r13 = "x"
            r3.getTextBounds(r13, r2, r8, r0)
            int r0 = r0.height()
            float r1 = (float) r0
            float r1 = r1 / r10
            float r0 = r4.density
            float r1 = r1 / r0
            double r0 = (double) r1
            r17 = r0
            r3 = 0
        L_0x00d2:
            int r0 = r5.getLineCount()
            if (r3 >= r0) goto L_0x0185
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x017f
            int r0 = r5.getLineEnd(r3)
            int r0 = r0 - r8
            char r1 = r6.charAt(r0)
            r0 = 10
            if (r1 != r0) goto L_0x017f
            float r12 = r5.getLineMax(r3)
        L_0x00ef:
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r5.getLineBounds(r3, r10)
            com.facebook.react.bridge.WritableNativeMap r2 = new com.facebook.react.bridge.WritableNativeMap
            r2.<init>()
            float r1 = r5.getLineLeft(r3)
            float r0 = r4.density
            float r1 = r1 / r0
            double r0 = (double) r1
            r2.putDouble(r13, r0)
            int r0 = r10.top
            float r1 = (float) r0
            float r0 = r4.density
            float r1 = r1 / r0
            double r0 = (double) r1
            java.lang.String r14 = "y"
            r2.putDouble(r14, r0)
            float r0 = r4.density
            float r12 = r12 / r0
            double r0 = (double) r12
            java.lang.String r12 = "width"
            r2.putDouble(r12, r0)
            int r0 = r10.height()
            float r1 = (float) r0
            float r0 = r4.density
            float r1 = r1 / r0
            double r0 = (double) r1
            java.lang.String r10 = "height"
            r2.putDouble(r10, r0)
            int r0 = r5.getLineDescent(r3)
            float r1 = (float) r0
            float r0 = r4.density
            float r1 = r1 / r0
            double r0 = (double) r1
            java.lang.String r10 = "descender"
            r2.putDouble(r10, r0)
            int r0 = r5.getLineAscent(r3)
            int r0 = -r0
            float r1 = (float) r0
            float r0 = r4.density
            float r1 = r1 / r0
            double r0 = (double) r1
            java.lang.String r10 = "ascender"
            r2.putDouble(r10, r0)
            int r0 = r5.getLineBaseline(r3)
            float r1 = (float) r0
            float r0 = r4.density
            float r1 = r1 / r0
            double r0 = (double) r1
            java.lang.String r10 = "baseline"
            r2.putDouble(r10, r0)
            java.lang.String r10 = "capHeight"
            r0 = r19
            r2.putDouble(r10, r0)
            java.lang.String r10 = "xHeight"
            r0 = r17
            r2.putDouble(r10, r0)
            int r1 = r5.getLineStart(r3)
            int r0 = r5.getLineEnd(r3)
            java.lang.CharSequence r0 = r6.subSequence(r1, r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "text"
            r2.putString(r0, r1)
            r15.pushMap(r2)
            int r3 = r3 + 1
            goto L_0x00d2
        L_0x017f:
            float r12 = r5.getLineWidth(r3)
            goto L_0x00ef
        L_0x0185:
            com.facebook.react.bridge.WritableNativeMap r3 = new com.facebook.react.bridge.WritableNativeMap
            r3.<init>()
            java.lang.String r0 = "lines"
            r3.putArray(r0, r15)
            boolean r0 = r21.A0F()
            if (r0 == 0) goto L_0x01e5
            java.lang.Class<com.facebook.react.uimanager.events.RCTEventEmitter> r1 = com.facebook.react.uimanager.events.RCTEventEmitter.class
            r0 = r21
            com.facebook.react.bridge.JavaScriptModule r2 = r0.A02(r1)
            com.facebook.react.uimanager.events.RCTEventEmitter r2 = (com.facebook.react.uimanager.events.RCTEventEmitter) r2
            int r1 = r7.A00
            java.lang.String r0 = "topTextLayout"
            r2.receiveEvent(r1, r0, r3)
        L_0x01a6:
            int r1 = r7.A01
            r0 = r16
            if (r1 != r0) goto L_0x01dc
            int r3 = r5.getLineCount()
        L_0x01b0:
            r7 = 0
            X.3cK r2 = X.C245103cK.EXACTLY
            if (r11 == r2) goto L_0x01fa
            r4 = 0
        L_0x01b6:
            if (r4 >= r3) goto L_0x01f2
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x01d7
            int r0 = r5.getLineEnd(r4)
            int r0 = r0 - r8
            char r1 = r6.charAt(r0)
            r0 = 10
            if (r1 != r0) goto L_0x01d7
            float r1 = r5.getLineMax(r4)
        L_0x01cf:
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d4
            r7 = r1
        L_0x01d4:
            int r4 = r4 + 1
            goto L_0x01b6
        L_0x01d7:
            float r1 = r5.getLineWidth(r4)
            goto L_0x01cf
        L_0x01dc:
            int r0 = r5.getLineCount()
            int r3 = java.lang.Math.min(r1, r0)
            goto L_0x01b0
        L_0x01e5:
            java.lang.String r0 = "Cannot get RCTEventEmitter, no CatalystInstance"
            X.TQR r1 = new X.TQR
            r1.<init>(r0)
            java.lang.String r0 = "ReactTextShadowNode"
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r0, r1)
            goto L_0x01a6
        L_0x01f2:
            X.3cK r0 = X.C245103cK.AT_MOST
            if (r11 != r0) goto L_0x0221
            int r0 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x0221
        L_0x01fa:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 <= r0) goto L_0x0206
            double r0 = (double) r9
            double r0 = java.lang.Math.ceil(r0)
            float r9 = (float) r0
        L_0x0206:
            r0 = r22
            if (r0 == r2) goto L_0x021a
            int r3 = r3 - r8
            int r0 = r5.getLineBottom(r3)
            float r2 = (float) r0
            X.3cK r1 = X.C245103cK.AT_MOST
            r0 = r22
            if (r0 != r1) goto L_0x021c
            int r0 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r0 <= 0) goto L_0x021c
        L_0x021a:
            r2 = r28
        L_0x021c:
            long r0 = X.C13990Tnq.A0C(r9, r2)
            return r0
        L_0x0221:
            r9 = r7
            goto L_0x01fa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WL3.Cnu(X.3cK, X.3cK, X.3c8, float, float):long");
    }
}
