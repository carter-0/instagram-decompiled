package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Pyr  reason: case insensitive filesystem */
public abstract class C7200Pyr {
    public static boolean A01(Intent intent) {
        if (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(intent.getStringExtra("google.c.a.e"));
        }
        return false;
    }

    public static void A00(Intent intent, String str) {
        String str2;
        Bundle A0a = AnonymousClass7TE.A0a();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            A0a.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            A0a.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            A0a.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            A0a.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 != null && stringExtra5.startsWith("/topics/")) {
            A0a.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                A0a.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                A0a.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(C7199Pyq.A02(extras, "gcm.n.e")) || C7199Pyq.A02(extras, "gcm.n.icon") != null) {
                    str2 = "display";
                    A0a.putString("_nmc", str2);
                }
            }
            str2 = "data";
            A0a.putString("_nmc", str2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(A0a);
            String.valueOf(str);
            String.valueOf(valueOf);
        }
        C3734195g A00 = C3734195g.A00();
        C3734195g.A01(A00);
        A00.A02.A03(C13489TbG.class);
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }
}
