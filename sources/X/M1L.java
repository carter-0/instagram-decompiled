package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class M1L implements C66543MVx, AnonymousClass0lh {
    public String A00 = "";
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public final UserSession A04;

    public M1L(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
    }

    public final String AqX(Context context) {
        if (C323596xl.A00.A01(this.A04, this.A00)) {
            return this.A00;
        }
        return AnonymousClass7TE.A16(context, 2131975544);
    }

    public final String BCj(Context context) {
        if (C323596xl.A00.A01(this.A04, this.A01)) {
            return this.A01;
        }
        return AnonymousClass7TE.A16(context, 2131975545);
    }

    public final ImageUrl BGK() {
        return null;
    }

    public final String BfX(Context context) {
        if (C323596xl.A00.A01(this.A04, this.A02)) {
            return this.A02;
        }
        return AnonymousClass7TE.A16(context, 2131965611);
    }

    public final String Bqe(Context context) {
        if (C323596xl.A00.A01(this.A04, this.A03)) {
            return this.A03;
        }
        return AnonymousClass7TE.A16(context, 2131965612);
    }

    public final void onSessionWillEnd() {
        this.A04.A03(M1L.class);
    }

    public final String Agh(Context context) {
        return null;
    }

    public final String Agi(Context context) {
        return null;
    }

    public final String Agj(Context context) {
        return null;
    }

    public final String Agk(Context context) {
        return null;
    }

    public final String Agm(Context context) {
        return null;
    }

    public final String Agn(Context context) {
        return null;
    }

    public final String B7D(Context context) {
        return null;
    }
}
