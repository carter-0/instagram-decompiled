package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import java.util.List;

public final class P34 implements C74450Pv5 {
    public DirectVisualMessageActionLogPriorityFragment A00;
    public final Context A01;
    public final List A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public P34(Context context, UserSession userSession, String str, String str2, String str3, List list) {
        DbW.A1O(userSession, 2, list);
        this.A01 = context;
        this.A03 = userSession;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = list;
    }

    public final void cleanup() {
    }

    public final AnonymousClass11X Ex0() {
        UserSession userSession = this.A03;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        1NY A0O = DbU.A0O(userSession);
        A0O.A0K("direct_v2/visual_action_log/%s/item/%s/", new Object[]{str, str2});
        A0O.A0G("original_message_client_context", str3);
        1OC A0S = DbT.A0S(A0O, NGy.class, OQK.class);
        A0S.A00 = new C68430NHp(userSession, this);
        return A0S;
    }

    public final void EU7(DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment) {
        this.A00 = directVisualMessageActionLogPriorityFragment;
    }
}
