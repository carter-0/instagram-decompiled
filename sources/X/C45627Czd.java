package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Czd  reason: case insensitive filesystem */
public abstract class C45627Czd {
    public static C257843y3 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C42051BFe bFe = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "music_asset_info")) {
                    bFe = C44225Cam.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (bFe != null || !(r5 instanceof 0c9)) {
                return new C257843y3(bFe);
            }
            AnonymousClass7TF.A1L("music_asset_info", r5, "SponsoredMusicInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, C257843y3 r5) {
        r4.A0c();
        C42051BFe bFe = r5.A00;
        if (bFe != null) {
            r4.A0q("music_asset_info");
            r4.A0c();
            String str = bFe.A0H;
            if (str != null) {
                r4.A0R("alacorn_session_id", str);
            }
            Boolean bool = bFe.A03;
            if (bool != null) {
                r4.A0S("allows_saving", bool.booleanValue());
            }
            String str2 = bFe.A0I;
            if (str2 != null) {
                r4.A0R("artist_id", str2);
            }
            String str3 = bFe.A0J;
            if (str3 != null) {
                r4.A0R("audio_cluster_id", str3);
            }
            List list = bFe.A0S;
            if (list != null) {
                Iterator A0s = C41845B3m.A0s(r4, "beats", list);
                while (A0s.hasNext()) {
                    Number number = (Number) A0s.next();
                    if (number != null) {
                        r4.A0h(number.longValue());
                    }
                }
                r4.A0Y();
            }
            Boolean bool2 = bFe.A04;
            if (bool2 != null) {
                r4.A0S("can_remix_be_shared_to_fb", bool2.booleanValue());
            }
            ImageUrl imageUrl = bFe.A00;
            if (imageUrl != null) {
                r4.A0q("cover_artwork_thumbnail_uri");
                16h.A01(r4, imageUrl);
            }
            ImageUrl imageUrl2 = bFe.A01;
            if (imageUrl2 != null) {
                r4.A0q("cover_artwork_uri");
                16h.A01(r4, imageUrl2);
            }
            String str4 = bFe.A0K;
            if (str4 != null) {
                r4.A0R("dash_manifest", str4);
            }
            Integer num = bFe.A0C;
            if (num != null) {
                r4.A0P(AnonymousClass000.A00(1270), num.intValue());
            }
            Integer num2 = bFe.A0D;
            if (num2 != null) {
                r4.A0P(AnonymousClass000.A00(1271), num2.intValue());
            }
            String str5 = bFe.A0L;
            if (str5 != null) {
                r4.A0R("display_artist", str5);
            }
            Long l = bFe.A0F;
            if (l != null) {
                r4.A0Q(TraceFieldType.Duration, l.longValue());
            }
            Integer num3 = bFe.A0E;
            if (num3 != null) {
                r4.A0P("duration_in_ms", num3.intValue());
            }
            Boolean bool3 = bFe.A05;
            if (bool3 != null) {
                r4.A0S("has_lyrics", bool3.booleanValue());
            }
            List list2 = bFe.A0T;
            if (list2 != null) {
                Iterator A0s2 = C41845B3m.A0s(r4, "highlight_start_times_in_ms", list2);
                while (A0s2.hasNext()) {
                    Number number2 = (Number) A0s2.next();
                    if (number2 != null) {
                        r4.A0g(number2.intValue());
                    }
                }
                r4.A0Y();
            }
            C41846B3n.A0y(r4, bFe.A0M);
            User user = bFe.A02;
            if (user != null) {
                C41845B3m.A0w(r4, user, "ig_artist");
            }
            Boolean bool4 = bFe.A06;
            if (bool4 != null) {
                r4.A0S("is_bookmarked", bool4.booleanValue());
            }
            Boolean bool5 = bFe.A07;
            if (bool5 != null) {
                r4.A0S("is_explicit", bool5.booleanValue());
            }
            Boolean bool6 = bFe.A08;
            if (bool6 != null) {
                r4.A0S("is_local_audio", bool6.booleanValue());
            }
            Boolean bool7 = bFe.A09;
            if (bool7 != null) {
                r4.A0S(AnonymousClass000.A00(1517), bool7.booleanValue());
            }
            Boolean bool8 = bFe.A0A;
            if (bool8 != null) {
                r4.A0S("is_original_sound", bool8.booleanValue());
            }
            String str6 = bFe.A0N;
            if (str6 != null) {
                r4.A0R(AnonymousClass000.A00(48), str6);
            }
            String str7 = bFe.A0O;
            if (str7 != null) {
                r4.A0R(AnonymousClass000.A00(1662), str7);
            }
            String str8 = bFe.A0P;
            if (str8 != null) {
                r4.A0R(AnonymousClass000.A00(1721), str8);
            }
            String str9 = bFe.A0Q;
            if (str9 != null) {
                r4.A0R("progressive_download_url", str9);
            }
            Boolean bool9 = bFe.A0B;
            if (bool9 != null) {
                r4.A0S(AnonymousClass000.A00(1801), bool9.booleanValue());
            }
            Long l2 = bFe.A0G;
            if (l2 != null) {
                r4.A0Q(AnonymousClass000.A00(790), l2.longValue());
            }
            C41846B3n.A10(r4, bFe.A0R);
            r4.A0Z();
        }
        r4.A0Z();
    }
}
