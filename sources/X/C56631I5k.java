package X;

import android.util.JsonWriter;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.MediaType;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;

/* renamed from: X.I5k  reason: case insensitive filesystem */
public abstract class C56631I5k {
    public static final 1OC A00(UserSession userSession, C247733gp r11, 1Xj r12, String str, String str2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3;
        Integer num;
        String str4;
        String str5;
        String str6;
        String str7;
        C46300DUd Bmy;
        AnonymousClass7TF.A1C(r11, 0, userSession);
        String str8 = r11.A0d;
        String str9 = r11.A0G;
        boolean A1U = AnonymousClass7TF.A1U(0, str8, str9);
        Matcher A09 = 0mp.A09(str8);
        ArrayList A1C = AnonymousClass7TE.A1C();
        while (A09.find()) {
            String group = A09.group(A1U ? 1 : 0);
            if (group != null) {
                A1C.add(00p.A0g(group, "@", "", false));
            }
        }
        C354958Oa A00 = AnonymousClass8OY.A00(userSession);
        if (DbT.A1b(A1C)) {
            A00.A01(str9, A1C);
        }
        String str10 = null;
        if (r12 != null) {
            str3 = C51965G9l.A0t(r12);
            num = r12.A2L();
        } else {
            str3 = null;
            num = AnonymousClass05K.A0C;
        }
        String A0k = DbS.A0k();
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        DbU.A1P(A0a, "media/%s/comment/", new Object[]{r11.A0E});
        A0a.A0O((15p) null, C54071Gyu.class, C56324Hwb.class, false);
        A0a.A9m("comment_text", str8);
        A0a.A9m(AnonymousClass000.A00(300), r11.A00());
        C51968G9o.A1L(A0a, AnonymousClass000.A00(1916), C11155SCk.A00(r11.A04, str8.length(), r11.A00), str);
        A0a.A9m("radio_type", str2);
        A0a.A9m("replied_to_comment_id", r11.A0c);
        A0a.A0H("is_carousel_bumped_post", z);
        A0a.A0G("inventory_source", str3);
        A0a.A0G("nav_chain", A0k);
        A0a.A0H(AnonymousClass000.A00(1512), z3);
        A0a.A0H(AnonymousClass000.A00(3445), z4);
        if (i != -1) {
            A0a.A9m("feed_position", String.valueOf(i));
        }
        int i4 = i2;
        if (i4 != -1) {
            A0a.A9m("carousel_index", String.valueOf(i4));
        }
        int i5 = i3;
        if (i5 != -1) {
            A0a.A9m("recs_ix", String.valueOf(i5));
        }
        C51973G9u.A1B(A0a, num);
        1Xj r0 = r11.A07;
        if (r0 != null) {
            str4 = DbT.A0x(r0);
        } else {
            str4 = null;
        }
        A0a.A0G("logging_info_token", str4);
        1Xj r02 = r11.A07;
        if (r02 == null || (Bmy = r02.A0C.Bmy()) == null) {
            str5 = null;
        } else {
            str5 = Bmy.Bmx();
        }
        A0a.A0G("repost_id", str5);
        if (r12 != null && r12.CcK() == A1U) {
            A0a.A0G("tracking_token", r12.A2v());
        }
        CommentGiphyMediaInfoIntf commentGiphyMediaInfoIntf = r11.A0T;
        if (commentGiphyMediaInfoIntf != null) {
            String B9F = commentGiphyMediaInfoIntf.B9F();
            Boolean CcU = commentGiphyMediaInfoIntf.CcU();
            str6 = null;
            if (!(B9F == null || CcU == null)) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    JsonWriter A092 = G9w.A09(stringWriter, CcU, B9F);
                    if (A092 != null) {
                        A092.close();
                        str6 = stringWriter.toString();
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } catch (IOException | NullPointerException e) {
                    0wb.A07("CommentApiUtil", e);
                }
            }
        } else {
            str6 = null;
        }
        A0a.A0G("gif_params", str6);
        AnonymousClass571 r9 = r11.A05;
        if (r9 != null) {
            String str11 = r9.A05;
            String str12 = r9.A06;
            MediaType mediaType = r9.A00;
            Integer num2 = r9.A01;
            if (!(mediaType == null || str11 == null || str12 == null || num2 == null)) {
                try {
                    StringWriter stringWriter2 = new StringWriter();
                    JsonWriter A08 = G9w.A08(mediaType, r9, stringWriter2, str11, str12);
                    if (1 - num2.intValue() != 0) {
                        str7 = "COMMENTS_CONTEXTUAL_RECOMMENDATION";
                    } else {
                        str7 = "COMMENTS";
                    }
                    JsonWriter endObject = A08.value(str7).endObject();
                    if (endObject != null) {
                        endObject.close();
                        str10 = stringWriter2.toString();
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } catch (IOException | NullPointerException e2) {
                    0wb.A07("CommentApiUtil", e2);
                }
            }
        }
        A0a.A0G("avatar_params", str10);
        if (182.A06(0Tu.A05, userSession, 36323328696396889L)) {
            A0a.A9m("include_carousel_child_mentions", "true");
            A0a.A0H(AnonymousClass000.A00(674), z2);
        }
        List list = r11.A0H;
        if (list != null) {
            A0a.A0G(AnonymousClass000.A00(541), String.valueOf(list));
        }
        A0a.A9m("comment_creation_key", r11.A0G);
        A0a.A9m(C66579MXk.A00(338), "true");
        A0a.A9m("include_media_code", "true");
        return DbT.A0U(A0a, A1U);
    }

