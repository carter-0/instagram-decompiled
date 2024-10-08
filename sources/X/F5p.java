package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class F5p {
    public static final List A00(UserSession userSession, String str) {
        AnonymousClass7TF.A1H(userSession, str);
        InstagramMainActivity A00 = C71172bH.A00();
        if (A00 == null || !str.equals("feed_contextual_chain") || !182.A06(0Tu.A05, userSession, 36317431707800716L)) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        View view = ((2au) A00.A0k.getValue()).A02;
        if (view != null) {
            A1C.add(view);
        }
        ViewGroup C3o = A00.C3o();
        A1C.add(C3o);
        View[] A10 = 0nA.A10(C3o);
        A1C.addAll(0sr.A1P(Arrays.copyOf(A10, A10.length)));
        if (DbT.A1b(A1C)) {
            A01(userSession, str, false);
        }
        return A1C;
    }

    public static final void A01(UserSession userSession, String str, boolean z) {
        AnonymousClass2ZQ A00;
        AnonymousClass7TG.A1O(userSession, str);
        if (str.equals("feed_contextual_chain") && 182.A06(0Tu.A05, userSession, 36317431707800716L) && (A00 = C71172bH.A00()) != null) {
            A00.Eu7(z);
        }
    }
}
