package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.93R  reason: invalid class name */
public abstract class AnonymousClass93R {
    public static String A00(String str, String str2, String str3, String str4, boolean z) {
        if (z) {
            return new JSONObject(0Yt.A06(new 0eP[]{new 0eP("serve_from_server_cache", Boolean.valueOf(z)), new 0eP("cohort_to_ttl_map", str), new 0eP("serve_on_foreground_prefetch", str3), new 0eP("serve_on_background_prefetch", str2), new 0eP("meta", str4)})).toString();
        }
        return null;
    }

    public static Map A01(String str, String str2, String str3, String str4, boolean z) {
        return 0Yt.A06(new 0eP[]{new 0eP("serve_from_server_cache", Boolean.valueOf(z)), new 0eP("cohort_to_ttl_map", str), new 0eP("serve_on_foreground_prefetch", str3), new 0eP("serve_on_background_prefetch", str2), new 0eP("meta", str4)});
    }
}
