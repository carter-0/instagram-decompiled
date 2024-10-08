package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

public final class R8e extends S00 {
    public S00 A00;

    public final Intent getInstantExperiencesIntent(Context context, String str, UserSession userSession, String str2, String str3, 2EG r14, String str4) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        String str5 = str;
        UserSession userSession2 = userSession;
        String str6 = str2;
        String str7 = str3;
        C51974G9v.A1P(str, userSession, str2, str3);
        2EG r6 = r14;
        0qQ.A0B(r14, 5);
        S00 s00 = this.A00;
        if (s00 != null) {
            return s00.getInstantExperiencesIntent(context2, str5, userSession2, str6, str7, r6, str4);
        }
        return null;
    }

    public R8e() {
        try {
            Object A0e = Pxh.A0e(Class.forName("com.instagram.business.instantexperiences.InstantExperiencesLibImpl"));
            0qQ.A0C(A0e, "null cannot be cast to non-null type com.instagram.business.instantexperiences.intf.InstantExperiencesLib");
            this.A00 = (S00) A0e;
        } catch (Exception e) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to initialize IXLib");
            0qQ.A0A(formatStrLocaleSafe);
            0wb.A06("InstantExperiencesWrapper", formatStrLocaleSafe, e);
        }
    }
}
