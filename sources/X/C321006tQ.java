package X;

/* renamed from: X.6tQ  reason: invalid class name and case insensitive filesystem */
public final class C321006tQ extends C321016tR {
    public final int A00 = hashCode();
    public final int A01 = 129900646;
    public final 02m A02 = 02m.A0p;
    public final boolean A03;
    public final C320986tO A04;

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0144, code lost:
        if (r5 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0148, code lost:
        if (r5 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DOa(X.C20997X8u r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            r0 = 1
            X.0qQ.A0B(r8, r0)
            r0 = 2
            X.0qQ.A0B(r10, r0)
            java.lang.String r2 = "sticker_download_end"
            X.02m r5 = r7.A02
            if (r5 == 0) goto L_0x0019
            int r1 = r7.A01
            int r0 = r7.A00
            r5.markerPoint(r1, r0, r2)
        L_0x0019:
            X.6tO r0 = r7.A04
            if (r0 == 0) goto L_0x0020
            r0.DOa(r8, r9, r10)
        L_0x0020:
            r7.A0B(r8, r9, r10)
            if (r5 == 0) goto L_0x003e
            int r3 = r7.A01
            int r2 = r7.A00
            java.lang.String r1 = r7.A0n
            java.lang.String r0 = "surface"
            r5.markerAnnotate(r3, r2, r0, r1)
            java.lang.String r1 = r7.A0m
            java.lang.String r0 = "sticker_pack"
            r5.markerAnnotate(r3, r2, r0, r1)
            java.lang.String r1 = "media_type"
            java.lang.String r0 = "animation"
            r5.markerAnnotate(r3, r2, r1, r0)
        L_0x003e:
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x0148
            if (r5 == 0) goto L_0x0074
            int r3 = r7.A01
            int r2 = r7.A00
            java.lang.String r1 = r7.A0k
            java.lang.String r0 = "template_id"
            r5.markerAnnotate(r3, r2, r0, r1)
        L_0x004f:
            int r3 = r7.A01
            int r2 = r7.A00
            java.lang.Integer r0 = r7.A0h
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "fps"
            r5.markerAnnotate(r3, r2, r0, r1)
            int r0 = r7.A03
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "height"
            r5.markerAnnotate(r3, r2, r0, r1)
            int r0 = r7.A04
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "width"
            r5.markerAnnotate(r3, r2, r0, r1)
        L_0x0074:
            X.7Sw r0 = X.C331897Sw.A0A
            android.content.Context r0 = r7.A0W
            X.7Sw r4 = X.C331917Sy.A00(r0)
            java.lang.String r1 = r7.A0E
            if (r1 != 0) goto L_0x0082
            java.lang.String r1 = r7.A0l
        L_0x0082:
            r6 = 0
            X.0qQ.A0B(r1, r6)
            X.7Sz r0 = r4.A03
            java.lang.String r3 = r0.A00(r1)
            X.0bY r0 = r4.A01
            android.net.Uri r2 = X.0cp.A01(r0, r1)
            if (r2 == 0) goto L_0x0144
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "file"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00fe
            java.lang.String r1 = r2.getPath()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            byte[] r0 = X.C272134kB.A03(r0)
        L_0x00ad:
            if (r0 == 0) goto L_0x0144
            if (r5 == 0) goto L_0x00d6
            int r3 = r7.A01
            int r2 = r7.A00
            int r1 = r0.length
            java.lang.String r0 = "size"
            r5.markerAnnotate(r3, r2, r0, r1)
        L_0x00bb:
            int r4 = r7.A01
            int r3 = r7.A00
            X.X8u r2 = r7.A0A
            boolean r0 = r2 instanceof X.C14026ToS
            java.lang.String r1 = "webp"
            if (r0 != 0) goto L_0x00d1
            boolean r0 = r2 instanceof X.WXU
            if (r0 != 0) goto L_0x00d1
            boolean r0 = r2 instanceof X.WXV
            if (r0 == 0) goto L_0x00fc
            java.lang.String r1 = "gif"
        L_0x00d1:
            java.lang.String r0 = "file_format"
            r5.markerAnnotate(r4, r3, r0, r1)
        L_0x00d6:
            X.X8u r0 = r7.A0A
            if (r0 == 0) goto L_0x00ed
            int r0 = r0.getFrameCount()
            if (r5 == 0) goto L_0x00ed
            int r3 = r7.A01
            int r2 = r7.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "total_frames"
            r5.markerAnnotate(r3, r2, r0, r1)
        L_0x00ed:
            java.lang.String r2 = "sticker_first_playback_start"
            if (r5 == 0) goto L_0x00f8
            int r1 = r7.A01
            int r0 = r7.A00
            r5.markerPoint(r1, r0, r2)
        L_0x00f8:
            r7.A09()
            return
        L_0x00fc:
            r1 = 0
            goto L_0x00d1
        L_0x00fe:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0144
            X.0eM r1 = r4.A08
            java.lang.Object r0 = r1.getValue()
            X.1JG r0 = (X.1JG) r0
            boolean r0 = r0.CJV(r3)
            if (r0 == 0) goto L_0x0144
            java.lang.Object r0 = r1.getValue()
            X.1JG r0 = (X.1JG) r0
            X.2ic r1 = r0.AX8(r3)
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x0144
            java.lang.Object r4 = r1.A00()
            java.io.InputStream r4 = (java.io.InputStream) r4
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]
        L_0x012d:
            int r1 = r4.read(r2)
            r0 = -1
            if (r1 == r0) goto L_0x0138
            r3.write(r2, r6, r1)
            goto L_0x012d
        L_0x0138:
            r3.flush()
            r4.close()
            byte[] r0 = r3.toByteArray()
            goto L_0x00ad
        L_0x0144:
            if (r5 == 0) goto L_0x00d6
            goto L_0x00bb
        L_0x0148:
            if (r5 == 0) goto L_0x0074
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321006tQ.DOa(X.X8u, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C321006tQ(android.content.Context r25, com.instagram.common.session.UserSession r26, X.C321076tX r27, X.C320986tO r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, float r35, int r36, int r37, boolean r38, boolean r39, boolean r40) {
        /*
            r24 = this;
            X.6oG r7 = X.C318046oG.AVATAR_ANIMATED
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            r4 = 0
            r21 = 0
            r19 = r36
            r18 = r35
            r17 = r34
            r22 = r39
            r5 = r26
            r3 = r25
            r20 = r37
            r2 = r24
            r9 = r27
            r10 = r28
            r11 = r29
            r13 = r30
            r14 = r31
            r15 = r32
            r16 = r33
            r6 = r4
            r8 = r4
            r23 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.02m r0 = X.02m.A0p
            r2.A02 = r0
            r0 = 129900646(0x7be2066, float:2.8607065E-34)
            r2.A01 = r0
            int r0 = r2.hashCode()
            r2.A00 = r0
            r0 = r38
            r2.A03 = r0
            r2.A04 = r10
            if (r40 != 0) goto L_0x0046
            A00(r2, r13)
        L_0x0046:
            r1 = 47
            X.9L2 r0 = new X.9L2
            r0.<init>(r2, r1)
            r2.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321006tQ.<init>(android.content.Context, com.instagram.common.session.UserSession, X.6tX, X.6tO, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, int, int, boolean, boolean, boolean):void");
    }

    public static final void A00(C321006tQ r5, String str) {
        String str2;
        02m r4 = r5.A02;
        if (r4 != null) {
            int i = r5.A01;
            int i2 = r5.A00;
            r4.markerStart(i, i2);
            C331897Sw r0 = C331897Sw.A0A;
            if (C331917Sy.A00(r5.A0W).A07(r5.A0l)) {
                str2 = "cache";
            } else {
                str2 = "network";
            }
            r4.markerAnnotate(i, i2, "source", str2);
        }
        if (r4 != null) {
            r4.markerPoint(r5.A01, r5.A00, "sticker_download_start");
        }
        r5.A0C(str);
    }
}
