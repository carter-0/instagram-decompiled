package X;

import androidx.compose.ui.Modifier;

public abstract class I3R {
    public static final float A00 = ((25.0f * 2.0f) / 2.4142137f);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r12.AGt(r8) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if ((r15 & 4) != 0) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.JNV r11, X.C286575Wy r12, androidx.compose.ui.Modifier r13, int r14, int r15, long r16) {
        /*
            r8 = r16
            r0 = 1776202187(0x69deb1cb, float:3.3652642E25)
            r12.ExV(r0)
            r6 = r15
            r0 = r15 & 1
            r2 = 4
            r10 = r11
            r5 = r14
            if (r0 == 0) goto L_0x00cd
            r0 = r14 | 6
        L_0x0012:
            r1 = r15 & 2
            r11 = r13
            if (r1 == 0) goto L_0x00c2
            r0 = r0 | 48
        L_0x0019:
            r1 = r14 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x002c
            r1 = r15 & 4
            if (r1 != 0) goto L_0x0029
            boolean r3 = r12.AGt(r8)
            r1 = 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x002b
        L_0x0029:
            r1 = 128(0x80, float:1.794E-43)
        L_0x002b:
            r0 = r0 | r1
        L_0x002c:
            r3 = r0 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r3 != r1) goto L_0x004a
            boolean r1 = r12.Bwn()
            if (r1 == 0) goto L_0x004a
            r12.Evl()
        L_0x003b:
            X.5Xd r0 = r12.ASQ()
            if (r0 == 0) goto L_0x0049
            r7 = 0
            X.J8P r4 = new X.J8P
            r4.<init>(r5, r6, r7, r8, r10, r11)
            r0.A06 = r4
        L_0x0049:
            return
        L_0x004a:
            r12.Ewr()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00b8
            boolean r1 = r12.Aw3()
            if (r1 != 0) goto L_0x00b8
            r12.Evl()
            r1 = r15 & 4
            if (r1 == 0) goto L_0x0060
        L_0x005e:
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0060:
            boolean r1 = X.C51967G9n.A1S(r12)
            if (r1 == 0) goto L_0x006e
            r3 = -1649796861(0xffffffff9daa1903, float:-4.5024487E-21)
            java.lang.String r1 = "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)"
            X.0fL.A01(r3, r1)
        L_0x006e:
            r4 = r0 & 14
            if (r4 == r2) goto L_0x007c
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r12.AGw(r10)
            if (r0 == 0) goto L_0x00b6
        L_0x007c:
            r0 = 1
        L_0x007d:
            java.lang.Object r1 = r12.ECw()
            if (r0 != 0) goto L_0x0087
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x008f
        L_0x0087:
            r0 = 0
            X.J6M r1 = X.J6M.A00(r10, r0)
            r12.FLL(r1)
        L_0x008f:
            X.0sP r1 = (X.0sP) r1
            r0 = 0
            androidx.compose.ui.Modifier r3 = X.AnonymousClass5R5.A00(r13, r1, r0)
            androidx.compose.ui.Alignment r2 = X.C287215Zl.A0C
            r1 = -1653527038(0xffffffff9d712e02, float:-3.191987E-21)
            X.J6o r0 = new X.J6o
            r0.<init>(r3, r8)
            X.5PJ r1 = X.AnonymousClass5PI.A01(r12, r0, r1)
            r0 = r4 | 432(0x1b0, float:6.05E-43)
            X.C56607I4g.A01(r10, r12, r2, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x003b
            r0 = -384810042(0xffffffffe91043c6, float:-1.0900336E25)
            X.0fL.A00(r0)
            goto L_0x003b
        L_0x00b6:
            r0 = 0
            goto L_0x007d
        L_0x00b8:
            r1 = r15 & 4
            if (r1 == 0) goto L_0x0060
            r8 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L_0x005e
        L_0x00c2:
            r1 = r14 & 48
            if (r1 != 0) goto L_0x0019
            int r1 = X.G9t.A0P(r12, r13)
            r0 = r0 | r1
            goto L_0x0019
        L_0x00cd:
            r0 = r14 & 6
            if (r0 != 0) goto L_0x00dc
            boolean r0 = X.G9t.A1T(r12, r11, r14)
            int r0 = X.C51970G9q.A05(r0)
            r0 = r0 | r14
            goto L_0x0012
        L_0x00dc:
            r0 = r14
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3R.A00(X.JNV, X.5Wy, androidx.compose.ui.Modifier, int, int, long):void");
    }

    public static final void A01(Modifier modifier, C286575Wy r4, int i, int i2) {
        int i3;
        r4.ExV(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r4, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !r4.Bwn()) {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-2020210091, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            C289585dr.A00(r4, C287435a8.A02(C287205Zk.A0G(modifier, A00, 25.0f), C287655aY.A00, C59386JHn.A00));
            if (0fL.A02()) {
                0fL.A00(1139065482);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, modifier, i2, i, 0);
        }
    }
}
