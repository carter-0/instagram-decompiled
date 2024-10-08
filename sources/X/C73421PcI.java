package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.PcI  reason: case insensitive filesystem */
public final class C73421PcI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ AnonymousClass7H6 A03;

    public C73421PcI(ViewGroup viewGroup, AnonymousClass7H6 r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = viewGroup;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (r1 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            X.7H6 r4 = r5.A03
            boolean r0 = r4.A0h
            if (r0 == 0) goto L_0x0031
            android.view.ViewGroup r1 = r4.A08
            if (r1 == 0) goto L_0x006b
            r0 = 0
            r1.setTop(r0)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            int r0 = X.AnonymousClass0nB.A00(r0)
            r1.setBottom(r0)
            android.view.View r0 = r4.A07
            A00(r1, r0)
            android.view.ViewGroup r0 = r4.A09
            A00(r1, r0)
        L_0x0023:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r4.A0C
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "viewPager"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0031:
            android.view.ViewGroup r3 = r5.A02
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            int r2 = X.AnonymousClass0nB.A01(r0)
            int r1 = X.AnonymousClass0nB.A00(r0)
            int r0 = r3.getWidth()
            if (r0 != r2) goto L_0x004b
            int r0 = r3.getHeight()
            if (r0 == r1) goto L_0x004e
        L_0x004b:
            X.0nA.A0g(r3, r2, r1)
        L_0x004e:
            int r0 = r5.A01
            r3.setTop(r0)
            int r0 = r5.A00
            int r1 = r1 - r0
            r3.setBottom(r1)
            android.view.View r0 = r4.A07
            A00(r3, r0)
            android.view.ViewGroup r0 = r4.A09
            A00(r3, r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r4.A0D
            if (r1 == 0) goto L_0x006b
            goto L_0x0023
        L_0x0068:
            A00(r1, r0)
        L_0x006b:
            android.view.ViewGroup r0 = r5.A02
            X.0nA.A0r(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73421PcI.run():void");
    }

    public static void A00(View view, View view2) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (view2 == null) {
            return;
        }
        if (view2.getWidth() != width || view2.getHeight() != height) {
            0nA.A0g(view2, width, height);
        }
    }
}
