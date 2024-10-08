package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class I4J {
    public static final long A03 = TimeUnit.SECONDS.toMillis(1);
    public final Activity A00;
    public final Resources A01;
    public final UserSession A02;

    public I4J(Activity activity, Resources resources, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = resources;
    }

    public final void A01(View view, View view2, HN0 hn0) {
        0qQ.A0B(view, 0);
        view2.postDelayed(new C57924Iif(view, hn0, this), A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (X.182.A06(r2, r3, 36324621481423035L) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C226262fy A00(X.HN0 r4, X.I4J r5) {
        /*
            X.HN0 r0 = X.HN0.TRENDING_AUDIO_TOOLTIP
            if (r4 != r0) goto L_0x001e
            com.instagram.common.session.UserSession r3 = r5.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324621481554108(0x810d0d000230bc, double:3.0351751202207214E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x001e
            r0 = 36324621481423035(0x810d0d000030bb, double:3.03517512013783E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0025
        L_0x001e:
            X.HN0 r0 = X.HN0.SHARE_TO_NOTE_TOOLTIP
            if (r4 == r0) goto L_0x0025
            X.2fy r0 = X.C226262fy.BELOW_ANCHOR
            return r0
        L_0x0025:
            X.2fy r0 = X.C226262fy.ABOVE_ANCHOR
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4J.A00(X.HN0, X.I4J):X.2fy");
    }
}
