package X;

import android.os.Bundle;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

public abstract class F7D {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        X.DbU.A0w(r6, A00(r10, r4, true), r8, com.instagram.modal.ModalActivity.class, X.C273654mx.A00(3191));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        r6.setArguments(A00(r10, r4, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r1 = X.DbS.A0M(r2, r8);
        r1.A0D(r6);
        r1.A0G = true;
        r1.A0E = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (r11 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        r1.A02 = r11.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f3, code lost:
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r7, com.instagram.common.session.UserSession r8, X.AnonymousClass4UE r9, com.instagram.quickpromotion.intf.QuickPromotionSlot r10, java.lang.Integer r11) {
        /*
            java.lang.Class<androidx.fragment.app.FragmentActivity> r0 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r2 = X.0mE.A00(r7, r0)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r6 = X.0mE.A00(r7, r0)
            android.app.Activity r6 = (android.app.Activity) r6
            X.4UC r9 = (X.AnonymousClass4UC) r9
            r5 = 0
            X.0qQ.A0B(r9, r5)
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ IOException -> 0x00fc }
            r1.<init>()     // Catch:{ IOException -> 0x00fc }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x00fc }
            X.17W r0 = r0.A0A(r1)     // Catch:{ IOException -> 0x00fc }
            X.AnonymousClass4V6.A00(r0, r9)     // Catch:{ IOException -> 0x00fc }
            r0.close()     // Catch:{ IOException -> 0x00fc }
            java.lang.String r4 = r1.toString()     // Catch:{ IOException -> 0x00fc }
            if (r4 == 0) goto L_0x0109
            X.4VA r0 = r9.A09
            java.lang.String r1 = r0.A00
            int r0 = r1.hashCode()
            r3 = 1
            java.lang.String r7 = "Required value was null."
            switch(r0) {
                case -1834320946: goto L_0x003c;
                case -1052567512: goto L_0x0058;
                case -677595213: goto L_0x0073;
                case -341373439: goto L_0x00d5;
                case 1190917935: goto L_0x0096;
                default: goto L_0x003b;
            }
        L_0x003b:
            return
        L_0x003c:
            java.lang.String r0 = "iig_fullscreen_rectangular_image"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0109
            if (r6 == 0) goto L_0x0050
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x0086
        L_0x0050:
            if (r2 == 0) goto L_0x0109
            X.EPp r6 = new X.EPp
            r6.<init>()
            goto L_0x00b8
        L_0x0058:
            java.lang.String r0 = "iig_celebration_fullscreen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0109
            X.EPl r6 = new X.EPl
            r6.<init>()
            android.os.Bundle r0 = A00(r10, r4, r5)
            r6.setArguments(r0)
            if (r2 != 0) goto L_0x00bf
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0073:
            java.lang.String r0 = "iig_fullscreen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0109
            if (r6 == 0) goto L_0x00b1
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r0 != 0) goto L_0x00b1
        L_0x0086:
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = A00(r10, r4, r3)
            r0 = 3191(0xc77, float:4.472E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbU.A0w(r6, r1, r8, r2, r0)
            return
        L_0x0096:
            java.lang.String r0 = "iig_fullscreen_bullet_list"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0109
            X.E4Q r6 = new X.E4Q
            r6.<init>()
            android.os.Bundle r0 = A00(r10, r4, r5)
            r6.setArguments(r0)
            if (r2 != 0) goto L_0x00bf
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x00b1:
            if (r2 == 0) goto L_0x0109
            X.EPo r6 = new X.EPo
            r6.<init>()
        L_0x00b8:
            android.os.Bundle r0 = A00(r10, r4, r5)
            r6.setArguments(r0)
        L_0x00bf:
            X.6Yo r1 = X.DbS.A0M(r2, r8)
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            r1.A0D(r6)
            r1.A0G = r3
            r1.A0E = r3
            if (r11 == 0) goto L_0x00f3
            int r0 = r11.intValue()
            r1.A02 = r0
            goto L_0x00f3
        L_0x00d5:
            java.lang.String r0 = "iig_fullscreen_bloks"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0109
            X.E4t r1 = new X.E4t
            r1.<init>()
            android.os.Bundle r0 = A00(r10, r4, r5)
            r1.setArguments(r0)
            if (r2 == 0) goto L_0x00f7
            X.6Yo r1 = X.DbV.A0M(r1, r2, r8)
            r1.A0G = r3
            r1.A0E = r3
        L_0x00f3:
            r1.A04()
            return
        L_0x00f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x00fc:
            java.lang.String r1 = "Error parsing QuickPromotion for fullscreen interstitial: "
            java.lang.String r0 = r9.A0D
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "IG-QP"
            X.0wb.A03(r0, r1)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F7D.A01(android.content.Context, com.instagram.common.session.UserSession, X.4UE, com.instagram.quickpromotion.intf.QuickPromotionSlot, java.lang.Integer):void");
    }

    public static final Bundle A00(QuickPromotionSlot quickPromotionSlot, String str, boolean z) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("QuickPromotionIIGFullscreenBaseFragment.KEY_FRAGMENT_TAG_LAUNCH_AS_MODAL", z);
        A0a.putString("QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT", quickPromotionSlot.name());
        A0a.putString("QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION", str);
        return A0a;
    }
}
