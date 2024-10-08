package X;

import android.animation.Animator;
import android.os.Handler;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;

/* renamed from: X.GYs  reason: case insensitive filesystem */
public final class C52593GYs extends C56996IKo implements Animator.AnimatorListener {
    public static final int A0A = DbS.A0z(C52593GYs.class).hashCode();
    public int A00;
    public int A01 = -1;
    public C313306gE A02;
    public C52592GYr A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06 = AnonymousClass7TF.A0D();
    public final C315536k3 A07 = new IW8(this, 0);
    public final ShowreelNativeMediaView A08;
    public final C52595GYu A09 = new C52595GYu(this);

    public final void D0N(AnonymousClass6L7 r1) {
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        this.A04 = false;
        this.A06.removeCallbacks(this.A09);
        this.A00 = 0;
        A01(this);
    }

    public final void onAnimationStart(Animator animator) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C52593GYs r4) {
        /*
            X.6gE r0 = r4.A02
            r1 = 1
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0.A08()
            if (r0 != r1) goto L_0x0031
            X.GYr r0 = r4.A03
            if (r0 == 0) goto L_0x0031
            com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView r0 = r0.A00
            X.XB5 r1 = r0.A00
            if (r1 == 0) goto L_0x0031
            X.6gE r4 = r0.A04
            if (r4 == 0) goto L_0x0031
            X.4mb r0 = r4.A07
            boolean r3 = r0.Erz()
            java.lang.Long r0 = r1.Bz0()
            if (r0 == 0) goto L_0x0032
            long r1 = r0.longValue()
            int r0 = (int) r1
        L_0x002a:
            if (r3 == 0) goto L_0x002e
            int r0 = r0 * 1000
        L_0x002e:
            r4.A06(r0)
        L_0x0031:
            return
        L_0x0032:
            r0 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52593GYs.A00(X.GYs):void");
    }

    public static final void A01(C52593GYs gYs) {
        if (!gYs.A04) {
            gYs.A06.postDelayed(gYs.A09, 0);
            gYs.A04 = true;
        }
    }

    public final void DO3(AnonymousClass6L7 r2) {
        JQM jqm;
        JQM jqm2;
        C52592GYr gYr = this.A03;
        if (!(gYr == null || (jqm2 = gYr.A01) == null)) {
            jqm2.CvK();
        }
        this.A05 = true;
        C52592GYr gYr2 = this.A03;
        if (gYr2 != null && (jqm = gYr2.A01) != null) {
            jqm.DO2();
        }
    }

    public C52593GYs(ShowreelNativeMediaView showreelNativeMediaView) {
        this.A08 = showreelNativeMediaView;
        showreelNativeMediaView.A02(this, A0A);
    }

    public final void DCj(AnonymousClass6L7 r1, Throwable th) {
    }

    public final void DmK(AnonymousClass6L7 r1) {
        A01(this);
    }
}
