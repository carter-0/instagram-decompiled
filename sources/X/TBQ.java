package X;

import android.content.Context;

public final class TBQ implements Runnable {
    public final /* synthetic */ Context A00;

    public TBQ(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            android.content.Context r2 = r3.A00
            java.util.regex.Pattern r0 = X.SCX.A01
            android.webkit.CookieSyncManager.createInstance(r2)     // Catch:{  }
            X.SlD r1 = X.RUF.A00()     // Catch:{  }
            r0 = 0
            r1.EDE(r0)     // Catch:{ Exception -> 0x000f }
        L_0x000f:
            r1.flush()     // Catch:{ Exception -> 0x0012 }
        L_0x0012:
            android.webkit.WebView r1 = new android.webkit.WebView     // Catch:{ Exception -> 0x001e }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001e }
            r0 = 1
            r1.clearCache(r0)     // Catch:{ Exception -> 0x001e }
            r1.destroy()     // Catch:{ Exception -> 0x001e }
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TBQ.run():void");
    }
}
