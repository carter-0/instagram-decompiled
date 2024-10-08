package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;
import com.instagram.mainactivity.InstagramMainActivity;

public final class FPU implements View.OnLongClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;

    public FPU(UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A01 = instagramMainActivity;
        this.A00 = userSession;
    }

    public final boolean onLongClick(View view) {
        2BT r4;
        InstagramMainActivity instagramMainActivity = this.A01;
        UserSession userSession = instagramMainActivity.A05;
        if (!(userSession == null || (r4 = (2BT) userSession.A00(2BT.class)) == null)) {
            0tS A0h = DbT.A0h();
            if (AnonymousClass7TG.A1a(A0h, A0h.A1i, 0tS.A4G, 121)) {
                if (!2BT.A01(r4)) {
                    return true;
                }
                2BT.A02(r4, true);
                return true;
            }
        }
        DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(view.getContext(), instagramMainActivity.getSupportFragmentManager(), instagramMainActivity.A0f, this.A00);
        return true;
    }
}
