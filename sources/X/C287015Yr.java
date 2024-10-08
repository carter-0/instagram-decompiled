package X;

/* renamed from: X.5Yr  reason: invalid class name and case insensitive filesystem */
public abstract class C287015Yr {
    public static final void A00(C286575Wy r4, 0sL r5, int i) {
        int i2;
        0qQ.A0B(r5, 0);
        r4.ExV(939159614);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (r4.AGw(r5)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-401990321, "com.instagram.compose.igds.theme.IgdsTheme (IgdsTheme.kt:26)");
            }
            A01(r4, r5, ((i2 << 3) & 112) | 6, false);
            if (0fL.A02()) {
                0fL.A00(-466918504);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGC(r5, i, 34);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r10 != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r7, X.0sL r8, int r9, boolean r10) {
        /*
            r0 = 1
            X.0qQ.A0B(r8, r0)
            r0 = 1606271130(0x5fbdc09a, float:2.7346196E19)
            r7.ExV(r0)
            r0 = r9 & 6
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r7.AGv(r10)
            r2 = 2
            if (r0 == 0) goto L_0x0016
            r2 = 4
        L_0x0016:
            r2 = r2 | r9
        L_0x0017:
            r0 = r9 & 48
            if (r0 != 0) goto L_0x0026
            boolean r1 = r7.AGw(r8)
            r0 = 16
            if (r1 == 0) goto L_0x0025
            r0 = 32
        L_0x0025:
            r2 = r2 | r0
        L_0x0026:
            r1 = r2 & 19
            r0 = 18
            if (r1 != r0) goto L_0x0043
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x0043
            r7.Evl()
        L_0x0035:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x0042
            X.5bo r0 = new X.5bo
            r0.<init>(r8, r9, r10)
            r1.A06 = r0
        L_0x0042:
            return
        L_0x0043:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0051
            r1 = -57369537(0xfffffffffc949c3f, float:-6.173032E36)
            java.lang.String r0 = "com.instagram.compose.igds.theme.IgdsTheme (IgdsTheme.kt:29)"
            X.0fL.A01(r1, r0)
        L_0x0051:
            boolean r0 = X.C287025Ys.A00(r7)
            if (r0 != 0) goto L_0x005a
            r5 = 0
            if (r10 == 0) goto L_0x005b
        L_0x005a:
            r5 = 1
        L_0x005b:
            boolean r0 = X.C61670oa.A07()
            if (r0 == 0) goto L_0x00c4
            if (r5 == 0) goto L_0x00c1
            X.5Yw r3 = X.C287035Yt.A00
        L_0x0065:
            long r0 = r3.A0S
            X.5Yx r2 = new X.5Yx
            r2.<init>(r0)
            boolean r0 = X.C61670oa.A0F()
            if (r0 == 0) goto L_0x00be
            X.5ZE r1 = X.C55324Hfr.A00
        L_0x0074:
            X.4bM r0 = X.AnonymousClass5ZF.A00
            X.5Xl r6 = r0.A02(r3)
            X.4bM r0 = X.AnonymousClass5ZH.A00
            X.5Xl r4 = r0.A02(r1)
            X.4bM r1 = X.AnonymousClass5ZJ.A00
            X.5ZT r0 = X.AnonymousClass5ZL.A00
            X.5Xl r3 = r1.A02(r0)
            X.4bM r0 = X.AnonymousClass5ZU.A00
            X.5Xl r2 = r0.A02(r2)
            X.4bM r1 = X.AnonymousClass5ZW.A00
            X.5ZY r0 = new X.5ZY
            r0.<init>(r5)
            X.5Xl r0 = r1.A02(r0)
            X.5Xl[] r3 = new X.C286705Xl[]{r6, r4, r3, r2, r0}
            r2 = 401118554(0x17e8955a, float:1.503035E-24)
            r1 = 15
            X.9LZ r0 = new X.9LZ
            r0.<init>(r8, r1)
            X.5PJ r1 = X.AnonymousClass5PI.A01(r7, r0, r2)
            r0 = 56
            X.C286715Xm.A01(r7, r1, r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0035
            r0 = -1486050659(0xffffffffa76caa9d, float:-3.2844069E-15)
            X.0fL.A00(r0)
            goto L_0x0035
        L_0x00be:
            X.5ZE r1 = X.AnonymousClass5Z0.A00
            goto L_0x0074
        L_0x00c1:
            X.5Yw r3 = X.C291185gk.A00
            goto L_0x0065
        L_0x00c4:
            if (r5 == 0) goto L_0x00c9
            X.5Yw r3 = X.C305056Gh.A00
            goto L_0x0065
        L_0x00c9:
            X.5Yw r3 = X.GWK.A00
            goto L_0x0065
        L_0x00cc:
            r2 = r9
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C287015Yr.A01(X.5Wy, X.0sL, int, boolean):void");
    }
}
