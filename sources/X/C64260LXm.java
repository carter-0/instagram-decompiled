package X;

import android.view.View;

/* renamed from: X.LXm  reason: case insensitive filesystem */
public final class C64260LXm implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    public C64260LXm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, int i) {
        this.A00 = i;
        this.A02 = obj6;
        this.A03 = obj;
        this.A08 = str;
        this.A07 = obj3;
        this.A05 = obj4;
        this.A01 = obj2;
        this.A04 = obj7;
        this.A06 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f4, code lost:
        if (((com.instagram.save.model.SavedCollection) r5.A06).A07(r3.getId()) != false) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r5 = r24
            int r0 = r5.A00
            if (r0 == 0) goto L_0x00d7
            r0 = 349087556(0x14cea744, float:2.0866659E-26)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r5.A04
            X.LB7 r7 = (X.LB7) r7
            java.lang.Object r0 = r5.A06
            X.L75 r0 = (X.L75) r0
            java.lang.Object r6 = r5.A02
            X.E6i r6 = (X.C47522E6i) r6
            java.lang.Object r14 = r5.A01
            android.content.Context r14 = (android.content.Context) r14
            java.lang.Object r9 = r5.A03
            X.4DH r9 = (X.AnonymousClass4DH) r9
            java.lang.Object r12 = r5.A07
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r4 = r5.A05
            X.1Xj r4 = (X.1Xj) r4
            java.lang.String r5 = r5.A08
            boolean r2 = r0.A00
            if (r2 != 0) goto L_0x0078
            X.1wn r2 = X.C64374Laq.A00
            if (r2 != 0) goto L_0x0052
            r16 = 1
            X.LgS r8 = new X.LgS
            r18 = r9
            r19 = r12
            r20 = r0
            r21 = r7
            r22 = r6
            r15 = r8
            r17 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            X.C64374Laq.A00 = r8
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r12)
            java.lang.Class<X.Jy0> r2 = X.C61149Jy0.class
            r3.A01(r8, r2)
        L_0x0052:
            X.EZv r3 = X.C48153EZv.A05
            X.EXN r2 = X.EXN.SHARE_PHOTO
            X.Lx7 r13 = new X.Lx7
            r15 = r9
            r16 = r12
            r17 = r4
            r18 = r0
            r19 = r7
            r20 = r6
            r21 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r3.A04(r9, r12, r13, r2)
        L_0x006b:
            X.8sM r3 = X.C368278sM.ACCEPT
            r2 = 0
            X.C64374Laq.A03(r3, r12, r0, r2)
            r0 = -1126633398(0xffffffffbcd8f04a, float:-0.026481766)
        L_0x0074:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0078:
            boolean r2 = r0.A01
            if (r2 == 0) goto L_0x0096
            com.instagram.igds.components.button.IgdsButton r3 = r7.A08
            r2 = 1
            X.C64374Laq.A04(r3, r2)
            r6.A03()
            r21 = 0
            r15 = r9
            r16 = r12
            r17 = r4
            r18 = r7
            r19 = r6
            r20 = r5
            X.C64374Laq.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x006b
        L_0x0096:
            androidx.fragment.app.FragmentActivity r8 = r9.getActivity()
            if (r8 == 0) goto L_0x006b
            X.8ju r3 = X.LJr.A00(r12)
            X.A5f r2 = new X.A5f
            r2.<init>(r14, r0)
            r3.A00 = r2
            X.Lxc r15 = new X.Lxc
            r16 = r14
            r17 = r9
            r18 = r12
            r19 = r4
            r20 = r3
            r21 = r7
            r22 = r6
            r23 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            X.LRS r7 = X.C62052KYa.A03
            X.818 r10 = X.AnonymousClass818.IG_ROWSHARE_SINGLE_FEED_ACCEPT
            X.Lxa r14 = X.C65659Lxa.A00
            java.lang.String r17 = r4.getId()
            if (r17 != 0) goto L_0x00ca
            java.lang.String r17 = ""
        L_0x00ca:
            r13 = 0
            X.819 r11 = X.AnonymousClass819.BOTTOMSHEET_SHARE_LATER_FEED
            java.lang.String r18 = ""
            r19 = 0
            r16 = r13
            r7.A02(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x006b
        L_0x00d7:
            r0 = 2077792736(0x7bd899e0, float:2.2493142E36)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r5.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            if (r3 != 0) goto L_0x00f6
            java.lang.Object r3 = r5.A04
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.Object r2 = r5.A06
            com.instagram.save.model.SavedCollection r2 = (com.instagram.save.model.SavedCollection) r2
            java.lang.String r0 = r3.getId()
            boolean r0 = r2.A07(r0)
            if (r0 == 0) goto L_0x0121
        L_0x00f6:
            java.lang.String r8 = r5.A08
            java.lang.Object r7 = r5.A07
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.6Yo r6 = X.DbS.A0M(r0, r7)
            r5 = 0
            X.1a1 r4 = X.C46447Df9.A02()
            java.lang.String r2 = r3.getId()
            r0 = 3917(0xf4d, float:5.489E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = X.C46474Dfc.A01(r7, r2, r0, r8)
            androidx.fragment.app.Fragment r0 = r4.A02(r7, r0)
            r6.A0B(r5, r0)
            r6.A04()
        L_0x0121:
            r0 = -319751376(0xffffffffecf0fb30, float:-2.3306272E27)
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64260LXm.onClick(android.view.View):void");
    }
}
