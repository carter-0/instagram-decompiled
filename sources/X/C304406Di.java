package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.6Di  reason: invalid class name and case insensitive filesystem */
public final class C304406Di extends C267794cD implements AnonymousClass5VH, C268824e3 {
    public AnonymousClass5VN A00;
    public String A01;
    public 0sL A02;
    public boolean A03;
    public final AnonymousClass0vF A04 = new AnonymousClass0vF(C61610nw.A00());

    public C304406Di(String str, 0sL r4) {
        0qQ.A0B(str, 1);
        0qQ.A0B(r4, 2);
        this.A01 = str;
        this.A02 = r4;
    }

    public final void A0D() {
        this.A03 = false;
    }

    public final void DIA(C268064ch r5) {
        0qQ.A0B(r5, 0);
        if (182.A06(0Tu.A05, (0lg) C288795cU.A00(C286955Yl.A00, this), 36326339469850339L)) {
            A00(r5, this);
        } else {
            this.A04.ATE(new C304496Dr(r5, this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007b, code lost:
        if ((X.C288025bF.A00(r5) / ((float) X.C289005cr.A00(r7))) < 0.5f) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C268064ch r11, X.C304406Di r12) {
        /*
            r9 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x0010
            r1 = -1064423877(0xffffffffc08e2e3b, float:-4.4431434)
            java.lang.String r0 = "VPVDModifierNode.verifyVisibilityThreshold"
            X.0fS.A01(r0, r1)
        L_0x0010:
            boolean r0 = r12.A08     // Catch:{ all -> 0x00b1 }
            r3 = 0
            if (r0 == 0) goto L_0x00a1
            X.5VN r5 = r12.A00     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            if (r5 != 0) goto L_0x004d
            X.4bM r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            java.lang.Object r0 = X.C288795cU.A00(r0, r12)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            android.app.Activity r0 = X.C61270mF.A00(r0)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            int r6 = X.0Pn.A00(r0)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            r5.<init>()     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            android.view.Window r0 = r0.getWindow()     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            android.view.View r0 = r0.getDecorView()     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            r0.getWindowVisibleDisplayFrame(r5)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            int r0 = r5.left     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            float r4 = (float) r0     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            int r0 = r5.top     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            float r2 = (float) r0     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            int r0 = r5.right     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            float r1 = (float) r0     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            int r0 = r5.bottom     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            int r0 = r0 - r6
            float r0 = (float) r0     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            X.5VN r5 = new X.5VN     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            r5.<init>(r4, r2, r1, r0)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            r12.A00 = r5     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
        L_0x004d:
            long r7 = r11.Bwh()     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            X.5VN r0 = X.C289425dZ.A01(r11)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            X.5VN r0 = r0.A04(r5)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            long r5 = r0.A01()     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            float r4 = X.C288025bF.A02(r5)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            r0 = 32
            long r1 = r7 >> r0
            int r0 = (int) r1     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            float r0 = (float) r0     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            float r4 = r4 / r0
            r2 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x007d
            float r1 = X.C288025bF.A00(r5)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            int r0 = X.C289005cr.A00(r7)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            float r0 = (float) r0     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            float r1 = r1 / r0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            r12.A01(r0)     // Catch:{ NullPointerException -> 0x0092, IllegalStateException -> 0x008a, IllegalArgumentException -> 0x0082, IndexOutOfBoundsException -> 0x009a }
            goto L_0x00a4
        L_0x0082:
            java.lang.String r1 = "VPVDModifierNode"
            java.lang.String r0 = "Error analyzing layout info in vpvd modifier node due to illegal argument exception (layout no longer exists)"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00a1
        L_0x008a:
            java.lang.String r1 = "VPVDModifierNode"
            java.lang.String r0 = "Error analyzing layout info in vpvd modifier node due to illegal state exception (layout not attached)"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00a1
        L_0x0092:
            java.lang.String r1 = "VPVDModifierNode"
            java.lang.String r0 = "Error analyzing layout info in vpvd modifier node due to null pointer"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00a1
        L_0x009a:
            java.lang.String r1 = "VPVDModifierNode"
            java.lang.String r0 = "Error analyzing layout info in vpvd modifier node due to index out of bounds exception (layout no longer exists)"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x00b1 }
        L_0x00a1:
            r12.A01(r3)     // Catch:{ all -> 0x00b1 }
        L_0x00a4:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x00b0
            r0 = -230769625(0xfffffffff23ebc27, float:-3.7778953E30)
            X.0fS.A00(r0)
        L_0x00b0:
            return
        L_0x00b1:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x00be
            r0 = -2118026445(0xffffffff81c17b33, float:-7.1073785E-38)
            X.0fS.A00(r0)
        L_0x00be:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304406Di.A00(X.4ch, X.6Di):void");
    }

    private final void A01(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            if (Systrace.A0E(1)) {
                0fS.A01("VPVDModifierNode.onItemVisibleChange", -1942111052);
            }
            try {
                this.A02.invoke(this.A01, Boolean.valueOf(z));
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(1162139274);
                }
            }
        }
    }
}
