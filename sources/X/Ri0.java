package X;

import android.content.res.Resources;
import com.instagram.android.R;

public abstract class Ri0 {
    public static final String A00(Resources resources, C7572QKn qKn) {
        AnonymousClass7TG.A1N(resources, qKn);
        boolean A1X = DbT.A1X(qKn.A00, "TrackingInfo.USE_MEDIA_REPORTING_FLOW");
        int i = R.string.f0nameremoved;
        if (A1X) {
            i = R.string.f0nameremoved;
        }
        return AnonymousClass7TF.A0d(resources, i);
    }
}
