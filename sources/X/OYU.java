package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.instagram.zero.dogfooding.notification.IgZeroDogfoodingNotificationActionReceiver;

public final class OYU {
    public static C262204Co A00;
    public static final OYU A01 = new Object();
    public static final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C73890PlR.A00);

    public static final PendingIntent A00(String str, int i) {
        Context context = C60960kU.A00;
        0qQ.A07(context);
        0Sy r2 = new 0Sy();
        Intent A0A = C66580MXl.A0A(context, IgZeroDogfoodingNotificationActionReceiver.class);
        A0A.putExtra("dogfooding_mode", str);
        r2.A0A(A0A);
        return r2.A02(context, i, 134217728);
    }
}
