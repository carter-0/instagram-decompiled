package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class F29 {
    public boolean A00;
    public final UserSession A01;

    public final void A00(Fragment fragment, FragmentActivity fragmentActivity, Map map, boolean z) {
        String str;
        if (!this.A00) {
            this.A00 = true;
            0gy A002 = AnonymousClass07i.A00(fragment);
            if (z) {
                str = "com.instagram.insights.media.live_videos.bottom_sheet.push_action";
            } else {
                str = "com.instagram.insights.media.live_videos.bottom_sheet.action";
            }
            C360678ey A05 = C359988do.A05(this.A01, str, map);
            E85.A00(A05, fragmentActivity, fragment, this, 16);
            1ES.A00(fragmentActivity, A002, A05);
        }
    }

    public F29(UserSession userSession) {
        this.A01 = userSession;
    }
}
