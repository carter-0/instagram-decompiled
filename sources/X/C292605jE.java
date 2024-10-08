package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.StringWriter;
import java.util.Map;

/* renamed from: X.5jE  reason: invalid class name and case insensitive filesystem */
public abstract class C292605jE {
    public static String A00(C254933tI r2) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A01(A0A, r2);
        A0A.close();
        return stringWriter.toString();
    }

    public static void A01(17Z r3, C254933tI r4) {
        r3.A0c();
        String str = r4.A0R;
        if (str != null) {
            r3.A0R("client_context", str);
        }
        String str2 = r4.A0T;
        if (str2 != null) {
            r3.A0R("item_id", str2);
        }
        2FW r0 = r4.A0F;
        if (r0 != null) {
            r3.A0R("item_type", r0.A00);
        }
        String str3 = r4.A0V;
        if (str3 != null) {
            r3.A0R("text", str3);
        }
        if (r4.A0A != null) {
            r3.A0q("image_glyphs");
            C18193VnB.A00(r3, r4.A0A);
        }
        if (r4.A0C != null) {
            r3.A0q("media");
            1Xj r1 = r4.A0C;
            1Xv r02 = 1Xj.A0h;
            1Xv.A07(r3, r1);
        }
        String str4 = r4.A0U;
        if (str4 != null) {
            r3.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4);
        }
        if (r4.A03 != null) {
            r3.A0q("reel_share");
            C70879OPt.A00(r3, r4.A03);
        }
        if (r4.A04 != null) {
            r3.A0q("story_share");
            C70880OPu.A00(r3, r4.A04);
        }
        if (r4.A02 != null) {
            r3.A0q("clip");
            C45671D0w.A00(r3, r4.A02);
        }
        if (r4.A0D != null) {
            r3.A0q(AnonymousClass000.A00(702));
            1Xj r12 = r4.A0D;
            1Xv r03 = 1Xj.A0h;
            1Xv.A07(r3, r12);
        }
        if (r4.A01 != null) {
            r3.A0q("direct_media_share");
            C45673D0y.A00(r4.A01, r3);
        }
        if (r4.A08 != null) {
            r3.A0q("voice_media");
            C2609847u.A00(r3, r4.A08);
        }
        if (r4.A07 != null) {
            r3.A0q("visual_media");
            C271364ij.A00(r3, r4.A07);
        }
        if (r4.A06 != null) {
            r3.A0q("message_item_dict");
            C271364ij.A00(r3, r4.A06);
        }
        if (r4.A0G != null) {
            r3.A0q("animated_media");
            AnonymousClass53A.A00(r3, r4.A0G);
        }
        if (r4.A0H != null) {
            r3.A0q("store_sticker");
            D1V.A00(r3, r4.A0H);
        }
        if (r4.A09 != null) {
            r3.A0q("xma");
            C254863tB.A00(r3, r4.A09);
        }
        if (r4.A0B != null) {
            r3.A0q(AnonymousClass000.A00(1839));
            C45674D0z.A00(r3, r4.A0B);
        }
        String str5 = r4.A0Q;
        if (str5 != null) {
            r3.A0R("replied_to_action_source", str5);
        }
        if (r4.A00 != null) {
            r3.A0q("link");
            C278334wi.A00(r4.A00, r3);
        }
        2FW r04 = r4.A0E;
        if (r04 != null) {
            r3.A0R("message_item_type", r04.A00);
        }
        if (r4.A0I != null) {
            r3.A0q("reaction_image_url_info");
            16W.A00(r3, r4.A0I);
        }
        if (r4.A05 != null) {
            r3.A0q("video_call_event");
            AnonymousClass55K.A00(r3, r4.A05);
        }
        String str6 = r4.A0W;
        if (str6 != null) {
            r3.A0R("timestamp", str6);
        }
        Long l = r4.A0P;
        if (l != null) {
            r3.A0Q("timestamp_in_micro", l.longValue());
        }
        String str7 = r4.A0S;
        if (str7 != null) {
            r3.A0R(AnonymousClass000.A00(1184), str7);
        }
        Boolean bool = r4.A0J;
        if (bool != null) {
            r3.A0S("is_ae", bool.booleanValue());
        }
        if (r4.A0X != null) {
            r3.A0q("media_interventions");
            r3.A0c();
            for (Map.Entry entry : r4.A0X.entrySet()) {
                if (!16P.A04(r3, entry)) {
                    r3.A0g(((Number) entry.getValue()).intValue());
                }
            }
            r3.A0Z();
        }
        Long l2 = r4.A0K;
        if (l2 != null) {
            r3.A0Q(AnonymousClass000.A00(3065), l2.longValue());
        }
        Long l3 = r4.A0O;
        if (l3 != null) {
            r3.A0Q("ephemeral_view_timestamp_ms", l3.longValue());
        }
        Long l4 = r4.A0M;
        if (l4 != null) {
            r3.A0Q(C66579MXk.A00(313), l4.longValue());
        }
        Long l5 = r4.A0N;
        if (l5 != null) {
            r3.A0Q("ephemeral_after_view_expiration_timestamp_ms", l5.longValue());
        }
        Long l6 = r4.A0L;
        if (l6 != null) {
            r3.A0Q("message_expiration_timestamp_ms", l6.longValue());
        }
        if (r4.A0Y != null) {
            16P.A03(r3, "hscroll_share");
            for (C254873tC r05 : r4.A0Y) {
                if (r05 != null) {
                    C254863tB.A00(r3, r05);
                }
            }
            r3.A0Y();
        }
        r3.A0Z();
    }
}
