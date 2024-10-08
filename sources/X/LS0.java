package X;

import android.content.Context;
import android.util.JsonWriter;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TagSerializer;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class LS0 {
    public static final LS0 A00 = new Object();

    public static final String A01(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, List list, List list2) {
        boolean equals;
        if (list == list2) {
            equals = true;
        } else {
            equals = Arrays.equals(list.toArray(new Tag[0]), list2.toArray(new Tag[0]));
        }
        if (equals) {
            return null;
        }
        try {
            ArrayList A002 = C63461KxQ.A00(list, list2);
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                W3r.A07(userSession, r4, r5, JTS.A0Y(it));
            }
            return TagSerializer.A00(list2, A002);
        } catch (IOException e) {
            0KC.A0F("EditMediaInfoUtil", C273654mx.A00(1404), e);
            return null;
        }
    }

    public static final 1NY A00(Context context, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, C61000Juw juw, 1Xj r11, Venue venue, AudioOverlayTrack audioOverlayTrack, Boolean bool, String str, String str2, List list, List list2, int i, int i2) {
        String str3;
        List list3;
        String A0k = DbS.A0k();
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        DbU.A1P(A0a, "media/%s/edit_media/", C51969G9p.A1b(r11));
        A0a.A0G("caption_text", str);
        A0a.A9m(MYM.A00(0, 9, 19), 0qv.A00(context));
        A0a.A9m(AnonymousClass000.A00(665), r11.A0C.BIl());
        A0a.A0E(AnonymousClass000.A00(669), bool);
        A0a.A0G("nav_chain", A0k);
        A0a.A0O((15p) null, C61290K1b.class, C64024LJl.class, false);
        A0a.A0R = true;
        int i3 = i;
        if (i3 != -1) {
            A0a.A9m(AnonymousClass000.A00(603), String.valueOf(i3));
        }
        int i4 = i2;
        if (i4 != -1) {
            A0a.A9m(C273654mx.A00(66), String.valueOf(i4));
        }
        if (venue != null) {
            try {
                String A002 = C63383Kw4.A00(venue);
                A0a.A9m("location", A002);
                if ("facebook_events".equals(venue.A03())) {
                    A0a.A9m("event", A002);
                }
            } catch (IOException e) {
                0KC.A0F("EditMediaInfoUtil", "Unable to parse location", e);
            }
        }
        if (list != null) {
            A0a.A9m("carousel_children_media_ids_to_delete", C51970G9q.A0k(list));
        }
        if (r11.A0C.Aqj() != null) {
            A0a.A9m(AnonymousClass000.A00(657), "true");
        }
        A0a.A9m("include_e2ee_mentioned_user_list", "true");
        List list4 = list2;
        if (list2 != null) {
            C2609247o Amn = r11.A0C.Amn();
            if (Amn != null) {
                str3 = Amn.C6E();
            } else {
                str3 = null;
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list4) {
                DbV.A1U(next, A1C, 0qQ.A0K(next, str3) ? 1 : 0);
            }
            if (00k.A0u(list4, str3) || str3 == null) {
                list3 = 0sn.A00;
            } else {
                list3 = AnonymousClass7TE.A1I(str3);
            }
            String str4 = null;
            if (!A1C.isEmpty() || !list3.isEmpty()) {
                try {
                    StringWriter A0v = JTO.A0v();
                    JsonWriter jsonWriter = new JsonWriter(A0v);
                    jsonWriter.beginObject();
                    if (AnonymousClass7TE.A1b(A1C)) {
                        jsonWriter.name("added");
                        C63187Ksu.A00(jsonWriter, A1C);
                    }
                    if (AnonymousClass7TE.A1b(list3)) {
                        jsonWriter.name("removed");
                        C63187Ksu.A00(jsonWriter, list3);
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    str4 = A0v.toString();
                } catch (IOException unused) {
                }
            }
            A0a.A9m("channel_tags", str4);
        }
        if (juw != null) {
            try {
                A0a.A9m("bio_product", LPS.A00(juw));
            } catch (IOException e2) {
                0KC.A0F("EditMediaInfoUtil", "Unable to serialize bio product info", e2);
            }
        }
        if (audioOverlayTrack != null) {
            MusicProduct musicProduct = MusicProduct.MUSIC_IN_FEED;
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                String str5 = str2;
                if (str2 != null) {
                    A0a.AA0("music_params", C59670JTa.A05(C59670JTa.A01(musicProduct, audioOverlayTrack, musicAssetModel, str5)));
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        if (mediaGenAIDetectionMethod != null) {
            A0a.A9m("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
        }
        return A0a;
    }
}
