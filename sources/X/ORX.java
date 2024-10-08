package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public abstract class ORX {
    public static void A00(Context context, UserSession userSession, C59559JOf jOf) {
        AnonymousClass37D A02 = AnonymousClass37D.A00.A02(context);
        if (A02 != null) {
            IgFragmentFactoryImpl.A00();
            C68486NKe nKe = new C68486NKe();
            nKe.setArguments(DbY.A09(userSession));
            A02.A0Q(new HFZ(2, jOf, userSession));
            A02.A0I(nKe);
        }
    }

    public static boolean A01(UserSession userSession) {
        1Av A00 = 1Au.A00(userSession);
        if (!C238173Av.A02(userSession, "ig_select_video_nux") || !C238173Av.A01(userSession, A00)) {
            return false;
        }
        return true;
    }
}
