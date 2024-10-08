package X;

/* renamed from: X.Gee  reason: case insensitive filesystem */
public final class C52904Gee extends C267794cD implements AnonymousClass5VH, C268824e3 {
    public AnonymousClass5VN A00;
    public Integer A01;
    public C62320sa A02;
    public C62320sa A03;
    public 0sP A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass0vF A08 = new AnonymousClass0vF(C61610nw.A00());

    public final void DIA(C268064ch r5) {
        0qQ.A0B(r5, 0);
        if (182.A06(0Tu.A05, (0lg) C288795cU.A00(C286955Yl.A00, this), 36326339469850339L)) {
            A00(r5, this);
        } else {
            this.A08.ATE(new H89(r5, this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0102, code lost:
        if ((X.C288025bF.A00(r5) / ((float) X.C289005cr.A00(r9))) < 0.5f) goto L_0x0104;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0171 */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00df A[Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f5 A[SYNTHETIC, Splitter:B:51:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0109 A[Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0122 A[Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0146 A[Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0153 A[Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C268064ch r11, X.C52904Gee r12) {
        /*
            boolean r0 = r12.A08
            r2 = 0
            if (r0 == 0) goto L_0x01b2
            r7 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x0015
            r1 = 122246971(0x749573b, float:1.5147194E-34)
            java.lang.String r0 = "VisibilityUpdateModifierNode.verifyVisibilityThreshold"
            X.0fS.A01(r0, r1)
        L_0x0015:
            long r9 = r11.Bwh()     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            if (r0 == 0) goto L_0x0027
            r1 = -1874863666(0xffffffff903fd9ce, float:-3.78359E-29)
            java.lang.String r0 = "calculateVisibilityPercentages"
            X.0fS.A01(r0, r1)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
        L_0x0027:
            X.5VN r4 = r12.A00     // Catch:{ all -> 0x0163 }
            if (r4 != 0) goto L_0x005e
            X.4bM r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = X.C288795cU.A00(r0, r12)     // Catch:{ all -> 0x0163 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0163 }
            android.app.Activity r0 = X.C61270mF.A00(r0)     // Catch:{ all -> 0x0163 }
            int r6 = X.0Pn.A00(r0)     // Catch:{ all -> 0x0163 }
            android.graphics.Rect r4 = X.AnonymousClass7TE.A0W()     // Catch:{ all -> 0x0163 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x0163 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x0163 }
            r0.getWindowVisibleDisplayFrame(r4)     // Catch:{ all -> 0x0163 }
            int r0 = r4.left     // Catch:{ all -> 0x0163 }
            float r5 = (float) r0     // Catch:{ all -> 0x0163 }
            int r0 = r4.top     // Catch:{ all -> 0x0163 }
            float r3 = (float) r0     // Catch:{ all -> 0x0163 }
            int r0 = r4.right     // Catch:{ all -> 0x0163 }
            float r1 = (float) r0     // Catch:{ all -> 0x0163 }
            int r0 = r4.bottom     // Catch:{ all -> 0x0163 }
            int r0 = r0 - r6
            float r0 = (float) r0     // Catch:{ all -> 0x0163 }
            X.5VN r4 = new X.5VN     // Catch:{ all -> 0x0163 }
            r4.<init>(r5, r3, r1, r0)     // Catch:{ all -> 0x0163 }
            r12.A00 = r4     // Catch:{ all -> 0x0163 }
        L_0x005e:
            java.lang.Integer r0 = r12.A01     // Catch:{ all -> 0x0163 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0163 }
            if (r1 == r2) goto L_0x00b3
            r0 = 1
            if (r1 != r0) goto L_0x00ad
            java.lang.String r1 = "localToWindow"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x0077
            r0 = -1434861096(0xffffffffaa79c1d8, float:-2.2182896E-13)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x0163 }
        L_0x0077:
            r0 = 0
            long r0 = r11.Cgb(r0)     // Catch:{ all -> 0x00a1 }
            float r6 = X.C289295dM.A01(r0)     // Catch:{ all -> 0x00a1 }
            float r5 = X.C289295dM.A02(r0)     // Catch:{ all -> 0x00a1 }
            int r0 = X.C51965G9l.A04(r9)     // Catch:{ all -> 0x00a1 }
            float r0 = (float) r0     // Catch:{ all -> 0x00a1 }
            float r3 = r6 + r0
            int r0 = X.C289005cr.A00(r9)     // Catch:{ all -> 0x00a1 }
            float r0 = (float) r0     // Catch:{ all -> 0x00a1 }
            float r0 = r0 + r5
            X.5VN r1 = new X.5VN     // Catch:{ all -> 0x00a1 }
            r1.<init>(r6, r5, r3, r0)     // Catch:{ all -> 0x00a1 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00d1
            r0 = 2126469756(0x7ebf5a7c, float:1.2717618E38)
            goto L_0x00ce
        L_0x00a1:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x0162
            r0 = -63020526(0xfffffffffc3e6212, float:-3.954102E36)
            goto L_0x015f
        L_0x00ad:
            X.Wub r1 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x0163 }
            goto L_0x0162
        L_0x00b3:
            java.lang.String r1 = "boundsInWindow"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00c1
            r0 = -259948284(0xfffffffff0818104, float:-3.206363E29)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x0163 }
        L_0x00c1:
            X.5VN r1 = X.C289425dZ.A01(r11)     // Catch:{ all -> 0x0155 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00d1
            r0 = 1749023964(0x683ffcdc, float:3.6265457E24)
        L_0x00ce:
            X.0fS.A00(r0)     // Catch:{ all -> 0x0163 }
        L_0x00d1:
            X.5VN r0 = r1.A04(r4)     // Catch:{ all -> 0x0163 }
            long r5 = r0.A01()     // Catch:{ all -> 0x0163 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            if (r0 == 0) goto L_0x00e5
            r0 = 1673719660(0x63c2ef6c, float:7.191841E21)
            X.0fS.A00(r0)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
        L_0x00e5:
            float r1 = X.C288025bF.A02(r5)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            int r0 = X.C51965G9l.A04(r9)
            float r4 = (float) r0
            float r1 = r1 / r4
            r3 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0104
            float r1 = X.C288025bF.A00(r5)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            int r0 = X.C289005cr.A00(r9)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            float r0 = (float) r0     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            float r1 = r1 / r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x0105
        L_0x0104:
            r1 = 0
        L_0x0105:
            boolean r0 = r12.A07     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            if (r1 == r0) goto L_0x010e
            X.0sP r0 = r12.A04     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            X.C51968G9o.A1O(r0, r1)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
        L_0x010e:
            r12.A07 = r1     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            float r0 = X.C288025bF.A02(r5)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0153
            float r0 = X.C288025bF.A00(r5)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0153
            r1 = 1
            boolean r0 = r12.A05     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            if (r0 != 0) goto L_0x012c
            X.0sa r0 = r12.A02     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            r0.invoke()     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
        L_0x012c:
            r12.A05 = r1     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            float r3 = X.C288025bF.A02(r5)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            float r3 = r3 / r4
            float r1 = X.C288025bF.A00(r5)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            int r0 = X.C289005cr.A00(r9)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            float r0 = (float) r0     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            float r1 = r1 / r0
            float r3 = r3 * r1
            r0 = 1065185444(0x3f7d70a4, float:0.99)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L_0x0150
            r1 = 1
            boolean r0 = r12.A06     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            if (r0 != 0) goto L_0x0150
            X.0sa r0 = r12.A03     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            r0.invoke()     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
        L_0x0150:
            r12.A06 = r1     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            goto L_0x0197
        L_0x0153:
            r1 = 0
            goto L_0x012c
        L_0x0155:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x0162
            r0 = 1081935783(0x407d07a7, float:3.953592)
        L_0x015f:
            X.0fS.A00(r0)     // Catch:{ all -> 0x0163 }
        L_0x0162:
            throw r1     // Catch:{ all -> 0x0163 }
        L_0x0163:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
            if (r0 == 0) goto L_0x0170
            r0 = -380768039(0xffffffffe94df0d9, float:-1.5560448E25)
            X.0fS.A00(r0)     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
        L_0x0170:
            throw r1     // Catch:{ NullPointerException -> 0x0185, IllegalStateException -> 0x0171 }
        L_0x0171:
            boolean r0 = r12.A07     // Catch:{ all -> 0x01a4 }
            if (r2 == r0) goto L_0x017a
            X.0sP r0 = r12.A04     // Catch:{ all -> 0x01a4 }
            X.C51968G9o.A1O(r0, r2)     // Catch:{ all -> 0x01a4 }
        L_0x017a:
            r12.A07 = r2     // Catch:{ all -> 0x01a4 }
            java.lang.String r1 = "VisibilityUpdateModifierNode"
            r0 = 1246(0x4de, float:1.746E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x01a4 }
            goto L_0x0194
        L_0x0185:
            boolean r0 = r12.A07     // Catch:{ all -> 0x01a4 }
            if (r2 == r0) goto L_0x018e
            X.0sP r0 = r12.A04     // Catch:{ all -> 0x01a4 }
            X.C51968G9o.A1O(r0, r2)     // Catch:{ all -> 0x01a4 }
        L_0x018e:
            r12.A07 = r2     // Catch:{ all -> 0x01a4 }
            java.lang.String r1 = "VisibilityUpdateModifierNode"
            java.lang.String r0 = "Error analyzing layout info in VisibilityChange modifier node due to null pointer"
        L_0x0194:
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x01a4 }
        L_0x0197:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x01a3
            r0 = 816441444(0x30a9e864, float:1.2362418E-9)
            X.0fS.A00(r0)
        L_0x01a3:
            return
        L_0x01a4:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x01b1
            r0 = -1572939836(0xffffffffa23ed7c4, float:-2.5864027E-18)
            X.0fS.A00(r0)
        L_0x01b1:
            throw r1
        L_0x01b2:
            boolean r0 = r12.A07
            if (r2 == r0) goto L_0x01bb
            X.0sP r0 = r12.A04
            X.C51968G9o.A1O(r0, r2)
        L_0x01bb:
            r12.A07 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52904Gee.A00(X.4ch, X.Gee):void");
    }

    public C52904Gee(Integer num, C62320sa r4, C62320sa r5, 0sP r6) {
        C51974G9v.A1P(num, r6, r4, r5);
        this.A01 = num;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
    }
}
