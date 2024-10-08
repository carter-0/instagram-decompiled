package X;

import android.graphics.PointF;
import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public abstract class LTQ {
    public static final Pair A00(List list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return new Pair(0, 0);
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((MediaSuggestedProductTag) it.next()).A01 == C62565Khv.AUTO_TAG) {
                i++;
            } else {
                i2++;
            }
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static final void A09(AnonymousClass0iw r8, UserSession userSession, String str, String str2, List list) {
        AbstractCollection abstractCollection;
        0qQ.A0B(list, 4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), AnonymousClass000.A00(1440));
        HashMap A1E = AnonymousClass7TE.A1E();
        if (!(list instanceof ArrayList) || (abstractCollection = (AbstractCollection) list) == null) {
            abstractCollection = AnonymousClass7TE.A1C();
        }
        if (DbT.A1b(abstractCollection)) {
            A1E.put(A01(userSession.A06, str2), abstractCollection);
        }
        JSONObject jSONObject = new JSONObject(0Yt.A0B(A1E));
        String str3 = userSession.A06;
        A06(A0e, str3, str);
        JTQ.A17(A0e, false);
        A0e.A9F(AnonymousClass000.A00(1366), 0L);
        A0e.A9F(AnonymousClass000.A00(1367), DbS.A0j(list.size()));
        JTU.A11(A0e, AnonymousClass000.A00(1368), jSONObject.toString(), str, str3);
        A0e.AAJ("media_format", "reels");
        A0e.Cgf();
    }

    public static final void A0A(AnonymousClass0iw r6, UserSession userSession, String str, String str2, boolean z) {
        DbY.A1S(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(C51972G9s.A0a(r6, userSession), "ig_suggested_tags_add_media_listener");
        String str3 = userSession.A06;
        JTU.A11(A0e, "upload_key", A01(str3, str2), str, str3);
        A0e.A9F(TraceFieldType.Duration, 0L);
        JTQ.A17(A0e, z);
        A0e.Cgf();
    }

    public static final String A01(String str, String str2) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (str2 != null) {
            A1A.append(str);
            A1A.append('_');
            A1A.append(str2);
        }
        return DbT.A10(A1A);
    }

    public static final HashMap A02(List list) {
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductTag productTag = (ProductTag) it.next();
            String str = JTO.A0q(productTag).A0H;
            PointF pointF = productTag.A00;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            if (pointF != null) {
                A1A.append(pointF.x);
                A1A.append(", ");
                A1A.append(pointF.y);
            }
            A1E.put(str, DbT.A10(A1A));
        }
        return A1E;
    }

    public static final HashMap A03(List list) {
        int i;
        int i2;
        HashMap A1E = AnonymousClass7TE.A1E();
        int i3 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it.next();
                if (mediaSuggestedProductTag.A01 == C62565Khv.AUTO_TAG) {
                    i3++;
                } else if (mediaSuggestedProductTag.A09()) {
                    i++;
                } else {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        A1E.put("high_confidence_count", Integer.valueOf(i3));
        A1E.put("medium_confidence_count", Integer.valueOf(i));
        A1E.put("low_confidence_count", Integer.valueOf(i2));
        return A1E;
    }

    public static final void A04(PointF pointF, C60762Jqt jqt, AnonymousClass0iw r6, UserSession userSession, C62565Khv khv, Float f, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        Long l;
        AnonymousClass7TG.A1T(userSession, r6, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "ig_suggested_tags_tag_action");
        String str8 = userSession.A06;
        A06(A0e, str8, str);
        JTU.A11(A0e, "tag_action_type", str2, str, str8);
        A0e.AAJ("user_tag_type", str7);
        JTQ.A17(A0e, z);
        C51970G9q.A19(A0e, (long) i);
        A0e.AAJ("tag_mode", khv.A00);
        A0e.AAJ("original_suggested_product_id", str3);
        A0e.AAJ(AnonymousClass000.A00(1795), str4);
        Double d = null;
        if (num != null) {
            l = C51969G9p.A0r(num);
        } else {
            l = null;
        }
        A0e.A9F("selected_product_id_rank", l);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (pointF != null) {
            A1A.append(pointF.x);
            A1A.append(", ");
            A1A.append(pointF.y);
        }
        A0e.AAJ("original_coordinates", DbT.A10(A1A));
        if (f != null) {
            d = Double.valueOf((double) f.floatValue());
        }
        A0e.A8D("confidence_level", d);
        A0e.AAK(jqt, "suggested_tags_info");
        A0e.AAJ("media_format", str6);
        A0e.AAJ("prior_submodule", str5);
        A0e.Cgf();
    }

    public static final void A05(Pair pair, C60762Jqt jqt, AnonymousClass0iw r6, UserSession userSession, String str, int i, boolean z, boolean z2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "ig_suggested_tags_view_cta");
        String str2 = userSession.A06;
        JTU.A11(A0e, "upload_key", A01(str2, str), str, str2);
        JTQ.A17(A0e, z);
        A0e.A9F("high_confidence_suggestions_count", C51969G9p.A0r((Number) pair.first));
        A0e.A9F("low_confidence_suggestions_count", C51969G9p.A0r((Number) pair.second));
        A0e.AAK(jqt, "suggested_tags_info");
        A0e.A7p("is_suggestion_row_shown", Boolean.valueOf(z2));
        A0e.A9F("suggestion_row_product_count", DbS.A0j(i));
        A0e.Cgf();
    }

    public static void A06(0Aj r2, String str, String str2) {
        r2.AAJ("upload_key", A01(str, str2));
    }

    public static final void A07(AnonymousClass0iw r2, UserSession userSession, Float f, String str, String str2, String str3, String str4, String str5, int i) {
        Double d;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "ig_suggested_tags_product_suggestion_cell_tap");
        if (A0e.isSampled()) {
            String str6 = userSession.A06;
            JTU.A11(A0e, "upload_key", A01(str6, str), str, str6);
            A0e.AAJ(AnonymousClass000.A00(1795), str2);
            A0e.A9F("suggestion_row_index", DbV.A0p(A0e, "merchant_id", str3, i));
            if (f != null) {
                d = Double.valueOf((double) f.floatValue());
            } else {
                d = null;
            }
            A0e.A8D("confidence_level", d);
            A0e.AAJ("media_format", str4);
            A0e.AAJ("user_tag_type", str5);
            A0e.Cgf();
        }
    }

    public static final void A08(AnonymousClass0iw r3, UserSession userSession, String str, String str2, long j, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(C51972G9s.A0a(r3, userSession), "ig_suggested_tags_request_error");
        String str3 = userSession.A06;
        JTU.A11(A0e, "upload_key", A01(str3, str), str, str3);
        A0e.A9F(TraceFieldType.Duration, Long.valueOf(j));
        JTQ.A17(A0e, z);
        Long A0m = C51971G9r.A0m();
        A0e.A9F("high_confidence_suggestions_count", A0m);
        A0e.A9F("low_confidence_suggestions_count", A0m);
        A0e.AAJ("error_message", str2);
        A0e.Cgf();
    }
}
