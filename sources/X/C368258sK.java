package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.8sK  reason: invalid class name and case insensitive filesystem */
public final class C368258sK {
    public final QuickPerformanceLogger A00;

    public static final int A00(Map map) {
        String str = (String) map.get("instance_key");
        if (str != null) {
            return Integer.parseInt(str);
        }
        return -1;
    }

    public final void A02(int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(i);
            quickPerformanceLogger.markerAnnotate(i, "platform", "Android");
            quickPerformanceLogger.markerAnnotate(i, "app_id", 567067343352427L);
            quickPerformanceLogger.markerAnnotate(i, "app_source", "INSTAGRAM_WITH_V2_PROVIDER");
            quickPerformanceLogger.markerAnnotate(i, "item_type", "ACCOUNT_ITEM");
            quickPerformanceLogger.markerAnnotate(i, "credential_source", "ACTIVE_ACCOUNT");
            quickPerformanceLogger.markerAnnotate(i, "logging_version", "3.0");
        }
    }

    public C368258sK(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    public static final void A01(Map map, C368258sK r8, int i) {
        String str;
        QuickPerformanceLogger quickPerformanceLogger;
        for (Map.Entry entry : map.entrySet()) {
            Integer[] A002 = AnonymousClass05K.A00(4);
            int length = A002.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    switch (A002[i2].intValue()) {
                        case 1:
                            str = "CALLER_NAME";
                            break;
                        case 2:
                            str = AnonymousClass000.A00(109);
                            break;
                        case 3:
                            str = "TARGET_APP_FETCH_RESULT";
                            break;
                        default:
                            str = "RESOLVER_NAME";
                            break;
                    }
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    0qQ.A07(lowerCase);
                    if (lowerCase.equals(entry.getKey())) {
                        CharSequence charSequence = (CharSequence) entry.getValue();
                        if (!(charSequence == null || charSequence.length() == 0 || (quickPerformanceLogger = r8.A00) == null)) {
                            quickPerformanceLogger.markerAnnotate(857814189, i, (String) entry.getKey(), (String) entry.getValue());
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
    }
}
