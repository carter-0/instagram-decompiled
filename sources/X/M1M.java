package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class M1M implements C66543MVx, AnonymousClass0lh {
    public static final CallerContext A06 = CallerContext.A01("FxIgFbFeedCrossPostingUpsellContent");
    public String A00 = "";
    public String A01;
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public final UserSession A05;

    public M1M(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
    }

    public final String AqX(Context context) {
        C323596xl r2 = C323596xl.A00;
        UserSession userSession = this.A05;
        if (r2.A01(userSession, this.A00)) {
            return this.A00;
        }
        int i = 2131951991;
        if (27u.A00(userSession).A01()) {
            i = 2131951992;
        }
        return AnonymousClass7TE.A16(context, i);
    }

    public final String B7D(Context context) {
        if (C323596xl.A00.A01(this.A05, this.A01)) {
            return this.A01;
        }
        return context.getString(2131951993);
    }

    public final String BCj(Context context) {
        if (C323596xl.A00.A01(this.A05, this.A02)) {
            return this.A02;
        }
        return AnonymousClass7TE.A16(context, 2131951996);
    }

    public final ImageUrl BGK() {
        return null;
    }

    public final String BfX(Context context) {
        if (C323596xl.A00.A01(this.A05, this.A03)) {
            return this.A03;
        }
        return AnonymousClass7TE.A16(context, 2131951994);
    }

    public final String Bqe(Context context) {
        if (C323596xl.A00.A01(this.A05, this.A04)) {
            return this.A04;
        }
        return AnonymousClass7TE.A16(context, 2131951995);
    }

    public final void onSessionWillEnd() {
        this.A05.A03(M1M.class);
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
}
