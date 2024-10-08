package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

public final class K0E extends C232922uf {
    public final int A00;
    public final Object A01;

    public K0E(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(2cs r1, Object obj, int i) {
        r1.A0A(new K0E(obj, i));
    }

    public final void DmC(2cs r6) {
        Integer num;
        switch (this.A00) {
            case 0:
                if (r6.A01 == 0.0d) {
                    ViewGroup viewGroup = ((C64148LQl) this.A01).A03;
                    viewGroup.getClass();
                    viewGroup.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (r6.A01 == 0.0d) {
                    C64148LQl lQl = (C64148LQl) this.A01;
                    Integer num2 = lQl.A07;
                    num2.getClass();
                    int intValue = num2.intValue();
                    if (intValue == 0) {
                        num = AnonymousClass05K.A01;
                    } else if (intValue == 1) {
                        num = AnonymousClass05K.A0C;
                    } else if (intValue == 2) {
                        lQl.A0A.A06(0.0d);
                        return;
                    } else {
                        return;
                    }
                    C64148LQl.A00(lQl, num);
                    lQl.A0B.A03();
                    return;
                }
                return;
            case 2:
                if (JTR.A01(r6) == 1.0d) {
                    C52798Gcp gcp = (C52798Gcp) this.A01;
                    if (gcp.A0H) {
                        gcp.A01();
                        return;
                    }
                }
                C52798Gcp gcp2 = (C52798Gcp) this.A01;
                if (gcp2.A0I) {
                    ((Animator) gcp2.A0D.getValue()).start();
                    return;
                }
                return;
            case 8:
                boolean A1Q = AnonymousClass7TF.A1Q((((float) JTR.A01(r6)) > 0.0f ? 1 : (((float) JTR.A01(r6)) == 0.0f ? 0 : -1)));
                C64940Lkf lkf = (C64940Lkf) this.A01;
                if (A1Q) {
                    View view = lkf.A08;
                    if (view != null) {
                        view.setVisibility(8);
                        View view2 = lkf.A09;
                        if (view2 != null) {
                            view2.setVisibility(8);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                View view3 = lkf.A0A;
                if (view3 != null) {
                    view3.setVisibility(8);
                    View view4 = lkf.A08;
                    if (view4 != null) {
                        view4.bringToFront();
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            default:
                super.DmC(r6);
                return;
        }
    }

    public final void DmD(2cs r7) {
        C71392co r0;
        if (2 - this.A00 != 0) {
            super.DmD(r7);
            return;
        }
        0qQ.A0B(r7, 0);
        int i = (r7.A01 > 1.0d ? 1 : (r7.A01 == 1.0d ? 0 : -1));
        C52798Gcp gcp = (C52798Gcp) this.A01;
        if (i == 0) {
            r0 = gcp.A06;
        } else {
            r0 = gcp.A07;
        }
        r7.A09(r0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r0 <= 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r0.setAlpha(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
        r2.A02(r11.A09.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r3 > 0.0f) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        r2.setVisibility(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmE(X.2cs r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0053;
                case 1: goto L_0x017e;
                case 2: goto L_0x016c;
                case 3: goto L_0x013b;
                case 4: goto L_0x0129;
                case 5: goto L_0x011e;
                case 6: goto L_0x0104;
                case 7: goto L_0x00eb;
                case 8: goto L_0x008c;
                case 9: goto L_0x0015;
                case 10: goto L_0x0035;
                case 11: goto L_0x0063;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r11 == 0) goto L_0x0013
            float r1 = X.JTO.A03(r11)
        L_0x000b:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
        L_0x000f:
            r0.setAlpha(r1)
        L_0x0012:
            return
        L_0x0013:
            r1 = 0
            goto L_0x000b
        L_0x0015:
            double r0 = X.JTR.A01(r11)
            float r3 = (float) r0
            java.lang.Object r0 = r10.A01
            X.Lgj r0 = (X.C64710Lgj) r0
            X.0eM r1 = r0.A0M
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            r0.setAlpha(r3)
            android.view.View r2 = X.AnonymousClass7TH.A06(r1)
            r1 = 0
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
        L_0x0031:
            r2.setVisibility(r1)
            return
        L_0x0035:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A01
            X.Lgj r0 = (X.C64710Lgj) r0
            X.7jT r0 = r0.A0J
            float r1 = X.JTO.A03(r11)
            android.widget.LinearLayout r2 = r0.A03
            if (r2 == 0) goto L_0x0012
            r2.setAlpha(r1)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L_0x0031
        L_0x0050:
            r1 = 8
            goto L_0x0031
        L_0x0053:
            X.2ct r0 = r11.A09
            float r1 = X.JTT.A00(r0)
            java.lang.Object r0 = r10.A01
            X.LQl r0 = (X.C64148LQl) r0
            android.view.ViewGroup r0 = r0.A03
            r0.getClass()
            goto L_0x000f
        L_0x0063:
            double r0 = X.JTR.A01(r11)
            float r3 = (float) r0
            java.lang.Object r2 = r10.A01
            X.IO8 r2 = (X.IO8) r2
            android.view.View r0 = r2.A02
            java.lang.String r1 = "useInCameraButtonView"
            if (r0 == 0) goto L_0x0084
            r0.setScaleX(r3)
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x0084
            r0.setScaleY(r3)
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x0084
            r0.setAlpha(r3)
            return
        L_0x0084:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008c:
            double r0 = X.JTR.A01(r11)
            float r5 = (float) r0
            java.lang.Object r4 = r10.A01
            X.Lkf r4 = (X.C64940Lkf) r4
            com.instagram.ui.igeditseekbar.IgEditSeekBar r0 = r4.A0H
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x00e6
            int r2 = r0.getHeight()
            android.view.View r0 = r4.A09
            if (r0 == 0) goto L_0x00e1
            r0.setAlpha(r5)
            com.instagram.ui.igeditseekbar.IgEditSeekBar r0 = r4.A0H
            if (r0 == 0) goto L_0x00dc
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r5
            r0.setAlpha(r1)
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x00c3
            android.view.View r1 = r4.A0A
            if (r1 == 0) goto L_0x00be
            float r0 = (float) r2
            float r0 = r0 * r5
            r1.setTranslationY(r0)
            return
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x00c3:
            android.view.View r0 = r4.A08
            if (r0 == 0) goto L_0x00d7
            r0.setAlpha(r5)
            android.view.View r0 = r4.A0A
            if (r0 == 0) goto L_0x00d2
            r0.setAlpha(r1)
            return
        L_0x00d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x00d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x00dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x00e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x00eb:
            double r0 = X.JTR.A01(r11)
            float r2 = (float) r0
            java.lang.Object r0 = r10.A01
            com.instagram.creation.photo.edit.tint.IgTintColorPicker r0 = (com.instagram.creation.photo.edit.tint.IgTintColorPicker) r0
            android.widget.TextView r1 = r0.A02
            if (r1 == 0) goto L_0x00ff
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r2
            r1.setAlpha(r0)
            return
        L_0x00ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0104:
            r1 = 0
            X.0qQ.A0B(r11, r1)
            java.lang.Object r5 = r10.A01
            X.LMj r5 = (X.C64091LMj) r5
            X.2ct r0 = r11.A09
            double r3 = r0.A00
            X.0s0 r2 = r5.A03
            X.0YZ[] r0 = X.C64091LMj.A04
            r1 = r0[r1]
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r2.Epx(r5, r0, r1)
            return
        L_0x011e:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A01
            X.Lzf r0 = (X.C65787Lzf) r0
            X.Gcp r2 = r0.A0A
            goto L_0x0133
        L_0x0129:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A01
            X.Lzf r0 = (X.C65787Lzf) r0
            X.Gcp r2 = r0.A09
        L_0x0133:
            X.2ct r0 = r11.A09
            double r0 = r0.A00
            r2.A02(r0)
            return
        L_0x013b:
            float r1 = X.JTO.A03(r11)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0163
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            double r0 = (double) r1
            r2 = 0
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r8 = 4608308318706860032(0x3ff4000000000000, double:1.25)
        L_0x0153:
            double r2 = X.AnonymousClass37Q.A04(r0, r2, r4, r6, r8)
            float r1 = (float) r2
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x0163:
            double r0 = (double) r1
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            r8 = r4
            goto L_0x0153
        L_0x016c:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r2 = r10.A01
            X.Gcp r2 = (X.C52798Gcp) r2
            X.2ct r0 = r11.A09
            double r0 = r0.A00
            r2.A00 = r0
            r2.invalidateSelf()
            return
        L_0x017e:
            X.2ct r2 = r11.A09
            float r1 = X.JTT.A00(r2)
            java.lang.Object r4 = r10.A01
            X.LQl r4 = (X.C64148LQl) r4
            android.view.View r0 = r4.A02
            r0.getClass()
            r0.setAlpha(r1)
            double r0 = r2.A00
            double r2 = X.AnonymousClass37Q.A00(r0)
            int r1 = (int) r2
            com.instagram.arlink.ui.CoachMarkOverlay r0 = r4.A06
            r0.getClass()
            r0.setSpotlightAlpha(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0E.DmE(X.2cs):void");
    }
}
