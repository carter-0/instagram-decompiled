package X;

import android.location.Location;
import com.instagram.common.session.UserSession;

/* renamed from: X.MuC  reason: case insensitive filesystem */
public final class C67757MuC extends 2YL {
    public Location A00;
    public 1Wr A01;
    public 05G A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final 2Fk A07;
    public final UserSession A08;
    public final C55868Hop A09;
    public final L71 A0A;
    public final C18611Vv4 A0B;
    public final C71108Ocm A0C;
    public final C70656OFd A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final C249513ju A0H = JTO.A1G(Integer.MAX_VALUE);
    public final AnonymousClass0Ud A0I;
    public final boolean A0J;
    public final AnonymousClass0r6 A0K;
    public final AnonymousClass0r6 A0L;
    public final AnonymousClass0r6 A0M;
    public final AnonymousClass0r6 A0N;
    public final AnonymousClass0r6 A0O;
    public final AnonymousClass0r6 A0P;
    public final AnonymousClass0Ud A0Q;

    public C67757MuC(UserSession userSession, C55868Hop hop, L71 l71, C18611Vv4 vv4, C71108Ocm ocm, C70656OFd oFd, String str, String str2, String str3, boolean z) {
        String str4 = str;
        0qQ.A0B(str4, 1);
        C71108Ocm ocm2 = ocm;
        String str5 = str2;
        String str6 = str3;
        AnonymousClass7TG.A0w(2, str5, str6, ocm2);
        C70656OFd oFd2 = oFd;
        0qQ.A0B(oFd2, 5);
        L71 l712 = l71;
        C18611Vv4 vv42 = vv4;
        C51973G9u.A0s(6, l712, userSession, vv42);
        C55868Hop hop2 = hop;
        0qQ.A0B(hop2, 9);
        this.A0F = str4;
        this.A0G = str5;
        this.A0E = str6;
        this.A0C = ocm2;
        this.A0D = oFd2;
        this.A0A = l712;
        this.A08 = userSession;
        this.A0B = vv42;
        this.A09 = hop2;
        this.A0J = 182.A06(0Tu.A05, userSession, 36318780325894600L);
        Location location = null;
        05G A012 = C71108Ocm.A01(this.A0C, this.A0F, this.A0G);
        19B r4 = 19B.A00;
        this.A03 = C226292g8.A00(r4, A012);
        this.A02 = C51970G9q.A10(false);
        C73521Pe6 pe6 = new C73521Pe6(A03(this), 10);
        this.A0M = pe6;
        C61820pm A032 = AnonymousClass10H.A03(new C67296MlV(5, (AnonymousClass4D7) null), A03(this), this.A02);
        this.A0P = A032;
        MC9 mc9 = new MC9(A03(this), 63);
        this.A0N = mc9;
        05G A033 = A03(this);
        0qQ.A0B(A033, 0);
        C73521Pe6 pe62 = new C73521Pe6(A033, 8);
        this.A0K = pe62;
        05F A022 = 10b.A02(A01(this).A06.A01, C318116oQ.A00(this), new MC9(A03(this), 64), AnonymousClass10A.A01);
        this.A0Q = A022;
        this.A0I = A022;
        this.A04 = C226292g8.A00(r4, pe62);
        0pp A023 = AnonymousClass10H.A02(new C73572Pg2(this, (AnonymousClass4D7) null, 2), pe6, A032, mc9, pe62, A03(this));
        this.A0O = A023;
        C73521Pe6 pe63 = new C73521Pe6(A023, 11);
        this.A0L = pe63;
        this.A05 = C226292g8.A00(r4, pe63);
        this.A07 = C226292g8.A00(r4, new C73521Pe6(pe63, 12));
        this.A06 = C226292g8.A00(r4, new C73521Pe6(A023, 13));
        DbY.A19(this, new C66168MGf(this, (AnonymousClass4D7) null, 14), new C73521Pe6(A03(this), 9));
        1Wr r1 = 1Wr.A00;
        this.A01 = r1;
        this.A00 = r1 != null ? r1.getLastLocation(userSession, "SerpChildViewModel") : location;
        if (!z) {
            1Eo.A05(r4, new MG4(this, (AnonymousClass4D7) null, 10), C318116oQ.A00(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.Nfl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: X.Nfm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: X.Nfp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: X.Nfq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: X.Nfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: X.Mny} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: X.Nfr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: X.Mnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: X.Nfv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: X.Nfs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: X.Mg7} */
    /* JADX WARNING: type inference failed for: r5v2, types: [X.Nfk, X.Mg5] */
    /* JADX WARNING: type inference failed for: r5v3, types: [X.Nfk, X.Mg5] */
    /* JADX WARNING: type inference failed for: r0v24, types: [X.O2f, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C297005r0 A00(X.C66966Mfz r5, X.C67757MuC r6, java.lang.Object r7, int r8, int r9) {
        /*
            boolean r0 = r7 instanceof X.C66942Mfb
            r4 = 0
            if (r0 == 0) goto L_0x0068
            X.Mfb r7 = (X.C66942Mfb) r7
            int r0 = r8 + r9
            r5.A00 = r0
            r5.A01 = r9
            X.Mg0 r1 = new X.Mg0
            r1.<init>(r5)
            boolean r0 = r7 instanceof X.C66632Ma1
            if (r0 == 0) goto L_0x0038
            X.Ma1 r7 = (X.C66632Ma1) r7
            X.Mg7 r5 = new X.Mg7
            r5.<init>(r1, r7)
        L_0x001d:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            r1 = 0
            X.5qz r0 = new X.5qz
            r0.<init>(r8, r1)
            r3.add(r5)
            r2.put(r5, r0)
            r1 = 3
            X.5r0 r0 = new X.5r0
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x0038:
            boolean r0 = r7 instanceof X.C69160Nfj
            if (r0 == 0) goto L_0x0044
            X.Nfj r7 = (X.C69160Nfj) r7
            X.Nfs r5 = new X.Nfs
            r5.<init>(r7, r1)
            goto L_0x001d
        L_0x0044:
            boolean r0 = r7 instanceof X.C69158Nfh
            if (r0 == 0) goto L_0x0050
            X.Nfh r7 = (X.C69158Nfh) r7
            X.Nfv r5 = new X.Nfv
            r5.<init>(r7, r1)
            goto L_0x001d
        L_0x0050:
            boolean r0 = r7 instanceof X.C67387Mn4
            if (r0 == 0) goto L_0x005c
            X.Mn4 r7 = (X.C67387Mn4) r7
            X.Mnw r5 = new X.Mnw
            r5.<init>(r7, r1)
            goto L_0x001d
        L_0x005c:
            boolean r0 = r7 instanceof X.C69159Nfi
            if (r0 == 0) goto L_0x013f
            X.Nfi r7 = (X.C69159Nfi) r7
            X.Nfr r5 = new X.Nfr
            r5.<init>(r7, r1)
            goto L_0x001d
        L_0x0068:
            r1 = 3
            boolean r0 = X.C61069Jw7.A00(r1, r7)
            if (r0 == 0) goto L_0x007c
            X.Jw7 r7 = (X.C61069Jw7) r7
            X.O2f r0 = new X.O2f
            r0.<init>()
            X.Mny r5 = new X.Mny
            r5.<init>(r7, r0)
            goto L_0x001d
        L_0x007c:
            boolean r0 = r7 instanceof X.N3M
            if (r0 == 0) goto L_0x00aa
            X.N3M r7 = (X.N3M) r7
            java.lang.Integer r0 = r7.A01
            if (r0 == 0) goto L_0x0092
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0092
            X.Nfo r5 = new X.Nfo
            r5.<init>(r7)
            goto L_0x001d
        L_0x0092:
            java.util.List r0 = r7.A0A
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a3
            X.Nfq r5 = new X.Nfq
            r5.<init>(r7)
            goto L_0x001d
        L_0x00a3:
            X.Nfp r5 = new X.Nfp
            r5.<init>(r7)
            goto L_0x001d
        L_0x00aa:
            boolean r0 = r7 instanceof X.C66972Mg5
            if (r0 == 0) goto L_0x00b1
            r5 = r7
            goto L_0x001d
        L_0x00b1:
            boolean r0 = r7 instanceof X.C70826OMy
            if (r0 == 0) goto L_0x00e4
            X.OMy r7 = (X.C70826OMy) r7
            java.lang.Integer r1 = r7.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 != r0) goto L_0x00c6
            X.Nfm r5 = new X.Nfm
            r5.<init>(r7)
            goto L_0x001d
        L_0x00c6:
            java.lang.Integer r0 = r7.A01()
            java.lang.String r3 = r7.A03
            X.AnonymousClass7TG.A1O(r0, r3)
            java.lang.String r2 = "hcm_"
            java.lang.String r1 = X.C70274O0e.A00(r0)
            r0 = 95
            java.lang.String r0 = X.002.A0i(r2, r1, r3, r0)
            X.Nfk r5 = new X.Nfk
            r5.<init>(r0)
            r5.A00 = r7
            goto L_0x001d
        L_0x00e4:
            boolean r0 = r7 instanceof X.N3A
            if (r0 == 0) goto L_0x0117
            com.instagram.common.session.UserSession r3 = r6.A08
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36328340923170038(0x81106f00013cf6, double:3.037527310075625E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x013f
            X.N3A r7 = (X.N3A) r7
            java.lang.Integer r0 = r7.A04
            java.lang.String r3 = ""
            X.AnonymousClass7TG.A1O(r0, r3)
            java.lang.String r2 = "hcm_"
            java.lang.String r1 = X.C70274O0e.A00(r0)
            r0 = 95
            java.lang.String r0 = X.002.A0i(r2, r1, r3, r0)
            X.Nfk r5 = new X.Nfk
            r5.<init>(r0)
            r5.A01 = r7
            goto L_0x001d
        L_0x0117:
            boolean r0 = r7 instanceof X.N62
            if (r0 == 0) goto L_0x0137
            com.instagram.common.session.UserSession r3 = r6.A08
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36328340923170038(0x81106f00013cf6, double:3.037527310075625E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x013f
            X.N62 r7 = (X.N62) r7
            java.lang.Integer r0 = r7.A02
            X.Nfl r5 = new X.Nfl
            r5.<init>(r7, r0)
            goto L_0x001d
        L_0x0137:
            boolean r0 = r7 instanceof X.C297005r0
            if (r0 == 0) goto L_0x013f
            r4 = r7
            X.5r0 r4 = (X.C297005r0) r4
            return r4
        L_0x013f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67757MuC.A00(X.Mfz, X.MuC, java.lang.Object, int, int):X.5r0");
    }

    public static final 05G A03(C67757MuC muC) {
        return C71108Ocm.A02(muC.A0C, muC.A0F, muC.A0G);
    }

    public static N4N A01(C67757MuC muC) {
        return (N4N) A03(muC).getValue();
    }

    public static final String A02(C67757MuC muC) {
        if (!(A01(muC).A0A instanceof C69173Nfw)) {
            return null;
        }
        C69628NpA npA = A01(muC).A0A;
        0qQ.A0C(npA, "null cannot be cast to non-null type com.instagram.search.surface.repository.SerpFeed.PaginationState.Incomplete");
        return ((C69173Nfw) npA).A00;
    }

    public final String A04() {
        return A01(this).A0F;
    }

    public final void A05() {
        if (A02(this) != null) {
            AnonymousClass7TE.A1Z(new MG4(this, (AnonymousClass4D7) null, 11), C318116oQ.A00(this));
        }
    }

    public final boolean A06() {
        Integer num;
        if (!A01(this).A0N) {
            return false;
        }
        N3M n3m = A01(this).A07;
        if (n3m == null || (num = n3m.A01) == null || num.intValue() == 1) {
            return true;
        }
        return false;
    }
}
