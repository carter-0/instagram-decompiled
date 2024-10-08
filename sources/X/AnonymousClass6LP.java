package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: X.6LP  reason: invalid class name */
public final class AnonymousClass6LP {
    public static final Map A08 = 0Yt.A06(new 0eP[]{new 0eP("partially_enter_viewport", 1), new 0eP("fully_enter_viewport", 1), new 0eP("prepare_render_start", 1), new 0eP("prepare_render_success", 1), new 0eP("prepare_render_fail", 1), new 0eP("content_parse_start", 1), new 0eP("content_parse_success", 1), new 0eP("content_parse_fail", 1), new 0eP("media_load_start", 1), new 0eP("media_load_success", 1), new 0eP("media_load_fail", 1)});
    public static final Set A09 = 0sc.A07(new String[]{"media_#_load_start", "media_#_load_success", "media_#_load_fail", "media_amount_determined"});
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public final QuickPerformanceLogger A04;
    public final AnonymousClass6Q8 A05;
    public final AnonymousClass6Q9 A06;
    public final ExecutorService A07;

    public AnonymousClass6LP(QuickPerformanceLogger quickPerformanceLogger, AnonymousClass6Q8 r3, AnonymousClass6Q9 r4) {
        0qQ.A0B(r3, 2);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        0qQ.A07(newSingleThreadExecutor);
        this.A04 = quickPerformanceLogger;
        this.A05 = r3;
        this.A07 = newSingleThreadExecutor;
        this.A06 = r4;
    }

    public final void A0H(String str, String str2) {
        A01(this, str);
        this.A07.execute(new AnonymousClass6QB(this, str, str2, this.A04.currentMonotonicTimestampNanos()));
    }

    public static final void A01(AnonymousClass6LP r2, String str) {
        if (r2.A06.A00()) {
            int hashCode = str.hashCode();
            if (hashCode != -1536070176) {
                if (hashCode != -360970784) {
                    if (hashCode == 1029446145 && str.equals("media_#_load_success")) {
                        r2.A03++;
                    }
                } else if (str.equals("media_#_load_start")) {
                    r2.A02++;
                }
            } else if (str.equals("media_#_load_fail")) {
                r2.A01++;
            }
        }
    }

    public static final void A02(AnonymousClass6LP r6, String str) {
        if (r6.A06.A00() && r6.A00 > 0 && 00k.A0u(A09, str)) {
            if (!0qQ.A0K(str, "media_amount_determined") || r6.A02 <= 0) {
                int hashCode = str.hashCode();
                if (hashCode != -1536070176) {
                    if (hashCode != -360970784) {
                        if (hashCode == 1029446145 && str.equals("media_#_load_success") && r6.A03 >= r6.A00) {
                            r6.A0H("media_load_success", (String) null);
                        }
                    } else if (str.equals("media_#_load_start")) {
                        r6.A0H("media_load_start", (String) null);
                    }
                } else if (str.equals("media_#_load_fail")) {
                    r6.A0H("media_load_fail", (String) null);
                }
            } else {
                r6.A0H("media_load_start", (String) null);
                if (r6.A03 >= r6.A00) {
                    r6.A0H("media_load_success", (String) null);
                } else if (r6.A01 > 0) {
                    r6.A0H("media_load_fail", (String) null);
                }
            }
        }
    }

    public final void A03() {
        if (this.A06.A00()) {
            A0H("content_parse_start", (String) null);
        }
    }

    public final void A04() {
        if (!this.A06.A00()) {
            A0H("prepare_render_binding_start", (String) null);
        }
    }

    public final void A05() {
        if (!this.A06.A00()) {
            A0H("prepare_render_binding_success", (String) null);
        }
    }

    public final void A06() {
        if (!this.A06.A00()) {
            A0H("prepare_render_success", (String) null);
        }
    }

    public final void A07() {
        this.A07.execute(new C57808Ign(this, this.A04.currentMonotonicTimestampNanos()));
    }

    public final void A08() {
        this.A07.execute(new AnonymousClass6QA(this, this.A04.currentMonotonicTimestampNanos()));
    }

    public final void A09() {
        this.A07.execute(new C52749Gc1(this, this.A04.currentMonotonicTimestampNanos()));
    }

    public final void A0A() {
        HashMap hashMap = new HashMap();
        hashMap.put("error", "Error playing video");
        String obj = new JSONObject(hashMap).toString();
        0qQ.A07(obj);
        A0H("video_play_request_fail", obj);
    }

    public final void A0B(String str) {
        if (this.A06.A00()) {
            HashMap hashMap = new HashMap();
            hashMap.put("error", str);
            String obj = new JSONObject(hashMap).toString();
            0qQ.A07(obj);
            A0H("content_parse_fail", obj);
        }
    }

    public final void A0C(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error", str);
        String obj = new JSONObject(hashMap).toString();
        0qQ.A07(obj);
        A0H("layout_parsing_fail", obj);
    }

    public final void A0D(String str) {
        if (!this.A06.A00()) {
            HashMap hashMap = new HashMap();
            hashMap.put("error", str);
            String obj = new JSONObject(hashMap).toString();
            0qQ.A07(obj);
            A0H("prepare_render_binding_fail", obj);
        }
    }

    public final void A0E(String str) {
        if (!this.A06.A00()) {
            HashMap hashMap = new HashMap();
            hashMap.put("error", str);
            String obj = new JSONObject(hashMap).toString();
            0qQ.A07(obj);
            A0H("prepare_render_fail", obj);
        }
    }

    public final void A0F(String str) {
        this.A07.execute(new C57890Ii7(this, str, this.A04.currentMonotonicTimestampNanos()));
    }

    public final void A0G(String str, int i, int i2) {
        LinkedHashMap A062 = 0Yt.A06(new 0eP[]{new 0eP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str), new 0eP("x", String.valueOf(i)), new 0eP("y", String.valueOf(i2))});
        0qQ.A0B("interaction_#", 0);
        A01(this, "interaction_#");
        this.A07.execute(new C306946Of(this, "interaction_#", A062, this.A04.currentMonotonicTimestampNanos()));
    }

    public final void A0I(boolean z) {
        String str;
        if (this.A06.A00()) {
            HashMap hashMap = new HashMap();
            if (z) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            hashMap.put("cache_hit", str);
            String obj = new JSONObject(hashMap).toString();
            0qQ.A07(obj);
            A0H("content_parse_success", obj);
        }
    }

    public final void A0J(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        hashMap.put("cache_hit", str);
        String obj = new JSONObject(hashMap).toString();
        0qQ.A07(obj);
        A0H("layout_parsing_success", obj);
    }

    public static final void A00(AnonymousClass6LP r5, int i) {
        int i2;
        if (r5.A06.A00() && AnonymousClass6QC.A00("prepare_render_success", 906037831, i) + AnonymousClass6QC.A00("prepare_render_fail", 906037831, i) <= 0) {
            int A002 = AnonymousClass6QC.A00("content_parse_success", 906037831, i);
            int A003 = AnonymousClass6QC.A00("content_parse_fail", 906037831, i);
            if (A002 > 0 && ((i2 = r5.A00) <= 0 || i2 == r5.A03)) {
                r5.A0H("prepare_render_success", (String) null);
            } else if (A003 > 0 || r5.A01 > 0) {
                String obj = new JSONObject(new HashMap()).toString();
                0qQ.A07(obj);
                r5.A0H("prepare_render_fail", obj);
            }
        }
    }
}
