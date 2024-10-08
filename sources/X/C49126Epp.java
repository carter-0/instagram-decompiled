package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.Epp  reason: case insensitive filesystem */
public abstract class C49126Epp {
    public static final void A00(FragmentActivity fragmentActivity, C15050ULg uLg, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        if (uLg != null) {
            FC2.A01(userSession, new ChannelCreationFlowExtraArgs((CategorySelectionScreenArgs) null, uLg.A00, uLg.A01), ChannelCreationSource.SCHOOLS, EV0.Social, true).CfS(fragmentActivity);
        }
    }
}
