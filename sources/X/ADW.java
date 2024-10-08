package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

public final class ADW {
    public static final ADW A00 = new Object();

    public final Drawable A00(Context context, UserSession userSession, User user, int i) {
        Object obj;
        AnonymousClass7TG.A1O(userSession, context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.asset_search_icon_width);
        int A09 = 0nA.A09(context);
        User user2 = user;
        String A0D = 002.A0D(AnonymousClass7TF.A0k(user.getUsername()), '@');
        if (A0D.length() > i) {
            A0D = 002.A0R(00R.A03(A0D, i - 2), "...");
        }
        Iterator it = AnonymousClass91M.A03(context, userSession, new C387369m6((QP8) null, user2, A0D, (float) dimensionPixelSize, A09)).A05().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Drawable drawable = (Drawable) obj;
            if ((drawable instanceof C369508us) && 0qQ.A0K(((C369508us) drawable).A01, "mention_sticker_hero")) {
                break;
            }
        }
        return (Drawable) obj;
    }
}
