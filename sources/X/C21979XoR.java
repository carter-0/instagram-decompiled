package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* renamed from: X.XoR  reason: case insensitive filesystem */
public final class C21979XoR {
    public static final C21979XoR A0W = new C21979XoR(new Object());
    public final Uri A00;
    public final Bundle A01;
    public final Boolean A02;
    public final Boolean A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final CharSequence A0A;
    public final CharSequence A0B;
    public final CharSequence A0C;
    public final CharSequence A0D;
    public final CharSequence A0E;
    public final CharSequence A0F;
    public final CharSequence A0G;
    public final Integer A0H;
    public final Integer A0I;
    @Deprecated
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final Integer A0P;
    public final Integer A0Q;
    public final Integer A0R;
    public final Integer A0S;
    public final Integer A0T;
    public final Long A0U;
    public final byte[] A0V;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C21979XoR xoR = (C21979XoR) obj;
            if (!Util.A0E(this.A0F, xoR.A0F) || !Util.A0E(this.A06, xoR.A06) || !Util.A0E(this.A05, xoR.A05) || !Util.A0E(this.A04, xoR.A04) || !Util.A0E(this.A0B, xoR.A0B) || !Util.A0E(this.A0E, xoR.A0E) || !Util.A0E(this.A0A, xoR.A0A) || !Util.A0E(this.A0U, xoR.A0U) || !Arrays.equals(this.A0V, xoR.A0V) || !Util.A0E(this.A0H, xoR.A0H) || !Util.A0E(this.A00, xoR.A00) || !Util.A0E(this.A0T, xoR.A0T) || !Util.A0E(this.A0S, xoR.A0S) || !Util.A0E(this.A0J, xoR.A0J) || !Util.A0E(this.A02, xoR.A02) || !Util.A0E(this.A03, xoR.A03) || !Util.A0E(this.A0N, xoR.A0N) || !Util.A0E(this.A0M, xoR.A0M) || !Util.A0E(this.A0L, xoR.A0L) || !Util.A0E(this.A0Q, xoR.A0Q) || !Util.A0E(this.A0P, xoR.A0P) || !Util.A0E(this.A0O, xoR.A0O) || !Util.A0E(this.A0G, xoR.A0G) || !Util.A0E(this.A08, xoR.A08) || !Util.A0E(this.A09, xoR.A09) || !Util.A0E(this.A0I, xoR.A0I) || !Util.A0E(this.A0R, xoR.A0R) || !Util.A0E(this.A0C, xoR.A0C) || !Util.A0E(this.A07, xoR.A07) || !Util.A0E(this.A0D, xoR.A0D) || !Util.A0E(this.A0K, xoR.A0K) || DbW.A1a(this.A01) != DbW.A1a(xoR.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[34];
        CharSequence charSequence = this.A0F;
        boolean z = false;
        CharSequence charSequence2 = this.A06;
        CharSequence charSequence3 = this.A05;
        CharSequence charSequence4 = this.A04;
        CharSequence charSequence5 = this.A0B;
        CharSequence charSequence6 = this.A0E;
        CharSequence charSequence7 = this.A0A;
        Long l = this.A0U;
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.A0V));
        Integer num = this.A0H;
        CharSequence charSequence8 = charSequence;
        CharSequence charSequence9 = charSequence2;
        CharSequence charSequence10 = charSequence3;
        CharSequence charSequence11 = charSequence4;
        CharSequence charSequence12 = charSequence5;
        CharSequence charSequence13 = charSequence6;
        CharSequence charSequence14 = charSequence7;
        Long l2 = l;
        Integer num2 = num;
        System.arraycopy(new Object[]{charSequence8, charSequence9, charSequence10, charSequence11, charSequence12, charSequence13, charSequence14, l2, null, null, valueOf, num2, this.A00, this.A0T, this.A0S, this.A0J, this.A02, this.A03, this.A0N, this.A0M, this.A0L, this.A0Q, this.A0P, this.A0O, this.A0G, this.A08, this.A09}, 0, objArr, 0, 27);
        Integer num3 = this.A0I;
        Integer num4 = this.A0R;
        CharSequence charSequence15 = this.A0C;
        CharSequence charSequence16 = this.A07;
        CharSequence charSequence17 = this.A0D;
        Integer num5 = this.A0K;
        if (this.A01 == null) {
            z = true;
        }
        System.arraycopy(new Object[]{num3, num4, charSequence15, charSequence16, charSequence17, num5, Boolean.valueOf(z)}, 0, objArr, 27, 7);
        return Arrays.hashCode(objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: int} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v43 */
    /* JADX WARNING: type inference failed for: r0v44 */
    /* JADX WARNING: type inference failed for: r0v45 */
    /* JADX WARNING: type inference failed for: r0v46 */
    /* JADX WARNING: type inference failed for: r0v47 */
    /* JADX WARNING: type inference failed for: r0v48 */
    /* JADX WARNING: type inference failed for: r0v49 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21979XoR(X.Xo1 r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Boolean r3 = r7.A02
            java.lang.Integer r4 = r7.A0J
            java.lang.Integer r2 = r7.A0K
            r0 = 0
            r5 = -1
            if (r3 == 0) goto L_0x00b6
            boolean r1 = r3.booleanValue()
            if (r1 != 0) goto L_0x0092
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
        L_0x0017:
            java.lang.CharSequence r0 = r7.A0F
            r6.A0F = r0
            java.lang.CharSequence r0 = r7.A06
            r6.A06 = r0
            java.lang.CharSequence r0 = r7.A05
            r6.A05 = r0
            java.lang.CharSequence r0 = r7.A04
            r6.A04 = r0
            java.lang.CharSequence r0 = r7.A0B
            r6.A0B = r0
            java.lang.CharSequence r0 = r7.A0E
            r6.A0E = r0
            java.lang.CharSequence r0 = r7.A0A
            r6.A0A = r0
            java.lang.Long r0 = r7.A0U
            r6.A0U = r0
            byte[] r0 = r7.A0V
            r6.A0V = r0
            java.lang.Integer r0 = r7.A0H
            r6.A0H = r0
            android.net.Uri r0 = r7.A00
            r6.A00 = r0
            java.lang.Integer r0 = r7.A0T
            r6.A0T = r0
            java.lang.Integer r0 = r7.A0S
            r6.A0S = r0
            r6.A0J = r4
            r6.A02 = r3
            java.lang.Boolean r0 = r7.A03
            r6.A03 = r0
            java.lang.Integer r0 = r7.A0N
            r6.A0N = r0
            java.lang.Integer r0 = r7.A0M
            r6.A0M = r0
            java.lang.Integer r0 = r7.A0L
            r6.A0L = r0
            java.lang.Integer r0 = r7.A0Q
            r6.A0Q = r0
            java.lang.Integer r0 = r7.A0P
            r6.A0P = r0
            java.lang.Integer r0 = r7.A0O
            r6.A0O = r0
            java.lang.CharSequence r0 = r7.A0G
            r6.A0G = r0
            java.lang.CharSequence r0 = r7.A08
            r6.A08 = r0
            java.lang.CharSequence r0 = r7.A09
            r6.A09 = r0
            java.lang.Integer r0 = r7.A0I
            r6.A0I = r0
            java.lang.Integer r0 = r7.A0R
            r6.A0R = r0
            java.lang.CharSequence r0 = r7.A0C
            r6.A0C = r0
            java.lang.CharSequence r0 = r7.A07
            r6.A07 = r0
            java.lang.CharSequence r0 = r7.A0D
            r6.A0D = r0
            r6.A0K = r2
            android.os.Bundle r0 = r7.A01
            r6.A01 = r0
            return
        L_0x0092:
            if (r4 == 0) goto L_0x009a
            int r1 = r4.intValue()
            if (r1 != r5) goto L_0x0017
        L_0x009a:
            if (r2 == 0) goto L_0x00a4
            int r0 = r2.intValue()
            switch(r0) {
                case 1: goto L_0x00aa;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00aa;
                case 4: goto L_0x00aa;
                case 5: goto L_0x00aa;
                case 6: goto L_0x00aa;
                case 7: goto L_0x00aa;
                case 8: goto L_0x00aa;
                case 9: goto L_0x00aa;
                case 10: goto L_0x00aa;
                case 11: goto L_0x00aa;
                case 12: goto L_0x00aa;
                case 13: goto L_0x00aa;
                case 14: goto L_0x00aa;
                case 15: goto L_0x00aa;
                case 16: goto L_0x00aa;
                case 17: goto L_0x00aa;
                case 18: goto L_0x00aa;
                case 19: goto L_0x00aa;
                case 20: goto L_0x00a3;
                case 21: goto L_0x00ac;
                case 22: goto L_0x00ae;
                case 23: goto L_0x00b0;
                case 24: goto L_0x00b2;
                case 25: goto L_0x00b4;
                case 26: goto L_0x00a3;
                case 27: goto L_0x00a3;
                case 28: goto L_0x00a3;
                case 29: goto L_0x00a3;
                case 30: goto L_0x00a3;
                case 31: goto L_0x00aa;
                case 32: goto L_0x00aa;
                case 33: goto L_0x00aa;
                case 34: goto L_0x00aa;
                case 35: goto L_0x00aa;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x0017
        L_0x00aa:
            r0 = 1
            goto L_0x00a4
        L_0x00ac:
            r0 = 2
            goto L_0x00a4
        L_0x00ae:
            r0 = 3
            goto L_0x00a4
        L_0x00b0:
            r0 = 4
            goto L_0x00a4
        L_0x00b2:
            r0 = 5
            goto L_0x00a4
        L_0x00b4:
            r0 = 6
            goto L_0x00a4
        L_0x00b6:
            if (r4 == 0) goto L_0x0017
            int r1 = r4.intValue()
            if (r1 == r5) goto L_0x00bf
            r0 = 1
        L_0x00bf:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x0017
            if (r2 != 0) goto L_0x0017
            switch(r1) {
                case 1: goto L_0x00e5;
                case 2: goto L_0x00e2;
                case 3: goto L_0x00df;
                case 4: goto L_0x00dc;
                case 5: goto L_0x00d9;
                case 6: goto L_0x00d6;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            r0 = 20
        L_0x00d0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0017
        L_0x00d6:
            r0 = 25
            goto L_0x00d0
        L_0x00d9:
            r0 = 24
            goto L_0x00d0
        L_0x00dc:
            r0 = 23
            goto L_0x00d0
        L_0x00df:
            r0 = 22
            goto L_0x00d0
        L_0x00e2:
            r0 = 21
            goto L_0x00d0
        L_0x00e5:
            r0 = 0
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21979XoR.<init>(X.Xo1):void");
    }
}
