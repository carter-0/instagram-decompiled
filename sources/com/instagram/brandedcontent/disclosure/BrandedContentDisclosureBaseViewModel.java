package com.instagram.brandedcontent.disclosure;

import X.00k;
import X.0Aj;
import X.0qQ;
import X.0sn;
import X.0u9;
import X.1HR;
import X.1Xj;
import X.1Xy;
import X.2YL;
import X.AnonymousClass0iw;
import X.AnonymousClass0r6;
import X.AnonymousClass1Nd;
import X.AnonymousClass7TE;
import X.C249513ju;
import X.C318116oQ;
import X.C347037wA;
import X.DU2;
import X.DbT;
import X.DbU;
import X.DbV;
import X.JTQ;
import X.Lg8;
import X.MGE;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class BrandedContentDisclosureBaseViewModel extends 2YL {
    public DU2 A00;
    public BrandedContentGatingInfo A01 = new BrandedContentGatingInfo((Integer) null, (String) null, (HashMap) null, (List) null, (List) null);
    public BrandedContentGatingInfo A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06 = AnonymousClass7TE.A1C();
    public List A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final BrandedContentAdsApi A0F;
    public final C249513ju A0G;
    public final AnonymousClass0r6 A0H;
    public final UserSession A0I;

    public BrandedContentDisclosureBaseViewModel(BrandedContentAdsApi brandedContentAdsApi, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A0I = userSession;
        this.A0F = brandedContentAdsApi;
        1HR A0o = JTQ.A0o();
        this.A0G = A0o;
        this.A0H = 0u9.A04(A0o);
        0sn r0 = 0sn.A00;
        this.A07 = r0;
        this.A08 = r0;
        this.A02 = new BrandedContentGatingInfo((Integer) null, (String) null, (HashMap) null, (List) null, (List) null);
        this.A05 = "feed";
        this.A03 = "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r2.A0E == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r12 = this;
            r1 = r12
            boolean r0 = r12 instanceof com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel
            if (r0 == 0) goto L_0x0068
            r2 = r1
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel r2 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel) r2
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.String r0 = r2.A05
            java.lang.String r3 = "live"
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x0030
            X.KiF r6 = X.C62582KiF.A0A
            r5 = 0
            boolean r8 = r2.A0E
            java.lang.String r7 = ""
            r9 = 0
            X.LiK r4 = new X.LiK
            r4.<init>(r5, r6, r7, r8, r9)
            r1.add(r4)
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x0030
        L_0x002a:
            X.2Fj r0 = r2.A01
            r0.A0B(r1)
            return
        L_0x0030:
            X.KiF r6 = X.C62582KiF.A07
            r5 = 0
            java.lang.String r7 = ""
            r8 = 0
            X.LiK r4 = new X.LiK
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            r1.add(r4)
            r2.A06(r1)
            com.instagram.common.session.UserSession r0 = r2.A02
            boolean r0 = X.LPL.A02(r0)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r2.A05
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x002a
            r3 = 2131954141(0x7f1309dd, float:1.9544773E38)
            r0 = 1
            X.C64812LiX.A00(r1, r3, r0)
            X.KiF r6 = X.C62582KiF.A05
            X.LiK r4 = new X.LiK
            r4.<init>(r5, r6, r7, r8, r9)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r4)
            r1.addAll(r0)
            goto L_0x002a
        L_0x0068:
            r0 = r1
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel r0 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel) r0
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r2 = r0.A05
            boolean r5 = X.LPL.A02(r2)
            boolean r2 = r0.A0E
            if (r2 == 0) goto L_0x00a3
            X.Jus r2 = r0.A01
            if (r2 == 0) goto L_0x00a3
            if (r5 == 0) goto L_0x00a3
            X.LE5 r3 = new X.LE5
            r3.<init>()
            r2 = 2131238465(0x7f081e41, float:1.809321E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A05 = r2
            r2 = 2131970094(0x7f13482e, float:1.957713E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A03 = r2
            r2 = 0
            r3.A07 = r2
            r2 = 2
            r3.A00 = r2
            X.LiZ r2 = r3.A00()
            r1.add(r2)
        L_0x00a3:
            boolean r2 = r0.A03
            if (r2 == 0) goto L_0x00b8
            java.lang.String r3 = r0.A05
            java.lang.String r2 = "live"
            boolean r2 = X.C51966G9m.A1a(r3, r2)
            if (r2 == 0) goto L_0x00b8
            r3 = 2131954125(0x7f1309cd, float:1.954474E38)
            r2 = 0
            X.C64812LiX.A00(r1, r3, r2)
        L_0x00b8:
            boolean r2 = r0.A03
            if (r2 == 0) goto L_0x01a3
            X.KiF r8 = X.C62582KiF.A0A
            r7 = 0
            boolean r10 = r0.A0E
            java.lang.String r9 = ""
            r11 = 0
            X.LiK r6 = new X.LiK
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r6)
            java.lang.Integer r3 = X.AnonymousClass05K.A03
            java.lang.String r2 = "feed"
            X.FY7 r6 = new X.FY7
            r6.<init>(r3, r2)
        L_0x00d5:
            r1.add(r6)
            boolean r2 = r0.A0E
            if (r2 == 0) goto L_0x011a
            X.Jus r3 = r0.A01
            r2 = 2131954107(0x7f1309bb, float:1.9544704E38)
            r4 = 1
            X.C64812LiX.A00(r1, r2, r4)
            if (r3 == 0) goto L_0x016b
            if (r5 == 0) goto L_0x016b
            X.LhY r2 = new X.LhY
            r2.<init>(r3)
            r1.add(r2)
            java.lang.Boolean r2 = r3.A00
            boolean r2 = X.AnonymousClass7TF.A1Y(r2, r4)
            if (r2 == 0) goto L_0x0109
            r3 = 2131970091(0x7f13482b, float:1.9577123E38)
            X.LrQ r2 = new X.LrQ
            r2.<init>(r0)
            X.Lhp r6 = new X.Lhp
            r6.<init>(r2, r3)
        L_0x0106:
            r1.add(r6)
        L_0x0109:
            r2 = 2131954142(0x7f1309de, float:1.9544775E38)
            X.C64812LiX.A00(r1, r2, r4)
            X.KiF r8 = X.C62582KiF.A05
            X.LiK r6 = new X.LiK
            r10 = r11
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r6)
        L_0x011a:
            boolean r2 = r0.A03
            if (r2 == 0) goto L_0x0159
            java.lang.String r3 = r0.A05
            java.lang.String r2 = "live"
            boolean r2 = X.C51966G9m.A1a(r3, r2)
            if (r2 == 0) goto L_0x0159
            r3 = 2131954162(0x7f1309f2, float:1.9544815E38)
            r2 = 1
            X.C64812LiX.A00(r1, r3, r2)
            X.KiF r8 = X.C62582KiF.A0G
            boolean r10 = r0.A0B
            X.LiK r6 = new X.LiK
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r6)
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            java.lang.String r4 = "feed"
            X.FY7 r2 = new X.FY7
            r2.<init>(r3, r4)
            r1.add(r2)
            boolean r2 = r0.A0D
            if (r2 == 0) goto L_0x015f
            X.DU2 r5 = r0.A00
            boolean r4 = r0.A0C
            java.lang.String r2 = r0.A04
            X.Li2 r3 = new X.Li2
            r3.<init>(r5, r2, r4)
        L_0x0156:
            r1.add(r3)
        L_0x0159:
            X.05G r0 = r0.A06
            r0.Epw(r1)
            return
        L_0x015f:
            boolean r2 = r0.A0B
            if (r2 == 0) goto L_0x0159
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            X.FY7 r3 = new X.FY7
            r3.<init>(r2, r4)
            goto L_0x0156
        L_0x016b:
            java.util.List r2 = r0.A06
            boolean r2 = X.AnonymousClass7TE.A1b(r2)
            if (r2 == 0) goto L_0x018c
            java.util.List r2 = r0.A06
            int r3 = r2.size()
            r2 = 2
            if (r3 >= r2) goto L_0x0187
            X.KiF r8 = X.C62582KiF.A08
            X.LiK r6 = new X.LiK
            r10 = r11
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r6)
        L_0x0187:
            r0.A06(r1)
            goto L_0x0109
        L_0x018c:
            if (r5 == 0) goto L_0x0199
            X.KiF r8 = X.C62582KiF.A0H
            X.LiK r6 = new X.LiK
            r10 = r11
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r6)
        L_0x0199:
            X.KiF r8 = X.C62582KiF.A08
            X.LiK r6 = new X.LiK
            r10 = r11
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0106
        L_0x01a3:
            X.KiF r8 = X.C62582KiF.A0C
            r7 = 0
            boolean r10 = r0.A0E
            java.lang.String r9 = ""
            r11 = 0
            X.LiK r6 = new X.LiK
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel.A04():void");
    }

    public final void A05(User user) {
        List list = this.A06;
        ArrayList<Object> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (DbV.A1Z(user, ((BrandedContentTag) next).A01)) {
                A1C.add(next);
            }
        }
        for (Object remove : A1C) {
            this.A06.remove(remove);
        }
        if (this.A06.size() == 1) {
            ((BrandedContentTag) this.A06.get(0)).A04 = C347037wA.A06(A02(), this.A05, this.A0D, this.A09);
        }
        A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r2 > 2) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.util.List r14) {
        /*
            r13 = this;
            r12 = 0
            java.util.List r0 = r13.A06
            java.util.Iterator r3 = r0.iterator()
        L_0x0007:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0037
            com.instagram.pendingmedia.model.BrandedContentTag r2 = X.JTO.A0l(r3)
            com.instagram.user.model.User r8 = r2.A00
            if (r8 != 0) goto L_0x0023
            com.instagram.common.session.UserSession r0 = r13.A02()
            X.17i r1 = X.17h.A00(r0)
            java.lang.String r0 = r2.A01
            com.instagram.user.model.User r8 = r1.A02(r0)
        L_0x0023:
            if (r8 == 0) goto L_0x0007
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r5 = 0
            boolean r11 = r2.A03
            r10 = 1916(0x77c, float:2.685E-42)
            X.N5z r4 = new X.N5z
            r6 = r5
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r14.add(r4)
            goto L_0x0007
        L_0x0037:
            java.util.List r0 = r13.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c8
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x0041:
            java.lang.String r1 = r13.A05
            X.FY7 r0 = new X.FY7
            r0.<init>(r2, r1)
            r14.add(r0)
            java.util.List r0 = r13.A06
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c1
            java.lang.String r1 = r13.A05
            java.lang.String r0 = "feed"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r1 = r13.A05
            java.lang.String r0 = "story"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r1 = r13.A05
            java.lang.String r0 = "reel"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r1 = r13.A05
            java.lang.String r0 = "igtv"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00c1
        L_0x007e:
            java.util.List r0 = r13.A06
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x008a
            r1 = 2
            r0 = 1
            if (r2 <= r1) goto L_0x008b
        L_0x008a:
            r0 = 0
        L_0x008b:
            r8 = r0 ^ 1
            java.util.List r0 = r13.A06
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x00c5
            if (r8 != 0) goto L_0x00c5
            X.KiF r5 = X.C62582KiF.A0F
        L_0x0099:
            r4 = 0
            java.util.List r0 = r13.A06
            java.lang.Object r0 = r0.get(r12)
            com.instagram.pendingmedia.model.BrandedContentTag r0 = (com.instagram.pendingmedia.model.BrandedContentTag) r0
            boolean r7 = r0.A04
            java.lang.String r6 = ""
            X.LiK r3 = new X.LiK
            r3.<init>(r4, r5, r6, r7, r8)
            if (r8 == 0) goto L_0x00c2
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
        L_0x00af:
            java.lang.String r1 = r13.A05
            X.FY7 r0 = new X.FY7
            r0.<init>(r2, r1)
            X.2tL[] r0 = new X.C232262tL[]{r3, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r14.addAll(r0)
        L_0x00c1:
            return
        L_0x00c2:
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            goto L_0x00af
        L_0x00c5:
            X.KiF r5 = X.C62582KiF.A0E
            goto L_0x0099
        L_0x00c8:
            java.util.List r0 = r13.A06
            java.util.Iterator r1 = r0.iterator()
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f8
            com.instagram.pendingmedia.model.BrandedContentTag r0 = X.JTO.A0l(r1)
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00ce
            java.util.List r0 = r13.A06
            java.util.Iterator r1 = r0.iterator()
        L_0x00e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f4
            com.instagram.pendingmedia.model.BrandedContentTag r0 = X.JTO.A0l(r1)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x00e2
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x0041
        L_0x00f4:
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x0041
        L_0x00f8:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel.A06(java.util.List):void");
    }

    public final boolean A07(AnonymousClass0iw r7, String str) {
        String str2;
        BrandedContentTag brandedContentTag;
        if (!this.A0D) {
            this.A0B = true;
            A04();
            AnonymousClass1Nd.A00(A02()).A00(new Lg8(true));
            return true;
        } else if (str == null) {
            return false;
        } else {
            this.A0B = true;
            this.A0C = true;
            A04();
            MGE.A01(this, str, C318116oQ.A00(this), 19);
            if (!AnonymousClass7TE.A1b(this.A06) || (brandedContentTag = (BrandedContentTag) 00k.A0O(this.A06, 0)) == null) {
                str2 = null;
            } else {
                str2 = brandedContentTag.A01;
            }
            0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(r7, A02(), 0), "instagram_bc_boost_code_access_token_enable");
            DbU.A1N(A0e, "prior_module", (String) null, str);
            A0e.AAJ("sponsor_igid", str2);
            A0e.Cgf();
            return true;
        }
    }

    public static final void A00(BrandedContentDisclosureBaseViewModel brandedContentDisclosureBaseViewModel) {
        1Xj A0U;
        List list;
        String str = brandedContentDisclosureBaseViewModel.A04;
        if (str != null && (A0U = DbV.A0U(brandedContentDisclosureBaseViewModel.A02(), str)) != null) {
            DU2 du2 = brandedContentDisclosureBaseViewModel.A00;
            1Xy r1 = A0U.A0C;
            if (du2 != null) {
                list = AnonymousClass7TE.A1I(du2);
            } else {
                list = null;
            }
            r1.EQ0(list);
        }
    }

    public final UserSession A02() {
        if (this instanceof BrandedContentDisclosureViewModel) {
            return ((BrandedContentDisclosureViewModel) this).A02;
        }
        return ((BrandedContentDisclosureMenuViewModel) this).A05;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 9
            boolean r0 = X.C66128MDg.A01(r3, r8)
            if (r0 == 0) goto L_0x00a1
            r6 = r8
            X.MDg r6 = (X.C66128MDg) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a1
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x006d
            if (r0 != r4) goto L_0x00b1
            java.lang.Object r6 = r6.A01
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r6 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel) r6
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a8
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.MW7 r0 = (X.MW7) r0
            X.Jx8 r0 = (X.C61097Jx8) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0040:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r1 = r4.next()
            X.536 r1 = (X.AnonymousClass536) r1
            com.instagram.user.model.User r3 = r1.ByI()
            java.lang.Boolean r0 = r1.Bbh()
            boolean r2 = X.AnonymousClass7TG.A1X(r0)
            java.lang.Boolean r0 = r1.CYy()
            if (r0 == 0) goto L_0x006b
            boolean r1 = r0.booleanValue()
        L_0x0062:
            com.instagram.pendingmedia.model.BrandedContentTag r0 = new com.instagram.pendingmedia.model.BrandedContentTag
            r0.<init>(r3, r2, r1)
            r5.add(r0)
            goto L_0x0040
        L_0x006b:
            r1 = 1
            goto L_0x0062
        L_0x006d:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r7.A02()
            com.instagram.brandedcontent.repository.BrandedContentApi r3 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r3.<init>(r0)
            java.util.List r0 = r7.A08
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0083:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            com.instagram.pendingmedia.model.BrandedContentTag r0 = X.JTO.A0l(r1)
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0083
            r2.add(r0)
            goto L_0x0083
        L_0x0095:
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r1 = r3.A09(r2, r6)
            if (r1 == r5) goto L_0x00c1
            r6 = r7
            goto L_0x0028
        L_0x00a1:
            X.MDg r6 = new X.MDg
            r6.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x00a8:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00bf
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b6:
            java.util.ArrayList r0 = X.00k.A0U(r5)
            r6.A06 = r0
            r6.A04()
        L_0x00bf:
            X.0gF r5 = X.C60340gF.A00
        L_0x00c1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel.A03(X.4D7):java.lang.Object");
    }

    public final boolean A08(boolean z) {
        if (!this.A06.isEmpty()) {
            ((BrandedContentTag) AnonymousClass7TE.A13(this.A06)).A04 = z;
        }
        A04();
        return true;
    }
}
