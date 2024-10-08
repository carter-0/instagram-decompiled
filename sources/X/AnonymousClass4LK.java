package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.api.schemas.CommentPrompt;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4LK  reason: invalid class name */
public final class AnonymousClass4LK {
    public static final AnonymousClass4LK A00 = new Object();

    public static final C358248ab A01(Context context, 2IR r4, UserSession userSession, 1Xj r6) {
        0qQ.A0B(userSession, 1);
        C358248ab r2 = new C358248ab(context);
        r2.A09(2131957591);
        r2.A08(2131957590);
        r2.A0I(new SV2(r4, userSession, r6), 2131957589);
        r2.A03();
        return r2;
    }

    public static final String A02(Resources resources, CommentPrompt commentPrompt, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        Integer BmI = commentPrompt.BmI();
        if (BmI == null) {
            return null;
        }
        int intValue = BmI.intValue();
        if (intValue != 0 || (z && !182.A06(0Tu.A05, userSession, 36326244979259033L))) {
            return resources.getQuantityString(R.plurals.comment_prompt_reply_count, intValue, new Object[]{BmI});
        }
        return resources.getString(2131956389);
    }

    public static final boolean A04(UserSession userSession, 1Xj r6) {
        String str;
        0qQ.A0B(userSession, 1);
        if (A00(r6) == null) {
            return false;
        }
        User CCd = r6.A0C.CCd();
        if (CCd != null) {
            str = CCd.getId();
        } else {
            str = null;
        }
        if (0qQ.A0K(str, userSession.A06) || ((r6.A5G() && 182.A06(0Tu.A06, userSession, 36326244979127959L)) || (r6.A5U() && 182.A06(0Tu.A06, userSession, 36328559966436781L)))) {
            return true;
        }
        return false;
    }

    public static final CommentPrompt A00(1Xj r0) {
        C272054k1 AlM;
        if (r0 == null || (AlM = r0.A0C.AlM()) == null) {
            return null;
        }
        return AlM.ApJ();
    }

    public static final String A03(1Xj r0) {
        CommentPrompt A002 = A00(r0);
        if (A002 != null) {
            return A002.BaV();
        }
        return null;
    }

    public final boolean A05(UserSession userSession, 1Xj r6) {
        if (!A04(userSession, r6)) {
            return false;
        }
        if (!r6.A5G() || 182.A06(0Tu.A05, userSession, 36326244979193496L)) {
            return true;
        }
        return false;
    }
}
