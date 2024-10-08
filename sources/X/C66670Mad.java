package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Mad  reason: case insensitive filesystem */
public abstract class C66670Mad {
    public static void A00(17Z r5, 1OS r6) {
        r5.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.A05);
        r5.A0Q("created_at_ms", r6.A01);
        0qQ.A07(Collections.unmodifiableSet(r6.A08));
        16P.A03(r5, "tags");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(r6.A08);
        0qQ.A07(unmodifiableSet);
        for (String str : unmodifiableSet) {
            if (str != null) {
                r5.A0t(str);
            }
        }
        r5.A0Y();
        String str2 = r6.A06;
        if (str2 != null) {
            r5.A0R("lifecycle_state", str2);
        }
        String str3 = r6.A07;
        if (str3 != null) {
            r5.A0R("send_attempt_channel", str3);
        }
        if (r6.A04 != null) {
            r5.A0q("send_error");
            OQQ.A00(r5, r6.A04);
        }
        r5.A0P("send_retry_count", r6.A00);
        if (r6.A03 != null) {
            r5.A0q("previous_send_error_for_automatic_retry");
            OQQ.A00(r5, r6.A03);
        }
        r5.A0q("basic_info");
        C66665MaY maY = r6.A02;
        r5.A0c();
        r5.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, maY.A03);
        r5.A0S("is_sampled_for_e2e_logging", maY.A09);
        r5.A0S("is_in_shh_mode", maY.A07);
        r5.A0S("send_silently", maY.A0A);
        r5.A0S("is_moment", maY.A08);
        r5.A0S("hide_future_requests", maY.A06);
        String str4 = maY.A04;
        if (str4 != null) {
            r5.A0R("mutation_attribution", str4);
        }
        String str5 = maY.A05;
        if (str5 != null) {
            r5.A0R("power_up_data", str5);
        }
        String str6 = maY.A02;
        if (str6 != null) {
            r5.A0R("ad_id", str6);
        }
        C70621ODs oDs = maY.A00;
        if (oDs != null) {
            r5.A0q("ephemerality_params");
            r5.A0c();
            C69405Nkj nkj = oDs.A00;
            if (nkj != null) {
                r5.A0R("product_type", nkj.A00);
            }
            Long l = oDs.A01;
            if (l != null) {
                r5.A0Q("ephemeral_duration_sec", l.longValue());
            }
            Long l2 = oDs.A02;
            if (l2 != null) {
                r5.A0Q("ephemeral_view_duration_sec", l2.longValue());
            }
            r5.A0Z();
        }
        Boolean bool = maY.A01;
        if (bool != null) {
            r5.A0S("should_xpost", bool.booleanValue());
        }
        r5.A0Z();
    }

    public static void A01(16F r3, 1OS r4, String str) {
        HashSet hashSet = null;
        if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(str)) {
            String A0l = AnonymousClass7TG.A0l(r3);
            0qQ.A0B(A0l, 0);
            r4.A05 = A0l;
        } else if ("created_at_ms".equals(str)) {
            r4.A01 = r3.A0y();
        } else if ("tags".equals(str)) {
            if (r3.A11() == 16L.A0C) {
                hashSet = AnonymousClass7TE.A1F();
                while (r3.A1J() != 16L.A08) {
                    AnonymousClass7TG.A1F(r3, hashSet);
                }
            }
            0qQ.A0B(hashSet, 0);
            r4.A08 = hashSet;
        } else if ("lifecycle_state".equals(str)) {
            String A0l2 = AnonymousClass7TG.A0l(r3);
            0qQ.A0B(A0l2, 0);
            r4.A06 = A0l2;
        } else if ("send_attempt_channel".equals(str)) {
            String A0l3 = AnonymousClass7TG.A0l(r3);
            0qQ.A0B(A0l3, 0);
            r4.A07 = A0l3;
        } else if ("send_error".equals(str)) {
            r4.A04 = OQQ.parseFromJson(r3);
        } else if ("send_retry_count".equals(str)) {
            r4.A00 = r3.A1D();
        } else if ("previous_send_error_for_automatic_retry".equals(str)) {
            r4.A03 = OQQ.parseFromJson(r3);
        } else if ("basic_info".equals(str)) {
            C66665MaY parseFromJson = C70120Nxa.parseFromJson(r3);
            0qQ.A0B(parseFromJson, 0);
            r4.A02 = parseFromJson;
        }
    }
}
