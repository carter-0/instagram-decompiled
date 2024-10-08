package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.base.MediaSession;
import java.util.List;
import java.util.Set;

public final class L47 {
    public ReboundViewPager A00;
    public C378369Pn A01;

    public static void A00(Context context, UserSession userSession, C3499582p r6, L47 l47, C267834cI r8, Set set, int i) {
        View A0D;
        List Co4 = r6.A00().Co4();
        if (((MediaSession) Co4.get(i)).Bsu() == AnonymousClass05K.A01 && (A0D = l47.A00.A0D(i)) != null) {
            AnonymousClass3Q2 A0N = JTQ.A0N((MediaSession) Co4.get(i), r8);
            A0N.getClass();
            C378369Pn A002 = C63121Krp.A00(context, userSession, (C63803L7j) DbT.A0o(A0D), A0N, r6.A00().AAx());
            l47.A01 = A002;
            set.add(A002);
        }
    }
}
