package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3LK  reason: invalid class name */
public final class AnonymousClass3LK implements 0lm {
    public static final Set A04 = 0sc.A07(new String[]{"profile", "self_profile"});
    public Map A00 = new LinkedHashMap();
    public final Set A01;
    public final boolean A02;
    public final UserSession A03;

    public AnonymousClass3LK(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        0Tu r2 = 0Tu.A05;
        this.A02 = !182.A06(r2, userSession, 36323878452145741L);
        List<String> A0R = 00l.A0R(182.A04(r2, userSession, 36886828405621475L), new String[]{","}, 0);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A0R, 10));
        for (String A0B : A0R) {
            arrayList.add(00l.A0B(A0B).toString());
        }
        this.A01 = 00k.A0k(arrayList);
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00.clear();
    }
}
