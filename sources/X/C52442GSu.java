package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GSu  reason: case insensitive filesystem */
public final class C52442GSu implements C74507Pw2 {
    public final C267614bu A00;
    public final boolean A01;

    public final float Aii(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (C324536zU.A00(userSession)) {
            return 0.3f;
        }
        return 1.0f;
    }

    public final boolean CQM(UserSession userSession, User user) {
        0qQ.A0B(userSession, 0);
        return !AnonymousClass7TF.A0Q(userSession).A1n();
    }

    public final boolean Esw(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        return C51973G9u.A1Z(1Au.A00(userSession), "profile_photo");
    }

    public final int BEI() {
        if (this.A01) {
            return R.drawable.activation_card_profile_photo_redesign;
        }
        return R.drawable.activation_card_profile_photo;
    }

    public final String Beb() {
        return "profile_photo";
    }

    public final void Czh() {
        this.A00.Da8();
    }

    public C52442GSu(C267614bu r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final int Ait() {
        return 2131952180;
    }

    public final int Apb() {
        return 2131952179;
    }

    public final int Apc() {
        return 2131952182;
    }

    public final int C2e() {
        return 2131952181;
    }

    public final int getTitleRes() {
        return 2131952182;
    }
}
