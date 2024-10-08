package X;

import java.util.concurrent.Callable;

/* renamed from: X.7qP  reason: invalid class name and case insensitive filesystem */
public final class C343557qP implements Callable {
    public final /* synthetic */ C340597lW A00;
    public final /* synthetic */ C343147pk A01;

    public C343557qP(C340597lW r1, C343147pk r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r0.intValue() == 1) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0239, code lost:
        if (r9 == 1) goto L_0x023b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r19 = this;
            r5 = r19
            X.7lW r2 = r5.A00
            X.7p2 r0 = r2.A08
            if (r0 == 0) goto L_0x02fc
            android.hardware.camera2.CaptureRequest$Builder r0 = r2.A06
            if (r0 == 0) goto L_0x02fc
            android.hardware.camera2.CameraDevice r0 = r2.A0j
            if (r0 == 0) goto L_0x02fc
            X.7p0 r0 = r2.A0D
            if (r0 == 0) goto L_0x02fc
            X.7p2 r0 = r2.A08
            X.7p4 r9 = X.C342717p3.A0J
            java.lang.Object r0 = r0.A02(r9)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            X.7p2 r1 = r2.A08
            if (r1 == 0) goto L_0x02f9
            X.7p4 r0 = X.C342717p3.A0e
            java.lang.Object r0 = r1.A02(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x02f9
            int r0 = r0.intValue()
            r7 = 1
            if (r0 != r7) goto L_0x02f9
        L_0x003a:
            X.7p2 r0 = r2.A08
            X.7p4 r1 = X.C342717p3.A03
            java.lang.Object r0 = r0.A02(r1)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            X.7p2 r0 = r2.A08
            X.7p4 r10 = X.C342717p3.A0M
            java.lang.Object r0 = r0.A02(r10)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r12 = r0.booleanValue()
            X.7p2 r0 = r2.A08
            X.7p4 r3 = X.C342717p3.A02
            java.lang.Object r0 = r0.A02(r3)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.HashMap r11 = new java.util.HashMap
            if (r0 == 0) goto L_0x02f4
            r11.<init>(r0)
        L_0x006d:
            X.7p2 r4 = r2.A08
            X.7pk r0 = r5.A01
            boolean r0 = r4.A04(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00be
            X.7lu r5 = r2.A0R
            boolean r0 = r5.A0S
            if (r0 == 0) goto L_0x00be
            X.7nh r0 = r2.A0C
            r4 = 1
            if (r0 == 0) goto L_0x00cf
            X.7p2 r0 = r2.A08
            java.lang.Object r0 = r0.A02(r10)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r10 = r0.booleanValue()
            X.7p2 r0 = r2.A08
            java.lang.Object r0 = r0.A02(r3)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.HashMap r3 = new java.util.HashMap
            if (r0 == 0) goto L_0x00cb
            r3.<init>(r0)
        L_0x00a8:
            if (r12 == r10) goto L_0x02d1
            if (r10 == 0) goto L_0x00b1
            X.7nh r0 = r2.A0C
            r0.EOp(r3)
        L_0x00b1:
            X.7nh r0 = r2.A0C
            boolean r0 = r0.CO8()
            if (r0 != 0) goto L_0x00c1
            X.7nh r0 = r2.A0C
            r0.setUseArCoreIfSupported(r10)
        L_0x00be:
            X.7p2 r0 = r2.A08
            return r0
        L_0x00c1:
            X.C340597lW.A05(r2, r4)
            X.7nh r0 = r2.A0C
            r0.setUseArCoreIfSupported(r10)
            goto L_0x02e3
        L_0x00cb:
            r3.<init>()
            goto L_0x00a8
        L_0x00cf:
            X.7p2 r3 = r2.A08
            X.7p4 r0 = X.C342717p3.A0U
            java.lang.Object r0 = r3.A02(r0)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.A0o = r0
            X.7p2 r3 = r2.A08
            X.7p4 r0 = X.C342717p3.A0Q
            java.lang.Object r0 = r3.A02(r0)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0100
            X.7po r0 = r2.A0k
            if (r0 == 0) goto L_0x0100
            X.7lt r3 = r2.A0P
            X.7po r0 = r2.A0k
            r3.A04(r0)
        L_0x0100:
            r5.A06()
            r11 = 0
            android.hardware.camera2.CaptureRequest$Builder r10 = r2.A06
            X.7p2 r3 = r2.A08
            X.7p0 r0 = r2.A0D
            X.C343587qS.A01(r10, r3, r0, r11)
            android.hardware.camera2.CaptureRequest$Builder r10 = r2.A06
            X.7p2 r3 = r2.A08
            X.7p0 r0 = r2.A0D
            X.C343587qS.A01(r10, r3, r0, r4)
            android.hardware.camera2.CaptureRequest$Builder r11 = r2.A06
            X.7p2 r10 = r2.A08
            X.7p0 r0 = r2.A0D
            r3 = 2
            X.C343587qS.A01(r11, r10, r0, r3)
            r12 = 3
            android.hardware.camera2.CaptureRequest$Builder r11 = r2.A06
            X.7p2 r10 = r2.A08
            X.7p0 r0 = r2.A0D
            X.C343587qS.A01(r11, r10, r0, r12)
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            r0 = 4
            X.C343587qS.A01(r12, r11, r10, r0)
            r13 = 5
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r13 = 6
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r13 = 7
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r13 = 8
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r13 = 9
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r13 = 10
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r13 = 11
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r13 = 12
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r13 = 13
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r13 = 14
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r13 = 15
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            X.C343587qS.A01(r12, r11, r10, r13)
            r18 = 0
            android.hardware.camera2.CameraManager r13 = r2.A0M
            android.hardware.camera2.CameraDevice r10 = r2.A0j
            java.lang.String r17 = r10.getId()
            android.hardware.camera2.CaptureRequest$Builder r14 = r2.A06
            X.7p2 r15 = r2.A08
            X.7p0 r10 = r2.A0D
            r16 = r10
            X.C343587qS.A00(r13, r14, r15, r16, r17, r18)
            android.hardware.camera2.CameraDevice r10 = r2.A0j
            java.lang.String r17 = r10.getId()
            android.hardware.camera2.CaptureRequest$Builder r12 = r2.A06
            X.7p2 r11 = r2.A08
            X.7p0 r10 = r2.A0D
            r14 = r12
            r15 = r11
            r16 = r10
            r18 = r4
            X.C343587qS.A00(r13, r14, r15, r16, r17, r18)
            X.7p0 r11 = r2.A0D
            X.7p1 r10 = X.C342687p0.A0F
            java.lang.Object r10 = r11.A01(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x01eb
            X.7p2 r11 = r2.A08
            X.7p4 r10 = X.C342717p3.A0l
            r11.A02(r10)
        L_0x01eb:
            X.7p2 r12 = r5.A0A
            if (r12 == 0) goto L_0x0204
            X.7po r11 = r5.A08
            if (r11 == 0) goto L_0x0204
            X.7p4 r10 = X.C342717p3.A0S
            java.lang.Object r10 = r12.A02(r10)
            r10.getClass()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r11.A0I = r10
        L_0x0204:
            X.7p2 r10 = r2.A08
            java.lang.Object r9 = r10.A02(r9)
            r9.getClass()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == r8) goto L_0x0226
            X.C340597lW.A05(r2, r4)
            android.hardware.camera2.CameraDevice r0 = r2.A0j
            java.lang.String r1 = r0.getId()
            r0 = 0
            X.C340597lW.A02(r2, r0, r1)
            r2.A0p = r9
            goto L_0x00be
        L_0x0226:
            X.7p2 r9 = r2.A08
            if (r9 == 0) goto L_0x029e
            X.7p4 r8 = X.C342717p3.A0e
            java.lang.Object r8 = r9.A02(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            if (r8 == 0) goto L_0x029e
            int r9 = r8.intValue()
            r8 = 1
            if (r9 != r4) goto L_0x029e
        L_0x023b:
            X.7p0 r9 = r2.A0D
            boolean r9 = r9 instanceof X.C343617qV
            if (r9 == 0) goto L_0x02a0
            X.7lp r9 = r2.A0Q
            boolean r9 = r9.A0G
            if (r9 != 0) goto L_0x02a0
            X.7ls r9 = r2.A0S
            boolean r9 = r9.A0D
            if (r9 != 0) goto L_0x02a0
            if (r8 == r7) goto L_0x02a0
            r3 = 0
            X.7ou r1 = r2.A07
            if (r1 == 0) goto L_0x0277
            float r1 = r1.A06()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r5 = r1.floatValue()
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r1 = "Google"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L_0x029b
            r1 = 1063423094(0x3f628c76, float:0.88495576)
            if (r8 == 0) goto L_0x0272
            r1 = 1066443735(0x3f90a3d7, float:1.13)
        L_0x0272:
            float r5 = r5 * r1
            java.lang.Float r3 = java.lang.Float.valueOf(r5)
        L_0x0277:
            X.C340597lW.A05(r2, r4)
            X.7p0 r1 = r2.A0D
            X.7qV r1 = (X.C343617qV) r1
            if (r8 != 0) goto L_0x0281
            r0 = -1
        L_0x0281:
            r1.A02(r0)
            android.hardware.camera2.CameraDevice r0 = r2.A0j
            java.lang.String r0 = r0.getId()
            r2.A0B(r0)
            X.C340597lW.A01(r2)
            android.hardware.camera2.CameraDevice r0 = r2.A0j
            java.lang.String r0 = r0.getId()
            X.C340597lW.A02(r2, r3, r0)
            goto L_0x00be
        L_0x029b:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0272
        L_0x029e:
            r8 = 0
            goto L_0x023b
        L_0x02a0:
            X.7p2 r0 = r2.A08
            java.lang.Object r0 = r0.A02(r1)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            X.7p0 r0 = r2.A0D
            boolean r0 = r0 instanceof X.C343617qV
            if (r0 == 0) goto L_0x02ef
            if (r1 == r6) goto L_0x02ef
            X.C340597lW.A05(r2, r4)
            X.7p0 r0 = r2.A0D
            X.7qV r0 = (X.C343617qV) r0
            if (r1 != 0) goto L_0x02c1
            r3 = -1
        L_0x02c1:
            r0.A02(r3)
            android.hardware.camera2.CameraDevice r0 = r2.A0j
            java.lang.String r0 = r0.getId()
            r2.A0B(r0)
            X.C340597lW.A01(r2)
            goto L_0x02e3
        L_0x02d1:
            if (r12 == 0) goto L_0x00cf
            if (r10 == 0) goto L_0x00cf
            boolean r0 = r3.equals(r11)
            if (r0 != 0) goto L_0x00cf
            X.C340597lW.A05(r2, r4)
            X.7nh r0 = r2.A0C
            r0.EOp(r3)
        L_0x02e3:
            android.hardware.camera2.CameraDevice r0 = r2.A0j
            java.lang.String r1 = r0.getId()
            r0 = 0
            X.C340597lW.A02(r2, r0, r1)
            goto L_0x00be
        L_0x02ef:
            r5.A05()
            goto L_0x00be
        L_0x02f4:
            r11.<init>()
            goto L_0x006d
        L_0x02f9:
            r7 = 0
            goto L_0x003a
        L_0x02fc:
            java.lang.String r1 = "Cannot modify settings, camera was closed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343557qP.call():java.lang.Object");
    }
}
