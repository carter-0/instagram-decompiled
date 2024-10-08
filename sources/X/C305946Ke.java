package X;

import android.animation.AnimatorSet;

/* renamed from: X.6Ke  reason: invalid class name and case insensitive filesystem */
public final class C305946Ke {
    public C309426Yf A00;
    public AnimatorSet A01;
    public final C307086Ot A02;

    public C305946Ke(C307086Ot r2) {
        0qQ.A0B(r2, 1);
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4.A03 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet A00() {
        /*
            r13 = this;
            android.animation.AnimatorSet r1 = r13.A01
            if (r1 != 0) goto L_0x0028
            X.6Ot r4 = r13.A02
            r10 = 0
            X.3oV r0 = r4.A07
            boolean r0 = r0.CVM()
            r3 = 1
            if (r0 == 0) goto L_0x0015
            android.widget.ImageView r0 = r4.A03
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            X.6Ov r0 = r4.A05
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0029
            r0 = 4
            if (r1 == r0) goto L_0x0029
            if (r1 == r10) goto L_0x0025
            if (r2 != 0) goto L_0x002f
        L_0x0025:
            r1 = 0
        L_0x0026:
            r13.A01 = r1
        L_0x0028:
            return r1
        L_0x0029:
            if (r2 == 0) goto L_0x0025
            android.widget.TextView r0 = r4.A04
            if (r0 == 0) goto L_0x0025
        L_0x002f:
            r9 = 1
            if (r1 == r3) goto L_0x0093
            r0 = 4
            if (r1 == r0) goto L_0x007c
            r0 = 3
            if (r1 == r0) goto L_0x005c
            r0 = 2
            if (r1 != r0) goto L_0x0025
            int r2 = r4.A06
            r0 = 750(0x2ee, double:3.705E-321)
            android.animation.AnimatorSet r8 = X.C305956Kf.A01(r4, r2, r0)
            android.animation.ObjectAnimator r4 = X.C305956Kf.A02(r4)
        L_0x0047:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.AnimatorSet$Builder r0 = r1.play(r4)
            r0.after(r8)
        L_0x0053:
            X.6K5 r0 = new X.6K5
            r0.<init>(r13)
            r1.addListener(r0)
            goto L_0x0026
        L_0x005c:
            r2 = 600(0x258, double:2.964E-321)
            int r0 = r4.A06
            android.animation.AnimatorSet r8 = X.C305956Kf.A01(r4, r0, r2)
            android.widget.ImageView r6 = r4.A00()
            r4 = 0
            r0 = 0
            float[] r5 = new float[r9]
            r5[r10] = r4
            java.lang.String r4 = "translationY"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r6, r4, r5)
            r4.setDuration(r2)
            r4.setStartDelay(r0)
            goto L_0x0047
        L_0x007c:
            r0 = 750(0x2ee, double:3.705E-321)
            android.animation.AnimatorSet r0 = X.C305956Kf.A01(r4, r10, r0)
            android.animation.AnimatorSet r2 = X.C305956Kf.A00(r4, r10)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.AnimatorSet$Builder r0 = r1.play(r0)
            r0.with(r2)
            goto L_0x0053
        L_0x0093:
            int r2 = r4.A06
            r0 = 750(0x2ee, double:3.705E-321)
            android.animation.AnimatorSet r0 = X.C305956Kf.A01(r4, r2, r0)
            android.animation.AnimatorSet r1 = X.C305956Kf.A00(r4, r2)
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            android.animation.AnimatorSet$Builder r0 = r8.play(r0)
            r0.with(r1)
            android.animation.ObjectAnimator r12 = X.C305956Kf.A02(r4)
            android.widget.TextView r11 = r4.A01()
            r7 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r4 = 600(0x258, double:2.964E-321)
            r2 = 1200(0x4b0, double:5.93E-321)
            r0 = 2
            float[] r1 = new float[r0]
            r1[r10] = r7
            r1[r9] = r6
            java.lang.String r0 = "alpha"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r11, r0, r1)
            r1.setDuration(r4)
            r1.setStartDelay(r2)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.AnimatorSet$Builder r0 = r4.play(r12)
            r0.with(r1)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C305946Ke.A00():android.animation.AnimatorSet");
    }

    public final void A01(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            C309426Yf r0 = this.A00;
            if (r0 == null || !r0.A0t) {
                AnimatorSet A002 = A00();
                if (A002 != null) {
                    A002.cancel();
                }
                C307086Ot r02 = this.A02;
                r02.A02();
                C252063oV r1 = r02.A07;
                if (r1.CVM()) {
                    r1.setVisibility(0);
                }
                AnimatorSet A003 = A00();
                if (A003 != null) {
                    A003.start();
                    return;
                }
                return;
            }
            AnimatorSet A004 = A00();
            if (A004 != null && A004.isRunning()) {
                return;
            }
        } else if (intValue != 1) {
            C305956Kf.A03(this);
            return;
        }
        AnimatorSet A005 = A00();
        if (A005 != null) {
            A005.cancel();
        }
        C307086Ot r3 = this.A02;
        int ordinal = r3.A05.ordinal();
        if (ordinal == 1 || ordinal == 4 || ordinal == 3 || ordinal == 2) {
            r3.A03(1.0f);
            if (r3.A03 != null) {
                r3.A00().setAlpha(1.0f);
            }
            if (r3.A03 != null) {
                r3.A00().setTranslationY(0.0f);
            }
            if (r3.A04 != null) {
                r3.A01().setAlpha(0.0f);
            }
            if (r3.A04 != null) {
                r3.A01().setTranslationY(0.0f);
            }
        }
        C252063oV r12 = r3.A07;
        if (r12.CVM()) {
            r12.setVisibility(0);
        }
    }
}
