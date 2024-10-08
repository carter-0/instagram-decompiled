package X;

import com.instagram.common.session.UserSession;

public final class HB0 extends C57212ISz {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ void Cir(0jB r6, 1Nv r7, AnonymousClass4DU r8, int i, int i2) {
        0Aj A0e;
        String str;
        Long l;
        String id;
        String A0H;
        Long A10;
        String str2;
        String str3;
        C267324bN r72 = (C267324bN) r7;
        AnonymousClass7TG.A1N(r8, r72);
        AnonymousClass3OA A07 = r72.A07();
        if (A07 != null && this.A01) {
            UserSession userSession = this.A00;
            if (182.A06(0Tu.A06, userSession, 36315133898656771L)) {
                DbY.A1S(userSession, A07);
                0Aj A0e2 = AnonymousClass7TE.A0e(C51972G9s.A0Z(r8, new AnonymousClass0kM(userSession)), "instagram_ad_impression_second_channel");
                if (A0e2.isSampled()) {
                    1Xj r2 = A07.A0K;
                    C51974G9v.A0p(A0e2, r2, "m_pk", r2.getId());
                    C51965G9l.A1L(A0e2, A07.A0j);
                    C51965G9l.A1D(A0e2, C51971G9r.A0n(0, A07.A0S));
                    A0e2.AAJ("host_media_pk", A07.A0f);
                    A0e2.Cgf();
                }
            }
        }
        if (!r72.CcK() && this.A03) {
            AnonymousClass0kM A0M = DbY.A0M(this.A00);
            A0M.A00 = r8;
            A0M.A01(0kJ.A02);
            A0e = AnonymousClass7TE.A0e(A0M.A00(), "instagram_organic_impression_second_channel");
            if (A0e.isSampled()) {
                1Xj r0 = r72.A02;
                if (r0 == null || (str3 = r0.getId()) == null) {
                    str3 = r72.getId();
                }
                C51965G9l.A1I(A0e, str3);
                1Xj r02 = r72.A02;
                if (r02 != null) {
                    A10 = C51972G9s.A0g(r02);
                } else {
                    A10 = null;
                }
                str2 = "m_t";
            } else {
                return;
            }
        } else if (r72.CcK() && this.A01) {
            UserSession userSession2 = this.A00;
            A0e = AnonymousClass7TE.A0e(C51972G9s.A0Z(r8, DbY.A0M(userSession2)), "instagram_ad_impression_second_channel");
            if (A0e.isSampled()) {
                1Xj r03 = r72.A02;
                if (r03 == null || (str = r03.getId()) == null) {
                    str = r72.getId();
                }
                C51965G9l.A1I(A0e, str);
                1Xj r04 = r72.A02;
                if (r04 != null) {
                    l = C51972G9s.A0g(r04);
                } else {
                    l = null;
                }
                A0e.A9F("m_t", l);
                C51965G9l.A1L(A0e, r72.ByO(userSession2));
                1Xj r1 = r72.A02;
                Long l2 = null;
                if (r1 != null) {
                    l2 = C51972G9s.A0i(C231122qu.A07(userSession2, r1));
                }
                C51965G9l.A1D(A0e, l2);
                1Xj r05 = r72.A02;
                if (!(r05 == null || (id = r05.getId()) == null || (A0H = C231122qu.A0H(userSession2, id)) == null || (A10 = AnonymousClass7TE.A10(A0H)) == null)) {
                    str2 = "host_profile_id";
                }
                A0e.Cgf();
            }
            return;
        } else {
            return;
        }
        A0e.A9F(str2, A10);
        A0e.Cgf();
    }

    public final /* bridge */ /* synthetic */ void Cke(0jB r6, 1Nv r7, AnonymousClass4DU r8, int i, int i2) {
        0Aj A0e;
        String str;
        Long l;
        String id;
        String A0H;
        Long A10;
        String str2;
        String str3;
        C267324bN r72 = (C267324bN) r7;
        AnonymousClass7TG.A1N(r8, r72);
        AnonymousClass3OA A07 = r72.A07();
        if (A07 != null && this.A01) {
            UserSession userSession = this.A00;
            if (182.A06(0Tu.A06, userSession, 36315133898656771L)) {
                DbY.A1S(userSession, A07);
                0Aj A0e2 = AnonymousClass7TE.A0e(C51972G9s.A0Z(r8, new AnonymousClass0kM(userSession)), "instagram_ad_sub_impression_second_channel");
                if (A0e2.isSampled()) {
                    1Xj r2 = A07.A0K;
                    C51974G9v.A0p(A0e2, r2, "m_pk", r2.getId());
                    C51965G9l.A1L(A0e2, A07.A0j);
                    C51965G9l.A1D(A0e2, C51971G9r.A0n(0, A07.A0S));
                    A0e2.AAJ("host_media_pk", A07.A0f);
                    A0e2.Cgf();
                }
            }
        }
        if (!r72.CcK() && this.A04) {
            AnonymousClass0kM A0M = DbY.A0M(this.A00);
            A0M.A00 = r8;
            A0M.A01(0kJ.A02);
            A0e = AnonymousClass7TE.A0e(A0M.A00(), "instagram_organic_sub_impression_second_channel");
            if (A0e.isSampled()) {
                1Xj r0 = r72.A02;
                if (r0 == null || (str3 = r0.getId()) == null) {
                    str3 = r72.getId();
                }
                C51965G9l.A1I(A0e, str3);
                1Xj r02 = r72.A02;
                if (r02 != null) {
                    A10 = C51972G9s.A0g(r02);
                } else {
                    A10 = null;
                }
                str2 = "m_t";
            } else {
                return;
            }
        } else if (r72.CcK() && this.A02) {
            UserSession userSession2 = this.A00;
            A0e = AnonymousClass7TE.A0e(C51972G9s.A0Z(r8, DbY.A0M(userSession2)), "instagram_ad_sub_impression_second_channel");
            if (A0e.isSampled()) {
                1Xj r03 = r72.A02;
                if (r03 == null || (str = r03.getId()) == null) {
                    str = r72.getId();
                }
                C51965G9l.A1I(A0e, str);
                1Xj r04 = r72.A02;
                if (r04 != null) {
                    l = C51972G9s.A0g(r04);
                } else {
                    l = null;
                }
                A0e.A9F("m_t", l);
                C51965G9l.A1L(A0e, r72.ByO(userSession2));
                1Xj r1 = r72.A02;
                Long l2 = null;
                if (r1 != null) {
                    l2 = C51972G9s.A0i(C231122qu.A07(userSession2, r1));
                }
                C51965G9l.A1D(A0e, l2);
                1Xj r05 = r72.A02;
                if (!(r05 == null || (id = r05.getId()) == null || (A0H = C231122qu.A0H(userSession2, id)) == null || (A10 = AnonymousClass7TE.A10(A0H)) == null)) {
                    str2 = "host_profile_id";
                }
                A0e.Cgf();
            }
            return;
        } else {
            return;
        }
        A0e.A9F(str2, A10);
        A0e.Cgf();
    }

    public HB0(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = userSession;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }
}
