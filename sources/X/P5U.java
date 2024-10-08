package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class P5U implements AnonymousClass7B2 {
    public final CharSequence AXW(Context context, UserSession userSession, AnonymousClass9HC r6, AnonymousClass7LQ r7, 17i r8) {
        boolean A1R = C66582MXn.A1R(userSession, r7.A0e);
        0qQ.A0B(context, 0);
        Resources resources = context.getResources();
        int i = 2131959636;
        if (A1R) {
            i = 2131959637;
        }
        return C66580MXl.A0D(resources.getString(i));
    }
}
