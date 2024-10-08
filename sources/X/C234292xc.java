package X;

import android.app.ActivityManager;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2xc  reason: invalid class name and case insensitive filesystem */
public final class C234292xc {
    public final long A00;
    public final long A01;
    public final Context A02;
    public final UserSession A03;
    public final boolean A04;

    public C234292xc(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A02 = context;
        this.A03 = userSession;
        0Tu r4 = 0Tu.A05;
        this.A01 = ((long) 182.A00(r4, userSession, 37162621142040820L)) * 1024 * 1024 * 1024;
        this.A00 = (long) 182.A00(r4, userSession, 37162621142106357L);
        this.A04 = 182.A06(r4, userSession, 36318196211718131L);
    }

    public final boolean A00() {
        ActivityManager activityManager;
        if (!this.A04 || C61970qY.A0G(this.A02)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService = this.A02.getSystemService("activity");
            if ((systemService instanceof ActivityManager) && (activityManager = (ActivityManager) systemService) != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            if (memoryInfo.totalMem < this.A01 || ((long) Runtime.getRuntime().availableProcessors()) < this.A00) {
                return false;
            }
            return true;
        }
        return false;
    }
}
