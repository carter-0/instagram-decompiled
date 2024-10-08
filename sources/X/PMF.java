package X;

import android.app.Activity;
import android.view.ViewGroup;

public final class PMF implements C74361Ptb {
    public N9Z A00;
    public final Activity A01;
    public final ViewGroup A02;
    public final Runnable A03 = new C73131PXQ(this);
    public final AnonymousClass0eM A04 = C73919Plz.A01(this, 45);
    public final AnonymousClass0eM A05 = C73919Plz.A01(this, 46);
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C73653PhS(this));
    public final AnonymousClass0eM A07 = C73919Plz.A01(this, 47);
    public final AnonymousClass0eM A08 = C73919Plz.A01(this, 48);
    public final AnonymousClass0eM A09 = C73919Plz.A01(this, 49);
    public final AnonymousClass0eM A0A = C73894PlV.A00(this, 0);
    public final C62320sa A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r1.getValue() != null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADN(X.C74270Pry r12) {
        /*
            r11 = this;
            X.N9Z r12 = (X.N9Z) r12
            r2 = 0
            X.0qQ.A0B(r12, r2)
            X.N9Z r0 = r11.A00
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 != 0) goto L_0x0115
            boolean r5 = r12.A01
            r4 = 0
            if (r5 == 0) goto L_0x00c7
            X.0eM r3 = r11.A09
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0028
            android.view.ViewGroup r1 = r11.A02
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            r1.addView(r0)
        L_0x0028:
            X.0eM r3 = r11.A07
            java.lang.Object r7 = r3.getValue()
            X.N1T r7 = (X.N1T) r7
            r8 = 2
            int[] r9 = new int[r8]
            X.0eM r1 = r11.A05
            java.lang.Object r0 = r1.getValue()
            java.lang.String r6 = "Required value was null."
            if (r0 == 0) goto L_0x0051
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            if (r0 == 0) goto L_0x0046
            r0.getLocationOnScreen(r9)
        L_0x0046:
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            if (r0 != 0) goto L_0x006d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0051:
            X.0eM r1 = r11.A04
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x0072
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            if (r0 == 0) goto L_0x0062
            r0.getLocationOnScreen(r9)
        L_0x0062:
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            if (r0 != 0) goto L_0x006d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x006d:
            int r10 = r0.getHeight()
            goto L_0x0073
        L_0x0072:
            r10 = 0
        L_0x0073:
            r6 = 1
            r0 = r9[r6]
            int r10 = r10 + r0
            X.0eM r0 = r11.A06
            int r9 = X.DbX.A07(r0)
            int[] r8 = new int[r8]
            X.0eM r1 = r11.A08
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L_0x008f
            X.0eM r1 = r11.A0A
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x0098
        L_0x008f:
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            if (r0 == 0) goto L_0x0098
            r0.getLocationOnScreen(r8)
        L_0x0098:
            r0 = r8[r6]
            android.graphics.Rect r0 = X.C66580MXl.A0C(r2, r10, r9, r0)
            r7.A01 = r0
            java.lang.Object r0 = r3.getValue()
            X.N1T r0 = (X.N1T) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00c7
            android.view.ViewGroup r0 = r11.A02
            r0.setClipChildren(r2)
            java.lang.Object r3 = r3.getValue()
            X.N1T r3 = (X.N1T) r3
            int r0 = X.N1T.A0E
            int r0 = r0 + 1
            X.N1T.A0E = r0
            android.view.View r1 = r3.A09
            X.PXP r0 = new X.PXP
            r0.<init>(r3)
            X.0nA.A0p(r1, r0)
            r3.A02 = r6
        L_0x00c7:
            X.0eM r3 = r11.A09
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            if (r5 != 0) goto L_0x00d1
            r4 = 8
        L_0x00d1:
            r0.setVisibility(r4)
            if (r5 != 0) goto L_0x0113
            android.view.View r1 = X.AnonymousClass7TE.A0c(r3)
            java.lang.Runnable r0 = r11.A03
            r1.removeCallbacks(r0)
            X.0eM r1 = r11.A07
            java.lang.Object r0 = r1.getValue()
            X.N1T r0 = (X.N1T) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0100
            java.lang.Object r1 = r1.getValue()
            X.N1T r1 = (X.N1T) r1
            int r0 = X.N1T.A0E
            int r0 = r0 + -1
            X.N1T.A0E = r0
            if (r0 != 0) goto L_0x00fe
            r0 = 0
            X.N1T.A0F = r0
            X.N1T.A0G = r0
        L_0x00fe:
            r1.A02 = r2
        L_0x0100:
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0113
            android.view.ViewGroup r1 = r11.A02
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            r1.removeView(r0)
        L_0x0113:
            r11.A00 = r12
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PMF.ADN(X.Pry):void");
    }

    public PMF(Activity activity, ViewGroup viewGroup, C62320sa r4) {
        this.A01 = activity;
        this.A0B = r4;
        this.A02 = viewGroup;
    }
}
