package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.A0n  reason: case insensitive filesystem */
public abstract class C39571A0n {
    public static final void A00(Activity activity, AnonymousClass0iw r12, UserSession userSession, C247733gp r14, String str, String str2) {
        User user;
        ExtendedImageUrl extendedImageUrl;
        String str3 = str2;
        AnonymousClass7TG.A1U(userSession, str, str3);
        if (r14 != null && (user = r14.A08) != null) {
            String str4 = r14.A0d;
            OOA A06 = 1as.A04.A02.A06(r12, userSession, C66579MXk.A00(1065));
            A06.A03(str);
            A06.A04(str3);
            A06.A06(user.getId());
            A06.A02(str3);
            String str5 = r14.A0G;
            0qQ.A0B(str5, 0);
            Bundle bundle = A06.A01;
            bundle.putString(C66579MXk.A00(220), str5);
            String username = user.getUsername();
            1Xj r0 = r14.A07;
            if (r0 != null) {
                extendedImageUrl = r0.A1n(activity);
            } else {
                extendedImageUrl = null;
            }
            bundle.putParcelable(C66579MXk.A00(223), new DirectPendingLayeredXma(extendedImageUrl, new ExtendedImageUrl(user.Bh3()), user, username, str4, false, false));
            bundle.putString(C66579MXk.A00(221), C66579MXk.A00(124));
            0qQ.A0B(str4, 0);
            bundle.putString(C66579MXk.A00(92), str4);
            A06.A05(str4);
            A06.A01("story_comment_reply");
            NK2 A00 = A06.A00();
            C331127Pr r1 = new C331127Pr(userSession);
            r1.A0a = false;
            C331157Pu A002 = r1.A00();
            0qQ.A0A(A00);
            A002.A02(activity, A00);
        }
    }
}
