package X;

import com.instagram.common.session.UserSession;

public final class PDH implements C74473PvT {
    public final AnonymousClass5HJ A00;
    public final UserSession A01;
    public final AnonymousClass2KK A02;
    public final C66598MYk A03;
    public final 0sP A04;
    public final boolean A05;

    public final AnonymousClass3H3 CsR() {
        int A022;
        int A042;
        int i;
        AnonymousClass5HJ r2 = this.A00;
        if (r2.A1R) {
            return new AnonymousClass3H3(r2.A08.A02, -1, -1);
        }
        int i2 = 0;
        if (this.A05) {
            if (!0qQ.A0K(this.A01.A06, r2.A0j)) {
                0KC.A0D("ArmadilloSupportedDirectNotificationBadgeUpdateStrategy", "Badge count calculation triggered by Armadillo notification sent to a non-active user. Armadillo does not support multi account yet so as a fallback we will just calculate badge account for the active user.");
            }
            int max = Math.max(0, this.A02.A00.getInt("direct_threads_badge_count", -1));
            C61072JwA jwA = (C61072JwA) this.A03.A01.A0X();
            if (jwA != null) {
                i2 = jwA.A01;
            }
            return new AnonymousClass3H3(i2 + max, max, i2);
        }
        int i3 = r2.A08.A02;
        if (0qQ.A0K(this.A01.A06, r2.A0j)) {
            0xY AR4 = this.A02.A00.AR4();
            AR4.E5Z("direct_threads_badge_count", i3);
            AR4.apply();
            C61072JwA jwA2 = (C61072JwA) this.A03.A01.A0X();
            if (jwA2 != null) {
                i = jwA2.A01;
            } else {
                i = 0;
            }
            i3 += i;
            AnonymousClass5ER r22 = r2.A08;
            A022 = C51967G9n.A04(r22.A05, -1);
            A042 = C51967G9n.A04(r22.A04, 0) + i;
        } else {
            this.A04.invoke(Integer.valueOf(i3));
            AnonymousClass5ER r23 = r2.A08;
            A022 = DbX.A02(r23.A05);
            A042 = C51967G9n.A04(r23.A04, -1);
        }
        return new AnonymousClass3H3(i3, A022, A042);
    }

    public final boolean Etf() {
        return !this.A05;
    }

    public final boolean Etg() {
        if (this.A05 || this.A00.A08 != null) {
            return true;
        }
        return false;
    }

    public final boolean Eth() {
        return !this.A05;
    }

    public PDH(AnonymousClass5HJ r2, UserSession userSession, AnonymousClass2KK r4, C66598MYk mYk, 0sP r6) {
        C51972G9s.A1D(mYk, r4);
        this.A01 = userSession;
        this.A00 = r2;
        this.A03 = mYk;
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = OSG.A00(r2.A0g);
    }
}
