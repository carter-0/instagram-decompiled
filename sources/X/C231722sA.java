package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.instagram.api.schemas.SuggestedUsersStyle;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.2sA  reason: invalid class name and case insensitive filesystem */
public final class C231722sA {
    public View A00;
    public SuggestedUsersStyle A01;
    public final Context A02;
    public final UserSession A03;
    public final Queue A04 = new LinkedList();
    public final Map A05 = new HashMap();

    public static final C61250m8 A00(SuggestedUsersStyle suggestedUsersStyle, C231722sA r5) {
        Context context;
        int i;
        Context contextThemeWrapper;
        Map map = r5.A05;
        C61250m8 r1 = (C61250m8) map.get(suggestedUsersStyle);
        if (r1 != null) {
            return r1;
        }
        int ordinal = suggestedUsersStyle.ordinal();
        if (ordinal == 1) {
            context = r5.A02;
            i = 2132018210;
            contextThemeWrapper = new ContextThemeWrapper(context, i);
        } else if (ordinal != 3) {
            contextThemeWrapper = r5.A02;
        } else {
            context = r5.A02;
            i = 2132018211;
            contextThemeWrapper = new ContextThemeWrapper(context, i);
        }
        C61250m8 r12 = new C61250m8(contextThemeWrapper, 0);
        map.put(suggestedUsersStyle, r12);
        return r12;
    }

    public C231722sA(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
    }
}
