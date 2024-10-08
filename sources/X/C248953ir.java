package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.url.InstagramHelpDeeplinkAliasActivity;
import com.instagram.url.InstagramShortenDeeplinkAliasActivity;

/* renamed from: X.3ir  reason: invalid class name and case insensitive filesystem */
public final class C248953ir extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248953ir(2Lk r7) {
        super("CoreXDeeplinkSetup", 1422822022, 3, true, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r1.A01;
        ComponentName componentName = new ComponentName(context, InstagramShortenDeeplinkAliasActivity.class);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            UserSession userSession = r1.A04;
            0Tu r6 = 0Tu.A05;
            int i = 2;
            int i2 = 2;
            if (182.A06(r6, userSession, 36318621412170049L)) {
                i2 = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i2, 1);
            ComponentName componentName2 = new ComponentName(context, InstagramHelpDeeplinkAliasActivity.class);
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 != null) {
                if (182.A06(r6, userSession, 36318621412432195L)) {
                    i = 1;
                }
                packageManager2.setComponentEnabledSetting(componentName2, i, 1);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
