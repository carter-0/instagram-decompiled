package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.757  reason: invalid class name */
public final class AnonymousClass757 implements AnonymousClass758 {
    public final C3263876o A00;
    public final 1Xj A01;
    public final DirectMessageIdentifier A02;

    public final void EiL(int i) {
    }

    public final void Er6(C245853da r1) {
    }

    public final void setVideoIconState(AnonymousClass3TO r1) {
    }

    public final DirectMessageIdentifier Ax8() {
        return this.A02;
    }

    public final 1Xj BPr() {
        return this.A01;
    }

    public final RoundedCornerMediaFrameLayout C5q() {
        return this.A00.A0W;
    }

    public final String CEE() {
        1Xj r0 = this.A01;
        if (r0 != null) {
            return r0.A0M;
        }
        return null;
    }

    public final void ET5(int i) {
        this.A00.A0V.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = r5.A00.A0U;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EgV(int r6, int r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0025
            r0 = 8
            if (r6 != r0) goto L_0x0024
            X.76o r0 = r5.A00
            X.76q r2 = r0.A0U
            android.view.View r1 = r2.A00
            if (r1 == 0) goto L_0x0024
            java.lang.Runnable r0 = r2.A04
            if (r0 == 0) goto L_0x0015
            r1.removeCallbacks(r0)
        L_0x0015:
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0024
            X.C3264076q.A01(r1)
            android.widget.ImageView r0 = r2.A01
            X.C3264076q.A00(r0)
            r0 = 0
            r2.A05 = r0
        L_0x0024:
            return
        L_0x0025:
            X.76o r0 = r5.A00
            X.76q r4 = r0.A0U
            android.view.View r3 = r4.A00
            if (r3 == 0) goto L_0x0024
            X.A47 r0 = r4.A02
            if (r0 == 0) goto L_0x0024
            java.lang.Integer r1 = r4.A03
            if (r1 == 0) goto L_0x003e
            java.util.Set r0 = r0.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x003e
            return
        L_0x003e:
            X.Ao4 r2 = new X.Ao4
            r2.<init>(r3, r4)
            r4.A04 = r2
            long r0 = (long) r7
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass757.EgV(int, int):void");
    }

    public AnonymousClass757(C3263876o r1, 1Xj r2, DirectMessageIdentifier directMessageIdentifier) {
        this.A00 = r1;
        this.A02 = directMessageIdentifier;
        this.A01 = r2;
    }
}
