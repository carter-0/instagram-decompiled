package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class IVF implements C367608rH {
    public final int A00;
    public final Object A01;

    public IVF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onClick() {
        C62320sa r0;
        switch (this.A00) {
            case 0:
                r0 = ((C55770Hn5) this.A01).A03;
                break;
            case 1:
                r0 = (C62320sa) this.A01;
                break;
            case 2:
                C14076TpQ tpQ = (C14076TpQ) this.A01;
                C355148Ov r2 = tpQ.A0C;
                if (r2 != null) {
                    C51975G9x.A18(AnonymousClass7TE.A0e(tpQ.A0T.A00, "discover_media_chaining_alt_topic_nudge"), "ig_explore_controls_not_interested_tap");
                    tpQ.DkU();
                    r2.dismiss();
                    return;
                }
                return;
            default:
                C14076TpQ tpQ2 = (C14076TpQ) this.A01;
                C355148Ov r22 = tpQ2.A0C;
                if (r22 != null) {
                    C51975G9x.A18(AnonymousClass7TE.A0e(tpQ2.A0T.A00, "discover_media_chaining_alt_topic_nudge"), "ig_explore_controls_content_controls_tap");
                    r22.dismiss();
                    FragmentActivity fragmentActivity = tpQ2.A0P;
                    UserSession userSession = tpQ2.A0R;
                    C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
                    A0Q.A0B((Bundle) null, FBD.A00.A00(fragmentActivity, tpQ2.A0Q, userSession, (String) null, "explore_header", (String) null, (HashMap) null));
                    A0Q.A04();
                    return;
                }
                return;
        }
        r0.invoke();
    }
}
