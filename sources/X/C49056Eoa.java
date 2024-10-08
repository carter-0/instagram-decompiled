package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;

/* renamed from: X.Eoa  reason: case insensitive filesystem */
public abstract class C49056Eoa {
    public static final void A00(Context context, AnonymousClass0iw r9, UserSession userSession, MessagingUser messagingUser, long j) {
        String str;
        UserSession userSession2 = userSession;
        User A02 = 17h.A00(userSession).A02(messagingUser.A03);
        Context context2 = context;
        C358248ab A0Y = DbS.A0Y(context);
        if (A02 != null) {
            str = A02.B8Q();
        } else {
            str = "";
        }
        A0Y.A05 = DbW.A0h(context, str, 2131969273);
        A0Y.A08(2131969272);
        A0Y.A0J(new FIW(context2, r9, userSession2, j), 2131969274);
        A0Y.A0D(FJM.A00);
        A0Y.A0r(true);
        DbT.A1V(A0Y);
    }
}
