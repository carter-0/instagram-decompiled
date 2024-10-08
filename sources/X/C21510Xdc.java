package X;

import androidx.media3.common.util.Util;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.Xdc  reason: case insensitive filesystem */
public abstract class C21510Xdc {
    public static boolean A01(C11389SRd sRd, XYq xYq, C22017XrB xrB, int i) {
        int i2;
        int A08;
        C11389SRd sRd2 = sRd;
        long A0C = sRd2.A0C();
        long j = A0C >>> 16;
        if (j != ((long) i)) {
            return false;
        }
        boolean A1Q = AnonymousClass7TF.A1Q(((j & 1) > 1 ? 1 : ((j & 1) == 1 ? 0 : -1)));
        int i3 = (int) ((A0C >> 12) & 15);
        int i4 = (int) ((A0C >> 8) & 15);
        int i5 = (int) (15 & (A0C >> 4));
        int i6 = (int) ((A0C >> 1) & 7);
        boolean A1Q2 = AnonymousClass7TF.A1Q(((A0C & 1) > 1 ? 1 : ((A0C & 1) == 1 ? 0 : -1)));
        C22017XrB xrB2 = xrB;
        if (i5 <= 7) {
            i2 = xrB2.A02 - 1;
        } else if (i5 > 10) {
            return false;
        } else {
            i5 = xrB2.A02;
            i2 = 2;
        }
        if (i5 != i2) {
            return false;
        }
        if ((i6 != 0 && i6 != xrB2.A01) || A1Q2) {
            return false;
        }
        try {
            long A0E = sRd2.A0E();
            if (!A1Q) {
                A0E *= (long) xrB2.A03;
            }
            xYq.A00 = A0E;
            int A00 = A00(sRd2, i3);
            if (A00 == -1 || A00 > xrB2.A03) {
                return false;
            }
            int i7 = xrB2.A07;
            if (i4 != 0) {
                if (i4 > 11) {
                    if (i4 == 12) {
                        A08 = sRd2.A05() * IgNetworkConsentStorage.MAX_ENTRIES;
                    } else if (i4 > 14) {
                        return false;
                    } else {
                        A08 = sRd2.A08();
                        if (i4 == 14) {
                            A08 *= 10;
                        }
                    }
                    if (A08 != i7) {
                        return false;
                    }
                } else if (i4 != xrB2.A08) {
                    return false;
                }
            }
            int A05 = sRd2.A05();
            int i8 = sRd2.A01;
            byte[] bArr = sRd2.A02;
            int i9 = i8 - 1;
            int i10 = 0;
            for (int i11 = sRd2.A01; i11 < i9; i11++) {
                i10 = Util.A0A[i10 ^ (bArr[i11] & 255)];
            }
            if (A05 == i10) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        return r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return r1 << r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C11389SRd r1, int r2) {
        /*
            switch(r2) {
                case 1: goto L_0x001c;
                case 2: goto L_0x0016;
                case 3: goto L_0x0016;
                case 4: goto L_0x0016;
                case 5: goto L_0x0016;
                case 6: goto L_0x000f;
                case 7: goto L_0x000a;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = -1
            return r1
        L_0x0005:
            r1 = 256(0x100, float:3.59E-43)
            int r0 = r2 + -8
            goto L_0x001a
        L_0x000a:
            int r0 = r1.A08()
            goto L_0x0013
        L_0x000f:
            int r0 = r1.A05()
        L_0x0013:
            int r1 = r0 + 1
            return r1
        L_0x0016:
            r1 = 576(0x240, float:8.07E-43)
            int r0 = r2 + -2
        L_0x001a:
            int r1 = r1 << r0
            return r1
        L_0x001c:
            r1 = 192(0xc0, float:2.69E-43)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21510Xdc.A00(X.SRd, int):int");
    }
}
