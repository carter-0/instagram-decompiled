package X;

import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.archive.fragment.ArchiveReelPeopleFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Ufm  reason: case insensitive filesystem */
public final class C15620Ufm extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C15620Ufm(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public static void A00(C15620Ufm ufm, C15241UXb uXb) {
        0lg r2 = (0lg) ufm.A02;
        0qQ.A0B(r2, 0);
        String str = ufm.A03;
        ((C19290WSy) r2.A01(C19290WSy.class, C20670Wx2.A00)).A00(uXb.A00, str);
        ((X6x) ufm.A01).DoS(uXb.A00);
    }

    public final void onFail(C268654dm r9) {
        int A032;
        int i;
        String str;
        String str2;
        Long A002;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(515041993);
                C59689JTv.A0A(((Fragment) this.A01).getContext(), "ArchiveFriendReelMedia_error");
                i = 91844982;
                break;
            case 1:
                A032 = AnonymousClass7TG.A0D(r9, -1419817404);
                C15328Uac uac = (C15328Uac) this.A02;
                AnonymousClass3AD r0 = uac.A0J;
                if (r0 != null) {
                    if (!(r0 instanceof C19763Wf4)) {
                        SpinnerImageView spinnerImageView = uac.A0K;
                        if (spinnerImageView == null) {
                            str2 = "loadingSpinner";
                        } else {
                            JTO.A1X(spinnerImageView);
                            C15480UdV udV = uac.A0B;
                            if (udV == null) {
                                str2 = "promoteAdToolsAdapter";
                            } else {
                                udV.A01(uac.A0e);
                            }
                        }
                    }
                    Throwable A012 = r9.A01();
                    if (A012 == null || (str = A012.getMessage()) == null) {
                        str = "Unknown error";
                    }
                    C18662VwK vwK = uac.A07;
                    if (vwK != null) {
                        String str3 = this.A03;
                        C19176WOi wOi = (C19176WOi) this.A01;
                        vwK.A07(str3, AppStateModule.APP_STATE_ACTIVE, wOi.BYo(), str);
                        uac.A0E = wOi;
                        C15328Uac.A07(uac);
                        i = -629396613;
                        break;
                    } else {
                        str2 = "adsManagerLogger";
                    }
                } else {
                    str2 = "pullToRefresh";
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            case 2:
                A032 = AnonymousClass0fD.A03(363519139);
                ((C60306Jj5) this.A01).A06.Epw(C388389nk.A00);
                i = 1479942735;
                break;
            case 3:
                A032 = AnonymousClass0fD.A03(-696309727);
                ((X6x) this.A01).DED();
                i = -1962988607;
                break;
            case 4:
                A032 = AnonymousClass0fD.A03(-210668784);
                ((X6x) this.A01).DED();
                i = 1409507780;
                break;
            case 5:
                A032 = AnonymousClass0fD.A03(972808447);
                ((X6x) this.A01).DED();
                i = 1544303958;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-462065895);
                C15620Ufm.super.onFail(r9);
                W0E A003 = C14639Tzl.A00(((ReelDashboardFragment) this.A01).A06);
                String str4 = this.A03;
                if (W0E.A01(A003, str4) && (A002 = W0E.A00(A003, str4)) != null) {
                    long longValue = A002.longValue();
                    1QP r4 = A003.A02;
                    r4.flowAnnotate(longValue, TraceFieldType.FailureReason, "fb_viewers_list_fetch_failure");
                    r4.flowEndFail(longValue, "fb_viewers_list_fetch_failure", (String) null);
                }
                i = -1727145917;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onFinish() {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-1420347684);
                C14909UEo uEo = (C14909UEo) this.A02;
                uEo.A02.stop();
                uEo.A01.setVisibility(8);
                uEo.A05.setVisibility(8);
                ((ArchiveReelPeopleFragment) this.A01).A02 = false;
                i2 = -938631365;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-1413438475);
                C15328Uac uac = (C15328Uac) this.A02;
                C238143As r0 = uac.A0H;
                if (r0 != null) {
                    r0.EaP(false);
                    AnonymousClass3AD r02 = uac.A0J;
                    if (r02 != null) {
                        r02.setIsLoading(false);
                        i2 = -497347379;
                        break;
                    } else {
                        str = "pullToRefresh";
                    }
                } else {
                    str = "recyclerViewProxy";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 6:
                i = AnonymousClass0fD.A03(-1222298195);
                C14625TzX tzX = ((ReelDashboardFragment) this.A01).mListAdapter;
                if (tzX != null) {
                    tzX.A0A(this.A03, false);
                }
                i2 = 726475733;
                break;
            default:
                C15620Ufm.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-563091182);
                i2 = 2143670449;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-1926207206);
                C15328Uac uac = (C15328Uac) this.A02;
                C238143As r0 = uac.A0H;
                if (r0 == null) {
                    str = "recyclerViewProxy";
                } else {
                    r0.EaP(true);
                    AnonymousClass3AD r02 = uac.A0J;
                    if (r02 != null) {
                        r02.setIsLoading(true);
                        AnonymousClass3AD r03 = uac.A0J;
                        if (r03 != null) {
                            if (!(r03 instanceof C19763Wf4)) {
                                C15480UdV udV = uac.A0B;
                                if (udV == null) {
                                    str = "promoteAdToolsAdapter";
                                } else {
                                    C15480UdV.A00(udV);
                                    SpinnerImageView spinnerImageView = uac.A0K;
                                    if (spinnerImageView == null) {
                                        str = "loadingSpinner";
                                    } else {
                                        DbS.A1T(spinnerImageView);
                                    }
                                }
                            }
                            i2 = 760101095;
                            break;
                        }
                    }
                    0qQ.A0F("pullToRefresh");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 2:
                i = AnonymousClass0fD.A03(-741989364);
                ((C60306Jj5) this.A01).A02();
                i2 = -1663980030;
                break;
            case 6:
                i = AnonymousClass0fD.A03(145469420);
                C14625TzX tzX = ((ReelDashboardFragment) this.A01).mListAdapter;
                if (tzX != null) {
                    tzX.A0A(this.A03, true);
                }
                i2 = -1990878746;
                break;
            default:
                C15620Ufm.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0244, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0247, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006a, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r22) {
        /*
            r21 = this;
            r5 = r21
            r6 = r22
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x01f0;
                case 1: goto L_0x00c5;
                case 2: goto L_0x0152;
                case 3: goto L_0x00a8;
                case 4: goto L_0x008b;
                case 5: goto L_0x006e;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 1812221306(0x6c044d7a, float:6.397763E26)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.B7x r6 = (X.C41945B7x) r6
            r0 = 1264090836(0x4b587ed4, float:1.4188244E7)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.C15620Ufm.super.onSuccess(r6)
            java.lang.Object r0 = r5.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            com.instagram.common.session.UserSession r0 = r0.A06
            X.W0E r7 = X.C14639Tzl.A00(r0)
            java.lang.String r3 = r5.A03
            java.util.List r0 = r6.A0G
            int r8 = r0.size()
            boolean r0 = X.W0E.A01(r7, r3)
            if (r0 == 0) goto L_0x004a
            java.lang.Long r0 = X.W0E.A00(r7, r3)
            if (r0 == 0) goto L_0x004a
            long r3 = r0.longValue()
            X.1QP r7 = r7.A02
            java.lang.String r0 = "fetched_fb_viewers_count"
            r7.flowAnnotate(r3, r0, r8)
            java.lang.String r0 = "fb_viewers_list_fetch_success"
            r7.flowMarkPoint(r3, r0)
        L_0x004a:
            java.lang.Object r7 = r5.A02
            X.X5P r7 = (X.X5P) r7
            java.util.List r10 = r6.A00()
            java.util.List r11 = r6.A0C
            java.lang.String r9 = r6.A07
            java.lang.Boolean r8 = r6.A06
            int r13 = r6.A00
            java.util.List r12 = r6.A0G
            int r14 = r6.A01
            r7.DEw(r8, r9, r10, r11, r12, r13, r14)
            r0 = 1726262941(0x66e4ae9d, float:5.399603E23)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1059726316(0x3f2a23ec, float:0.6646106)
        L_0x006a:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x006e:
            r0 = -1697434873(0xffffffff9ad33307, float:-8.7349994E-23)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.UXb r6 = (X.C15241UXb) r6
            r0 = -1711258505(0xffffffff9a004477, float:-2.6525085E-23)
            int r1 = X.AnonymousClass0fD.A03(r0)
            A00(r5, r6)
            r0 = 1149063511(0x447d5157, float:1013.27094)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 351953622(0x14fa62d6, float:2.5282533E-26)
            goto L_0x006a
        L_0x008b:
            r0 = 1308381953(0x4dfc5301, float:5.29162272E8)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.UXb r6 = (X.C15241UXb) r6
            r0 = 422145234(0x19296cd2, float:8.759071E-24)
            int r1 = X.AnonymousClass0fD.A03(r0)
            A00(r5, r6)
            r0 = 1918212699(0x72559a5b, float:4.2308423E30)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1136647411(0x43bfdcf3, float:383.72617)
            goto L_0x006a
        L_0x00a8:
            r0 = 1560125587(0x5cfda093, float:5.71117779E17)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.UXb r6 = (X.C15241UXb) r6
            r0 = -1236197614(0xffffffffb6511f12, float:-3.1161512E-6)
            int r1 = X.AnonymousClass0fD.A03(r0)
            A00(r5, r6)
            r0 = -1808148217(0xffffffff9439d907, float:-9.382914E-27)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1345084737(0x502c5d41, float:1.15671706E10)
            goto L_0x006a
        L_0x00c5:
            r0 = 1759419310(0x68de9bae, float:8.409897E24)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.UXS r6 = (X.UXS) r6
            r0 = -1047643067(0xffffffffc18e3c45, float:-17.779428)
            int r7 = X.AnonymousClass7TG.A0D(r6, r0)
            boolean r0 = r6.A01
            java.lang.String r3 = "adsManagerLogger"
            java.lang.Object r8 = r5.A02
            X.Uac r8 = (X.C15328Uac) r8
            if (r0 != 0) goto L_0x012a
            X.3AD r0 = r8.A0J
            if (r0 != 0) goto L_0x00ed
            java.lang.String r3 = "pullToRefresh"
        L_0x00e5:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ed:
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x0107
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r8.A0K
            if (r0 != 0) goto L_0x00f8
            java.lang.String r3 = "loadingSpinner"
            goto L_0x00e5
        L_0x00f8:
            X.JTO.A1X(r0)
            X.UdV r1 = r8.A0B
            if (r1 != 0) goto L_0x0102
            java.lang.String r3 = "promoteAdToolsAdapter"
            goto L_0x00e5
        L_0x0102:
            java.util.List r0 = r8.A0e
            r1.A01(r0)
        L_0x0107:
            X.UKM r0 = r6.A00
            if (r0 == 0) goto L_0x010f
            java.lang.String r9 = r0.A02
            if (r9 != 0) goto L_0x0111
        L_0x010f:
            java.lang.String r9 = "Unknown error"
        L_0x0111:
            X.VwK r6 = r8.A07
            if (r6 == 0) goto L_0x00e5
            java.lang.String r4 = r5.A03
            java.lang.Object r3 = r5.A01
            X.WOi r3 = (X.C19176WOi) r3
            java.lang.String r1 = r3.BYo()
            java.lang.String r0 = "active"
            r6.A07(r4, r0, r1, r9)
            r8.A0E = r3
            X.C15328Uac.A07(r8)
            goto L_0x0147
        L_0x012a:
            X.VwK r6 = r8.A07
            if (r6 == 0) goto L_0x00e5
            java.lang.String r4 = r5.A03
            java.lang.Object r0 = r5.A01
            X.WOi r0 = (X.C19176WOi) r0
            java.lang.String r3 = r0.BYo()
            r1 = 0
            java.lang.String r0 = "active"
            r6.A08(r4, r0, r3, r1)
            X.0eM r0 = r8.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.W3M.A06(r0)
        L_0x0147:
            r0 = 64583228(0x3d9763c, float:1.2781259E-36)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 400809137(0x17e3dcb1, float:1.4725242E-24)
            goto L_0x006a
        L_0x0152:
            r0 = 1522578905(0x5ac0b5d9, float:2.71215696E16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CFD r6 = (X.CFD) r6
            r0 = 786035520(0x2ed9f340, float:9.9112274E-11)
            int r2 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r7 = r5.A02
            X.L45 r7 = (X.L45) r7
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.CsK r0 = r6.A00
            if (r0 == 0) goto L_0x0173
            java.util.List r0 = r0.A00
            if (r0 != 0) goto L_0x0175
        L_0x0173:
            X.0sn r0 = X.0sn.A00
        L_0x0175:
            java.util.Iterator r11 = r0.iterator()
        L_0x0179:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r9 = r11.next()
            X.A7m r9 = (X.C39746A7m) r9
            X.A5V r0 = r9.A02
            r10 = 0
            if (r0 == 0) goto L_0x01d6
            java.lang.String r8 = r0.A00
        L_0x018c:
            java.lang.String r6 = r9.A06
            X.A6M r0 = r9.A01
            if (r0 == 0) goto L_0x01d4
            X.A6o r15 = r0.A00
            java.lang.Float r0 = r0.A01
            if (r0 == 0) goto L_0x01a4
            float r1 = r0.floatValue()
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x01a4:
            if (r8 == 0) goto L_0x0179
            if (r6 == 0) goto L_0x0179
            if (r15 == 0) goto L_0x0179
            if (r10 == 0) goto L_0x0179
            java.lang.String r1 = r9.A05
            X.0qQ.A07(r1)
            int r20 = r10.intValue()
            X.A7n r0 = r9.A00
            X.LAi r13 = r0.A00
            X.0qQ.A07(r13)
            X.A7n r0 = r9.A00
            X.LAi r14 = r0.A01
            X.0qQ.A07(r14)
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            X.JuE r12 = new X.JuE
            r19 = r6
            r18 = r8
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r3.add(r12)
            goto L_0x0179
        L_0x01d4:
            r15 = r10
            goto L_0x01a4
        L_0x01d6:
            r8 = r10
            goto L_0x018c
        L_0x01d8:
            android.util.LruCache r0 = r7.A00
            java.lang.String r1 = r5.A03
            r0.put(r1, r3)
            java.lang.Object r0 = r5.A01
            X.Jj5 r0 = (X.C60306Jj5) r0
            r0.A05(r1, r3)
            r0 = -2054383070(0xffffffff858c9a22, float:-1.3222156E-35)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1631856810(0xffffffff9ebbd756, float:-1.9888456E-20)
            goto L_0x0244
        L_0x01f0:
            r0 = -366849059(0xffffffffea2253dd, float:-4.9060503E25)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CF3 r6 = (X.CF3) r6
            r0 = -1558318839(0xffffffffa31df109, float:-8.562028E-18)
            int r7 = X.AnonymousClass0fD.A03(r0)
            java.lang.String r9 = r5.A03
            java.lang.Object r8 = r5.A01
            com.instagram.archive.fragment.ArchiveReelPeopleFragment r8 = (com.instagram.archive.fragment.ArchiveReelPeopleFragment) r8
            com.instagram.common.session.UserSession r0 = r8.getSession()
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            X.1Nr r1 = new X.1Nr
            r1.<init>(r0)
            com.instagram.model.reels.ReelType r3 = com.instagram.model.reels.ReelType.A07
            r0 = 1
            com.instagram.model.reels.Reel r2 = new com.instagram.model.reels.Reel
            r2.<init>(r1, r9, r0)
            r1 = 0
            r2.A1W = r1
            r2.A0P = r3
            java.util.List r0 = r6.A00
            if (r0 == 0) goto L_0x0227
            r2.A0X(r0)
        L_0x0227:
            com.instagram.common.session.UserSession r0 = r8.getSession()
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r0)
            r0.A0X(r2)
            java.lang.Object r0 = r5.A02
            X.UEo r0 = (X.C14909UEo) r0
            com.instagram.archive.fragment.ArchiveReelPeopleFragment.A01(r8, r0, r2)
            r8.A02 = r1
            r0 = -1799327417(0xffffffff94c07147, float:-1.9431726E-26)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 948028983(0x3881c637, float:6.18812E-5)
        L_0x0244:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15620Ufm.onSuccess(java.lang.Object):void");
    }
}
