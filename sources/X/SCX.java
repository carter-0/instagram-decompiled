package X;

import java.util.Vector;
import java.util.regex.Pattern;

public abstract class SCX {
    public static final Vector A00 = new Vector();
    public static final Pattern A01 = Pattern.compile("(?:\\sChrome/)(\\d{2,3})(?:\\.)");

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|4|5|6|7|8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r2) {
        /*
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L_0x0025
            android.webkit.CookieSyncManager.createInstance(r2)     // Catch:{  }
            X.SlD r1 = X.RUF.A00()     // Catch:{  }
            r0 = 0
            r1.EDE(r0)     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            r1.flush()     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            android.webkit.WebView r1 = new android.webkit.WebView     // Catch:{ Exception -> 0x002d }
            r1.<init>(r2)     // Catch:{ Exception -> 0x002d }
            r0 = 1
            r1.clearCache(r0)     // Catch:{ Exception -> 0x002d }
            r1.destroy()     // Catch:{ Exception -> 0x002d }
            return
        L_0x0025:
            X.TBQ r0 = new X.TBQ
            r0.<init>(r2)
            X.SB5.A00(r0)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SCX.A00(android.content.Context):void");
    }
}
