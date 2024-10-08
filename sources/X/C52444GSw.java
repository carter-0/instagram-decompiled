package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GSw  reason: case insensitive filesystem */
public final class C52444GSw implements C74507Pw2 {
    public final C267614bu A00;

    public final boolean CQM(UserSession userSession, User user) {
        0qQ.A0B(userSession, 0);
        if (DbX.A0m(userSession).Aaw() != null) {
            Integer Aaw = DbX.A0m(userSession).Aaw();
            if (Aaw == null) {
                throw AnonymousClass7TE.A0y();
            } else if (Aaw.intValue() <= 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean Esw(Context context, UserSession userSession) {
        return 182.A06(DbS.A0J(userSession, 1), userSession, 36315589165321630L);
    }

    public final String Beb() {
        return "creation";
    }

    public final void Czh() {
        this.A00.D6b();
    }

    public C52444GSw(C267614bu r1) {
        this.A00 = r1;
    }

    public final int Ait() {
        return 2131952158;
    }

    public final int Apb() {
        return 2131952157;
    }

    public final int Apc() {
        return 2131952160;
    }

    public final int BEI() {
        return R.drawable.activation_card_creation;
    }

    public final int C2e() {
        return 2131952159;
    }

    public final int getTitleRes() {
        return 2131952160;
    }

    public final /* synthetic */ float Aii(UserSession userSession) {
        return 1.0f;
    }
}
