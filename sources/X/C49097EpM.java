package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.EpM  reason: case insensitive filesystem */
public abstract class C49097EpM {
    public static final C47505E5n A00(UserSession userSession, AZV azv, EW0 ew0, G6J g6j, String str, String str2, String str3, String str4, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str2, 8);
        C47505E5n e5n = new C47505E5n();
        Bundle A09 = DbY.A09(userSession);
        A09.putBoolean("ARGS_SHOULD_SHOW_PRIVACY_TOGGLE", z);
        A09.putBoolean("ARGS_MENTION_SHARING_ENABLED", z2);
        A09.putInt("ARGS_MAX_MENTION_COUNT", 20);
        A09.putString("ARGS_MEDIA_ID", str);
        A09.putString("ARGS_MEDIA_TYPE", str2);
        A09.putInt("ARGS_MEDIA_POSITION", i);
        A09.putString("ARGS_SESSION_ID", str3);
        A09.putString("ARGS_ENTRY_POINT", ew0.A00);
        A09.putString("ARGS_TITLE", str4);
        A09.putBoolean("ARGS_HAS_ACTION_BUTTON", z3);
        e5n.setArguments(A09);
        e5n.A07 = g6j;
        e5n.A04 = azv;
        HashSet hashSet = e5n.A0L;
        hashSet.clear();
        if (list != null) {
            hashSet.addAll(list);
        }
        HashSet hashSet2 = e5n.A0K;
        hashSet2.clear();
        HashSet hashSet3 = e5n.A0M;
        hashSet3.clear();
        if (list2 != null) {
            hashSet2.addAll(list2);
            hashSet3.addAll(list2);
        }
        return e5n;
    }
}
