package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GSv  reason: case insensitive filesystem */
public final class C52443GSv implements C74507Pw2 {
    public final 2ZX A00;
    public final C267614bu A01;

    public final boolean CQM(UserSession userSession, User user) {
        0qQ.A0B(userSession, 0);
        if (DbX.A0m(userSession).BMa() != null) {
            Integer BMa = DbX.A0m(userSession).BMa();
            if (BMa == null) {
                throw AnonymousClass7TE.A0y();
            } else if (BMa.intValue() <= 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean Esw(Context context, UserSession userSession) {
        2ZX r2;
        if (182.A06(DbS.A0J(userSession, 1), userSession, 36315589165387167L) && (r2 = this.A00) != null) {
            String obj = 1QK.A09.toString();
            if (r2.C3m(obj) != null) {
                View C3m = r2.C3m(obj);
                if (C3m == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (!C3m.isInLayout()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final String Beb() {
        return AnonymousClass000.A00(3500);
    }

    public final void Czh() {
        this.A01.DNY(this.A00);
    }

    public C52443GSv(2ZX r1, C267614bu r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final int Ait() {
        return 2131952171;
    }

    public final int Apb() {
        return 2131952172;
    }

    public final int Apc() {
        return 2131952174;
    }

    public final int BEI() {
        return R.drawable.activation_card_like_reel;
    }

    public final int C2e() {
        return 2131952173;
    }

    public final int getTitleRes() {
        return 2131952174;
    }

    public final /* synthetic */ float Aii(UserSession userSession) {
        return 1.0f;
    }
}
