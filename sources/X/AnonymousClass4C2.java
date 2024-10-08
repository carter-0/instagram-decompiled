package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.4C2  reason: invalid class name */
public final class AnonymousClass4C2 implements C59900bo {
    public final /* synthetic */ AnonymousClass45A A00;

    public AnonymousClass4C2(AnonymousClass45A r1) {
        this.A00 = r1;
    }

    public final ArrayList BIF() {
        String str;
        if (this.A00 instanceof AnonymousClass459) {
            str = "com.facebook.rti.mqtt.ACTION_ZR_SWITCH";
        } else {
            str = "com.facebook.rti.mqtt.ACTION_WORK_SWITCH";
        }
        return new ArrayList(Collections.singletonList(new IntentFilter(str)));
    }

    public final void Dbc(Context context, Intent intent, C59880bj r11) {
        String str;
        String str2;
        Object[] objArr;
        String str3;
        C13849TiS AR1;
        String str4;
        AnonymousClass3RV r3;
        String stringExtra = intent.getStringExtra("extra_mqtt_endpoint");
        String stringExtra2 = intent.getStringExtra("extra_analytics_endpoint");
        String stringExtra3 = intent.getStringExtra("extra_fbns_endpoint");
        String stringExtra4 = intent.getStringExtra("extra_fbns_analytics_endpoint");
        AnonymousClass45A r4 = this.A00;
        0cS r1 = new 0cS();
        r1.A01();
        r1.A04("MQTT_CONFIG_CHANGE_DOMAIN");
        if (!r1.A00().A03(context, intent, (0bY) null)) {
            if (r4 instanceof AnonymousClass459) {
                str2 = "ZeroRatingConnectionConfigOverrides";
            } else {
                str2 = "WorkConnectionConfigOverrides";
            }
            objArr = new Object[]{stringExtra, stringExtra2, stringExtra3, stringExtra4};
            str3 = "ignore unauthorized sender %s, %s, %s, %s";
        } else if (!r4.A02(stringExtra) || !r4.A02(stringExtra3)) {
            if (r4 instanceof AnonymousClass459) {
                str = "ZeroRatingConnectionConfigOverrides";
            } else {
                str = "WorkConnectionConfigOverrides";
            }
            objArr = new Object[]{stringExtra, stringExtra2, stringExtra3, stringExtra4};
            str3 = "ignore illegal target endpoint switch %s, %s, %s, %s";
        } else {
            Integer num = r4.A04;
            if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0C) {
                if (!TextUtils.isEmpty(stringExtra3)) {
                    stringExtra = stringExtra3;
                }
                if (!TextUtils.isEmpty(stringExtra4)) {
                    stringExtra2 = stringExtra4;
                }
            }
            String str5 = r4.A06;
            if (str5 != null ? str5.equals(stringExtra) : stringExtra == null) {
                String str6 = r4.A05;
                if (str6 == null) {
                    if (stringExtra2 == null) {
                        return;
                    }
                } else if (str6.equals(stringExtra2)) {
                    return;
                }
            }
            if (r4 instanceof AnonymousClass459) {
                if (!(stringExtra == null || (r3 = r4.A02) == null)) {
                    AR1 = r3.A00(r4.A01, 002.A0R("rti.mqtt.", "mqtt_last_host")).AR1();
                    AR1.E5e("zero_rating_last_host", stringExtra);
                    AR1.E5a("zero_rating_last_host_timestamp", System.currentTimeMillis());
                    str4 = "ZeroRatingConnectionConfigOverrides";
                }
                r4.A06 = stringExtra;
                r4.A05 = stringExtra2;
                r4.A03.A02();
                return;
            }
            AR1 = r4.A02.A00(r4.A01, 002.A0R("rti.mqtt.", "mqtt_last_host")).AR1();
            if (stringExtra != null) {
                AR1.E5e(Pxd.A00(932), stringExtra);
            }
            if (stringExtra2 != null) {
                AR1.E5e(Pxd.A00(931), stringExtra2);
            }
            str4 = "WorkConnectionConfigOverrides";
            AR1.AIR(str4, "Failed to save endpoints to preferences");
            r4.A06 = stringExtra;
            r4.A05 = stringExtra2;
            r4.A03.A02();
            return;
        }
        0KC.A0P(str2, str3, objArr);
    }
}
