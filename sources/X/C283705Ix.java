package X;

import android.app.usage.UsageStatsManager;
import com.instagram.common.session.UserSession;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.5Ix  reason: invalid class name and case insensitive filesystem */
public final class C283705Ix {
    public static 0sK A00;
    public static final C283705Ix A01 = new Object();

    public final List A00(UserSession userSession, long j) {
        if (!182.A06(0Tu.A05, userSession, 36325038093513281L)) {
            return null;
        }
        0sK r4 = A00;
        if (r4 == null) {
            r4 = B08.A00;
            Class<UsageStatsManager> cls = UsageStatsManager.class;
            try {
                Class cls2 = Long.TYPE;
                Method method = cls.getMethod("queryEventsForSelf", new Class[]{cls2, cls2});
                if (method != null) {
                    r4 = new JGX(method, 2);
                }
            } catch (Exception e) {
                0KC.A0G("IGScreenTimeOsUsageStats", "Failed to get queryEventsForSelf method", e);
            }
            A00 = r4;
        }
        return (List) r4.invoke(userSession, Long.valueOf(j * 1000), Long.valueOf(System.currentTimeMillis()));
    }
}
