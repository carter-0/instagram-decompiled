package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public final class SMc {
    public static final SMc A00 = new Object();

    public static final void A00(Context context, String str) {
        Intent A09 = DbS.A09();
        A09.setPackage(str);
        A09.setAction("com.whatsapp.otp.OTP_REQUESTED");
        Bundle extras = A09.getExtras();
        if (extras == null) {
            extras = AnonymousClass7TE.A0a();
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 67108864;
        }
        0Sy r1 = new 0Sy();
        r1.A0B(A09, context.getClassLoader());
        r1.A09();
        extras.putParcelable("_ci_", r1.A02(context, 0, i));
        A09.putExtras(extras);
        context.sendBroadcast(A09);
    }
}
