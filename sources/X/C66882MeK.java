package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MeK  reason: case insensitive filesystem */
public final class C66882MeK implements C74410PuQ {
    public final /* synthetic */ C66870Me6 A00;

    public final String AUf(UserSession userSession) {
        return "thread is not one to one";
    }

    public C66882MeK(C66870Me6 me6) {
        this.A00 = me6;
    }

    public final /* bridge */ /* synthetic */ boolean ASy(UserSession userSession, Object obj) {
        String str;
        C66871Me7 me7 = (C66871Me7) obj;
        boolean A1Z = AnonymousClass7TG.A1Z(me7, userSession);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36320360874582376L) || 182.A06(r2, userSession, 36320360874713450L) || me7.A03 == AnonymousClass05K.A01) {
            return A1Z;
        }
        2Eq r0 = me7.A01;
        if (r0 == null && ((str = me7.A06) == null || (r0 = (2Eq) this.A00.A02.invoke(userSession, str)) == null)) {
            return A1Z;
        }
        return r0.CYU();
    }
}
