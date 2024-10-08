package X;

import org.webrtc.CameraEnumerationAndroid;

public abstract class SMh {
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 7350};

    public static int A00(ST7 st7) {
        int i;
        int A06 = st7.A06(4);
        if (A06 == 15) {
            if (st7.A04() >= 24) {
                return st7.A06(24);
            }
            i = 1177;
        } else if (A06 < 13) {
            return A01[A06];
        } else {
            i = 1178;
        }
        throw Pxf.A0L(C273654mx.A00(i), (Throwable) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        throw new X.XQX(r2.toString(), (java.lang.Throwable) null, 1, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C10509RtO A01(X.ST7 r10, boolean r11) {
        /*
            r0 = 5
            int r8 = r10.A06(r0)
            r5 = 31
            if (r8 != r5) goto L_0x0010
            r0 = 6
            int r0 = r10.A06(r0)
            int r8 = r0 + 32
        L_0x0010:
            int r4 = A00(r10)
            r2 = 4
            int r9 = r10.A06(r2)
            java.lang.String r0 = "mp4a.40."
            java.lang.String r3 = X.002.A0O(r0, r8)
            r1 = 5
            if (r8 == r1) goto L_0x0027
            r0 = 29
            if (r8 != r0) goto L_0x0040
        L_0x0027:
            int r4 = A00(r10)
            int r8 = r10.A06(r1)
            if (r8 != r5) goto L_0x0038
            r0 = 6
            int r0 = r10.A06(r0)
            int r8 = r0 + 32
        L_0x0038:
            r0 = 22
            if (r8 != r0) goto L_0x0040
            int r9 = r10.A06(r2)
        L_0x0040:
            if (r11 == 0) goto L_0x00ab
            r7 = 1
            r6 = 3
            r5 = 2
            if (r8 == r7) goto L_0x0072
            if (r8 == r5) goto L_0x0072
            if (r8 == r6) goto L_0x0072
            if (r8 == r2) goto L_0x0072
            r0 = 6
            if (r8 == r0) goto L_0x0072
            r0 = 7
            if (r8 == r0) goto L_0x0072
            r0 = 17
            if (r8 == r0) goto L_0x0072
            switch(r8) {
                case 19: goto L_0x0072;
                case 20: goto L_0x0072;
                case 21: goto L_0x0072;
                case 22: goto L_0x0072;
                case 23: goto L_0x0072;
                default: goto L_0x005a;
            }
        L_0x005a:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported audio object type: "
            r2.append(r0)
            r2.append(r8)
        L_0x0066:
            java.lang.String r3 = r2.toString()
            r1 = 0
            r0 = 0
            X.XQX r2 = new X.XQX
            r2.<init>(r3, r1, r7, r0)
            throw r2
        L_0x0072:
            boolean r0 = r10.A0F()
            if (r0 == 0) goto L_0x007f
            java.lang.String r1 = "AacUtil"
            java.lang.String r0 = "Unexpected frameLengthFlag = 1"
            X.STH.A03(r1, r0)
        L_0x007f:
            boolean r0 = r10.A0F()
            if (r0 == 0) goto L_0x008a
            r0 = 14
            r10.A0A(r0)
        L_0x008a:
            boolean r2 = r10.A0F()
            if (r9 == 0) goto L_0x00e8
            r0 = 6
            r1 = 20
            if (r8 == r0) goto L_0x0097
            if (r8 != r1) goto L_0x009a
        L_0x0097:
            r10.A0A(r6)
        L_0x009a:
            if (r2 == 0) goto L_0x00a8
            r0 = 22
            if (r8 != r0) goto L_0x00c2
            r0 = 16
            r10.A0A(r0)
        L_0x00a5:
            r10.A0A(r7)
        L_0x00a8:
            switch(r8) {
                case 17: goto L_0x00b9;
                case 18: goto L_0x00ab;
                case 19: goto L_0x00b9;
                case 20: goto L_0x00b9;
                case 21: goto L_0x00b9;
                case 22: goto L_0x00b9;
                case 23: goto L_0x00b9;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            int[] r0 = A00
            r2 = r0[r9]
            r0 = -1
            r1 = 0
            if (r2 == r0) goto L_0x00e1
            X.RtO r0 = new X.RtO
            r0.<init>(r4, r2, r3)
            return r0
        L_0x00b9:
            int r1 = r10.A06(r5)
            if (r1 == r5) goto L_0x00d4
            if (r1 == r6) goto L_0x00d4
            goto L_0x00ab
        L_0x00c2:
            r0 = 17
            if (r8 == r0) goto L_0x00d0
            r0 = 19
            if (r8 == r0) goto L_0x00d0
            if (r8 == r1) goto L_0x00d0
            r0 = 23
            if (r8 != r0) goto L_0x00a5
        L_0x00d0:
            r10.A0A(r6)
            goto L_0x00a5
        L_0x00d4:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported epConfig: "
            r2.append(r0)
            r2.append(r1)
            goto L_0x0066
        L_0x00e1:
            r0 = 1
            X.XQX r2 = new X.XQX
            r2.<init>(r1, r1, r0, r0)
            throw r2
        L_0x00e8:
            java.lang.UnsupportedOperationException r2 = X.C66580MXl.A11()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SMh.A01(X.ST7, boolean):X.RtO");
    }
}