    public static final 1OC A01(UserSession userSession, 1Xj r9, String str, String str2, int i, int i2, boolean z, boolean z2) {
        String str3;
        Integer num;
        AnonymousClass7TF.A1B(userSession, 0, str);
        if (r9 != null) {
            str3 = C51965G9l.A0t(r9);
            num = r9.A2L();
        } else {
            str3 = null;
            num = AnonymousClass05K.A0C;
        }
        String A0k = DbS.A0k();
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("media/%s/comment_like/", new Object[]{str});
        A0a.A0O((15p) null, C54063Gym.class, C56323Hwa.class, false);
        A0a.A0H("is_carousel_bumped_post", z);
        A0a.A0G("nav_chain", A0k);
        A0a.A0H("is_feed_preview_comment", z2);
        A0a.A9m("is_reply_highlight", "false");
        if (str2 != null) {
            C51965G9l.A1S(A0a, str2);
        }
        if (str3 != null) {
            A0a.A9m("inventory_source", str3);
        }
        if (r9 != null) {
            A0a.A9m("ranking_info_token", DbT.A0x(r9));
        }
        if (i != -1) {
            A0a.A9m("feed_position", String.valueOf(i));
        }
        if (i2 != -1) {
            A0a.A9m("carousel_index", String.valueOf(i2));
        }
        C51973G9u.A1B(A0a, num);
        if (r9 != null && r9.CcK()) {
            A0a.A0G("tracking_token", r9.A2v());
        }
        return DbT.A0U(A0a, true);
    }

    public static final 1OC A02(UserSession userSession, 1Xj r9, String str, String str2, int i, int i2, boolean z, boolean z2) {
        String str3;
        Integer num;
        AnonymousClass7TF.A1B(userSession, 0, str);
        if (r9 != null) {
            str3 = C51965G9l.A0t(r9);
            num = r9.A2L();
        } else {
            str3 = null;
            num = AnonymousClass05K.A0C;
        }
        String A0k = DbS.A0k();
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("media/%s/comment_unlike/", new Object[]{str});
        A0a.A0O((15p) null, C54063Gym.class, C56323Hwa.class, false);
        A0a.A0H("is_carousel_bumped_post", z);
        A0a.A0G("nav_chain", A0k);
        A0a.A0H("is_feed_preview_comment", z2);
        A0a.A9m("is_reply_highlight", "false");
        if (str2 != null) {
            C51965G9l.A1S(A0a, str2);
        }
        if (str3 != null) {
            A0a.A9m("inventory_source", str3);
        }
        if (i != -1) {
            String valueOf = String.valueOf(i);
            A0a.A9m("feed_position", valueOf);
            A0a.A9m("m_ix", valueOf);
        }
        if (i2 != -1) {
            A0a.A9m("carousel_index", String.valueOf(i2));
        }
        C51973G9u.A1B(A0a, num);
        if (r9 != null && r9.CcK()) {
            A0a.A0G("tracking_token", r9.A2v());
        }
        return DbT.A0U(A0a, true);
    }

    public static final 1OC A03(UserSession userSession, String str, String str2, Set set) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("media/%s/comment/bulk_delete/", new Object[]{str});
        A0a.A0Q(C54049GyY.class, C56208Hub.class);
        C51968G9o.A1L(A0a, "comment_ids_to_delete", C239023El.A00(',').A02(set), str2);
        return DbT.A0U(A0a, true);
    }

    public static final void A04(C54063Gym gym, String str) {
        String str2;
        String str3;
        String str4;
        0qQ.A0B(str, 1);
        HashMap A1E = AnonymousClass7TE.A1E();
        String str5 = "";
        if (gym == null || (str2 = Integer.valueOf(gym.mStatusCode).toString()) == null) {
            str2 = str5;
        }
        A1E.put(TraceFieldType.ErrorCode, str2);
        if (gym == null || (str3 = gym.A00) == null) {
            str3 = "comment_like_client_error";
        }
        A1E.put("error_key", str3);
        if (!(gym == null || (str4 = gym.A00) == null)) {
            str5 = str4;
        }
        A1E.put("error_message", str5);
        A1E.put("c_pk", str);
        ((C64901Yc) HWC.A00()).A00 = new ODK("latest_comment_like_error", A1E);
    }
}
