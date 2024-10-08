package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ih7  reason: case insensitive filesystem */
public final class C57828Ih7 implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ GXC A01;

    public C57828Ih7(Bundle bundle, GXC gxc) {
        this.A01 = gxc;
        this.A00 = bundle;
    }

    public final void run() {
        GXC gxc = this.A01;
        gxc.A02 = false;
        this.A00.remove("ClipsConstants.ARG_AUTO_LAUNCH_EXPLORE_CLIPS_VIEWER");
        UserSession userSession = gxc.A04;
        FragmentActivity fragmentActivity = gxc.A03;
        C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.THIRD_PARTY_URL, userSession);
        A0i.A1F = gxc.A05;
        DbU.A1M(fragmentActivity, A0i, userSession);
    }
}
