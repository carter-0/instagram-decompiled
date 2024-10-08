package X;

import java.io.IOException;

/* renamed from: X.6rq  reason: invalid class name and case insensitive filesystem */
public final class C320146rq {
    public static C320136rp parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C320136rp r0 = new C320136rp();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                A00(r3, r0, A0q);
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(16F r1, C320136rp r2, String str) {
        if ("outgoing_request".equals(str)) {
            r2.A0F = r1.A0d();
        } else if ("following".equals(str)) {
            r2.A0E = r1.A0d();
        } else if ("followed_by".equals(str)) {
            r2.A02 = Boolean.valueOf(r1.A0d());
        } else if ("incoming_request".equals(str)) {
            r2.A07 = Boolean.valueOf(r1.A0d());
        } else if ("blocking".equals(str)) {
            r2.A00 = Boolean.valueOf(r1.A0d());
        } else if ("is_blocking_reel".equals(str)) {
            r2.A01 = Boolean.valueOf(r1.A0d());
        } else if ("muting".equals(str)) {
            r2.A05 = Boolean.valueOf(r1.A0d());
        } else if ("is_muting_reel".equals(str)) {
            r2.A06 = Boolean.valueOf(r1.A0d());
        } else if ("is_muting_notes".equals(str)) {
            r2.A04 = Boolean.valueOf(r1.A0d());
        } else if ("is_muting_media_notes".equals(str)) {
            r2.A03 = Boolean.valueOf(r1.A0d());
        } else if ("is_private".equals(str)) {
            r2.A0A = Boolean.valueOf(r1.A0d());
        } else if ("subscribed".equals(str)) {
            r2.A0B = Boolean.valueOf(r1.A0d());
        } else if ("is_eligible_to_subscribe".equals(str)) {
            r2.A09 = Boolean.valueOf(r1.A0d());
        } else if ("is_viewer_unconnected".equals(str)) {
            r2.A0C = Boolean.valueOf(r1.A0d());
        } else if ("should_show_profile_upsell".equals(str)) {
            r2.A0D = Boolean.valueOf(r1.A0d());
        } else if ("is_banner_profile_upsell".equals(str)) {
            r2.A08 = Boolean.valueOf(r1.A0d());
        } else {
            1XY.A01(r1, r2, str);
        }
    }
}
