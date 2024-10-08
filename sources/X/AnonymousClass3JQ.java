package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.configs.AggregatedBannerConfig;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;
import java.util.List;

/* renamed from: X.3JQ  reason: invalid class name */
public final class AnonymousClass3JQ implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass354 A00;

    public AnonymousClass3JQ(AnonymousClass354 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1079443974);
        AnonymousClass354 r1 = this.A00;
        C227802jw A002 = AnonymousClass354.A00(r1);
        if (A002 != null) {
            UserSession userSession = r1.A01;
            FragmentActivity requireActivity = A002.requireActivity();
            AB2.A01(userSession, r1.A02, "friend_map");
            AnonymousClass3HE.A00().A02(requireActivity, userSession, new FriendMapLaunchConfig((AggregatedBannerConfig) null, AnonymousClass05K.A0Y, (String) null, (String) null, (String) null, (List) null, false, false, false));
        }
        AnonymousClass0fD.A0C(-2139708305, A05);
    }
}
