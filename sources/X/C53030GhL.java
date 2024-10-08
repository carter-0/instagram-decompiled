package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.GhL  reason: case insensitive filesystem */
public final class C53030GhL extends 2YL {
    public static final List A0F = 0sr.A1P(new HNK[]{HNK.ANYBODY_CREATOR_DOES_NOT_FOLLOW, HNK.FOLLOWERS_CREATOR_DOES_NOT_FOLLOW, HNK.SELECTED_USERS_ONLY});
    public Dc2 A00;
    public Boolean A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final C52369GPq A05;
    public final CreatorAiSettingsRepository A06;
    public final String A07;
    public final AnonymousClass62P A08;
    public final 05G A09;
    public final 05G A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;
    public final boolean A0D;
    public final UserSession A0E;

    public C53030GhL(UserSession userSession, C52369GPq gPq, CreatorAiSettingsRepository creatorAiSettingsRepository, String str) {
        UserSession userSession2 = userSession;
        String str2 = str;
        AnonymousClass7TF.A1C(userSession2, 1, str2);
        this.A0E = userSession2;
        this.A06 = creatorAiSettingsRepository;
        this.A07 = str2;
        this.A05 = gPq;
        boolean A0K = 0qQ.A0K(userSession2.A06, str2);
        this.A0D = A0K;
        02z A10 = DbS.A10(new C53386GnI((C53375Gn5) null, DbS.A0V(""), C54617HLa.LOADING, (HNK) null, C255943uy.SUCCESS, (Integer) null, "", "", AnonymousClass62M.A01, false, true, true, false, false, false));
        this.A0A = A10;
        this.A0C = 10b.A03(A10);
        02z A012 = 106.A01(C57151IQp.A00);
        this.A09 = A012;
        this.A0B = 10b.A03(A012);
        C54666HMx hMx = C54666HMx.TEST_AI;
        C54666HMx hMx2 = null;
        C54666HMx hMx3 = !A0K ? null : C54666HMx.INSIGHTS;
        C54666HMx hMx4 = C54666HMx.DIVIDER;
        C54666HMx hMx5 = C54666HMx.SUMMARY;
        C54666HMx hMx6 = C54666HMx.IG_CONTENT;
        C54666HMx hMx7 = C54666HMx.YOUR_INFO;
        C54666HMx hMx8 = C54666HMx.TOPICS_TO_AVOID;
        C54666HMx hMx9 = C54666HMx.LINKS;
        C54666HMx hMx10 = C54666HMx.KEYWORD_RESPONSES;
        0Tu r3 = 0Tu.A05;
        hMx10 = !182.A06(r3, userSession2, 36322993690454753L) ? null : hMx10;
        C54666HMx hMx11 = !182.A06(r3, userSession2, 36322993689668314L) ? null : C54666HMx.EMBODIMENT;
        C54666HMx hMx12 = C54666HMx.DELETE;
        if (A0K && 182.A06(r3, userSession2, 36322993690389216L)) {
            hMx2 = hMx12;
        }
        this.A08 = AnonymousClass62Q.A00(C51967G9n.A0s(new C54666HMx[]{hMx, hMx3, hMx4, hMx5, hMx6, hMx7, hMx8, hMx9, hMx10, hMx11, hMx2}));
    }

    public final void A01(boolean z) {
        05G r2;
        Object obj;
        C53375Gn5 gn5 = ((C53386GnI) this.A0C.getValue()).A00;
        if (gn5 != null) {
            05G r5 = this.A09;
            String str = gn5.A05;
            String str2 = gn5.A03;
            r5.Epw(new C53538Gq9(gn5.A04, gn5.A02, str2, str));
            return;
        }
        if (this.A03) {
            boolean z2 = z;
            if (z) {
                r2 = this.A09;
                obj = C57152IQq.A00;
            } else {
                C52369GPq gPq = this.A05;
                C52369GPq.A00((C54677HOi) null, (HOP) null, C54688HOt.A07, gPq, this.A01, false, gPq.A00);
                String str3 = this.A02;
                if (str3 != null) {
                    AnonymousClass7TE.A1Z(new MEW(this, str3, (AnonymousClass4D7) null, 3, z2), C318116oQ.A00(this));
                    return;
                }
                return;
            }
        } else if (!0qQ.A0K(this.A0E.A06, this.A07)) {
            r2 = this.A09;
            obj = new C53537Gq7(2131956987, (String) null);
        } else {
            this.A05.A04(C54677HOi.AUTO_REPLIES);
            r2 = this.A09;
            obj = C57150IQo.A00;
        }
        r2.Epw(obj);
    }

    public final void A00(int i) {
        User A022;
        Object value;
        C53386GnI gnI;
        String A082;
        ImageUrl Bh3;
        String fbidV2;
        Object value2;
        C52369GPq gPq = this.A05;
        C52369GPq.A02(C54688HOt.A09, gPq, gPq.A00);
        05G r2 = this.A0A;
        if (((C53386GnI) r2.getValue()).A02 == C54617HLa.ERROR) {
            do {
                value2 = r2.getValue();
            } while (!r2.AIY(value2, C53386GnI.A00((ImageUrl) null, C54617HLa.LOADING, (C53386GnI) value2, (C255943uy) null, (String) null, (String) null, 32759, false, false, false, false)));
        }
        if (this.A0D) {
            A022 = AnonymousClass0t1.A01.A01(this.A0E);
        } else {
            A022 = 17h.A00(this.A0E).A02(this.A07);
        }
        if (A022 != null) {
            do {
                value = r2.getValue();
                gnI = (C53386GnI) value;
                A082 = AnonymousClass50n.A08(A022);
                0qQ.A07(A082);
                Bh3 = A022.Bh3();
                fbidV2 = A022.A03.getFbidV2();
                if (fbidV2 == null) {
                    fbidV2 = "";
                }
            } while (!r2.AIY(value, C53386GnI.A00(Bh3, (C54617HLa) null, gnI, (C255943uy) null, fbidV2, A082, 29183, false, false, false, false)));
        }
        AnonymousClass7TE.A1Z(new C66164MGb(this, (AnonymousClass4D7) null, i, 16), C318116oQ.A00(this));
    }
}
