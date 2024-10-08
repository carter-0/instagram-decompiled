package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.453  reason: invalid class name */
public final class AnonymousClass453 {
    public int A00;
    public Map A01 = new HashMap();
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final long A0Q;
    public final long A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c2, code lost:
        if (r1.equals(r0) == false) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x0104
            r5 = 0
            if (r8 == 0) goto L_0x00c4
            java.lang.Class r1 = r7.getClass()
            java.lang.Class r0 = r8.getClass()
            if (r1 != r0) goto L_0x00c4
            X.453 r8 = (X.AnonymousClass453) r8
            int r1 = r7.A0N
            int r0 = r8.A0N
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A09
            int r0 = r8.A09
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0D
            int r0 = r8.A0D
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0P
            int r0 = r8.A0P
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0K
            int r0 = r8.A0K
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0L
            int r0 = r8.A0L
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A04
            int r0 = r8.A04
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A07
            int r0 = r8.A07
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A05
            int r0 = r8.A05
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A02
            int r0 = r8.A02
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A06
            int r0 = r8.A06
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A03
            int r0 = r8.A03
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0E
            int r0 = r8.A0E
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0M
            int r0 = r8.A0M
            if (r1 != r0) goto L_0x00c4
            boolean r1 = r7.A0V
            boolean r0 = r8.A0V
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A08
            int r0 = r8.A08
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0H
            int r0 = r8.A0H
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0G
            int r0 = r8.A0G
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0I
            int r0 = r8.A0I
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0J
            int r0 = r8.A0J
            if (r1 != r0) goto L_0x00c4
            long r3 = r7.A0R
            long r1 = r8.A0R
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            long r3 = r7.A0Q
            long r1 = r8.A0Q
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            int r1 = r7.A0F
            int r0 = r8.A0F
            if (r1 != r0) goto L_0x00c4
            boolean r1 = r7.A0X
            boolean r0 = r8.A0X
            if (r1 != r0) goto L_0x00c4
            boolean r1 = r7.A0W
            boolean r0 = r8.A0W
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0A
            int r0 = r8.A0A
            if (r1 != r0) goto L_0x00c4
            java.lang.String r1 = r7.A0T
            java.lang.String r0 = r8.A0T
            if (r1 == 0) goto L_0x00c5
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c8
        L_0x00c4:
            return r5
        L_0x00c5:
            if (r0 == 0) goto L_0x00c8
            return r5
        L_0x00c8:
            java.lang.String r1 = r7.A0U
            java.lang.String r0 = r8.A0U
            if (r1 == 0) goto L_0x00d5
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d8
            return r5
        L_0x00d5:
            if (r0 == 0) goto L_0x00d8
            return r5
        L_0x00d8:
            int r1 = r7.A0O
            int r0 = r8.A0O
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0C
            int r0 = r8.A0C
            if (r1 != r0) goto L_0x00c4
            int r1 = r7.A0B
            int r0 = r8.A0B
            if (r1 != r0) goto L_0x00c4
            boolean r1 = r7.A0Y
            boolean r0 = r8.A0Y
            if (r1 != r0) goto L_0x00c4
            java.util.Map r1 = r7.A01
            java.util.Map r0 = r8.A01
            if (r1 != r0) goto L_0x00c4
            java.lang.String r1 = r7.A0S
            java.lang.String r0 = r8.A0S
            if (r1 == 0) goto L_0x0101
            boolean r6 = r1.equals(r0)
            return r6
        L_0x0101:
            if (r0 == 0) goto L_0x0104
            r6 = 0
        L_0x0104:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass453.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.A0T;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31 * 31;
        String str2 = this.A0U;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.A0S;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        long j = this.A0R;
        long j2 = this.A0Q;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i5 + i3) * 31) + this.A0N) * 31) + this.A09) * 31) + this.A0D) * 31) + this.A0P) * 31) + this.A0K) * 31) + this.A0L) * 31) + this.A04) * 31) + this.A07) * 31) + this.A05) * 31) + this.A02) * 31) + this.A06) * 31) + this.A03) * 31) + this.A0E) * 31) + this.A08) * 31) + this.A00) * 31) + this.A0M) * 31) + (this.A0V ? 1 : 0)) * 31) + this.A0H) * 31) + this.A0G) * 31) + this.A0I) * 31) + this.A0J) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A0F) * 31) + (this.A0X ? 1 : 0)) * 31) + (this.A0W ? 1 : 0)) * 31) + this.A0A) * 31) + this.A0O) * 31) + this.A0C) * 31) + this.A0B) * 31) + (this.A0Y ? 1 : 0)) * 31) + this.A01.hashCode();
    }

    public AnonymousClass453(JSONObject jSONObject) {
        this.A0T = jSONObject.optString("host_name_v6", "mqtt-mini.facebook.com");
        this.A0U = jSONObject.optString("php_sandbox_host_name", (String) null);
        this.A0S = jSONObject.optString("analytics_endpoint", "https://graph.facebook.com/logging_client_events");
        this.A0N = jSONObject.optInt("default_port", 443);
        this.A09 = jSONObject.optInt("backup_port", 443);
        this.A0D = jSONObject.optInt("dns_timeout_sec", 60);
        this.A0P = jSONObject.optInt("socket_timeout_sec", 60);
        this.A0K = jSONObject.optInt("mqtt_connect_timeout_sec", 60);
        this.A0L = jSONObject.optInt("response_timeout_sec", 59);
        this.A04 = jSONObject.optInt("back_to_back_retry_attempts", 3);
        this.A07 = jSONObject.optInt("background_back_to_back_retry_attempts", 1);
        this.A05 = jSONObject.optInt("back_to_back_retry_interval_sec", 0);
        this.A02 = jSONObject.optInt("back_off_initial_retry_interval_sec", 2);
        this.A06 = jSONObject.optInt("background_back_off_initial_retry_interval_sec", 10);
        this.A03 = jSONObject.optInt("back_off_max_retry_interval_sec", 900);
        this.A0E = jSONObject.optInt("foreground_keepalive_interval_sec", 60);
        this.A08 = jSONObject.optInt("background_keepalive_interval_persistent_sec", 900);
        this.A00 = jSONObject.optInt("skip_ping_threshold_s", 10);
        this.A0M = jSONObject.optInt("ping_delay_s", 60);
        this.A0V = jSONObject.optBoolean("force_server_ping", false);
        this.A0H = jSONObject.optInt("min_cycle_delay_sec_inexact_scheduling", 900);
        this.A0G = jSONObject.optInt("happy_eyeballs_delay_ms", 25);
        this.A0I = jSONObject.optInt("mqtt_client_thread_priority_ui", 5);
        this.A0J = jSONObject.optInt("mqtt_client_thread_priority_worker", 5);
        this.A0R = jSONObject.optLong("analytics_log_min_interval_for_sent_ms", 0);
        this.A0Q = jSONObject.optLong("analytics_log_min_interval_for_received_ms", 0);
        this.A0F = jSONObject.optInt("gcm_ping_mqtt_delay_sec", 30);
        this.A0X = jSONObject.optBoolean("use_ssl", true);
        this.A0W = jSONObject.optBoolean("use_compression", true);
        this.A0A = jSONObject.optInt("ct", 60000);
        this.A0O = jSONObject.optInt("short_mqtt_connection_sec", 5);
        this.A0C = jSONObject.optInt("connect_rate_limiter_limit", 40);
        this.A0B = jSONObject.optInt("connect_rate_limiter_interval_s", 2400);
        this.A0Y = jSONObject.optBoolean("verbose_connection_health_log", false);
    }
}
