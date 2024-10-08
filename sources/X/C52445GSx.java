package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GSx  reason: case insensitive filesystem */
public final class C52445GSx implements C74507Pw2 {
    public final long A00;
    public final C267614bu A01;
    public final boolean A02;

    public final boolean CQM(UserSession userSession, User user) {
        0qQ.A0B(userSession, 0);
        boolean z = this.A02;
        Integer B70 = DbX.A0m(userSession).B70();
        if (z) {
            if (B70 == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (((long) B70.intValue()) >= this.A00) {
                return true;
            } else {
                return false;
            }
        } else if (B70 == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (B70.intValue() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean Esw(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        return C51973G9u.A1Z(1Au.A00(userSession), "follow");
    }

    public final int BEI() {
        if (this.A02) {
            return R.drawable.activation_card_follow_redesign;
        }
        return R.drawable.activation_card_follow;
    }

    public final String Beb() {
        return "follow";
    }

    public final int C2e() {
        if (this.A02) {
            return 2131952167;
        }
        return 2131952166;
    }

    public final void Czh() {
        this.A01.DGL();
    }

    public final int getTitleRes() {
        if (this.A02) {
            return 2131952169;
        }
        return 2131952168;
    }

    public C52445GSx(C267614bu r1, long j, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = j;
    }

    public final int Ait() {
        return 2131952165;
    }

    public final int Apb() {
        return 2131952164;
    }

    public final int Apc() {
        return getTitleRes();
    }

    public final /* synthetic */ float Aii(UserSession userSession) {
        return 1.0f;
    }
}
