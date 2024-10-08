package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.7iZ  reason: invalid class name and case insensitive filesystem */
public final class C338807iZ implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass9PE A02;

    public C338807iZ(Bundle bundle, View view, AnonymousClass9PE r3) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = bundle;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r9 == X.28D.A5G) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (X.182.A06(X.0Tu.A05, (X.0lg) r3.A0J.getValue(), 36323315811494976L) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ef, code lost:
        if (r8.getBoolean("SAVE_INSTANCE_KEY_WAS_SHOWING_MG") != true) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            X.9PE r3 = r15.A02
            android.view.View r0 = r3.mView
            r4 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0194
            X.34p r0 = r3.A01
            java.lang.String r14 = "qccNavComponent"
            if (r0 == 0) goto L_0x001b
            r0.A08(r2)
            android.view.View r10 = r15.A01
            android.os.Bundle r8 = r15.A00
            X.2bE r0 = r3.A0A
            if (r0 != 0) goto L_0x0023
            java.lang.String r14 = "navigationState"
        L_0x001b:
            X.0qQ.A0F(r14)
        L_0x001e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0023:
            java.lang.String r0 = r0.A02
            X.28D r9 = X.C348017xk.A00(r0)
            X.28D r0 = X.28D.A0a
            r6 = 0
            if (r9 == r0) goto L_0x0037
            X.28D r0 = X.28D.A5D
            if (r9 == r0) goto L_0x0037
            X.28D r0 = X.28D.A5G
            r11 = 0
            if (r9 != r0) goto L_0x0038
        L_0x0037:
            r11 = 1
        L_0x0038:
            X.28D r0 = X.28D.A5G
            if (r9 != r0) goto L_0x005c
            X.8nf r0 = X.C365768ne.A0A
            X.8ne r0 = r0.A00()
            java.lang.Boolean r0 = r0.A04
            if (r0 == 0) goto L_0x005c
            X.0eM r0 = r3.A0J
            java.lang.Object r12 = r0.getValue()
            X.0lg r12 = (X.0lg) r12
            X.0Tu r7 = X.0Tu.A05
            r0 = 36323315811494976(0x810bdd00022c40, double:3.034349409217815E-306)
            boolean r0 = X.182.A06(r7, r12, r0)
            r13 = 1
            if (r0 != 0) goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            X.80D r7 = new X.80D
            r7.<init>()
            X.B2s r0 = r3.A07
            if (r0 != 0) goto L_0x0069
            java.lang.String r14 = "environment"
            goto L_0x001b
        L_0x0069:
            r7.A0l = r0
            X.0eM r12 = r3.A0J
            java.lang.Object r0 = r12.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            r0.getClass()
            r7.A0S = r0
            android.app.Activity r0 = r3.getRootActivity()
            r0.getClass()
            r7.A05 = r0
            r7.A0M = r3
            X.80I r1 = X.AnonymousClass80H.A02
            r12.getValue()
            java.util.Set r0 = X.C338817ia.A01()
            X.80H r0 = r1.A02(r0)
            r0.getClass()
            r7.A0W = r0
            r7.A3h = r6
            X.2k2 r0 = r3.volumeKeyPressController
            r7.A0R = r0
            X.80C r0 = r3.A09
            r0.getClass()
            r7.A0t = r0
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r10, r0)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r10.getClass()
            r7.A09 = r10
            r7.A0B = r9
            r7.A0O = r3
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r3.A02
            r7.A0V = r0
            java.lang.String r0 = r3.A0D
            r7.A2G = r0
            java.lang.String r1 = r3.A0E
            java.lang.String r0 = r3.A0F
            r7.A2N = r1
            r7.A2f = r0
            r7.A3F = r4
            X.80E r0 = X.AnonymousClass80E.ALL
            r7.A0y = r0
            r7.A3g = r4
            r7.A3N = r4
            r7.A3M = r4
            r7.A3L = r4
            r7.A47 = r6
            X.7ib r0 = new X.7ib
            r0.<init>(r3)
            r7.A0f = r0
            X.7ic r0 = new X.7ic
            r0.<init>(r3)
            r7.A0m = r0
            r7.A3J = r4
            r7.A3Q = r4
            r7.A0n = r3
            if (r8 == 0) goto L_0x00f1
            java.lang.String r0 = "SAVE_INSTANCE_KEY_WAS_SHOWING_MG"
            boolean r1 = r8.getBoolean(r0)
            r0 = 1
            if (r1 == r4) goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            r7.A40 = r0
            r7.A3f = r4
            r7.A0i = r3
            r7.A0q = r3
            r0 = 8
            r7.A03 = r0
            r7.A0r = r3
            androidx.fragment.app.FragmentActivity r10 = r3.requireActivity()
            java.lang.Object r9 = r12.getValue()
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.String r8 = r3.A0C
            X.7id r1 = new X.7id
            r1.<init>(r3)
            X.7pF r0 = new X.7pF
            r0.<init>(r10, r9, r1, r8)
            r7.A0e = r0
            androidx.fragment.app.FragmentActivity r10 = r3.requireActivity()
            java.lang.Object r9 = r12.getValue()
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.String r8 = r3.A0C
            X.7if r1 = new X.7if
            r1.<init>(r3)
            X.7pG r0 = new X.7pG
            r0.<init>(r10, r9, r1, r8)
            r7.A0c = r0
            r7.A3W = r11
            X.AVK r0 = r3.A05
            r7.A0d = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r7.A23 = r0
            java.lang.String r0 = "stories_gallery"
            r7.A2S = r0
            X.7pD r0 = r3.A08
            if (r0 != 0) goto L_0x0148
            java.lang.String r14 = "swipePercentageThresholdController"
            goto L_0x001b
        L_0x0148:
            r7.A0p = r0
            if (r13 != 0) goto L_0x015c
            r9 = 2131975153(0x7f135bf1, float:1.958739E38)
            r10 = 2131975154(0x7f135bf2, float:1.9587392E38)
            X.80F r8 = new X.80F
            r12 = r4
            r13 = r4
            r11 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r7.A17 = r8
        L_0x015c:
            X.80Q r0 = new X.80Q
            r0.<init>(r7)
            r3.A06 = r0
            X.9PL r1 = r3.A04
            if (r1 != 0) goto L_0x016b
            java.lang.String r14 = "navigationPerfLogger"
            goto L_0x001b
        L_0x016b:
            java.lang.String r0 = "QCC_created"
            r1.A0E(r0)
            X.2bE r0 = r3.A0A
            java.lang.String r1 = "navigationState"
            if (r0 == 0) goto L_0x01de
            r3.DV0(r0)
            X.2bE r0 = r3.A0A
            if (r0 == 0) goto L_0x01de
            r0.A00(r3)
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x018d
            X.80Q r0 = r3.A06
            if (r0 == 0) goto L_0x018d
            r0.A01()
        L_0x018d:
            X.34p r0 = r3.A01
            if (r0 == 0) goto L_0x001b
            r0.A05()
        L_0x0194:
            X.80Q r6 = r3.A06
            if (r6 == 0) goto L_0x01ab
            android.os.Bundle r5 = r15.A00
            if (r5 == 0) goto L_0x01ab
            java.lang.String r0 = "SAVE_INSTANCE_KEY_DID_USER_CLOSE_FEED_GALLERY_PICKER"
            boolean r1 = r5.getBoolean(r0)
            X.80R r0 = r6.A00
            r0.A07 = r1
            X.8Hx r0 = r0.A1j
            r0.EIn(r5)
        L_0x01ab:
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r3.A02
            if (r0 == 0) goto L_0x01d5
            X.4yO r1 = r0.A03
            r3.A03 = r1
            X.8jC r0 = X.C363138jC.A00
            if (r1 != r0) goto L_0x01d5
            X.80Q r0 = r3.A06
            if (r0 == 0) goto L_0x01d5
            X.80R r0 = r0.A00
            boolean r0 = r0.A07
            if (r0 != r4) goto L_0x01d5
            X.0eM r0 = r3.A0J
            java.lang.Object r0 = r0.getValue()
            X.0lg r0 = (X.0lg) r0
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.8aE r0 = new X.8aE
            r0.<init>()
            r1.A05(r0)
        L_0x01d5:
            r3.A02 = r2
            r3.A0D = r2
            r3.A0E = r2
            r3.A0F = r2
            return
        L_0x01de:
            X.0qQ.A0F(r1)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C338807iZ.run():void");
    }
}
