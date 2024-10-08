package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.tagging.model.TagSerializer;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class LSW {
    public static final 1OC A01(C61062Jw0 jw0, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, C61000Juw juw, 1Xj r11, MusicOverlayStickerModel musicOverlayStickerModel, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2) {
        String str3;
        String str4;
        String str5 = "";
        String str6 = str;
        boolean A1Y = DbW.A1Y(str6);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        DbU.A1P(A0a, "media/%s/edit_media/", C51969G9p.A1b(r11));
        A0a.A9m("caption_text", str6);
        A0a.A0G("funded_content_deal_id", str2);
        if (jw0 == null) {
            str4 = str5;
        } else {
            try {
                str4 = C45890D9t.A00(jw0);
            } catch (IOException e) {
                AnonymousClass7TF.A19(0wj.A01.AEf("ReelApiUtil.createEditMetadataTask", 817902720), DialogModule.KEY_MESSAGE, "IOException: ClipsShoppingMetadata serializeToJson", e);
            }
        }
        A0a.A9m("shopping_data", str4);
        A0a.A0E(AnonymousClass000.A00(3428), bool);
        A0a.A0E("revshare_ads_toggled_on", bool2);
        if (bool3 != null) {
            if (bool3.booleanValue()) {
                str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str3 = "0";
            }
            A0a.A0G("video_subtitles_enabled", str3);
        }
        Boolean bool6 = bool4;
        if (bool4 != null) {
            A0a.A0E(AnonymousClass000.A00(1926), bool6);
        }
        Boolean bool7 = bool5;
        if (bool5 != null) {
            A0a.A0E(AnonymousClass000.A00(1845), bool7);
        }
        if (musicOverlayStickerModel != null) {
            A0a.AA0("music_params", C59670JTa.A05(musicOverlayStickerModel));
        }
        A0a.A9m("include_e2ee_mentioned_user_list", "true");
        if (mediaGenAIDetectionMethod != null) {
            A0a.A9m("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
        }
        if (r11.A0C.Aqj() != null && 182.A06(0Tu.A05, userSession, 36327391735331226L)) {
            A0a.A9m(AnonymousClass000.A00(657), "true");
        }
        if (juw != null) {
            try {
                str5 = LPS.A00(juw);
            } catch (IOException unused) {
                0wb.A03("ReelApiUtil.createEditMetadataTask", "IOException: IGBIOProductInfo serializeToJson");
            }
        }
        A0a.A9m("bio_product", str5);
        return DbW.A0L(A0a, C61290K1b.class, C64024LJl.class, A1Y);
    }

    public static final 1OC A02(UserSession userSession, String str) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/archive_clip/");
        A0a.A0G(AnonymousClass000.A00(547), str);
        return DbU.A0S(A0a, C43775CCt.class, C45542CyG.class);
    }

    public static final 1OC A03(UserSession userSession, String str) {
        1NY A0L = DbZ.A0L(userSession);
        DbU.A1P(A0L, "media/%s/delete/", new Object[]{str});
        JTO.A1W(A0L, str);
        return DbW.A0L(A0L, C61284K0v.class, LGy.class, true);
    }

    public static final 1OC A04(UserSession userSession, String str, List list) {
        1NY A0L = DbZ.A0L(userSession);
        DbU.A1P(A0L, "media/%s/delete/", new Object[]{str});
        JTO.A1W(A0L, str);
        try {
            String A00 = AnonymousClass000.A00(2979);
            StringWriter A0v = JTO.A0v();
            17W A0K = AnonymousClass7TF.A0K(A0v);
            Iterator A0s = C41845B3m.A0s(A0K, AnonymousClass000.A00(2978), list);
            while (A0s.hasNext()) {
                C41846B3n.A18(A0K, A0s);
            }
            A0K.A0Y();
            A0K.A0R("source_app", "IG");
            A0L.A9m(A00, AnonymousClass7TG.A0k(A0K, A0v));
        } catch (IOException e) {
            AnonymousClass7TF.A19(0wj.A01.AEf("ClipsEditApiUtil.createDeepDeleteMediaTask", 817902720), DialogModule.KEY_MESSAGE, "IOException: DeepDeletionRequestMetadata serializeToJson", e);
        }
        return DbW.A0L(A0L, C61284K0v.class, LGy.class, true);
    }

    public static final 1OC A00(C61062Jw0 jw0, BrandedContentGatingInfoIntf brandedContentGatingInfoIntf, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, C61000Juw juw, 1Xj r19, AnonymousClass3QO r20, Venue venue, MusicOverlayStickerModel musicOverlayStickerModel, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, boolean z) {
        String A00;
        HashSet hashSet;
        HashSet hashSet2;
        String str4;
        String str5 = str3;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        1NY A0a = AnonymousClass7TG.A0a(userSession2);
        1Xj r1 = r19;
        DbU.A1P(A0a, "media/%s/edit_media/", C51969G9p.A1b(r1));
        A0a.A0G("caption_text", str);
        A0a.A0G("funded_content_deal_id", str2);
        String str6 = "";
        if (jw0 == null) {
            A00 = str6;
        } else {
            A00 = C45890D9t.A00(jw0);
        }
        A0a.A9m("shopping_data", A00);
        A0a.A0E(AnonymousClass000.A00(3428), bool);
        A0a.A0E("revshare_ads_toggled_on", bool2);
        0Tu r2 = 0Tu.A05;
        A0a.A0H("include_e2ee_mentioned_user_list", 182.A06(r2, userSession2, 2342156773019224298L));
        if (bool3 != null) {
            if (bool3.booleanValue()) {
                str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str4 = "0";
            }
            A0a.A0G("video_subtitles_enabled", str4);
        }
        Boolean bool6 = bool4;
        if (bool4 != null) {
            A0a.A0E(AnonymousClass000.A00(1926), bool6);
        }
        Boolean bool7 = bool5;
        if (bool5 != null) {
            A0a.A0E(AnonymousClass000.A00(1845), bool7);
        }
        A0a.A9m("usertags", TagSerializer.A01(list3, list4, (List) null));
        A0a.A9m("fb_user_tags", TagSerializer.A01((List) null, list5, (List) null));
        if (((list6 != null && !list6.isEmpty()) || (list7 != null && !list7.isEmpty())) && ((r1.A0C.Aqj() != null && C271174i4.A04(userSession2, true)) || 182.A06(r2, userSession2, 36313012185269849L))) {
            if (list6 != null) {
                hashSet = 00k.A0V(list6);
            } else {
                hashSet = null;
            }
            if (list7 != null) {
                hashSet2 = 00k.A0V(list7);
            } else {
                hashSet2 = null;
            }
            A0a.A9m("coauthor_invites", TagSerializer.A02((Map) null, hashSet, hashSet2));
        }
        if (!0qQ.A0K(r1.A0C.BVF(), str5)) {
            if (str3 == null) {
                str5 = str6;
            }
            A0a.A9m("mv_link", str5);
        }
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod2 = mediaGenAIDetectionMethod;
        if (mediaGenAIDetectionMethod != null) {
            A0a.A9m("gen_ai_detection_method", mediaGenAIDetectionMethod2.A00);
        }
        try {
            String A002 = C63383Kw4.A00(venue);
            A0a.A9m("location", A002);
            if (venue != null && "facebook_events".equals(venue.A03())) {
                A0a.A9m("event", A002);
            }
        } catch (IOException e) {
            AnonymousClass7TF.A19(0wj.A01.AEf("ReelApiUtil.createEditMetadataTask", 817902720), DialogModule.KEY_MESSAGE, "IOException: UploadLocationSerializer getVenueAsJsonString", e);
        }
        LSV.A04(A0a, userSession2, list, list2, z);
        LSV.A03(A0a, brandedContentProjectMetadataIntf);
        LSV.A02(A0a, brandedContentGatingInfoIntf);
        if (musicOverlayStickerModel != null) {
            A0a.AA0("music_params", C59670JTa.A05(musicOverlayStickerModel));
        }
        AnonymousClass3QO r0 = r20;
        if (r20 != null) {
            A0a.A0G("audience", r0.A00);
        }
        if (r1.A0C.Aqj() != null && 182.A06(r2, userSession2, 36327391735331226L)) {
            A0a.A9m(AnonymousClass000.A00(657), "true");
        }
        if (juw != null) {
            try {
                str6 = LPS.A00(juw);
            } catch (IOException unused) {
                0wb.A03("ReelApiUtil.createEditMetadataTask", "IOException: IGBIOProductInfo serializeToJson");
            }
        }
        A0a.A9m("bio_product", str6);
        A0a.A0O((15p) null, C61290K1b.class, C64024LJl.class, false);
        return DbT.A0U(A0a, true);
    }
}
