package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class GD6 implements C231292rN, C59587JPh {
    public I4M A00;
    public JQX A01;
    public boolean A02;
    public boolean A03;
    public Long A04;
    public final ClipsViewerConfig A05;
    public final GBX A06;
    public final AnonymousClass2t9 A07;
    public final AnonymousClass2tB A08;
    public final UserSession A09;
    public final C52009GBg A0A;
    public final GBY A0B;
    public final C52007GBe A0C;
    public final List A0D = AnonymousClass7TE.A1C();
    public final List A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final AnonymousClass2tB A0H;
    public final GBW A0I;
    public final C14049Tot A0J;
    public final GBU A0K;
    public final GBV A0L;
    public final GBQ A0M;
    public final GBT A0N;
    public final boolean A0O;
    public final boolean A0P;

    public final void A07(C267324bN r3) {
        0qQ.A0B(r3, 0);
        if (GDZ.A00(r3) || r3.A0G() || r3.A01 == C295365o2.BRAND_SURVEY) {
            this.A0A.A0T(r3, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r1 = r5.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C267324bN r6, java.lang.String r7, int r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            boolean r0 = X.GDZ.A00(r6)
            if (r0 != 0) goto L_0x0016
            boolean r0 = r6.A0G()
            if (r0 != 0) goto L_0x0016
            X.5o2 r1 = r6.A01
            X.5o2 r0 = X.C295365o2.BRAND_SURVEY
            if (r1 != r0) goto L_0x0047
        L_0x0016:
            X.GBg r4 = r5.A0A
            r4.A0b(r6, r8)
            r2 = 1
            r4.Ea9(r6, r2)
            X.1Xj r0 = r6.A02
            if (r0 == 0) goto L_0x0048
            com.instagram.common.session.UserSession r1 = r5.A09
            com.instagram.user.model.UpcomingEvent r0 = r0.A27(r1)
            if (r0 == 0) goto L_0x0048
            X.HMA r0 = X.C52057GDd.A00(r6, r1, r0, r2)
        L_0x002f:
            r4.EiN(r6, r0)
            com.instagram.common.session.UserSession r3 = r5.A09
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318509745641661(0x81077e002918bd, double:3.031310033819705E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0047
            r4.EaR(r6, r9)
            r4.EUB(r6, r7)
        L_0x0047:
            return
        L_0x0048:
            r0 = 0
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GD6.A08(X.4bN, java.lang.String, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r1.A0E(r0).A01 == X.C295365o2.GHOST) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(java.util.List r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r4)
            r0 = 0
            r3.A09(r0)
            if (r5 == 0) goto L_0x0027
            X.GBg r1 = r3.A0A
            int r0 = r1.A0A()
            if (r0 <= 0) goto L_0x0034
            com.instagram.clips.intf.ClipsViewerConfig r0 = r3.A05
            boolean r0 = r0.A1Y
            if (r0 == 0) goto L_0x002d
            r0 = 0
        L_0x001d:
            X.4bN r0 = r1.A0E(r0)
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.GHOST
            if (r1 != r0) goto L_0x0034
        L_0x0027:
            X.GBg r0 = r3.A0A
            r0.A0V(r2)
            return
        L_0x002d:
            int r0 = r1.A0A()
            int r0 = r0 + -1
            goto L_0x001d
        L_0x0034:
            X.4bN r0 = X.C295375o3.A00()
            r2.add(r0)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GD6.A0B(java.util.List, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r6.A0A.A0I().containsAll(r7) == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(java.util.List r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r6 = this;
            r3 = 0
            if (r12 == 0) goto L_0x0090
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r7.iterator()
        L_0x000b:
            boolean r0 = r2.hasNext()
            r4 = 1
            if (r0 == 0) goto L_0x0021
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4bN r0 = (X.C267324bN) r0
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x000b
            r5.add(r1)
            goto L_0x000b
        L_0x0021:
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            if (r0 != 0) goto L_0x0090
            com.instagram.clips.intf.ClipsViewerConfig r0 = r6.A05
            com.instagram.clips.intf.ClipsViewerSource r2 = r0.A0J
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0038
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0038
            return
        L_0x0038:
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0047
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x0047
            X.GBg r0 = r6.A0A
            r0.A0N()
            r6.A03 = r4
        L_0x0047:
            if (r10 == 0) goto L_0x005d
            X.5o2 r5 = X.C295365o2.UNAVAILABLE
            r0 = 0
            X.GEC r1 = new X.GEC
            r1.<init>(r5, r0)
            X.4bN r0 = new X.4bN
            r0.<init>((X.GEC) r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r6.A0B(r0, r11)
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r11 == 0) goto L_0x0080
            if (r1 != 0) goto L_0x0080
        L_0x0062:
            r6.A0B(r7, r4)
            if (r11 != 0) goto L_0x0090
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.BLEND
            if (r2 != r0) goto L_0x0090
            X.5o2 r2 = X.C295365o2.BLEND_END_OF_FEED
            r0 = 0
            X.GEC r1 = new X.GEC
            r1.<init>(r2, r0)
            X.4bN r0 = new X.4bN
            r0.<init>((X.GEC) r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r6.A0B(r0, r3)
            return
        L_0x0080:
            r4 = 0
            goto L_0x0062
        L_0x0082:
            X.GBg r0 = r6.A0A
            java.util.List r0 = r0.A0I()
            boolean r0 = r0.containsAll(r7)
            r1 = 1
            if (r0 != 0) goto L_0x005e
            goto L_0x005d
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GD6.A0C(java.util.List, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final AnonymousClass3W1 BQr(1Xj r3) {
        0qQ.A0B(r3, 0);
        AnonymousClass3W1 r0 = this.A0A.BzC(C267324bN.A0d.A04(r3)).A0E;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DLr(C267324bN r7, int i) {
        0qQ.A0B(r7, 0);
        boolean A042 = A04();
        if (!A042) {
            C320876t6 A022 = A02(r7, this);
            this.A0B.A05.D1O(i, 1, (Object) null);
            this.A02 = true;
            11Z.A02(new C52291GMh(this, A022, i));
            return;
        }
        C227912kJ.A01(this.A09, this.A04, (C62320sa) null, new J6V(i, 13, (Object) r7, (Object) this), A042);
    }

    public static int A00(GD6 gd6) {
        return gd6.A0A.A0A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (X.0qQ.A0K(r1, "creators_in_reels") != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        return new X.C320876t6(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        return new X.C320876t6(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C320876t6 A02(X.C267324bN r6, X.GD6 r7) {
        /*
            X.GBX r0 = r7.A06
            r4 = r6
            boolean r0 = r0.A00(r6)
            if (r0 == 0) goto L_0x001d
            X.GBg r0 = r7.A0A
            X.Jvg r3 = r0.A0D()
            X.GDe r5 = r0.BzC(r6)
            com.instagram.common.session.UserSession r6 = r7.A09
            boolean r7 = r7.A0O
            X.GDg r2 = new X.GDg
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L_0x001d:
            boolean r0 = r7.A0P
            if (r0 == 0) goto L_0x0040
            X.0wj r3 = X.0wj.A01
            r2 = 817904311(0x30c03ab7, float:1.3986526E-9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Non-Litho Item Definition has been initialized for itemType = "
            r1.append(r0)
            X.5o2 r0 = r6.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.0f9 r0 = r3.AEf(r0, r2)
            r0.report()
        L_0x0040:
            X.5o2 r0 = r6.A01
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x009f;
                case 1: goto L_0x0097;
                case 2: goto L_0x0097;
                case 3: goto L_0x0097;
                case 4: goto L_0x007f;
                case 5: goto L_0x007f;
                case 6: goto L_0x0079;
                case 7: goto L_0x008f;
                case 8: goto L_0x007f;
                case 9: goto L_0x005b;
                case 10: goto L_0x007f;
                case 11: goto L_0x007f;
                case 12: goto L_0x006b;
                case 13: goto L_0x0073;
                case 14: goto L_0x007f;
                case 15: goto L_0x007f;
                case 16: goto L_0x008f;
                case 17: goto L_0x0055;
                case 18: goto L_0x004f;
                case 19: goto L_0x0087;
                default: goto L_0x0049;
            }
        L_0x0049:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x004f:
            X.HJl r2 = new X.HJl
            r2.<init>(r6)
            return r2
        L_0x0055:
            X.HJm r2 = new X.HJm
            r2.<init>(r6)
            return r2
        L_0x005b:
            X.GmE r0 = r6.A02()
            if (r0 == 0) goto L_0x0071
            java.lang.String r1 = r0.A0B
        L_0x0063:
            java.lang.String r0 = "creators_in_reels"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0073
        L_0x006b:
            X.HJn r2 = new X.HJn
            r2.<init>(r6)
            return r2
        L_0x0071:
            r1 = 0
            goto L_0x0063
        L_0x0073:
            X.GZ7 r2 = new X.GZ7
            r2.<init>(r6)
            return r2
        L_0x0079:
            X.HJo r2 = new X.HJo
            r2.<init>(r6)
            return r2
        L_0x007f:
            java.lang.String r1 = "Ghost should only be litho"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0087:
            java.lang.String r1 = "Blend EOF should only be litho"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x008f:
            java.lang.String r1 = "Unavailable should only be litho"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0097:
            java.lang.String r1 = "Ads should only be litho"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x009f:
            java.lang.String r1 = "Organic should only be litho"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GD6.A02(X.4bN, X.GD6):X.6t6");
    }

    public static final void A03(GD6 gd6) {
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        List<C267324bN> A0I2 = gd6.A0A.A0I();
        ArrayList A0r = AnonymousClass7TG.A0r(A0I2);
        for (C267324bN A022 : A0I2) {
            A0r.add(A02(A022, gd6));
        }
        viewModelListUpdate.A01(A0r);
        gd6.A02 = true;
        gd6.A07.A06(viewModelListUpdate, gd6.A08);
    }

    private final boolean A04() {
        long j;
        boolean A1W = AnonymousClass7TF.A1W(this.A05.A0J, ClipsViewerSource.CLIPS_TAB);
        UserSession userSession = this.A09;
        0Tu r2 = 0Tu.A05;
        if (A1W) {
            j = 36329732492902699L;
        } else {
            j = 36329732492968236L;
        }
        return DbY.A1Z(r2, userSession, j);
    }

    public final 2Rw A05() {
        2Rw r0;
        2We r02 = this.A0B.A00;
        if (r02 != null && (r0 = r02.A0Q) != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0z("should never be null");
    }

    public final void A06(C229352nF r6, String str) {
        if (r6 != null && str != null) {
            List A0I2 = this.A0A.A0I();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : A0I2) {
                C295365o2 r1 = ((C267324bN) next).A01;
                if (r1 == C295365o2.ORGANIC || r1 == C295365o2.AD || r1 == C295365o2.MULTI_ADS || r1 == C295365o2.MIDCARD) {
                    A1C.add(next);
                }
            }
            r6.A08(str, A1C, false, false);
        }
    }

    public final void A09(Integer num) {
        if (!this.A0A.A0Y()) {
            11Z.A02(new C52220GJl(this, num));
        }
    }

    public final void A0A(Integer num) {
        if (num == null) {
            A0B(0sn.A00, true);
            return;
        }
        this.A0A.A0b(C295375o3.A00(), num.intValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r5.A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cs9(X.1Xj r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0025
            X.GBg r1 = r5.A0A
            int r4 = r1.A0C(r6)
            r0 = -1
            if (r4 == r0) goto L_0x0025
            X.4bN r0 = r1.A0E(r4)
            r3 = 1
            r5.A02 = r3
            X.2t9 r2 = r5.A07
            X.6t6 r1 = A02(r0, r5)
            X.2tB r0 = r5.A08
            r2.A07(r0, r1, r4)
            X.GBY r0 = r5.A0B
            X.GBa r1 = r0.A05
            r0 = 0
            r1.D1O(r4, r3, r0)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GD6.Cs9(X.1Xj):void");
    }

    public static C52009GBg A01(C62320sa r0) {
        return ((GD6) r0.invoke()).A0A;
    }

    public final void onDataSetChanged() {
        boolean A042 = A04();
        if (!A042) {
            A03(this);
            return;
        }
        Long l = this.A04;
        if (l == null) {
            l = C51968G9o.A0u();
            this.A04 = l;
        }
        C227912kJ.A01(this.A09, l, new C58676Ivl(this, 32), J6E.A00(this, 2), A042);
    }

    public GD6(Activity activity, Context context, AnonymousClass07Z r57, C229382nI r58, JPD jpd, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C230292pL r62, C310256ag r63, C234342xi r64, C51984GAh gAh, C52009GBg gBg, C51987GAk gAk, GDE gde, C56024HrW hrW, H3C h3c, GBL gbl, GBI gbi, C46340Dci dci, JU3 ju3, GBO gbo, GBD gbd, C46341Dcj dcj, C55267Hew hew, GBM gbm, GBN gbn, GBJ gbj, I4A i4a, C51979GAc gAc, GBC gbc, C51981GAe gAe, C51980GAd gAd, GF2 gf2, JT5 jt5, JT5 jt52, 0sP r90, boolean z, boolean z2) {
        C51979GAc gAc2 = gAc;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1S(userSession2, gAc2);
        I4A i4a2 = i4a;
        ClipsViewerConfig clipsViewerConfig2 = clipsViewerConfig;
        GDE gde2 = gde;
        GBI gbi2 = gbi;
        C51974G9v.A1Q(clipsViewerConfig2, gde2, i4a2, gbi2);
        GBJ gbj2 = gbj;
        GBM gbm2 = gbm;
        C55267Hew hew2 = hew;
        GBL gbl2 = gbl;
        C51974G9v.A1R(gbj2, hew2, gbl2, gbm2);
        GBN gbn2 = gbn;
        0qQ.A0B(gbn2, 15);
        C46341Dcj dcj2 = dcj;
        C46340Dci dci2 = dci;
        C51969G9p.A1S(dci2, 16, dcj2);
        JU3 ju32 = ju3;
        0qQ.A0B(ju32, 18);
        GBO gbo2 = gbo;
        C52009GBg gBg2 = gBg;
        C51970G9q.A1O(gbo2, 20, gBg2);
        C51984GAh gAh2 = gAh;
        0qQ.A0B(gAh2, 30);
        this.A09 = userSession2;
        this.A05 = clipsViewerConfig2;
        this.A0A = gBg2;
        0Tu r2 = 0Tu.A05;
        this.A0G = 182.A06(r2, userSession2, 36312874749658444L);
        this.A0P = 182.A06(r2, userSession2, 36312874750248273L);
        this.A0F = 182.A06(r2, userSession2, 36312874746971437L);
        this.A0O = 182.A06(r2, userSession2, 36312874747102511L);
        Activity activity2 = activity;
        Context context2 = context;
        Context context3 = context2;
        GBQ gbq = new GBQ(activity2, context3, userSession2, z);
        this.A0M = gbq;
        C230292pL r23 = r62;
        C310256ag r24 = r63;
        C51987GAk gAk2 = gAk;
        C52009GBg gBg3 = gBg2;
        C51984GAh gAh3 = gAh2;
        C52009GBg gBg4 = gBg2;
        GBQ gbq2 = gbq;
        C51987GAk gAk3 = gAk2;
        GDE gde3 = gde2;
        Activity activity3 = activity2;
        Context context4 = context3;
        ClipsViewerConfig clipsViewerConfig3 = clipsViewerConfig2;
        C52009GBg gBg5 = gBg2;
        UserSession userSession3 = userSession2;
        C52007GBe gBe = new C52007GBe(activity3, context4, r58, jpd, clipsViewerConfig3, gBg5, gBg3, userSession3, r23, r24, r64, gAh3, gBg4, gbq2, gAk3, gde3, hrW, h3c, gbl2, gbi2, dci2, ju32, gbo2, gbd, dcj2, hew2, gbm2, gbn2, gbj2, i4a2, gAc2, gf2, jt5, jt52, z2);
        this.A0C = gBe;
        C51979GAc gAc3 = gAc2;
        GBT gbt = new GBT(gBg2, gAc3, gAk2, gAd);
        this.A0N = gbt;
        Activity activity4 = activity2;
        C52009GBg gBg6 = gBg2;
        C51979GAc gAc4 = gAc3;
        UserSession userSession4 = userSession2;
        C51987GAk gAk4 = gAk2;
        GBU gbu = new GBU(activity4, gBg6, gAc4, userSession4, gAk4);
        this.A0K = gbu;
        GBV gbv = new GBV(activity4, gBg6, gAc4, userSession4, gAk4, gAe);
        this.A0L = gbv;
        C14049Tot tot = new C14049Tot(activity2, gBg2, userSession2, gAk2);
        this.A0J = tot;
        GBW gbw = new GBW(gBg2, gAk2);
        this.A0I = gbw;
        GBX gbx = new GBX();
        this.A06 = gbx;
        this.A08 = new C66905Meo(this, 4);
        C66905Meo meo = new C66905Meo(this, 3);
        this.A0H = meo;
        Activity activity5 = activity2;
        Context context5 = context2;
        GBY gby = new GBY(activity5, context5, r57, clipsViewerConfig2, gbx, meo, userSession2, gBg2, gbw, tot, gbu, gbv, gbq, gBe, gbt, gde2, gbc, new C58676Ivl(this, 31), r90);
        this.A0B = gby;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context2);
        A002.A01 = gby.A02;
        A002.A01(gBe);
        if (182.A06(r2, userSession2, 36312874747036974L)) {
            A002.A09 = true;
        }
        if (182.A06(r2, userSession2, 36327353081280877L)) {
            A002.A0A = true;
        }
        AnonymousClass2t9 A003 = A002.A00();
        Context context6 = context2;
        C51979GAc gAc5 = gAc2;
        C66626MZn mZn = new C66626MZn(context6, gAc5, userSession2, new C52008GBf(context6, gAc5, userSession2), C267324bN.class);
        Iterator A0H2 = gBg2.A0H();
        while (A0H2.hasNext()) {
            Object next = A0H2.next();
            if (next instanceof C267324bN) {
                mZn.A03(gBg2, next);
            }
        }
        gBg2.Eab((AnonymousClass07Z) null, mZn);
        this.A07 = A003;
        this.A0E = AnonymousClass7TE.A1C();
        C52009GBg gBg7 = this.A0A;
        gAk2.A00 = new C52011GBi(gBg7, this);
        gBg7.A02.add(this);
    }
}
