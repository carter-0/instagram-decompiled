package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Dj  reason: invalid class name and case insensitive filesystem */
public final class C238773Dj {
    public static final C238773Dj A00 = new Object();

    public final List A00(View view, UserSession userSession) {
        0qQ.A0B(view, 0);
        0qQ.A0B(userSession, 1);
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36330784759628559L) || !182.A06(r2, userSession, 2342173793973256974L)) {
            return 0sn.A00;
        }
        long A01 = 182.A01(r2, userSession, 36612259736852796L);
        if (Long.valueOf(A01) != null && A01 == 2) {
            return 0sr.A1P(new C282055Bf[]{new C282055Bf(view, userSession), new C282045Be(view, userSession)});
        }
        List singletonList = Collections.singletonList(new C282045Be(view, userSession));
        0qQ.A07(singletonList);
        return singletonList;
    }
}
