package X;

import com.instagram.tagging.widget.MediaTagHintsLayout;

public final class M9B implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3W1 A01;
    public final /* synthetic */ MediaTagHintsLayout A02;

    public M9B(AnonymousClass3W1 r1, MediaTagHintsLayout mediaTagHintsLayout, int i) {
        this.A02 = mediaTagHintsLayout;
        this.A01 = r1;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
        if (r4.A03 != null) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.3W1 r5 = r10.A01
            int r2 = r10.A00
            boolean r0 = com.instagram.tagging.widget.MediaTagHintsLayout.A00(r5, r2)
            if (r0 != 0) goto L_0x0099
            com.instagram.tagging.widget.MediaTagHintsLayout r4 = r10.A02
            com.instagram.common.session.UserSession r0 = r4.A02
            r0.getClass()
            r7 = -1
            X.47M r0 = r5.A07(r2, r7)
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0099
            r9 = 0
        L_0x001d:
            int r0 = r4.getChildCount()
            if (r9 >= r0) goto L_0x0053
            android.view.View r8 = r4.getChildAt(r9)
            r0 = 0
            r8.setVisibility(r0)
            r0 = 1
            X.5nL r1 = X.C294975nL.A01(r8, r0)
            X.4jN r0 = new X.4jN
            r0.<init>()
            X.5nL r6 = r1.A0D(r0)
            float r0 = r8.getPivotX()
            r3 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.A0U(r3, r1, r0)
            float r0 = r8.getPivotY()
            r6.A0V(r3, r1, r0)
            r6.A0M(r3, r1)
            r6.A0H()
            int r9 = r9 + 1
            goto L_0x001d
        L_0x0053:
            com.instagram.common.session.UserSession r0 = r4.A02
            r0.getClass()
            X.47M r1 = r5.A07(r2, r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A01 = r0
            com.instagram.common.session.UserSession r0 = r4.A02
            r0.getClass()
            X.47M r1 = r5.A07(r2, r7)
            r0 = 1
            r1.A05 = r0
            java.lang.Runnable r1 = r4.A04
            if (r1 == 0) goto L_0x0078
            android.os.Handler r0 = r4.A05
            r0.removeCallbacks(r1)
            r1 = 0
            r4.A04 = r1
        L_0x0078:
            boolean r0 = com.instagram.tagging.widget.MediaTagHintsLayout.A00(r5, r2)
            if (r0 != 0) goto L_0x00a7
            if (r1 != 0) goto L_0x0085
            java.lang.Runnable r1 = r4.A03
            r0 = 1
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            X.17k.A0E(r0)
            X.M9C r3 = new X.M9C
            r3.<init>(r5, r4, r2)
            r4.A03 = r3
            android.os.Handler r2 = r4.A05
            int r0 = r4.A00
            long r0 = (long) r0
            r2.postDelayed(r3, r0)
            return
        L_0x0099:
            com.instagram.tagging.widget.MediaTagHintsLayout r2 = r10.A02
            java.lang.Runnable r1 = r2.A04
            if (r1 == 0) goto L_0x00a7
            android.os.Handler r0 = r2.A05
            r0.removeCallbacks(r1)
            r0 = 0
            r2.A04 = r0
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M9B.run():void");
    }
}
