package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VIi  reason: case insensitive filesystem */
public abstract class C17112VIi {
    public static final void A00(17Z r3, ULm uLm) {
        0qQ.A0B(uLm, 1);
        r3.A0c();
        String str = uLm.A0M;
        if (str != null) {
            r3.A0R("alacorn_session_id", str);
        }
        Boolean bool = uLm.A04;
        if (bool != null) {
            r3.A0S(AnonymousClass000.A00(2593), bool.booleanValue());
        }
        r3.A0S("allows_saving", uLm.A0p);
        String str2 = uLm.A0N;
        if (str2 != null) {
            r3.A0R("artist_id", str2);
        }
        String str3 = uLm.A0O;
        if (str3 != null) {
            r3.A0R("audio_asset_id", str3);
        }
        Integer num = uLm.A0G;
        if (num != null) {
            r3.A0P(AnonymousClass000.A00(518), num.intValue());
        }
        Integer num2 = uLm.A0H;
        if (num2 != null) {
            r3.A0P(AnonymousClass000.A00(1120), num2.intValue());
        }
        String str4 = uLm.A0P;
        if (str4 != null) {
            r3.A0R("audio_cluster_id", str4);
        }
        List list = uLm.A0m;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r3, AnonymousClass000.A00(1122), list);
            while (A0s.hasNext()) {
                C16578UxX uxX = (C16578UxX) A0s.next();
                0qQ.A0B(uxX, 0);
                r3.A0t(uxX.A00);
            }
            r3.A0Y();
        }
        C61007Jv6 jv6 = uLm.A00;
        if (jv6 != null) {
            r3.A0q("audio_muting_info");
            r3.A0c();
            r3.A0S("allow_audio_editing", jv6.A02);
            r3.A0S("mute_audio", jv6.A03);
            RFN rfn = (RFN) jv6.A00;
            if (rfn != null) {
                r3.A0R("mute_reason", rfn.A00);
            }
            r3.A0R("mute_reason_str", jv6.A01);
            r3.A0S("show_muted_audio_toast", jv6.A04);
            r3.A0Z();
        }
        String str5 = uLm.A0Q;
        if (str5 != null) {
            r3.A0R(AnonymousClass000.A00(134), str5);
        }
        String str6 = uLm.A0R;
        if (str6 != null) {
            r3.A0R("cover_artwork_thumbnail_uri", str6);
        }
        r3.A0R("cover_artwork_uri", uLm.A0S);
        String str7 = uLm.A0T;
        if (str7 != null) {
            r3.A0R("dark_message", str7);
        }
        String str8 = uLm.A0U;
        if (str8 != null) {
            r3.A0R("dash_manifest", str8);
        }
        String str9 = uLm.A0V;
        if (str9 != null) {
            r3.A0R("derived_content_id", str9);
        }
        Integer num3 = uLm.A0I;
        if (num3 != null) {
            r3.A0P(C273654mx.A00(137), num3.intValue());
        }
        String str10 = uLm.A0W;
        if (str10 != null) {
            r3.A0R("display_artist", str10);
        }
        List list2 = uLm.A0n;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r3, "display_labels", list2);
            while (A0s2.hasNext()) {
                C16563UxF uxF = (C16563UxF) A0s2.next();
                0qQ.A0B(uxF, 0);
                r3.A0t(uxF.A00);
            }
            r3.A0Y();
        }
        Integer num4 = uLm.A0J;
        if (num4 != null) {
            r3.A0P("duration_in_ms", num4.intValue());
        }
        String str11 = uLm.A0X;
        if (str11 != null) {
            r3.A0R("fast_start_progressive_download_url", str11);
        }
        String str12 = uLm.A0Y;
        if (str12 != null) {
            r3.A0R(AnonymousClass000.A00(3149), str12);
        }
        Boolean bool2 = uLm.A05;
        if (bool2 != null) {
            r3.A0S("has_lyrics", bool2.booleanValue());
        }
        Boolean bool3 = uLm.A06;
        if (bool3 != null) {
            r3.A0S("hide_remixing", bool3.booleanValue());
        }
        List list3 = uLm.A0o;
        if (list3 != null) {
            Iterator A0s3 = C41845B3m.A0s(r3, "highlight_start_times_in_ms", list3);
            while (A0s3.hasNext()) {
                r3.A0g(AnonymousClass7TG.A0F(A0s3));
            }
            r3.A0Y();
        }
        r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, uLm.A0Z);
        C15036UKp uKp = uLm.A01;
        if (uKp != null) {
            r3.A0q("ig_artist");
            C17109VIf.A00(r3, uKp);
        }
        String str13 = uLm.A0a;
        if (str13 != null) {
            r3.A0R("ig_username", str13);
        }
        Boolean bool4 = uLm.A07;
        if (bool4 != null) {
            r3.A0S("is_bookmarked", bool4.booleanValue());
        }
        Boolean bool5 = uLm.A08;
        if (bool5 != null) {
            r3.A0S("is_eligible_for_audio_effects", bool5.booleanValue());
        }
        Boolean bool6 = uLm.A09;
        if (bool6 != null) {
            r3.A0S("is_eligible_for_vinyl_sticker", bool6.booleanValue());
        }
        r3.A0S("is_explicit", uLm.A0q);
        Boolean bool7 = uLm.A0A;
        if (bool7 != null) {
            r3.A0S("is_local_audio", bool7.booleanValue());
        }
        Boolean bool8 = uLm.A0B;
        if (bool8 != null) {
            r3.A0S("is_original_sound", bool8.booleanValue());
        }
        Boolean bool9 = uLm.A0C;
        if (bool9 != null) {
            r3.A0S(AnonymousClass000.A00(3465), bool9.booleanValue());
        }
        String str14 = uLm.A0b;
        if (str14 != null) {
            r3.A0R(AnonymousClass000.A00(48), str14);
        }
        C16589Uxj uxj = uLm.A03;
        if (uxj != null) {
            r3.A0R(AnonymousClass000.A00(324), uxj.A00);
        }
        String str15 = uLm.A0c;
        if (str15 != null) {
            r3.A0R("original_media_id", str15);
        }
        Integer num5 = uLm.A0K;
        if (num5 != null) {
            r3.A0P(AnonymousClass000.A00(732), num5.intValue());
        }
        Boolean bool10 = uLm.A0D;
        if (bool10 != null) {
            r3.A0S(AnonymousClass000.A00(1684), bool10.booleanValue());
        }
        r3.A0R(AnonymousClass000.A00(3749), uLm.A0d);
        String str16 = uLm.A0e;
        if (str16 != null) {
            r3.A0R("progressive_download_url", str16);
        }
        String str17 = uLm.A0f;
        if (str17 != null) {
            r3.A0R(C66579MXk.A00(25), str17);
        }
        String str18 = uLm.A0g;
        if (str18 != null) {
            r3.A0R("sanitized_title", str18);
        }
        Boolean bool11 = uLm.A0E;
        if (bool11 != null) {
            r3.A0S(AnonymousClass000.A00(3989), bool11.booleanValue());
        }
        r3.A0S("should_mute_audio", uLm.A0r);
        r3.A0R(AnonymousClass000.A00(3993), uLm.A0h);
        RFN rfn2 = uLm.A02;
        if (rfn2 != null) {
            r3.A0R(AnonymousClass000.A00(3994), rfn2.A00);
        }
        Boolean bool12 = uLm.A0F;
        if (bool12 != null) {
            r3.A0S(AnonymousClass000.A00(1816), bool12.booleanValue());
        }
        String str19 = uLm.A0i;
        if (str19 != null) {
            r3.A0R("subtitle", str19);
        }
        String str20 = uLm.A0j;
        if (str20 != null) {
            r3.A0R("tag", str20);
        }
        C41846B3n.A10(r3, uLm.A0k);
        Integer num6 = uLm.A0L;
        if (num6 != null) {
            r3.A0P("trend_rank", num6.intValue());
        }
        String str21 = uLm.A0l;
        if (str21 != null) {
            r3.A0R("web_30s_preview_download_url", str21);
        }
        r3.A0Z();
    }
}
