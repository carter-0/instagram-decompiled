package X;

/* renamed from: X.6Dj  reason: invalid class name and case insensitive filesystem */
public final class C304416Dj extends C267794cD implements AnonymousClass5VH, C268824e3 {
    public AnonymousClass5VN A00;
    public AnonymousClass6CO A01;
    public String A02;
    public 0sL A03;
    public boolean A04;
    public final AnonymousClass0vF A05 = new AnonymousClass0vF(C61610nw.A00());

    public C304416Dj(AnonymousClass6CO r3, String str, 0sL r5) {
        0qQ.A0B(str, 1);
        0qQ.A0B(r3, 2);
        0qQ.A0B(r5, 3);
        this.A02 = str;
        this.A01 = r3;
        this.A03 = r5;
    }

    public final void A0D() {
        this.A04 = false;
    }

    public final void DIA(C268064ch r5) {
        0qQ.A0B(r5, 0);
        if (182.A06(0Tu.A05, (0lg) C288795cU.A00(C286955Yl.A00, this), 36326339469850339L)) {
            A00(r5, this);
        } else {
            this.A05.ATE(new C304506Ds(r5, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae A[Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8 A[Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109, all -> 0x0125 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C268064ch r12, X.C304416Dj r13) {
        /*
            r10 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x0010
            r1 = 1766550228(0x694b6ad4, float:1.5369776E25)
            java.lang.String r0 = "VisibilityDetectorModifier.verifyVisibilityThreshold"
            X.0fS.A01(r0, r1)
        L_0x0010:
            boolean r0 = r13.A08     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x0118
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
            if (r0 == 0) goto L_0x0022
            r1 = 371528230(0x16251226, float:1.333432E-25)
            java.lang.String r0 = "calculateIsVisible"
            X.0fS.A01(r0, r1)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
        L_0x0022:
            X.5VN r4 = r13.A00     // Catch:{ all -> 0x00fb }
            if (r4 != 0) goto L_0x005a
            X.4bM r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01     // Catch:{ all -> 0x00fb }
            java.lang.Object r0 = X.C288795cU.A00(r0, r13)     // Catch:{ all -> 0x00fb }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x00fb }
            android.app.Activity r0 = X.C61270mF.A00(r0)     // Catch:{ all -> 0x00fb }
            int r5 = X.0Pn.A00(r0)     // Catch:{ all -> 0x00fb }
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch:{ all -> 0x00fb }
            r4.<init>()     // Catch:{ all -> 0x00fb }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00fb }
            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00fb }
            r0.getWindowVisibleDisplayFrame(r4)     // Catch:{ all -> 0x00fb }
            int r0 = r4.left     // Catch:{ all -> 0x00fb }
            float r3 = (float) r0     // Catch:{ all -> 0x00fb }
            int r0 = r4.top     // Catch:{ all -> 0x00fb }
            float r2 = (float) r0     // Catch:{ all -> 0x00fb }
            int r0 = r4.right     // Catch:{ all -> 0x00fb }
            float r1 = (float) r0     // Catch:{ all -> 0x00fb }
            int r0 = r4.bottom     // Catch:{ all -> 0x00fb }
            int r0 = r0 - r5
            float r0 = (float) r0     // Catch:{ all -> 0x00fb }
            X.5VN r4 = new X.5VN     // Catch:{ all -> 0x00fb }
            r4.<init>(r3, r2, r1, r0)     // Catch:{ all -> 0x00fb }
            r13.A00 = r4     // Catch:{ all -> 0x00fb }
        L_0x005a:
            long r8 = r12.Bwh()     // Catch:{ all -> 0x00fb }
            X.5VN r0 = X.C289425dZ.A01(r12)     // Catch:{ all -> 0x00fb }
            X.5VN r0 = r0.A04(r4)     // Catch:{ all -> 0x00fb }
            long r6 = r0.A01()     // Catch:{ all -> 0x00fb }
            r0 = 32
            long r0 = r8 >> r0
            int r5 = (int) r0     // Catch:{ all -> 0x00fb }
            r3 = 0
            if (r5 == 0) goto L_0x00b8
            int r4 = X.C289005cr.A00(r8)     // Catch:{ all -> 0x00fb }
            if (r4 == 0) goto L_0x00b8
            X.6CO r1 = r13.A01     // Catch:{ all -> 0x00fb }
            boolean r0 = r1 instanceof X.AnonymousClass6CN     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x008f
            float r0 = X.C288025bF.A02(r6)     // Catch:{ all -> 0x00fb }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            float r0 = X.C288025bF.A00(r6)     // Catch:{ all -> 0x00fb }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            goto L_0x00a5
        L_0x008f:
            boolean r0 = r1 instanceof X.AnonymousClass6CP     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00b2
            float r2 = X.C288025bF.A02(r6)     // Catch:{ all -> 0x00fb }
            float r0 = (float) r5     // Catch:{ all -> 0x00fb }
            float r2 = r2 / r0
            float r1 = X.C288025bF.A00(r6)     // Catch:{ all -> 0x00fb }
            float r0 = (float) r4     // Catch:{ all -> 0x00fb }
            float r1 = r1 / r0
            float r2 = r2 * r1
            r0 = 1065185444(0x3f7d70a4, float:0.99)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x00a5:
            if (r0 < 0) goto L_0x00a8
            r3 = 1
        L_0x00a8:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
            if (r0 == 0) goto L_0x00c4
            r0 = -319636434(0xffffffffecf2bc2e, float:-2.3475896E27)
            goto L_0x00c1
        L_0x00b2:
            X.Wub r0 = new X.Wub     // Catch:{ all -> 0x00fb }
            r0.<init>()     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00b8:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
            if (r0 == 0) goto L_0x00c4
            r0 = -504733760(0xffffffffe1ea5fc0, float:-5.404297E20)
        L_0x00c1:
            X.0fS.A00(r0)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
        L_0x00c4:
            boolean r0 = r13.A04     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
            if (r3 == r0) goto L_0x0118
            r13.A04 = r3     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
            java.lang.String r1 = "VisibilityDetectorModifier.onItemVisibleChange"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
            if (r0 == 0) goto L_0x00d8
            r0 = -1808721647(0xffffffff94311911, float:-8.94116E-27)
            X.0fS.A01(r1, r0)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
        L_0x00d8:
            X.0sL r2 = r13.A03     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = r13.A02     // Catch:{ all -> 0x00f0 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00f0 }
            r2.invoke(r1, r0)     // Catch:{ all -> 0x00f0 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
            if (r0 == 0) goto L_0x0118
            r0 = 1393866288(0x5314b630, float:6.3871176E11)
            X.0fS.A00(r0)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
            goto L_0x0118
        L_0x00f0:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
            if (r0 == 0) goto L_0x0108
            r0 = 1854378908(0x6e87939c, float:2.0979463E28)
            goto L_0x0105
        L_0x00fb:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
            if (r0 == 0) goto L_0x0108
            r0 = -1263859496(0xffffffffb4ab08d8, float:-3.1857667E-7)
        L_0x0105:
            X.0fS.A00(r0)     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
        L_0x0108:
            throw r1     // Catch:{ NullPointerException -> 0x0111, IllegalStateException -> 0x0109 }
        L_0x0109:
            java.lang.String r1 = "VisibilityChangeModifierNode"
            java.lang.String r0 = "Error analyzing layout info in VisibilityChange modifier node due to illegal state exception (layout not attached)"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x0125 }
            goto L_0x0118
        L_0x0111:
            java.lang.String r1 = "VisibilityChangeModifierNode"
            java.lang.String r0 = "Error analyzing layout info in VisibilityChange modifier node due to null pointer"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x0125 }
        L_0x0118:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x0124
            r0 = -2021990223(0xffffffff877ae0b1, float:-1.887394E-34)
            X.0fS.A00(r0)
        L_0x0124:
            return
        L_0x0125:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x0132
            r0 = 1581221594(0x5e3f86da, float:3.45023945E18)
            X.0fS.A00(r0)
        L_0x0132:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304416Dj.A00(X.4ch, X.6Dj):void");
    }
}
