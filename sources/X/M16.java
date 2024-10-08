package X;

import com.instagram.common.session.UserSession;

public final class M16 implements AnonymousClass8Wp {
    public final Boolean A00;

    public final boolean CXq() {
        return false;
    }

    public final boolean Esl(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Boolean bool = this.A00;
        if (bool == null) {
            bool = AnonymousClass7TF.A0R(0Tu.A05, userSession, 36310761622012174L);
        }
        return bool.booleanValue();
    }

    public final int Bee(UserSession userSession) {
        return DbS.A04(0Tu.A05, userSession, 36592236598919545L);
    }

    public final int BnJ(UserSession userSession) {
        return DbS.A04(0Tu.A05, userSession, 36594027600348714L);
    }

    public final boolean Ers(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if ((182.A06(r2, userSession, 36310761621946637L) || 182.A06(r2, userSession, 36312552623309987L) || 182.A06(r2, userSession, 36312552623441060L)) && AnonymousClass7TG.A0I() >= DbW.A06(AnonymousClass7TE.A0q(userSession), AnonymousClass000.A00(539))) {
            return true;
        }
        return false;
    }

    public final boolean Esk(UserSession userSession) {
        return 182.A06(0Tu.A05, userSession, 36310761622143247L);
    }

    public M16(Boolean bool) {
        this.A00 = bool;
    }
}
