package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

public final class SR0 {
    public static final SR0 A00 = new Object();

    public final boolean A02(Intent intent) {
        Object parcelableExtra;
        0qQ.A0B(intent, 0);
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("_ci_", PendingIntent.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("_ci_");
        }
        PendingIntent pendingIntent = (PendingIntent) parcelableExtra;
        if (pendingIntent == null) {
            return false;
        }
        String creatorPackage = pendingIntent.getCreatorPackage();
        return 0qQ.A0K(creatorPackage, "com.whatsapp") || 0qQ.A0K(creatorPackage, AnonymousClass000.A00(561));
    }

    public static final String A00() {
        boolean z;
        long j = 0;
        String str = null;
        String string = 0xn.A01("com.instagram.android.WHATSAPP_OTP").getString("otp_data", (String) null);
        if (string != null) {
            try {
                JSONObject A17 = C66580MXl.A17(string);
                String string2 = A17.getString("otp");
                long j2 = A17.getLong("ct");
                0qQ.A0A(string2);
                z = true;
                0qQ.A0B(string2, 1);
                str = string2;
                j = j2;
            } catch (JSONException unused) {
                z = false;
            }
            if (!z || C51966G9m.A07(j) >= 3600000) {
                return null;
            }
        }
        return str;
    }

    public static final void A01() {
        0xY AR4 = 0xn.A01("com.instagram.android.WHATSAPP_OTP").AR4();
        AR4.ED3("otp_data");
        AR4.apply();
    }
}
