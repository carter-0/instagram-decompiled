package X;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.Arrays;

/* renamed from: X.MpI  reason: case insensitive filesystem */
public final class C67523MpI extends 0ng {
    public final /* synthetic */ 1Ou A00;

    public final void run() {
        EventBuilder markEventBuilder;
        try {
            1Ou r2 = this.A00;
            IntentFilter intentFilter = 1Ou.A0W;
            ConnectivityManager connectivityManager = (ConnectivityManager) r2.A03.getSystemService("connectivity");
            r2.A00 = connectivityManager;
            if (connectivityManager != null) {
                connectivityManager.registerDefaultNetworkCallback(r2.A04);
            }
            r2.A0O = true;
        } catch (Exception e) {
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null && (markEventBuilder = qPLInstance.markEventBuilder(936446320, "network_state_handler_mutation_manager")) != null && markEventBuilder.isSampled()) {
                qPLInstance.markEventBuilder(936446320, "network_state_handler_mutation_manager").annotate("trace", 002.A0g(e.getMessage(), ": ", Arrays.toString(e.getStackTrace()))).report();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67523MpI(1Ou r5) {
        super(1338936892, 3, true, false);
        this.A00 = r5;
    }
}
