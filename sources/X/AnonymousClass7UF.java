package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7UF  reason: invalid class name */
public final class AnonymousClass7UF {
    public boolean A00;
    public final AnonymousClass0eK A01;
    public final UserSession A02;
    public final AnonymousClass7UC A03;
    public final AnonymousClass7SM A04;
    public final AnonymousClass7UE A05;
    public final C62320sa A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (X.AnonymousClass73Z.A00(r1.A02, r29, true) != false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02fb, code lost:
        if (r2 != false) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C254933tI r29, java.lang.Integer r30, int r31) {
        /*
            r28 = this;
            r4 = 1
            r1 = r28
            r3 = r31
            if (r31 < 0) goto L_0x0012
            com.instagram.common.session.UserSession r0 = r1.A02
            r2 = r29
            boolean r0 = X.AnonymousClass73Z.A00(r0, r2, r4)
            r2 = 1
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            X.7UE r0 = r1.A05
            java.lang.Object r0 = r0.get()
            X.7Mt r0 = (X.C330437Mt) r0
            if (r0 == 0) goto L_0x02fb
            if (r2 == 0) goto L_0x0037
            r0.A01()
        L_0x0022:
            X.7UC r2 = r1.A03
            X.0sa r0 = r2.A04
            java.lang.Object r5 = r0.invoke()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x0037
            X.Akg r0 = new X.Akg
            r0.<init>(r2)
            long r2 = (long) r3
            r5.postDelayed(r0, r2)
        L_0x0037:
            com.instagram.common.session.UserSession r15 = r1.A02
            X.OyY r5 = X.C72208OyY.A00(r15)
            java.lang.String r0 = r5.A06
            if (r0 == 0) goto L_0x0056
            X.2Ep r2 = r5.A03
            if (r2 == 0) goto L_0x0056
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = r2.C6C()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02eb
            X.C72208OyY.A04(r5)
        L_0x0056:
            X.7SM r0 = r1.A04
            X.9H7 r0 = r0.A00
            X.7Hl r2 = r0.A0R
            r11 = 0
            if (r2 == 0) goto L_0x0209
            boolean r3 = r2.A1U()
            if (r3 != r4) goto L_0x0209
            X.C329067Hl.A0Y(r2)
            X.7Sa r3 = r2.A1i
            X.9H7 r3 = r3.A00
            android.os.Bundle r5 = r3.A0r
            java.lang.String r3 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_LOCAL_SMART_SUGGESTION"
            r5.remove(r3)
            X.A7C r5 = r2.A0T
            if (r5 == 0) goto L_0x0081
            r3 = 0
            r5.A01 = r3
            android.view.ViewGroup r3 = r5.A00
            if (r3 == 0) goto L_0x0081
            r3.removeAllViews()
        L_0x0081:
            X.7Km r5 = r2.A0L
            if (r5 == 0) goto L_0x019f
            X.7L0 r3 = r2.A0U
            if (r3 == 0) goto L_0x019f
            android.view.ViewGroup r3 = r5.A00
            if (r3 == 0) goto L_0x019f
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x019f
            X.C329067Hl.A0S(r2)
            com.instagram.common.session.UserSession r5 = r2.A1Z
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r9 = r3.A01(r5)
            X.7Zi r13 = X.C333527Zh.A00(r5)
            com.instagram.model.direct.DirectThreadKey r3 = X.C329067Hl.A09(r2)
            com.instagram.common.typedurl.ImageUrl r6 = r9.Bh3()
            X.0qQ.A0B(r5, r11)
            java.lang.String r7 = "DirectMessageComposerController"
            com.facebook.common.callercontext.CallerContext r17 = com.facebook.common.callercontext.CallerContext.A01(r7)
            r7 = 302(0x12e, float:4.23E-43)
            java.lang.String r18 = X.C273654mx.A00(r7)
            java.lang.String r19 = "ig_direct"
            java.lang.String r20 = "whatsapp_number_share"
            java.lang.String r21 = "fetching_number"
            X.9JK r7 = new X.9JK
            r16 = r7
            r16.<init>((com.facebook.common.callercontext.CallerContext) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21)
            X.9F4 r8 = X.AnonymousClass9F3.A00(r5)
            X.0eM r8 = r8.A02
            java.lang.Object r8 = r8.getValue()
            X.9F7 r8 = (X.AnonymousClass9F7) r8
            java.lang.Object r8 = r8.Au3(r7)
            X.9Ge r8 = (X.C376009Ge) r8
            if (r8 == 0) goto L_0x02e8
            X.9Gd r8 = r8.A00
            if (r8 == 0) goto L_0x02e8
            java.lang.String r8 = r8.A00(r7, r5)
            if (r8 == 0) goto L_0x02e8
            java.util.Locale r7 = X.AnonymousClass1Q2.A02()
            java.lang.String r7 = r7.getCountry()
            java.lang.String r8 = android.telephony.PhoneNumberUtils.formatNumber(r8, r7)
        L_0x00f0:
            if (r3 == 0) goto L_0x019f
            if (r8 == 0) goto L_0x019f
            java.lang.String r14 = r9.getUsername()
            com.instagram.model.mediasize.ExtendedImageUrl r10 = new com.instagram.model.mediasize.ExtendedImageUrl
            r10.<init>(r6)
            android.content.Context r6 = r2.A1R
            android.content.res.Resources r7 = r6.getResources()
            r6 = 2131958812(0x7f131c1c, float:1.9554247E38)
            java.lang.String r9 = r7.getString(r6)
            r6 = 5
            X.0qQ.A0B(r9, r6)
            java.lang.String r19 = X.C333537Zi.A03(r13, r11)
            com.instagram.common.session.UserSession r7 = r13.A03
            java.lang.Class<X.1f3> r12 = X.AnonymousClass1f3.class
            X.ODs r6 = X.OQO.A00(r7, r3)
            r20 = 0
            X.MaY r12 = X.C66669Mac.A02(r7, r6, r12)
            java.lang.String r6 = r12.A03
            r21 = 7
            r22 = r4
            r23 = r11
            r24 = r11
            r16 = r13
            r17 = r3
            r18 = r6
            X.C333537Zi.A08(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Long r25 = X.OQO.A01(r7, r3)
            long r26 = java.lang.System.currentTimeMillis()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r26 = r26 * r16
            X.1d5 r6 = new X.1d5
            r22 = r6
            r23 = r12
            r24 = r3
            r22.<init>(r23, r24, r25, r26)
            r6.A01 = r14
            r6.A03 = r8
            r6.A00 = r10
            r6.A02 = r9
            java.lang.String r18 = r6.A06()
            java.lang.String r8 = r3.A00
            r16 = r13
            r17 = r19
            r19 = r8
            r20 = r21
            r21 = r11
            r22 = r11
            X.C333537Zi.A0B(r16, r17, r18, r19, r20, r21, r22)
            X.1Ou r8 = X.1Ou.A01(r7)
            r8.A0A(r6)
            X.2FW r9 = X.2FW.A0y
            java.lang.String r8 = r6.A06()
            X.MaY r6 = r6.A02
            boolean r6 = r6.A09
            X.C3265677h.A0g(r7, r3, r9, r8, r6)
            X.0wc r7 = X.AnonymousClass0kN.A02(r5)
            java.lang.String r6 = "wa_business_number_share_business_share"
            X.0kJ r3 = r7.A00
            X.0Aj r7 = r7.A00(r3, r6)
            java.lang.String r3 = r5.A06
            long r5 = java.lang.Long.parseLong(r3)
            boolean r3 = r7.isSampled()
            if (r3 == 0) goto L_0x019f
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "page_id"
            r7.A9F(r3, r5)
            r7.Cgf()
        L_0x019f:
            com.instagram.common.ui.base.IgTextView r3 = r2.A0G
            if (r3 == 0) goto L_0x01b0
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x01b0
            com.instagram.common.ui.base.IgTextView r3 = r2.A0G
            r2 = 8
            r3.setVisibility(r2)
        L_0x01b0:
            boolean r2 = r0.A0k
            if (r2 == 0) goto L_0x0209
            X.Mi7 r3 = r0.A0Q
            if (r3 == 0) goto L_0x01bd
            X.3t2 r2 = r0.A1S
            r3.A0A(r2, r11)
        L_0x01bd:
            X.4DH r8 = r0.A0u
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            X.0hq r2 = r2.getSupportFragmentManager()
            r7 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            androidx.fragment.app.Fragment r3 = r2.A0P(r7)
            if (r3 == 0) goto L_0x0209
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            X.0hq r2 = r2.getSupportFragmentManager()
            X.0s1 r6 = new X.0s1
            r6.<init>(r2)
            r6.A03(r3)
            androidx.fragment.app.FragmentActivity r5 = r8.requireActivity()
            com.instagram.common.session.UserSession r3 = r0.A10
            r2 = 1282(0x502, float:1.796E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.1pE r16 = X.1pE.A01(r5, r8, r3, r2)
            r6.A03(r8)
            r6.A00()
            androidx.fragment.app.FragmentActivity r17 = r8.requireActivity()
            X.3t2 r2 = r0.A1S
            r18 = 0
            r20 = r7
            r21 = r11
            r22 = r11
            r19 = r2
            r16.A07(r17, r18, r19, r20, r21, r22)
        L_0x0209:
            java.lang.String r2 = r0.A0d
            if (r2 == 0) goto L_0x021e
            X.1Ng r5 = r0.A0v
            java.util.List r3 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r3)
            X.AY1 r2 = new X.AY1
            r2.<init>(r3)
            r5.A00(r2)
        L_0x021e:
            X.4DH r9 = r0.A0u
            androidx.fragment.app.FragmentActivity r6 = r9.getActivity()
            if (r6 == 0) goto L_0x0290
            X.0eM r2 = r0.A1Z
            java.lang.Object r7 = r2.getValue()
            X.7Gh r7 = (X.C328807Gh) r7
            com.instagram.common.session.UserSession r8 = r0.A10
            X.3t2 r5 = r0.A1S
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0290
            r7.A05 = r4
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x024b
            X.37E r2 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            X.37D r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x024b
            r0.A0B()
        L_0x024b:
            X.Ae3 r3 = new X.Ae3
            r3.<init>(r6, r9, r8, r5)
            X.6ap r5 = new X.6ap
            r5.<init>()
            r2 = 2131964424(0x7f133208, float:1.956563E38)
            java.lang.String r0 = r7.A03
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r6.getString(r2, r0)
            r5.A0D = r0
            com.instagram.common.typedurl.ImageUrl r0 = r7.A00
            r5.A09 = r0
            X.6ar r0 = X.C310356ar.CIRCULAR
            r5.A0B(r0)
            r5.A0L = r4
            r5.A0A(r3)
            r0 = 2131964426(0x7f13320a, float:1.9565633E38)
            java.lang.String r0 = r6.getString(r0)
            X.0qQ.A07(r0)
            r5.A0G = r0
            r0 = 10000(0x2710, float:1.4013E-41)
            r5.A01 = r0
            X.1xC r3 = X.1xC.A01
            X.Dc2 r2 = r5.A00()
            X.3GP r0 = new X.3GP
            r0.<init>(r2)
            r3.A00(r0)
        L_0x0290:
            X.0eK r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.7SD r0 = r0.C6Q()
            int r0 = r0.A08
            boolean r0 = X.AnonymousClass48O.A01(r0)
            if (r0 == 0) goto L_0x02c1
            X.4kA r0 = X.AnonymousClass4k9.A00(r15)
            X.0xa r0 = r0.A00
            X.0xY r2 = r0.AR4()
            r0 = 3021(0xbcd, float:4.233E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.E5T(r0, r4)
            r2.apply()
        L_0x02c1:
            X.0sa r0 = r1.A06
            java.lang.Object r3 = r0.invoke()
            X.7VP r3 = (X.AnonymousClass7VP) r3
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1N
            com.instagram.quickpromotion.intf.Trigger[] r0 = new com.instagram.quickpromotion.intf.Trigger[]{r0}
            java.util.Set r2 = X.0sc.A06(r0)
            if (r30 == 0) goto L_0x02da
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1O
            r2.add(r0)
        L_0x02da:
            X.0eM r0 = r3.A0A
            java.lang.Object r0 = r0.getValue()
            X.2bu r0 = (X.2bu) r0
            r0.AVg(r2)
            r1.A00 = r4
            return
        L_0x02e8:
            r8 = 0
            goto L_0x00f0
        L_0x02eb:
            X.2Ep r3 = r5.A03
            X.OJh r2 = r5.A0E
            X.3U9 r3 = (X.AnonymousClass3U9) r3
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.3S9 r0 = r3.A01
            r0.A0c = r2
            goto L_0x0056
        L_0x02fb:
            if (r2 == 0) goto L_0x0037
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7UF.A01(X.3tI, java.lang.Integer, int):void");
    }

    public final void A00() {
        AnonymousClass0eK r3 = this.A01;
        Object obj = r3.get();
        0qQ.A07(obj);
        if (((C333517Zg) obj).C6l().C6Q().A08 == 29) {
            AnonymousClass4kA A002 = AnonymousClass4k9.A00(this.A02);
            Object obj2 = r3.get();
            0qQ.A07(obj2);
            String C6C = ((C333517Zg) obj2).C6l().C6C();
            0xa r4 = A002.A00;
            0xY AR4 = r4.AR4();
            String A003 = AnonymousClass000.A00(2726);
            AR4.E5Z(002.A0R(A003, C6C), r4.getInt(002.A0R(A003, C6C), 0) + 1);
            AR4.apply();
        }
    }

    public AnonymousClass7UF(UserSession userSession, AnonymousClass7UC r2, AnonymousClass7SM r3, AnonymousClass7UE r4, AnonymousClass0eK r5, C62320sa r6) {
        this.A02 = userSession;
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = r5;
        this.A05 = r4;
        this.A06 = r6;
    }
}
