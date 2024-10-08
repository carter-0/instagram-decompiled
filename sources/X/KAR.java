package X;

import android.content.Context;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.realtimeclient.RealtimeConstants;

public final class KAR extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public KAR(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    public final void onFail(C268654dm r11) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-1479216397);
                C358248ab A0X = DbS.A0X(((C17744VdD) this.A01).A02);
                A0X.A09(2131970790);
                A0X.A08(2131970789);
                A0X.A0E(C64213LUd.A00);
                LV8.A00(A0X, this.A03, 2);
                DbT.A1V(A0X);
                i2 = 78517339;
                break;
            case 1:
                i = AnonymousClass7TG.A0D(r11, 191424893);
                KAR.super.onFail(r11);
                KLH.A01((KLH) this.A03);
                i2 = -930895553;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1570199528);
                KAR.super.onFail(r11);
                NearbyVenuesService.A02((UserSession) this.A03, (C22328Xzd) null);
                i2 = -1864371914;
                break;
            case 3:
                i = AnonymousClass0fD.A03(1607005201);
                0qQ.A0B(r11, 0);
                KAR.super.onFail(r11);
                C64146LQj lQj = (C64146LQj) this.A03;
                if (lQj.A02) {
                    lQj.A04.A02.setVisibility(8);
                    lQj.A02 = false;
                }
                lQj.A08.invoke();
                i2 = -1278216820;
                break;
            case 4:
                i = AnonymousClass7TG.A0D(r11, 304127515);
                1XP r0 = (1XP) r11.A00();
                if (r0 != null) {
                    str = r0.getErrorMessage();
                } else {
                    str = null;
                }
                boolean A0K = 0qQ.A0K(str, "Media not found or unavailable");
                LCl lCl = (LCl) this.A01;
                int i3 = 2;
                if (A0K) {
                    i3 = 1;
                }
                lCl.A00(i3);
                i2 = -729981362;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1651583805);
                ((IgdsButton) this.A01).setLoading(false);
                C61436K7l k7l = (C61436K7l) this.A03;
                C59689JTv.A07(k7l.getActivity(), 2131960632);
                OTV otv = (OTV) k7l.A04.getValue();
                otv.A00.markerPoint(31786177, "Follow_Creator_Failed");
                OTV.A00(otv, 3);
                DbZ.A17(k7l);
                i2 = 1697031849;
                break;
            case 6:
                i = AnonymousClass0fD.A03(1680487495);
                L2L l2l = (L2L) this.A01;
                int i4 = l2l.A00;
                if (i4 < 3) {
                    int i5 = i4 + 1;
                    l2l.A00 = i5;
                    int pow = ((int) (Math.pow(2.0d, (double) (i5 - 1)) * 2.0d)) * IgNetworkConsentStorage.MAX_ENTRIES;
                    1NY A0L = DbZ.A0L((UserSession) this.A03);
                    A0L.A0A("creatives/camera_graphql/");
                    A0L.A9m("query_id", "2253728161315083");
                    A0L.A0Q(CF8.class, D0Z.class);
                    1OC A0U = DbT.A0U(A0L, true);
                    A0U.A00 = this;
                    1ES.A04(A0U, 278, 3, pow, true, false);
                } else {
                    ((1P0) this.A02).onFail(r11);
                }
                i2 = -1765318557;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-273077306);
                DbS.A1U(this.A01);
                i2 = -194250126;
                break;
            case 8:
                i = AnonymousClass0fD.A03(520821388);
                i2 = 903401840;
                break;
            default:
                i = AnonymousClass0fD.A03(2138549659);
                AnonymousClass0iw A022 = AnonymousClass6WL.A02((Context) this.A01);
                if (A022 != null) {
                    C270194gL r4 = (C270194gL) this.A02;
                    UserSession userSession = ((AnonymousClass6Z5) this.A03).A09;
                    if (userSession == null) {
                        DbS.A17();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0wc A012 = AnonymousClass0kN.A01(A022, userSession);
                    String str2 = r4.A0X;
                    str2.getClass();
                    String A0q = JTP.A0q(r4);
                    String str3 = r4.A0e;
                    str3.getClass();
                    0Aj A0e = AnonymousClass7TE.A0e(A012, "ig_live_moderator_resign");
                    JTQ.A14(A0e, A0q);
                    DbS.A1H(A0e, RealtimeConstants.SEND_FAIL);
                    JTQ.A10(A0e, DbZ.A07(str2));
                    C51965G9l.A1I(A0e, str3);
                    C51969G9p.A1A(A0e, A022);
                    JTO.A1R(A0e, "moderator");
                    A0e.AAJ("method", "ufi_action_sheet");
                    A0e.Cgf();
                }
                i2 = 1896792312;
                break;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        if (3 - this.A00 != 0) {
            KAR.super.onStart();
            return;
        }
        int A032 = AnonymousClass0fD.A03(-645166339);
        KAR.super.onStart();
        C64146LQj lQj = (C64146LQj) this.A03;
        if (!lQj.A02) {
            L97 l97 = lQj.A04;
            DbS.A1T(l97.A04);
            l97.A02.setVisibility(0);
            lQj.A02 = true;
        }
        AnonymousClass0fD.A0A(-2053681156, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02ec, code lost:
        X.AnonymousClass0fD.A0A(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0397, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x039a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r29) {
        /*
            r28 = this;
            r5 = r28
            r6 = r29
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x036d;
                case 1: goto L_0x02f3;
                case 2: goto L_0x0295;
                case 3: goto L_0x018d;
                case 4: goto L_0x014b;
                case 5: goto L_0x00f7;
                case 6: goto L_0x00d7;
                case 7: goto L_0x00a9;
                case 8: goto L_0x0052;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 481575472(0x1cb44230, float:1.192851E-21)
            int r7 = X.AnonymousClass0fD.A03(r0)
            r0 = 1956684815(0x74a0a40f, float:1.0181824E32)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.1xC r4 = X.1xC.A01
            X.6ap r3 = X.DbV.A0W()
            java.lang.Object r2 = r5.A01
            android.content.Context r2 = (android.content.Context) r2
            int r0 = X.Dbb.A01(r2)
            r3.A02 = r0
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131965131(0x7f1334cb, float:1.9567063E38)
            X.DbT.A1D(r1, r3, r0)
            r0 = 5000(0x1388, float:7.006E-42)
            r3.A01 = r0
            X.DbY.A1K(r4, r3)
            X.0iw r2 = X.AnonymousClass6WL.A02(r2)
            if (r2 == 0) goto L_0x02e3
            java.lang.Object r0 = r5.A03
            X.6Z5 r0 = (X.AnonymousClass6Z5) r0
            java.lang.Object r1 = r5.A02
            X.4gL r1 = (X.C270194gL) r1
            com.instagram.common.session.UserSession r0 = r0.A09
            if (r0 != 0) goto L_0x02cb
            X.DbS.A17()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0052:
            r0 = -1909322193(0xffffffff8e320e2f, float:-2.1947023E-30)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.K1W r6 = (X.K1W) r6
            r0 = -1174792593(0xffffffffb9fa166f, float:-4.770043E-4)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x009e
            com.instagram.api.schemas.IGLiveBadgeSettings r1 = r6.A00
            com.instagram.api.schemas.IGLiveBadgeSettings r0 = com.instagram.api.schemas.IGLiveBadgeSettings.UNSET
            if (r1 != r0) goto L_0x009e
            X.1YN r8 = X.AnonymousClass2bO.A00()
            java.lang.Object r6 = r5.A01
            X.2bv r6 = (X.2bv) r6
            java.lang.Object r2 = r5.A02
            X.4UE r2 = (X.AnonymousClass4UE) r2
            java.lang.Object r1 = r5.A03
            X.Lgj r1 = (X.C64710Lgj) r1
            android.content.Context r0 = r1.A04
            X.4DH r3 = r1.A0A
            r8.A06(r0, r3, r2, r6)
            com.instagram.common.session.UserSession r0 = r1.A0D
            com.instagram.api.schemas.IGLiveBadgeSettings r1 = com.instagram.api.schemas.IGLiveBadgeSettings.ON
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "users/set_live_settings/"
            r2.A0A(r0)
            java.lang.String r1 = r1.A00
            java.lang.String r0 = "live_badge_setting"
            X.DbX.A1M(r2, r0, r1)
            X.1OC r0 = r2.A0M()
            r3.schedule(r0)
        L_0x009e:
            r0 = 1099732323(0x418c9563, float:17.572943)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1328972093(0x4f36813d, float:3.06192307E9)
            goto L_0x02ec
        L_0x00a9:
            r0 = -169509660(0xfffffffff5e57ce4, float:-5.8182083E32)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.3HO r6 = (X.AnonymousClass3HO) r6
            r0 = -738189828(0xffffffffd4001dfc, float:-2.20103547E12)
            int r3 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r2 = r5.A02
            X.0sP r2 = (X.0sP) r2
            X.3Ia r1 = r6.FH3()
            java.lang.Object r0 = r5.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.util.List r0 = X.AnonymousClass3P8.A01(r0, r1)
            r2.invoke(r0)
            r0 = 2057979889(0x7aaa47f1, float:4.420748E35)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1302421594(0xffffffffb25e9fa6, float:-1.2958401E-8)
            goto L_0x02ec
        L_0x00d7:
            r0 = -591271655(0xffffffffdcc1e919, float:-4.36647713E17)
            int r7 = X.AnonymousClass0fD.A03(r0)
            r0 = 1959799821(0x74d02c0d, float:1.3194473E32)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A02
            X.1P0 r0 = (X.1P0) r0
            r0.onSuccess(r6)
            r0 = 1666489802(0x63549dca, float:3.9220796E21)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1143408117(0xffffffffbbd8fa0b, float:-0.0066216043)
            goto L_0x02ec
        L_0x00f7:
            r0 = 74382164(0x46efb54, float:2.809217E-36)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 259716807(0xf7af6c7, float:1.2373479E-29)
            int r7 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            r0 = 0
            r1.setLoading(r0)
            java.lang.Object r6 = r5.A03
            X.K7l r6 = (X.C61436K7l) r6
            X.0eM r0 = r6.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r2 = r5.A02
            r1 = 1
            X.NQT r0 = new X.NQT
            r0.<init>(r2, r1)
            X.C290635fd.A01(r3, r0)
            r6.A02 = r1
            X.0eM r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            X.OTV r0 = (X.OTV) r0
            X.02m r2 = r0.A00
            r1 = 31786177(0x1e504c1, float:8.4128136E-38)
            java.lang.String r0 = "Follow_Creator_Success"
            r2.markerPoint(r1, r0)
            X.MSH r0 = r6.A01
            if (r0 == 0) goto L_0x013d
            r0.DGY()
        L_0x013d:
            X.DbZ.A17(r6)
            r0 = 1106557496(0x41f4ba38, float:30.590927)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 10149946(0x9ae03a, float:1.4223104E-38)
            goto L_0x0397
        L_0x014b:
            r0 = -1622847176(0xffffffff9f455138, float:-4.1783555E-20)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.1XO r6 = (X.1XO) r6
            r0 = -285083507(0xffffffffef01f88d, float:-4.0224046E28)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r1 = 0
            X.0qQ.A0B(r6, r1)
            java.util.List r0 = r6.A06
            X.1Xj r3 = X.DbZ.A0T(r0, r1)
            java.lang.Object r0 = r5.A03
            X.L6T r0 = (X.L6T) r0
            com.instagram.common.session.UserSession r2 = r0.A02
            X.1E8 r0 = X.1E7.A00(r2)
            X.0qQ.A0A(r3)
            r0.A03(r3)
            java.lang.Object r1 = r5.A01
            X.LCl r1 = (X.LCl) r1
            boolean r0 = X.C52345GOp.A0C(r2, r3)
            r0 = r0 ^ 1
            r1.A00(r0)
            r0 = 1587486566(0x5e9f1f66, float:5.7329977E18)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 884566673(0x34b96a91, float:3.4536473E-7)
            goto L_0x02ec
        L_0x018d:
            r0 = 2040060197(0x7998d925, float:9.920417E34)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.3JC r6 = (X.AnonymousClass3JC) r6
            r0 = 467807623(0x1be22d87, float:3.7417985E-22)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r6, r3)
            X.KAR.super.onSuccess(r6)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.lang.Object r8 = r6.A01
            X.3lr r8 = (X.C250663lr) r8
            if (r8 == 0) goto L_0x0266
            java.lang.Class<X.BoP> r6 = X.BoP.class
            r0 = 827(0x33b, float:1.159E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -638004799(0xffffffffd9f8d1c1, float:-8.7545526E15)
            X.3lr r8 = r8.getRequiredTreeField(r3, r1, r6, r0)
            if (r8 == 0) goto L_0x0266
            java.lang.Class<X.BoO> r6 = X.BoO.class
            java.lang.String r1 = "user"
            r0 = -1774109550(0xffffffff96413c92, float:-1.5609528E-25)
            X.3lr r8 = r8.getRequiredTreeField(r3, r1, r6, r0)
            if (r8 == 0) goto L_0x0266
            java.lang.Class<X.BoN> r6 = X.BoN.class
            r0 = 3739(0xe9b, float:5.24E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1169934775(0x45bbc9b7, float:6009.2144)
            X.3lr r6 = r8.getOptionalTreeField(r3, r1, r6, r0)
            if (r6 == 0) goto L_0x0266
            java.lang.Class<X.BoM> r1 = X.BoM.class
            r0 = 256670844(0xf4c7c7c, float:1.0081951E-29)
            X.3lr r8 = r6.reinterpretRequired(r3, r1, r0)
            if (r8 == 0) goto L_0x0266
            java.lang.Class<X.BoL> r6 = X.BoL.class
            java.lang.String r1 = "results"
            r0 = -1230967260(0xffffffffb6a0ee24, float:-4.796095E-6)
            com.google.common.collect.ImmutableList r0 = r8.getOptionalCompactedTreeListField(r3, r1, r6, r0)
            if (r0 == 0) goto L_0x0266
            X.3kO r10 = r0.iterator()
            X.0qQ.A07(r10)
        L_0x01fc:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0266
            X.3lr r6 = X.C41845B3m.A0V(r10)
            java.lang.Class<X.BoK> r1 = X.BoK.class
            r0 = 2123902453(0x7e982df5, float:1.0114064E38)
            X.3lr r9 = r6.reinterpretRequired(r3, r1, r0)
            X.0qQ.A07(r9)
            r8 = 1
            java.lang.String r6 = "name"
            java.lang.String r0 = r9.getRequiredStringField(r8, r6)
            if (r0 == 0) goto L_0x01fc
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01fc
            r12 = 0
            r0 = 704(0x2c0, float:9.87E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r23 = r9.A0A(r0)
            java.lang.String r0 = "id"
            long r0 = r9.getRequiredTimeField(r3, r0)
            java.lang.String r24 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "media_count"
            int r0 = r9.A00(r0)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)
            r1 = 35
            java.lang.String r0 = r9.getRequiredStringField(r8, r6)
            java.lang.String r25 = X.002.A0D(r0, r1)
            com.instagram.model.hashtag.HashtagImpl r11 = new com.instagram.model.hashtag.HashtagImpl
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r26 = r12
            r27 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r7.add(r11)
            goto L_0x01fc
        L_0x0266:
            java.lang.Object r6 = r5.A03
            X.LQj r6 = (X.C64146LQj) r6
            java.util.List r0 = X.00k.A0a(r7)
            r6.A01 = r0
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x027f
            X.L97 r0 = r6.A04
            android.view.View r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
            r6.A02 = r3
        L_0x027f:
            java.lang.Object r1 = r5.A02
            X.L0q r1 = (X.C63628L0q) r1
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            X.C64146LQj.A01(r6, r1, r0)
            r0 = 654176920(0x26fdf298, float:1.7621157E-15)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1835026018(0x6d604662, float:4.338108E27)
            goto L_0x0397
        L_0x0295:
            r0 = 1676170757(0x63e85605, float:8.571686E21)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.Xzd r6 = (X.C22328Xzd) r6
            r0 = 742269217(0x2c3e2121, float:2.7019014E-12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.KAR.super.onSuccess(r6)
            java.lang.Object r2 = r5.A01
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r0 = r5.A02
            com.instagram.location.intf.LocationSignalPackage r0 = (com.instagram.location.intf.LocationSignalPackage) r0
            java.lang.Class<com.instagram.creation.location.NearbyVenuesService> r1 = com.instagram.creation.location.NearbyVenuesService.class
            monitor-enter(r1)
            com.instagram.creation.location.NearbyVenuesService.A01 = r6     // Catch:{ all -> 0x02f0 }
            com.instagram.creation.location.NearbyVenuesService.A00 = r2     // Catch:{ all -> 0x02f0 }
            com.instagram.creation.location.NearbyVenuesService.A02 = r0     // Catch:{ all -> 0x02f0 }
            monitor-exit(r1)
            java.lang.Object r0 = r5.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.creation.location.NearbyVenuesService.A02(r0, r6)
            r0 = -1110333155(0xffffffffbdd1a91d, float:-0.10237334)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -794889464(0xffffffffd09ef308, float:-2.13338194E10)
            goto L_0x02ec
        L_0x02cb:
            X.LF6 r4 = new X.LF6
            r4.<init>(r2, r0)
            java.lang.String r3 = r1.A0X
            r3.getClass()
            java.lang.String r2 = X.JTP.A0q(r1)
            java.lang.String r1 = r1.A0e
            r1.getClass()
            java.lang.String r0 = "ufi_action_sheet"
            r4.A00(r0, r3, r2, r1)
        L_0x02e3:
            r0 = 1976685139(0x75d1d253, float:5.319609E32)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -293227270(0xffffffffee85b4fa, float:-2.0690147E28)
        L_0x02ec:
            X.AnonymousClass0fD.A0A(r0, r7)
            return
        L_0x02f0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x02f3:
            r0 = 588148492(0x230e6f0c, float:7.7213505E-18)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.1XO r6 = (X.1XO) r6
            r0 = -1701121860(0xffffffff9a9af0bc, float:-6.4081835E-23)
            int r3 = X.AnonymousClass7TG.A0D(r6, r0)
            r9 = 2131165339(0x7f07009b, float:1.7944892E38)
            java.util.List r0 = r6.A06
            int r0 = r0.size()
            r8 = 3
            if (r0 < r8) goto L_0x035c
            r7 = 0
        L_0x0310:
            java.util.List r0 = r6.A06
            X.1Xj r0 = X.DbZ.A0T(r0, r7)
            com.instagram.model.mediasize.ExtendedImageUrl r10 = r0.A1m(r9)
            java.util.List r0 = r6.A06
            X.1Xj r0 = X.DbZ.A0T(r0, r7)
            java.lang.String r1 = r0.A2n()
            if (r1 == 0) goto L_0x0351
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            if (r10 == 0) goto L_0x034c
            X.1NK r1 = X.1NK.A00()
            java.lang.Object r0 = r5.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            java.lang.String r0 = r0.getModuleName()
            X.1OO r1 = r1.A0J(r10, r0)
            r1.A08 = r2
            java.lang.Object r0 = r5.A02
            X.1MK r0 = (X.AnonymousClass1MK) r0
            r1.A02(r0)
            r1.A01()
        L_0x034c:
            int r7 = r7 + 1
            if (r7 >= r8) goto L_0x0363
            goto L_0x0310
        L_0x0351:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 646863907(0x268e5c23, float:9.878203E-16)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        L_0x035c:
            java.lang.Object r0 = r5.A03
            X.KLH r0 = (X.KLH) r0
            X.KLH.A01(r0)
        L_0x0363:
            r0 = -1391806736(0xffffffffad0ab6f0, float:-7.885012E-12)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1974738033(0x75b41c71, float:4.566359E32)
            goto L_0x0397
        L_0x036d:
            r0 = 606441935(0x242591cf, float:3.5902176E-17)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -772035185(0xffffffffd1fbad8f, float:-1.35118578E11)
            int r3 = X.AnonymousClass7TG.A0D(r6, r0)
            X.KAR.super.onSuccess(r6)
            java.lang.Object r2 = r5.A03
            X.1Yh r2 = (X.1Yh) r2
            java.lang.Object r1 = r5.A02
            X.Via r1 = (X.C17945Via) r1
            X.VdD r0 = new X.VdD
            r0.<init>(r1)
            X.1Yh.A03(r2, r0)
            r0 = -1794737362(0xffffffff95067b2e, float:-2.7158256E-26)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1708121094(0xffffffff9a3023fa, float:-3.642501E-23)
        L_0x0397:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KAR.onSuccess(java.lang.Object):void");
    }
}
