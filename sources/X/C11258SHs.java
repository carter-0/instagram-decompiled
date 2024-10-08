package X;

import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SHs  reason: case insensitive filesystem */
public final class C11258SHs {
    public long A00;
    public T9D A01 = C7860Qbk.A00;
    public final long A02;
    public final Intent A03;
    public final T9D A04;
    public final T9D A05;
    public final T9D A06;
    public final T9D A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public static C11258SHs A00(Object obj) {
        T9D t9d;
        T9D t9d2;
        T9D t9d3;
        T9D t9d4;
        T9D t9d5;
        try {
            String str = (String) obj;
            if (str.length() > 50000) {
                return null;
            }
            JSONObject A17 = C66580MXl.A17(str);
            Intent parseUri = Intent.parseUri(A17.getString("key_intent"), 0);
            String string = A17.getString("key_notifid");
            long j = A17.getLong("key_timestamp_received");
            long j2 = A17.getLong("key_timestamp_last_retried");
            if (A17.has("key_log_event")) {
                t9d = C7861Qbl.A00(Boolean.valueOf(A17.getBoolean("key_log_event")));
            } else {
                t9d = C7860Qbk.A00;
            }
            if (A17.has("key_queue_time_ms")) {
                t9d2 = C7861Qbl.A00(Long.valueOf(A17.getLong("key_queue_time_ms")));
            } else {
                t9d2 = C7860Qbk.A00;
            }
            String optString = A17.optString("key_job_id");
            String optString2 = A17.optString("key_source");
            if (A17.has("key_mqtt_process_time_ms")) {
                t9d3 = C7861Qbl.A00(Long.valueOf(A17.getLong("key_mqtt_process_time_ms")));
            } else {
                t9d3 = C7860Qbk.A00;
            }
            if (A17.has("key_ttl_s")) {
                t9d4 = C7861Qbl.A00(Long.valueOf(A17.getLong("key_ttl_s")));
            } else {
                t9d4 = C7860Qbk.A00;
            }
            if (A17.has("key_is_delivered")) {
                t9d5 = C7861Qbl.A00(Boolean.valueOf(A17.getBoolean("key_is_delivered")));
            } else {
                t9d5 = C7860Qbk.A00;
            }
            C11258SHs sHs = new C11258SHs(parseUri, t9d, t9d2, t9d3, t9d4, string, optString, optString2, j, j2);
            if ((t9d5 instanceof C7860Qbk) || !AnonymousClass7TE.A1a(t9d5.A01())) {
                return sHs;
            }
            sHs.A01 = C7861Qbl.A00(AnonymousClass7TE.A0v());
            return sHs;
        } catch (Exception unused) {
            return null;
        }
    }

    public C11258SHs(Intent intent, T9D t9d, T9D t9d2, T9D t9d3, T9D t9d4, String str, String str2, String str3, long j, long j2) {
        this.A03 = intent;
        this.A09 = str;
        this.A05 = t9d;
        this.A04 = t9d2;
        this.A08 = str2;
        this.A0A = str3;
        this.A06 = t9d3;
        this.A07 = t9d4;
        this.A02 = j;
        this.A00 = j2;
    }

    public final String A01() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            JSONObject A11 = DbS.A11();
            A11.putOpt("key_intent", this.A03.toUri(0));
            A11.putOpt("key_notifid", this.A09);
            A11.putOpt("key_timestamp_received", Long.valueOf(this.A02));
            A11.putOpt("key_timestamp_last_retried", Long.valueOf(this.A00));
            T9D t9d = this.A07;
            if (t9d instanceof C7860Qbk) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                A11.putOpt("key_ttl_s", t9d.A01());
            }
            T9D t9d2 = this.A05;
            if (t9d2 instanceof C7860Qbk) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                A11.putOpt("key_log_event", t9d2.A01());
            }
            A11.putOpt("key_job_id", this.A08);
            A11.putOpt("key_source", this.A0A);
            T9D t9d3 = this.A04;
            if (t9d3 instanceof C7860Qbk) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                A11.putOpt("key_queue_time_ms", t9d3.A01());
            }
            T9D t9d4 = this.A06;
            if (t9d4 instanceof C7860Qbk) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                A11.putOpt("key_mqtt_process_time_ms", t9d4.A01());
            }
            T9D t9d5 = this.A01;
            if (t9d5 instanceof C7860Qbk) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                A11.putOpt("key_is_delivered", t9d5.A01());
            }
            String obj = A11.toString();
            int length = obj.length();
            if (length <= 50000) {
                return obj;
            }
            throw DbW.A0b("Payload size limit exceeded with ", length);
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }
}
