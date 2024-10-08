package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;
import com.instagram.common.session.UserSession;

public final class OUh {
    public static final OUh A00 = new Object();

    public final 0eP A00(Context context, UserSession userSession, boolean z) {
        C69279Nif nif;
        0Tu r2;
        boolean z2 = false;
        if (!context.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            nif = C69279Nif.SYSTEM_FEATURE_NOT_PRESENT;
        } else {
            Object systemService = context.getSystemService("appops");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            if (((AppOpsManager) systemService).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0) {
                if (z) {
                    r2 = 0Tu.A06;
                } else {
                    r2 = 0Tu.A05;
                }
                if (DbY.A1Z(r2, userSession, 36311148169134528L)) {
                    z2 = true;
                    nif = null;
                } else {
                    nif = C69279Nif.IG_FEATURE_NOT_ENABLED;
                }
            } else {
                nif = C69279Nif.SYSTEM_PERMISSION_DENIED;
            }
        }
        return AnonymousClass7TE.A1L(z2, nif);
    }
}
