package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class IS6 implements AnonymousClass3YT {
    public final UserSession A00;

    public IS6(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final String BSq(Context context, 1Xj r3, AnonymousClass3W1 r4) {
        0qQ.A0B(r3, 1);
        AnonymousClass5HT BYk = r3.A0C.BYk();
        if (BYk != null) {
            return BYk.getCtaSubtitle();
        }
        return null;
    }

    public final boolean Et3(1Xj r5, AnonymousClass3W1 r6, int i) {
        0qQ.A0B(r5, 0);
        if (r5.CcK() || r5.A0C.BYk() == null) {
            return false;
        }
        String A0k = C51973G9u.A0k(r5);
        UserSession userSession = this.A00;
        if (C51966G9m.A1W(userSession, A0k) || 182.A06(0Tu.A05, userSession, 36319149693082557L)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean EtS() {
        return false;
    }

    public final /* synthetic */ List Bqk(1Xj r2, AnonymousClass3W1 r3) {
        return null;
    }

    public final CharSequence C4o(Context context, UserSession userSession, 1Xj r4, AnonymousClass3W1 r5) {
        String ctaTitle;
        AnonymousClass7TG.A1N(context, r4);
        AnonymousClass5HT BYk = r4.A0C.BYk();
        if (BYk == null || (ctaTitle = BYk.getCtaTitle()) == null) {
            return AnonymousClass7TE.A16(context, 2131959810);
        }
        return ctaTitle;
    }

    public final /* synthetic */ boolean Et2(UserSession userSession, 1Xj r3) {
        return false;
    }

    public final /* synthetic */ boolean Et1(UserSession userSession, 1Xj r3, AnonymousClass3W1 r4) {
        return false;
    }

    public final /* synthetic */ CharSequence Bqi(Context context, UserSession userSession, 1Xj r4, AnonymousClass4DU r5, AnonymousClass3W1 r6) {
        return null;
    }
}
