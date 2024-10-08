package X;

import android.graphics.Matrix;

/* renamed from: X.4XA  reason: invalid class name */
public abstract class AnonymousClass4XA {
    public static final float A00(Matrix matrix, float f, float f2, int i, int i2) {
        if (f2 < f) {
            float f3 = f2 / f;
            matrix.setScale(1.0f, f3, ((float) i) / 2.0f, ((float) i2) / 2.0f);
            return f3;
        }
        float f4 = f / f2;
        matrix.setScale(f4, 1.0f, ((float) i) / 2.0f, ((float) i2) / 2.0f);
        return f4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0099, code lost:
        if (r15 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        r15 = (com.instagram.common.ui.widget.videopreviewview.VideoPreviewView) r15;
        r1 = r15.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        if (r1 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a1, code lost:
        r1.DZ7(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
        r13.setTransform(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.view.TextureView r13, X.AnonymousClass4M7 r14, X.MQ2 r15, float r16, float r17, float r18, int r19, int r20) {
        /*
            int r8 = r13.getWidth()
            int r7 = r13.getHeight()
            r10 = r19
            float r6 = (float) r10
            r9 = r20
            float r5 = (float) r9
            float r4 = r6 / r5
            float r3 = (float) r8
            float r2 = (float) r7
            float r1 = r3 / r2
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r14 == 0) goto L_0x0024
            int r12 = r14.ordinal()
            r11 = 1073741824(0x40000000, float:2.0)
            switch(r12) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0088;
                case 2: goto L_0x0065;
                case 3: goto L_0x004f;
                case 4: goto L_0x0030;
                case 5: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.String r1 = "Incorrect VideoScaleType state"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002c:
            A00(r0, r4, r1, r8, r7)
            goto L_0x00a4
        L_0x0030:
            float r1 = A00(r0, r4, r1, r8, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 / r1
            float r1 = r3 / r11
            float r2 = r2 / r11
            r0.postScale(r4, r4, r1, r2)
            float r3 = r3 / r6
            float r3 = r3 * r5
            float r1 = r3 / r11
            float r1 = r1 - r2
            r2 = 0
            r0.postTranslate(r2, r1)
            float r3 = r3 * r18
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r1
            r0.postTranslate(r2, r3)
            goto L_0x00a4
        L_0x004f:
            float r1 = A00(r0, r4, r1, r8, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 / r1
            float r1 = r3 / r11
            float r2 = r2 / r11
            r0.postScale(r4, r4, r1, r2)
            float r3 = r3 / r6
            float r3 = r3 * r5
            float r3 = r3 / r11
            float r3 = r3 - r2
            r1 = 0
            r0.postTranslate(r1, r3)
            goto L_0x00a4
        L_0x0065:
            A00(r0, r4, r1, r8, r7)
            if (r10 >= r9) goto L_0x0078
            int r1 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0078
            float r1 = r16 / r4
            float r3 = r3 / r11
            float r2 = r2 / r11
            r0.postScale(r1, r1, r3, r2)
            r4 = r16
            goto L_0x0099
        L_0x0078:
            if (r10 <= r9) goto L_0x0099
            int r1 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x0099
            float r4 = r4 / r17
            float r3 = r3 / r11
            float r2 = r2 / r11
            r0.postScale(r4, r4, r3, r2)
            r4 = r17
            goto L_0x0099
        L_0x0088:
            float r1 = A00(r0, r4, r1, r8, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r4 / r1
            float r3 = r3 / r11
            float r2 = r2 / r11
            r0.postScale(r1, r1, r3, r2)
            goto L_0x0099
        L_0x0096:
            A00(r0, r4, r1, r8, r7)
        L_0x0099:
            if (r15 == 0) goto L_0x00a4
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r15 = (com.instagram.common.ui.widget.videopreviewview.VideoPreviewView) r15
            X.MVh r1 = r15.A03
            if (r1 == 0) goto L_0x00a4
            r1.DZ7(r15, r4)
        L_0x00a4:
            r13.setTransform(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XA.A01(android.view.TextureView, X.4M7, X.MQ2, float, float, float, int, int):void");
    }
}
