package com.instagram.creation.capture.quickcapture.freetransform.transformmatrix;

import X.002;
import X.0kD;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C266624a2;
import X.C266644a5;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

public final class TransformMatrixConfig implements C266624a2 {
    public static boolean A0M;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public TransformMatrixParams A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public float A0H;
    public float A0I;
    public int A0J;
    public C266644a5 A0K;
    public boolean A0L;

    public final synchronized void A03() {
        float f;
        C266644a5 A002 = A00();
        A002.A00 = this.A0H;
        C266644a5.A00(A002);
        float f2 = this.A08.A01;
        float f3 = f2 * this.A00;
        float f4 = f2 * this.A0I;
        C266644a5 A003 = A00();
        A003.A02 = f3;
        C266644a5.A00(A003);
        C266644a5 A004 = A00();
        A004.A03 = f4;
        C266644a5.A00(A004);
        C266644a5 A005 = A00();
        A005.A07 = this.A0L;
        C266644a5.A00(A005);
        float f5 = -(this.A08.A00 + ((float) this.A0J));
        if (!this.A0G) {
            f5 = -f5;
        }
        C266644a5 A006 = A00();
        A006.A01 = f5;
        C266644a5.A00(A006);
        C266644a5 A007 = A00();
        A007.A06 = this.A0J;
        C266644a5.A00(A007);
        TransformMatrixParams transformMatrixParams = this.A08;
        float f6 = transformMatrixParams.A02 / f3;
        float f7 = transformMatrixParams.A03 / f4;
        int i = this.A0J;
        double d = (((double) i) * 3.141592653589793d) / 180.0d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f8 = (cos * f6) + (sin * f7);
        float f9 = (cos * f7) - (sin * f6);
        if (i == 0) {
            f = f8;
            f8 = -f9;
        } else if (i != 90) {
            if (i == 180) {
                f8 = -f8;
            } else if (i != 270) {
                0kD.A07(this.A09, 002.A0O("Unsupported exif=", i), (Throwable) null);
            } else {
                f = f9;
            }
            f = f8;
            f8 = f9;
        } else {
            f = -f9;
            f8 = -f8;
        }
        if (!this.A0G) {
            f8 = -f8;
        }
        C266644a5 A008 = A00();
        A008.A04 = f;
        C266644a5.A00(A008);
        C266644a5 A009 = A00();
        A009.A05 = f8;
        C266644a5.A00(A009);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TransformMatrixConfig(TransformMatrixParams transformMatrixParams, String str, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this();
        0qQ.A0B(str, 13);
        if (i4 <= 0 || i5 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.A05 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A0C = z3;
        this.A07 = i4;
        this.A06 = i5;
        TransformMatrixParams transformMatrixParams2 = this.A08;
        transformMatrixParams2.A04 = transformMatrixParams.A04;
        transformMatrixParams2.A00(transformMatrixParams);
        this.A0A = z;
        this.A0F = z2;
        this.A0D = z5;
        this.A0G = z4;
        this.A0E = z6;
        this.A09 = 002.A0T(getClass().getSimpleName(), str, '_');
        A01();
    }

    public final C266644a5 A00() {
        C266644a5 r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("transformMatrix");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r14.A0F == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r14 = this;
            boolean r2 = r14.A0D
            boolean r1 = r14.A0E
            X.4a5 r0 = new X.4a5
            r0.<init>(r2, r1)
            r14.A0K = r0
            boolean r0 = r14.A0A
            r3 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0016
            boolean r1 = r14.A0F
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r14.A0L = r0
            boolean r0 = r14.A0C
            if (r0 == 0) goto L_0x00cf
            int r0 = r14.A04
            int r1 = r0 % 180
            if (r1 != 0) goto L_0x00cb
            int r0 = r14.A05
        L_0x0025:
            r14.A02 = r0
            if (r1 != 0) goto L_0x00c7
            int r0 = r14.A03
        L_0x002b:
            r14.A01 = r0
            r14.A0J = r7
        L_0x002f:
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            int r0 = r14.A0J
            float r0 = (float) r0
            r5.postRotate(r0)
            int r0 = r14.A02
            float r2 = (float) r0
            int r0 = r14.A01
            float r1 = (float) r0
            r0 = 0
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r0, r0, r2, r1)
            r5.mapRect(r4)
            r4.offsetTo(r0, r0)
            float r0 = r4.width()
            double r0 = (double) r0
            double r1 = java.lang.Math.rint(r0)
            float r0 = (float) r1
            int r12 = (int) r0
            float r0 = r4.height()
            double r0 = (double) r0
            double r1 = java.lang.Math.rint(r0)
            float r0 = (float) r1
            int r13 = (int) r0
            float r8 = (float) r12
            float r0 = (float) r13
            float r8 = r8 / r0
            r14.A0H = r8
            int r10 = r14.A07
            float r6 = (float) r10
            int r11 = r14.A06
            float r2 = (float) r11
            float r4 = r6 / r2
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r14.A08
            boolean r1 = r0.A04
            if (r1 != 0) goto L_0x0086
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r9 = 0
            if (r0 > 0) goto L_0x007b
            r9 = 1
        L_0x007b:
            r0 = 1061158912(0x3f400000, float:0.75)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r0 = 0
            if (r5 <= 0) goto L_0x0083
            r0 = 1
        L_0x0083:
            if (r9 != r0) goto L_0x0086
            r7 = 1
        L_0x0086:
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r7 != 0) goto L_0x009d
            boolean r0 = A0M
            if (r0 != 0) goto L_0x009d
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a5
            float r8 = r8 / r4
            r14.A00 = r8
        L_0x0095:
            r14.A0I = r5
        L_0x0097:
            r14.A0B = r3
            r14.A03()
            return
        L_0x009d:
            float r6 = r6 / r8
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r0 = (int) r6
            float r4 = (float) r0
            float r4 = r4 / r2
            goto L_0x00bf
        L_0x00a5:
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c4
            if (r1 != 0) goto L_0x00bc
            java.lang.String r6 = "Scale to height:\noutput surface="
            java.lang.String r7 = " x "
            java.lang.String r8 = "\nfinal input texture="
            r9 = r7
            java.lang.String r2 = X.002.A10(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = r14.A09
            r0 = 0
            X.0kD.A07(r1, r2, r0)
        L_0x00bc:
            float r0 = r14.A0H
            float r4 = r4 / r0
        L_0x00bf:
            r14.A0I = r4
            r14.A00 = r5
            goto L_0x0097
        L_0x00c4:
            r14.A00 = r5
            goto L_0x0095
        L_0x00c7:
            int r0 = r14.A05
            goto L_0x002b
        L_0x00cb:
            int r0 = r14.A03
            goto L_0x0025
        L_0x00cf:
            int r0 = r14.A05
            r14.A02 = r0
            int r0 = r14.A03
            r14.A01 = r0
            int r0 = r14.A04
            r14.A0J = r0
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig.A01():void");
    }

    public final void A02() {
        TransformMatrixParams transformMatrixParams = this.A08;
        synchronized (transformMatrixParams) {
            transformMatrixParams.A01 = 1.0f;
            transformMatrixParams.A00 = 0.0f;
            transformMatrixParams.A02 = 0.0f;
            transformMatrixParams.A03 = 0.0f;
        }
    }

    public final void A04(float f) {
        this.A08.A02 = f / ((float) this.A07);
    }

    public final void A05(float f) {
        this.A08.A03 = f / ((float) this.A06);
    }

    public final float[] C5o() {
        return A00().A08.A01;
    }

    public TransformMatrixConfig() {
        this.A0G = true;
        this.A09 = "";
        Integer num = AnonymousClass05K.A00;
        this.A08 = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
    }
}
