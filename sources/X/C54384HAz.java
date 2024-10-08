package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HAz  reason: case insensitive filesystem */
public final class C54384HAz extends C57212ISz {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ void Cir(0jB r5, 1Nv r6, AnonymousClass4DU r7, int i, int i2) {
        0Aj A0e;
        Long A0d;
        String str;
        C255773uh r62 = (C255773uh) r6;
        AnonymousClass7TG.A1N(r7, r62);
        if (!r62.CcK() && this.A03) {
            AnonymousClass0kM A0M = DbY.A0M(this.A00);
            A0M.A00 = r7;
            A0M.A01(0kJ.A02);
            A0e = AnonymousClass7TE.A0e(A0M.A00(), "instagram_organic_impression_second_channel");
            if (A0e.isSampled()) {
                C51965G9l.A1I(A0e, r62.A0j);
                A0d = C63401KwM.A00(r62);
                str = "m_t";
            } else {
                return;
            }
        } else if (r62.CcK() && this.A01) {
            UserSession userSession = this.A00;
            A0e = AnonymousClass7TE.A0e(C51972G9s.A0Z(r7, DbY.A0M(userSession)), "instagram_ad_impression_second_channel");
            if (A0e.isSampled()) {
                C51965G9l.A1I(A0e, r62.A0j);
                A0e.A9F("m_t", C63401KwM.A00(r62));
                C51965G9l.A1L(A0e, r62.ByO(userSession));
                A0d = DbZ.A0d(r62.A0U(userSession));
                str = "ad_id";
            } else {
                return;
            }
        } else {
            return;
        }
        A0e.A9F(str, A0d);
        A0e.Cgf();
    }

    public final /* bridge */ /* synthetic */ void Cke(0jB r5, 1Nv r6, AnonymousClass4DU r7, int i, int i2) {
        0Aj A0e;
        Long A0d;
        String str;
        C255773uh r62 = (C255773uh) r6;
        AnonymousClass7TG.A1N(r7, r62);
        if (!r62.CcK() && this.A04) {
            AnonymousClass0kM A0M = DbY.A0M(this.A00);
            A0M.A00 = r7;
            A0M.A01(0kJ.A02);
            A0e = AnonymousClass7TE.A0e(A0M.A00(), "instagram_organic_sub_impression_second_channel");
            if (A0e.isSampled()) {
                C51965G9l.A1I(A0e, r62.A0j);
                A0d = C63401KwM.A00(r62);
                str = "m_t";
            } else {
                return;
            }
        } else if (r62.CcK() && this.A02) {
            UserSession userSession = this.A00;
            A0e = AnonymousClass7TE.A0e(C51972G9s.A0Z(r7, DbY.A0M(userSession)), "instagram_ad_sub_impression_second_channel");
            if (A0e.isSampled()) {
                C51965G9l.A1I(A0e, r62.A0j);
                A0e.A9F("m_t", C63401KwM.A00(r62));
                C51965G9l.A1L(A0e, r62.ByO(userSession));
                A0d = DbZ.A0d(r62.A0U(userSession));
                str = "ad_id";
            } else {
                return;
            }
        } else {
            return;
        }
        A0e.A9F(str, A0d);
        A0e.Cgf();
    }

    public C54384HAz(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = userSession;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }
}
