package X;

/* renamed from: X.Mo5  reason: case insensitive filesystem */
public abstract class C67450Mo5 {
    public static void A00(16F r3, C67451Mo6 mo6, String str) {
        String str2 = null;
        if ("page_token".equals(str)) {
            if (r3.A11() != 16L.A0G) {
                str2 = r3.A1P();
            }
            mo6.A02 = str2;
        } else if ("has_more".equals(str)) {
            mo6.A04 = r3.A0d();
        } else if ("rank_token".equals(str)) {
            if (r3.A11() != 16L.A0G) {
                str2 = r3.A1P();
            }
            mo6.A03 = str2;
        } else if ("clear_client_cache".equals(str)) {
            mo6.A07 = r3.A0d();
        } else if ("inform_module".equals(str)) {
            mo6.A00 = C44725Cjt.parseFromJson(r3);
        } else if ("see_more".equals(str)) {
            mo6.A01 = C70328O2g.parseFromJson(r3);
        } else if ("is_meta_ai_heuristic_enabled".equals(str)) {
            mo6.A05 = r3.A0d();
        } else if ("is_meta_ai_prompt_echo_enabled".equals(str)) {
            mo6.A06 = r3.A0d();
        } else {
            1XY.A01(r3, mo6, str);
        }
    }
}
