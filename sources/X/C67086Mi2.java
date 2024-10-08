package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Mi2  reason: case insensitive filesystem */
public final class C67086Mi2 implements C74507Pw2 {
    public final C267614bu A00;

    public final boolean CQM(UserSession userSession, User user) {
        return false;
    }

    public final String Beb() {
        return "contacts";
    }

    public final void Czh() {
        this.A00.D5x();
    }

    public C67086Mi2(C267614bu r1) {
        this.A00 = r1;
    }

    public final int Ait() {
        return 2131956508;
    }

    public final int Apb() {
        return 2131956508;
    }

    public final int Apc() {
        return 2131956510;
    }

    public final int BEI() {
        return R.drawable.find_people_connect_contacts;
    }

    public final int C2e() {
        return 2131974647;
    }

    public final boolean Esw(Context context, UserSession userSession) {
        AnonymousClass7TG.A1N(context, userSession);
        if (!C267044ar.A00(context, userSession) || C66581MXm.A1Y(1Au.A00(userSession).A01, "dismissed_find_people_card", "contacts")) {
            return false;
        }
        return true;
    }

    public final int getTitleRes() {
        return 2131956510;
    }

    public final /* synthetic */ float Aii(UserSession userSession) {
        return 1.0f;
    }
}
