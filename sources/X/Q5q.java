package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public abstract class Q5q extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, -790395757);
        AnonymousClass0jb r1 = AnonymousClass0jd.A04;
        Context context2 = C60960kU.A00;
        0qQ.A07(context2);
        19i A01 = r1.A00(context2).A01((0lg) null);
        if (!"com.facebook.GET_PHONE_ID".equals(intent.getAction()) || A01 == null) {
            i = 1968525047;
        } else {
            Bundle resultExtras = getResultExtras(true);
            0Pj r0 = C49849F9o.A01;
            PendingIntent pendingIntent = (PendingIntent) resultExtras.getParcelable("auth");
            if (pendingIntent != null && C49849F9o.A00(context, pendingIntent.getCreatorPackage())) {
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putLong("timestamp", A01.A00);
                A0a.putString("origin", A01.A02);
                setResult(-1, A01.A01, A0a);
            }
            i = -1014110834;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
