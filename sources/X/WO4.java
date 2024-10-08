package X;

import com.instagram.common.session.UserSession;

public final class WO4 implements X6L {
    public final int A00;
    public final Object A01;

    public WO4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        X.UZX.A01(r2, r1, "failed to obtain access token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DED() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0076;
                case 2: goto L_0x0011;
                case 3: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A01
            X.UZX r2 = (X.UZX) r2
            java.lang.String r1 = "paused"
        L_0x000b:
            java.lang.String r0 = "failed to obtain access token"
            X.UZX.A01(r2, r1, r0)
            return
        L_0x0011:
            java.lang.Object r2 = r5.A01
            X.UZX r2 = (X.UZX) r2
            java.lang.String r1 = "delete"
            goto L_0x000b
        L_0x0018:
            java.lang.Object r3 = r5.A01
            X.UZU r3 = (X.UZU) r3
            X.3As r0 = r3.A03
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "recyclerViewProxy"
        L_0x0022:
            X.0qQ.A0F(r0)
        L_0x0025:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002a:
            r2 = 0
            r0.EaP(r2)
            X.3AD r0 = r3.A04
            java.lang.String r1 = "pullToRefresh"
            if (r0 == 0) goto L_0x0058
            r0.setIsLoading(r2)
            X.3AD r0 = r3.A04
            if (r0 == 0) goto L_0x0058
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x0068
            X.UdV r1 = r3.A01
            if (r1 != 0) goto L_0x005c
            java.lang.String r0 = "promoteAdToolsAdapter"
            goto L_0x0022
        L_0x0046:
            java.lang.Object r1 = r5.A01
            X.UZX r1 = (X.UZX) r1
            X.0eM r0 = r1.A09
            java.lang.Object r4 = r0.getValue()
            X.VwK r4 = (X.C18662VwK) r4
            java.lang.String r3 = r1.A04
            if (r3 != 0) goto L_0x006c
            java.lang.String r1 = "mediaId"
        L_0x0058:
            X.0qQ.A0F(r1)
            goto L_0x0025
        L_0x005c:
            java.util.List r0 = r3.A0A
            r1.A01(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r3.A05
            if (r0 == 0) goto L_0x0068
            X.JTO.A1X(r0)
        L_0x0068:
            X.UZU.A02(r3)
            return
        L_0x006c:
            java.lang.String r2 = "campaign_controls"
            java.lang.String r1 = "ads_manager"
            java.lang.String r0 = "failed to obtain access token"
            r4.A09(r2, r1, r3, r0)
            return
        L_0x0076:
            java.lang.Object r1 = r5.A01
            X.Uac r1 = (X.C15328Uac) r1
            r0 = 0
            X.C15328Uac.A0B(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WO4.DED():void");
    }

    public final void Doe(String str) {
        String str2;
        switch (this.A00) {
            case 0:
                0qQ.A0B(str, 0);
                UZU uzu = (UZU) this.A01;
                String str3 = uzu.A07;
                if (str3 == null || uzu.A08 == null) {
                    UZU.A02(uzu);
                    return;
                }
                C18641Vvg vvg = uzu.A02;
                if (vvg == null) {
                    str2 = "promoteAdsManagerDataFetcher";
                    break;
                } else {
                    String str4 = uzu.A06;
                    C15621Ufn ufn = new C15621Ufn(uzu, 6);
                    UserSession userSession = vvg.A02;
                    C18641Vvg.A00(vvg, ufn, C18146VmM.A01(userSession, str3, str4, str, WGU.A00(userSession).A03));
                    return;
                }
            case 1:
                0qQ.A0B(str, 0);
                C15328Uac.A0B((C15328Uac) this.A01, str);
                return;
            case 2:
                0qQ.A0B(str, 0);
                UZX uzx = (UZX) this.A01;
                C18641Vvg vvg2 = (C18641Vvg) uzx.A08.getValue();
                String str5 = uzx.A04;
                str2 = "mediaId";
                if (str5 != null) {
                    String str6 = uzx.A02;
                    C15621Ufn ufn2 = new C15621Ufn(uzx, 14);
                    UserSession userSession2 = vvg2.A02;
                    String str7 = WGU.A00(userSession2).A03;
                    AnonymousClass7TF.A1D(userSession2, 0, str7);
                    1NY A0a = AnonymousClass7TG.A0a(userSession2);
                    C51968G9o.A1K(A0a, "ads/ads_manager/delete_promotion_v2/", str5);
                    A0a.A9m("fb_auth_token", str);
                    A0a.A0G("flow_id", str7);
                    A0a.A0G("boosted_id", str6);
                    C18641Vvg.A00(vvg2, ufn2, DbT.A0R((15p) null, A0a, UX4.class, C18147VmN.class, false));
                    C18662VwK vwK = (C18662VwK) uzx.A09.getValue();
                    String str8 = uzx.A04;
                    if (str8 != null) {
                        vwK.A08("campaign_controls", "delete", str8, (String) null);
                        return;
                    }
                }
                break;
            case 3:
                0qQ.A0B(str, 0);
                UZX uzx2 = (UZX) this.A01;
                C18641Vvg vvg3 = (C18641Vvg) uzx2.A08.getValue();
                1P0 r5 = (1P0) uzx2.A0A.getValue();
                String str9 = uzx2.A04;
                if (str9 == null) {
                    str2 = "mediaId";
                    break;
                } else {
                    String str10 = uzx2.A02;
                    UserSession userSession3 = vvg3.A02;
                    String str11 = WGU.A00(userSession3).A03;
                    AnonymousClass7TF.A1D(userSession3, 0, str11);
                    1NY A0a2 = AnonymousClass7TG.A0a(userSession3);
                    C13990Tnq.A1C(A0a2, "ads/ads_manager/fetch_campaign_controls_v2/", str);
                    JTO.A1W(A0a2, str9);
                    A0a2.A0G("flow_id", str11);
                    A0a2.A0G("boosted_id", str10);
                    C18641Vvg.A00(vvg3, r5, DbU.A0S(A0a2, C15237UWx.class, C18114Vli.class));
                    return;
                }
            default:
                0qQ.A0B(str, 0);
                UZX uzx3 = (UZX) this.A01;
                C18641Vvg vvg4 = (C18641Vvg) uzx3.A08.getValue();
                String str12 = uzx3.A04;
                str2 = "mediaId";
                if (str12 != null) {
                    vvg4.A03(new C15621Ufn(uzx3, 16), str12, uzx3.A02, str);
                    C18662VwK vwK2 = (C18662VwK) uzx3.A09.getValue();
                    String str13 = uzx3.A04;
                    if (str13 != null) {
                        vwK2.A08("campaign_controls", "paused", str13, (String) null);
                        return;
                    }
                }
                break;
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
