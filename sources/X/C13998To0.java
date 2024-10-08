package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.To0  reason: case insensitive filesystem */
public final class C13998To0 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13998To0(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static UserSession A00(C13998To0 to0) {
        UserSession A04 = ((C15286UZq) to0.A01).A04();
        0qQ.A0B(A04, 1);
        return A04;
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C13998To0(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c3, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbY.A0R(r1), 36314536898202276L) != false) goto L_0x01c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0024;
                case 2: goto L_0x002f;
                case 3: goto L_0x003f;
                case 4: goto L_0x0054;
                case 5: goto L_0x0069;
                case 6: goto L_0x0096;
                case 7: goto L_0x00ae;
                case 8: goto L_0x00c9;
                case 9: goto L_0x00eb;
                case 10: goto L_0x011b;
                case 11: goto L_0x012c;
                case 12: goto L_0x0141;
                case 13: goto L_0x0155;
                case 14: goto L_0x015f;
                case 15: goto L_0x0169;
                case 16: goto L_0x0173;
                case 17: goto L_0x0185;
                case 18: goto L_0x0197;
                case 19: goto L_0x01cc;
                case 20: goto L_0x01d9;
                case 21: goto L_0x01f6;
                case 22: goto L_0x0204;
                case 23: goto L_0x0212;
                case 24: goto L_0x021e;
                case 25: goto L_0x022c;
                case 26: goto L_0x023d;
                case 27: goto L_0x0246;
                case 28: goto L_0x0250;
                case 29: goto L_0x000c;
                case 30: goto L_0x0261;
                case 31: goto L_0x0005;
                case 32: goto L_0x0268;
                case 33: goto L_0x0278;
                case 34: goto L_0x0282;
                case 35: goto L_0x000c;
                case 36: goto L_0x0261;
                case 37: goto L_0x0005;
                case 38: goto L_0x028d;
                case 39: goto L_0x029d;
                case 40: goto L_0x000c;
                case 41: goto L_0x0261;
                case 42: goto L_0x0005;
                case 43: goto L_0x02a7;
                case 44: goto L_0x02b7;
                case 45: goto L_0x02c8;
                case 46: goto L_0x000c;
                case 47: goto L_0x0261;
                case 48: goto L_0x0005;
                case 49: goto L_0x02d3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x000c:
            java.lang.Object r4 = r11.A01
            return r4
        L_0x000f:
            com.instagram.common.session.UserSession r1 = A00(r11)
            r0 = 45
            X.PqM r2 = new X.PqM
            r2.<init>(r1, r0)
            java.lang.String r1 = "fbsearch/reels_serp/"
            java.lang.String r0 = "clips_serp_page"
            X.Uq8 r4 = new X.Uq8
            r4.<init>(r1, r0, r2)
            return r4
        L_0x0024:
            java.lang.Object r1 = r11.A01
            X.UZa r1 = (X.C15272UZa) r1
            X.0eM r0 = r1.A0Z
            X.0wc r4 = X.DbX.A0P(r1, r0)
            return r4
        L_0x002f:
            java.lang.Object r0 = r11.A01
            X.UZq r0 = (X.C15286UZq) r0
            X.0eM r0 = r0.A0m
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.UqD r4 = new X.UqD
            r4.<init>(r0)
            return r4
        L_0x003f:
            com.instagram.common.session.UserSession r1 = A00(r11)
            r0 = 47
            X.PqM r2 = new X.PqM
            r2.<init>(r1, r0)
            java.lang.String r1 = "tags/search/"
            java.lang.String r0 = "hashtag_serp"
            X.Uq9 r4 = new X.Uq9
            r4.<init>(r1, r0, r2)
            return r4
        L_0x0054:
            com.instagram.common.session.UserSession r1 = A00(r11)
            r0 = 48
            X.PqM r2 = new X.PqM
            r2.<init>(r1, r0)
            java.lang.String r1 = "fbsearch/places/"
            java.lang.String r0 = "places_serp"
            X.UqA r4 = new X.UqA
            r4.<init>(r1, r0, r2)
            return r4
        L_0x0069:
            java.lang.Object r0 = r11.A01
            X.TwV r0 = (X.C14447TwV) r0
            com.instagram.common.session.UserSession r4 = r0.A02
            X.Twu r0 = X.C14433TwH.A00(r4)
            X.ToI r0 = r0.A00
            java.util.List r0 = r0.A02()
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0094
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314536898202276(0x8103e100000aa4, double:3.028797589101665E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0094
        L_0x008f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L_0x0094:
            r3 = 0
            goto L_0x008f
        L_0x0096:
            java.lang.Object r3 = r11.A01
            X.TqX r3 = (X.C14137TqX) r3
            X.0eM r0 = r3.A0t
            java.lang.Object r2 = r0.getValue()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            android.content.Context r1 = r3.requireContext()
            X.TwY r0 = r3.A0c
            X.TwK r4 = new X.TwK
            r4.<init>(r1, r2, r0)
            return r4
        L_0x00ae:
            java.lang.Object r2 = r11.A01
            X.TqX r2 = (X.C14137TqX) r2
            X.0eM r0 = r2.A0t
            java.lang.Object r1 = r0.getValue()
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = r2.A09
            if (r0 == 0) goto L_0x00c4
            X.TwS r4 = new X.TwS
            r4.<init>(r2, r1, r0)
            return r4
        L_0x00c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00c9:
            java.lang.Object r6 = r11.A01
            X.TqX r6 = (X.C14137TqX) r6
            java.lang.String r8 = r6.A09
            if (r8 == 0) goto L_0x00e6
            X.0eM r0 = r6.A0t
            java.lang.Object r7 = r0.getValue()
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            r10 = 0
            r9 = 112(0x70, float:1.57E-43)
            X.TwL r4 = new X.TwL
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x00e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00eb:
            java.lang.Object r1 = r11.A01
            X.TqY r1 = (X.C14138TqY) r1
            android.content.Context r2 = r1.requireContext()
            X.0eM r0 = r1.A0t
            java.lang.Object r3 = r0.getValue()
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            android.content.Context r1 = r1.requireContext()
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2xu r5 = new X.2xu
            r5.<init>(r1, r0)
            java.lang.String r6 = "SingleSearchTypeaheadTabFragment"
            r4 = 0
            boolean r7 = X.C234472xv.A02(r3)
            X.2xy r0 = X.C234472xv.A00(r2, r3, r4, r5, r6, r7)
            X.Ja5 r4 = new X.Ja5
            r4.<init>(r0)
            return r4
        L_0x011b:
            java.lang.Object r1 = r11.A01
            X.TqY r1 = (X.C14138TqY) r1
            X.0eM r0 = r1.A0t
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.0wc r4 = X.AnonymousClass0kN.A01(r1, r0)
            return r4
        L_0x012c:
            com.instagram.common.session.UserSession r1 = A00(r11)
            r0 = 49
            X.PqM r2 = new X.PqM
            r2.<init>(r1, r0)
            java.lang.String r1 = "fbsearch/non_profiled_serp/"
            java.lang.String r0 = "popular_serp"
            X.UqB r4 = new X.UqB
            r4.<init>(r1, r0, r2)
            return r4
        L_0x0141:
            com.instagram.common.session.UserSession r1 = A00(r11)
            r0 = 0
            X.Wxc r2 = new X.Wxc
            r2.<init>(r1, r0)
            java.lang.String r1 = "fbsearch/account_serp/"
            java.lang.String r0 = "user_serp"
            X.UqC r4 = new X.UqC
            r4.<init>(r1, r0, r2)
            return r4
        L_0x0155:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.VhG r4 = new X.VhG
            r4.<init>(r0)
            return r4
        L_0x015f:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.TvX r4 = new X.TvX
            r4.<init>(r0)
            return r4
        L_0x0169:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.TwM r4 = new X.TwM
            r4.<init>(r0)
            return r4
        L_0x0173:
            java.lang.Object r0 = r11.A01
            X.TwM r0 = (X.C14438TwM) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325832662267136(0x810e2700013500, double:3.0359410757806736E-306)
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r4
        L_0x0185:
            java.lang.Object r0 = r11.A01
            X.TwM r0 = (X.C14438TwM) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325832662201599(0x810e27000034ff, double:3.035941075739228E-306)
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r4
        L_0x0197:
            java.lang.Object r0 = r11.A01
            X.Uc1 r0 = (X.C15398Uc1) r0
            X.0eM r1 = r0.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            X.Twu r0 = X.C14433TwH.A00(r0)
            X.ToI r0 = r0.A00
            java.util.List r0 = r0.A02()
            boolean r0 = r0.isEmpty()
            r4 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ca
            X.0lg r3 = X.DbY.A0R(r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314536898202276(0x8103e100000aa4, double:3.028797589101665E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01ca
        L_0x01c5:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L_0x01ca:
            r4 = 0
            goto L_0x01c5
        L_0x01cc:
            java.lang.Object r0 = r11.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0qQ.A0A(r0)
            X.Ocm r4 = new X.Ocm
            r4.<init>(r0)
            return r4
        L_0x01d9:
            java.lang.Object r0 = r11.A01
            X.UbA r0 = (X.C15358UbA) r0
            com.instagram.model.keyword.Keyword r0 = r0.A08
            if (r0 != 0) goto L_0x01eb
            java.lang.String r0 = "surfaceKeyword"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01eb:
            java.lang.String r3 = r0.A04
            r2 = 0
            r1 = 1
            r0 = 0
            X.VZS r4 = new X.VZS
            r4.<init>(r2, r3, r1, r0)
            return r4
        L_0x01f6:
            java.lang.Object r0 = r11.A01
            X.MuC r0 = (X.C67757MuC) r0
            java.lang.String r2 = r0.A0E
            r1 = 0
            r0 = 0
            X.VZS r4 = new X.VZS
            r4.<init>(r1, r2, r0, r0)
            return r4
        L_0x0204:
            java.lang.Object r0 = r11.A01
            X.0wX r0 = (X.C62880wX) r0
            android.content.Context r0 = r0.A06()
            X.F33 r4 = new X.F33
            r4.<init>(r0)
            return r4
        L_0x0212:
            java.lang.Object r0 = r11.A01
            X.S1U r0 = (X.S1U) r0
            boolean r0 = r0.A01
            X.S4R r4 = new X.S4R
            r4.<init>(r0)
            return r4
        L_0x021e:
            java.lang.Object r0 = r11.A01
            X.0wX r0 = (X.C62880wX) r0
            android.content.Context r0 = r0.A06()
            X.1Ec r4 = new X.1Ec
            r4.<init>(r0)
            return r4
        L_0x022c:
            X.VGI r0 = com.instagram.service.http.IGTigonAsyncHttpServiceHolder.Companion
            java.lang.Object r1 = r11.A01
            X.0lg r1 = (X.0lg) r1
            com.instagram.service.http.IGTigonAsyncHttpService r0 = new com.instagram.service.http.IGTigonAsyncHttpService
            r0.<init>(r1)
            com.instagram.service.http.IGTigonAsyncHttpServiceHolder r4 = new com.instagram.service.http.IGTigonAsyncHttpServiceHolder
            r4.<init>(r0)
            return r4
        L_0x023d:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r11.A01
            X.0wW r4 = r1.A05(r0)
            return r4
        L_0x0246:
            java.lang.Object r1 = r11.A01
            X.ESI r1 = (X.ESI) r1
            r0 = 0
            r1.A09 = r0
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0250:
            java.lang.Object r2 = r11.A01
            X.E1Z r2 = (X.E1Z) r2
            X.0eM r0 = r2.A06
            X.0lg r1 = X.DbT.A0X(r0)
            X.0iw r0 = r2.A04
            X.0wc r4 = X.AnonymousClass0kN.A01(r0, r1)
            return r4
        L_0x0261:
            java.lang.Object r0 = r11.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x0268:
            java.lang.Object r0 = r11.A01
            X.ES8 r0 = (X.ES8) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KC1 r4 = new X.KC1
            r4.<init>(r0)
            return r4
        L_0x0278:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.F2J r4 = new X.F2J
            r4.<init>(r0)
            return r4
        L_0x0282:
            java.lang.Object r0 = r11.A01
            X.ERe r0 = (X.C48017ERe) r0
            X.0eM r0 = r0.A00
            X.1Av r4 = X.DbX.A0h(r0)
            return r4
        L_0x028d:
            java.lang.Object r0 = r11.A01
            X.ES9 r0 = (X.ES9) r0
            X.0eM r0 = r0.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KC2 r4 = new X.KC2
            r4.<init>(r0)
            return r4
        L_0x029d:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.EyF r4 = new X.EyF
            r4.<init>(r0)
            return r4
        L_0x02a7:
            java.lang.Object r0 = r11.A01
            X.ESS r0 = (X.ESS) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KC3 r4 = new X.KC3
            r4.<init>(r0)
            return r4
        L_0x02b7:
            java.lang.Object r0 = r11.A01
            X.ERf r0 = (X.C48018ERf) r0
            X.0eM r0 = r0.A01
            X.0lg r1 = X.DbT.A0X(r0)
            java.lang.String r0 = "message_links_settings_fragment"
            X.0wc r4 = X.DbW.A0J(r1, r0)
            return r4
        L_0x02c8:
            java.lang.Object r0 = r11.A01
            X.ERf r0 = (X.C48018ERf) r0
            X.0eM r0 = r0.A01
            X.1Av r4 = X.DbX.A0h(r0)
            return r4
        L_0x02d3:
            java.lang.Object r0 = r11.A01
            X.K4f r0 = (X.C61363K4f) r0
            X.0eM r0 = r0.A0a
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.LEg r4 = new X.LEg
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13998To0.invoke():java.lang.Object");
    }
}
