package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class M1N implements C66543MVx, AnonymousClass0lh {
    public static final CallerContext A0B = CallerContext.A01("FxIgFbStoryAfterShareACUpsellContent");
    public ImageUrl A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public final UserSession A0A;

    public M1N(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A0A = userSession;
    }

    public final String Agh(Context context) {
        String str = this.A01;
        if (str == null || str.length() == 0) {
            return "account-center-pano";
        }
        return str;
    }

    public final String Agi(Context context) {
        String str = this.A02;
        if (str == null || str.length() == 0) {
            return "settings-pano";
        }
        return str;
    }

    public final String Agj(Context context) {
        String str = this.A03;
        if (str == null || str.length() == 0) {
            return "outline";
        }
        return str;
    }

    public final String Agk(Context context) {
        String str = this.A04;
        if (str == null || str.length() == 0) {
            return "outline";
        }
        return str;
    }

    public final String Agm(Context context) {
        String str = this.A05;
        if (str != null && str.length() != 0) {
            return str;
        }
        int i = 2131951998;
        if (27u.A00(this.A0A).A01()) {
            i = 2131951999;
        }
        return context.getString(i);
    }

    public final String Agn(Context context) {
        String str = this.A06;
        if (str != null && str.length() != 0) {
            return str;
        }
        int i = 2131975911;
        if (27u.A00(this.A0A).A01()) {
            i = 2131975913;
        }
        return context.getString(i);
    }

    public final String BCj(Context context) {
        String str = this.A07;
        if (str.length() == 0) {
            return AnonymousClass7TE.A16(context, 2131952000);
        }
        return str;
    }

    public final ImageUrl BGK() {
        return this.A00;
    }

    public final String BfX(Context context) {
        String str = this.A08;
        if (str == null || str.length() == 0) {
            return AnonymousClass7TE.A16(context, 2131951997);
        }
        return str;
    }

    public final String Bqe(Context context) {
        String str = this.A09;
        if (str.length() == 0) {
            return AnonymousClass7TE.A16(context, 2131974398);
        }
        return str;
    }

    public final void onSessionWillEnd() {
        this.A0A.A03(M1N.class);
    }

    public final String AqX(Context context) {
        return "";
    }

    public final String B7D(Context context) {
        return null;
    }
}
