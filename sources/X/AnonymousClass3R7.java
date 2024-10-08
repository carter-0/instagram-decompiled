package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.3R7  reason: invalid class name */
public final class AnonymousClass3R7 {
    public final Context A00;
    public final AnonymousClass3R6 A01;

    public static void A00(Context context, Intent intent) {
        T9D qbl;
        String stringExtra = intent.getStringExtra("extra_notification_sender");
        String stringExtra2 = intent.getStringExtra(C66579MXk.A00(34));
        String stringExtra3 = intent.getStringExtra("job_id");
        if (stringExtra3 == null) {
            qbl = C7860Qbk.A00;
        } else {
            qbl = new C7861Qbl(stringExtra3);
        }
        SP2.A01(context, C7860Qbk.A00, qbl, stringExtra, stringExtra2, true);
    }

    public static void A01(Context context, Intent intent, String str) {
        T9D qbl;
        String stringExtra = intent.getStringExtra("extra_notification_sender");
        String stringExtra2 = intent.getStringExtra(C66579MXk.A00(34));
        C7861Qbl qbl2 = new C7861Qbl(str);
        String stringExtra3 = intent.getStringExtra("job_id");
        if (stringExtra3 == null) {
            qbl = C7860Qbk.A00;
        } else {
            qbl = new C7861Qbl(stringExtra3);
        }
        SP2.A01(context, qbl2, qbl, stringExtra, stringExtra2, false);
    }

    public AnonymousClass3R7(Context context, AnonymousClass3R6 r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
