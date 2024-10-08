package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.List;

public abstract class F9T {
    public static final List A00 = 0sr.A1P(new ChannelCreationSource[]{ChannelCreationSource.PROFILE, ChannelCreationSource.QUICK_PROMOTION, ChannelCreationSource.ACTIVITY_FEED, ChannelCreationSource.PROFESSIONAL_DASHBOARD_NEXT_STEP, ChannelCreationSource.SUBSCRIPTION_SETTINGS, ChannelCreationSource.MESSAGING_LED, ChannelCreationSource.SCHOOLS});

    public static final void A00(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass4DH r6, UserSession userSession, String str) {
        List list = A00;
        Parcelable parcelable = bundle.getParcelable("social_channel_creation_source");
        Parcelable parcelable2 = null;
        if (parcelable instanceof ChannelCreationSource) {
            parcelable2 = parcelable;
        }
        if (00k.A0u(list, parcelable2)) {
            DbY.A0u(fragmentActivity, bundle, userSession, str);
            return;
        }
        C309516Yo A0P = DbU.A0P(bundle, r6, fragmentActivity, userSession);
        A0P.A0F = true;
        DbV.A1O(A0P);
    }
}
