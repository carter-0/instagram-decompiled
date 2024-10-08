package X;

import android.app.ActivityManager;
import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6fr  reason: invalid class name and case insensitive filesystem */
public final class C313096fr {
    public final C312156dv A00;
    public final ActivityManager A01;
    public final C312516eY A02;
    public volatile WeakHashMap A03 = new WeakHashMap(2);

    public static C368758tH A00(C313096fr r2, String str) {
        for (Map.Entry key : r2.A03.entrySet()) {
            C344037rD B46 = ((C312136ds) key.getKey()).B46();
            if (B46 != null && str != null && str.equals(B46.getActiveSessionId())) {
                return B46.BY6();
            }
        }
        return null;
    }

    public static void A02(boolean z) {
        QuickPerformanceLogger qPLInstance;
        if (!z && (qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance()) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("use_case", "jni_null_ard");
            qPLInstance.markerGenerateWithAnnotations(11282540, 4, 1, TimeUnit.MILLISECONDS, hashMap);
        }
    }

    public C313096fr(Context context, C312516eY r4, C312156dv r5) {
        this.A00 = r5;
        this.A02 = r4;
        this.A01 = (ActivityManager) context.getSystemService("activity");
    }

    public static void A01(C313096fr r6, String str) {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        ActivityManager activityManager = r6.A01;
        if (activityManager != null && qPLInstance != null) {
            int hashCode = str.hashCode();
            if (qPLInstance.isMarkerOn(16323880, hashCode)) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                qPLInstance.markerAnnotateCrucialForUserFlow(16323880, hashCode, "ann_avail_mem_at_start", 002.A0Q("", memoryInfo.availMem));
            }
        }
    }
}
