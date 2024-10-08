package X;

import java.util.Map;

/* renamed from: X.4NO  reason: invalid class name */
public final class AnonymousClass4NO {
    public static final void A00(C58840Ae r3, AnonymousClass4OR r4, 1yA r5, String str, String str2) {
        0qQ.A0B(r5, 1);
        if (r5.A06) {
            0wc r32 = (0wc) r3;
            0Aj A00 = r32.A00(r32.A00, "media_playback_compound_debug");
            if (A00.isSampled() && r4 != null) {
                A00.AAK(r4, "required_metadata");
                A00.AAJ("log_category", str);
                A00.AAJ("error_type", str2);
                A00.AAJ("error_message", "");
                A00.Cgf();
            }
        }
    }

    public final String A01(AnonymousClass4OR r5, long j) {
        if (r5 == null) {
            return "client_metadata_provider_missing";
        }
        Number number = 0L;
        Map map = r5.A00;
        0qQ.A07(map);
        if ((!map.containsKey("media_id") || (number = (Number) map.get("media_id")) != null) && j == number.longValue()) {
            return null;
        }
        return "client_media_id_mismatch";
    }
}
