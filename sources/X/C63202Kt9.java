package X;

/* renamed from: X.Kt9  reason: case insensitive filesystem */
public abstract class C63202Kt9 {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        if (X.182.A06(X.0Tu.A05, r13, 36313025069712998L) == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        if (X.DbY.A1Z(X.0Tu.A06, r11, 36317723764397528L) == false) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x005e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(android.content.Context r27, com.instagram.common.session.UserSession r28, X.L6Q r29, X.L4D r30, X.C62461KgB[] r31, int r32, boolean r33, boolean r34, boolean r35) {
        /*
            r23 = 0
            r7 = r27
            r15 = r28
            X.AnonymousClass7TF.A1H(r7, r15)
            r14 = 2
            r6 = r29
            r5 = r30
            X.AnonymousClass7TF.A1C(r6, r14, r5)
            r0 = 8
            r4 = r31
            X.0qQ.A0B(r4, r0)
            int r8 = r4.length
            java.util.ArrayList r3 = X.DbS.A0v(r8)
            r2 = 0
        L_0x001e:
            if (r2 >= r8) goto L_0x011d
            r0 = r4[r2]
            X.KgB r10 = X.C62461KgB.GALLERY
            r21 = r32
            r22 = r33
            if (r0 != r10) goto L_0x00a7
            X.1Av r9 = X.1Au.A00(r15)
            X.0s0 r1 = r9.A7B
            X.0YZ[] r12 = X.1Av.A8a
            r0 = 34
            boolean r0 = X.AnonymousClass7TG.A1a(r9, r1, r12, r0)
            java.lang.String r11 = "RenderConfigUtil"
            if (r0 == 0) goto L_0x00a1
            X.1Av r9 = X.1Au.A00(r15)
            X.0s0 r1 = r9.A7E
            r0 = 33
            boolean r0 = X.AnonymousClass7TG.A1a(r9, r1, r12, r0)
            if (r0 == 0) goto L_0x00a1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r9 = 0
            if (r1 > r0) goto L_0x0061
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = X.1DL.A07(r7, r0)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "Won't render for gallery: No permission to write to external storage"
        L_0x005b:
            X.0kD.A0C(r11, r0, r9)
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0061:
            if (r34 != 0) goto L_0x0090
            com.instagram.common.session.UserSession r13 = r6.A00
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0077
            X.0Tu r12 = X.0Tu.A05
            r0 = 36313025069712998(0x81028100000666, double:3.027841502677401E-306)
            boolean r1 = X.182.A06(r12, r13, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            if (r0 == 0) goto L_0x0090
            java.lang.Integer r18 = X.AnonymousClass05K.A0C
            java.lang.String r0 = ".webp"
        L_0x007e:
            java.io.File r0 = X.0qc.A00(r7, r0)
            if (r0 == 0) goto L_0x008d
            java.lang.String r19 = r0.getAbsolutePath()
        L_0x0088:
            if (r19 != 0) goto L_0x0095
            java.lang.String r0 = "Won't render for gallery: Unable to create photo file path"
            goto L_0x005b
        L_0x008d:
            r19 = 0
            goto L_0x0088
        L_0x0090:
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            java.lang.String r0 = ".jpg"
            goto L_0x007e
        L_0x0095:
            X.LAM r0 = new X.LAM
            r20 = r14
            r17 = r10
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0118
        L_0x00a1:
            java.lang.String r0 = "Gallery render disabled by setting"
            X.0KC.A0D(r11, r0)
            goto L_0x005e
        L_0x00a7:
            r0 = r4[r2]
            X.KgB r9 = X.C62461KgB.UPLOAD
            if (r0 != r9) goto L_0x005e
            if (r34 != 0) goto L_0x00f5
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x00c9
            com.instagram.common.session.UserSession r11 = r5.A00
            boolean r0 = X.C11103SAe.A01(r11)
            if (r0 == 0) goto L_0x00c9
            X.0Tu r10 = X.0Tu.A06
            r0 = 36317723764397528(0x8106c7000715d8, double:3.0308129761160226E-306)
            boolean r1 = X.DbY.A1Z(r10, r11, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00ca
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            if (r0 == 0) goto L_0x00dd
            java.lang.Integer r26 = X.AnonymousClass05K.A00
            r27 = 0
            java.lang.String r0 = ".heic"
            java.io.File r0 = X.0qc.A01(r0)     // Catch:{ IOException -> 0x00fc }
            if (r0 == 0) goto L_0x0104
            java.lang.String r27 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x00fc }
            goto L_0x0104
        L_0x00dd:
            boolean r0 = r6.A01
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f5
            java.lang.Integer r26 = X.AnonymousClass05K.A0C
            java.lang.String r0 = ".webp"
            java.io.File r0 = X.0qc.A01(r0)
            if (r0 == 0) goto L_0x00f2
            java.lang.String r27 = r0.getAbsolutePath()
            goto L_0x0104
        L_0x00f2:
            r27 = 0
            goto L_0x0104
        L_0x00f5:
            java.lang.Integer r26 = X.AnonymousClass05K.A01
            java.lang.String r27 = X.0qc.A02()
            goto L_0x0104
        L_0x00fc:
            r10 = move-exception
            java.lang.String r1 = "PhotoFileUtil"
            java.lang.String r0 = "unable to create heic temp file"
            X.0KC.A0F(r1, r0, r10)
        L_0x0104:
            if (r27 == 0) goto L_0x005e
            r28 = 2147483647(0x7fffffff, float:NaN)
            X.LAM r0 = new X.LAM
            r31 = r35
            r24 = r0
            r25 = r9
            r29 = r21
            r30 = r22
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
        L_0x0118:
            r3.add(r0)
            goto L_0x005e
        L_0x011d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63202Kt9.A00(android.content.Context, com.instagram.common.session.UserSession, X.L6Q, X.L4D, X.KgB[], int, boolean, boolean, boolean):java.util.ArrayList");
    }
}
