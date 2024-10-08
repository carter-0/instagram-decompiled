package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

public final class FAJ {
    public final ImageUrl A00;
    public final CharSequence A01;
    public final String A02;

    public FAJ(Context context, UserSession userSession, 1Xj r6) {
        String str;
        this.A00 = r6.A1Q();
        User A2A = r6.A2A(userSession);
        A2A.getClass();
        SpannableStringBuilder A0C = DbS.A0C(A2A.getUsername());
        if (A2A.isVerified()) {
            C244273av.A08(context, A0C, true);
        }
        this.A01 = A0C;
        if (r6.A5Y()) {
            str = r6.A0C.getTitle();
        } else if (r6.A1T() != null) {
            str = r6.A1T().A0d;
        } else {
            str = null;
        }
        this.A02 = str;
    }

    public FAJ() {
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }
}
