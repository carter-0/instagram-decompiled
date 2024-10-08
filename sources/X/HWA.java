package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashMap;

public abstract class HWA {
    public static final HashMap A00(C307896Rx r5) {
        C313186g1 r0 = (C313186g1) C308206Td.A0F(r5, C313186g1.class, R.id.story_bloks_sticker_controller);
        if (r0 == null) {
            return AnonymousClass7TE.A1E();
        }
        C311276cQ r02 = r0.A00;
        C310016aI r4 = r02.A01;
        C250973mM r52 = ((ReelViewerFragment) r02.A02).A0a;
        if (r52 == null) {
            return null;
        }
        UserSession userSession = r4.A06;
        C255773uh A08 = r52.A08(userSession);
        if (!A08.CWu()) {
            return null;
        }
        C254523sc A02 = GTA.A02(userSession, C310016aI.A01(r52.A0H, r4), A08, "GetLogEventExtras_event");
        A02.A2D = AnonymousClass7TE.A0u();
        User user = A08.A0i;
        if (user != null) {
            A02.A7O = user.getId();
            A02.A7B = user.getUsername();
        }
        C310016aI.A04(A02, (GT8) r4.A0I.get(A08.CFY()), r4);
        return 0j8.A03(A02.A00().A06);
    }
}
