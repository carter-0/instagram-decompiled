package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.HxN  reason: case insensitive filesystem */
public abstract class C56369HxN {
    public static final 1OC A00(ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, UserSession userSession) {
        String str;
        boolean A1b = C51973G9u.A1b(userSession, instagramMidcardType, clipsMidCardSubtype);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/mid_cards/");
        A0a.A0C("start_position", 0);
        A0a.A0C("end_position", A1b ? 1 : 0);
        A0a.A9m("ads_position", new JSONArray().toString());
        A0a.A0G("moment_ids", new JSONArray().toString());
        A0a.A9m("mid_card_type", instagramMidcardType.A00);
        if (clipsMidCardSubtype != ClipsMidCardSubtype.A0v) {
            String str2 = clipsMidCardSubtype.A00;
            if (str2 == null || 00p.A0k(str2, "acr", false) != A1b) {
                str = "mid_card_subtype";
            } else {
                str = AnonymousClass000.A00(237);
            }
            A0a.A0G(str, str2);
        }
        return DbU.A0S(A0a, B5G.class, B5F.class);
    }

    public static final 1OC A01(C53332GmI gmI, UserSession userSession) {
        1NY A0a;
        String str;
        String str2;
        String str3;
        String str4;
        List<C276014sL> list;
        AnonymousClass7TG.A1N(userSession, gmI);
        C53452Gok gok = gmI.A06;
        if (gok != null) {
            str3 = gok.A09;
            A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("clips/write_mid_card_seen_state_v2/");
            str4 = "impression_token";
        } else {
            InstagramMidcardType instagramMidcardType = gmI.A05;
            ArrayList arrayList = null;
            A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("clips/write_mid_card_seen_state/");
            A0a.A9m("mid_card_type", instagramMidcardType.A00);
            int ordinal = instagramMidcardType.ordinal();
            String A00 = AnonymousClass000.A00(237);
            String str5 = "";
            String A002 = C273654mx.A00(160);
            if (ordinal == 33) {
                A0a.A9m(A002, C51970G9q.A0k(0sn.A00));
                String str6 = gmI.A0C;
                if (str6 != null) {
                    str5 = str6;
                }
                str = C51970G9q.A0k(AnonymousClass7TE.A1I(str5));
                str2 = "story_midcard_impressions";
            } else if (ordinal == 12) {
                String str7 = gmI.A0C;
                if (str7 != null) {
                    str5 = str7;
                }
                List A1I = AnonymousClass7TE.A1I(str5);
                A0a.A9m(A002, C51970G9q.A0k(A1I));
                str = C51970G9q.A0k(A1I);
                str2 = "feed_collection_mid_card_impressions";
            } else if (ordinal == 28 || ordinal != 37) {
                A0a.A9m(A002, C51970G9q.A0k(AnonymousClass7TE.A1I(gmI.A0D)));
                A0a.A0Q(1XP.class, 1XY.class);
                return A0a.A0M();
            } else {
                A0a.A9m(A002, C51970G9q.A0k(0sn.A00));
                C42110BHo bHo = gmI.A08;
                if (!(bHo == null || (list = bHo.A01) == null)) {
                    arrayList = AnonymousClass7TG.A0r(list);
                    for (C276014sL r0 : list) {
                        String A2n = r0.A00.A2n();
                        if (A2n != null) {
                            arrayList.add(A2n);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                }
                A0a.A9m("template_mid_card_impressions", C51970G9q.A0k(arrayList));
                ClipsMidCardSubtype clipsMidCardSubtype = gmI.A04;
                if (clipsMidCardSubtype != ClipsMidCardSubtype.A0v) {
                    str3 = clipsMidCardSubtype.A00;
                    str4 = "template_mid_card_category";
                }
                A0a.A0Q(1XP.class, 1XY.class);
                return A0a.A0M();
            }
            A0a.A9m(str2, str);
            ClipsMidCardSubtype clipsMidCardSubtype2 = gmI.A04;
            if (clipsMidCardSubtype2 != ClipsMidCardSubtype.A0v) {
                A0a.A9m(A00, clipsMidCardSubtype2.A00);
            }
            A0a.A0Q(1XP.class, 1XY.class);
            return A0a.A0M();
        }
        A0a.A9m(str4, str3);
        A0a.A0Q(1XP.class, 1XY.class);
        return A0a.A0M();
    }
}
