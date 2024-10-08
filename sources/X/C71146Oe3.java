package X;

import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Oe3  reason: case insensitive filesystem */
public abstract class C71146Oe3 {
    public static final 1NY A00(UserSession userSession, O5M o5m, N2J n2j, DirectThreadKey directThreadKey, JSONObject jSONObject) {
        0qQ.A0B(directThreadKey, 1);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("direct_v2/threads/broadcast/generic_share/");
        A09(A0a, directThreadKey);
        String str = n2j.A01;
        String str2 = n2j.A02;
        boolean z = n2j.A04;
        A05(A0a, n2j.A00, str, str2, n2j.A03, (String) null, z, n2j.A06, n2j.A05);
        A06(A0a, o5m, jSONObject);
        return A0a;
    }

    public static final List A02(List list) {
        0qQ.A0B(list, 0);
        List A0X = 00k.A0X(list);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0X) {
            String str = (String) next;
            if (C51966G9m.A1X(str) && !0qQ.A0K(str, "0")) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    @Deprecated(message = "Please use addThreadKeyParams and addSendItemParams instead.")
    public static final void A04(1NY r1, C70621ODs oDs, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(directThreadKey, 1);
        A09(r1, directThreadKey);
        A05(r1, oDs, str, str2, str3, str4, z, z2, z3);
    }

    public static final void A07(1NY r4, List list) {
        0qQ.A0B(list, 0);
        List A0X = 00k.A0X(list);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0X) {
            DbV.A1U(next, A1C, 00l.A0W((String) next) ? 1 : 0);
        }
        if (AnonymousClass7TE.A1b(A1C)) {
            r4.A9m("meta_gallery_media_ids", A01(A1C));
        }
    }

    public static final void A08(1NY r7, List list) {
        boolean z;
        ArrayList A0q = AnonymousClass7TF.A0q(list, 1);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            MediaUploadMetadata mediaUploadMetadata = (MediaUploadMetadata) next;
            String str = mediaUploadMetadata.A08;
            if (str != null && !00l.A0W(str)) {
                JSONObject A11 = DbS.A11();
                A11.put("attachment_index", i);
                A11.put(C273654mx.A00(817), mediaUploadMetadata.A08);
                ImmersiveMediaFields immersiveMediaFields = mediaUploadMetadata.A00;
                if (immersiveMediaFields != null) {
                    z = immersiveMediaFields.A01;
                } else {
                    z = false;
                }
                A11.put("is_3d", z);
                A0q.add(A11);
            }
            i = i2;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = A0q.iterator();
        while (it.hasNext()) {
            DbT.A1W(it, jSONArray);
        }
        r7.A9m("meta_gallery_media_info", jSONArray.toString());
    }

    public static String A01(Iterable iterable) {
        return 002.A0E(C239023El.A00(',').A02(iterable), '[', ']');
    }

    public static final void A03(1NY r5, C70621ODs oDs) {
        if (oDs != null) {
            Long l = oDs.A01;
            if (l != null) {
                long longValue = l.longValue();
                if (longValue > 0) {
                    r5.A0D("ephemeral_duration_sec", longValue);
                }
            }
            Long l2 = oDs.A02;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (longValue2 >= 0) {
                    r5.A0D("ephemeral_view_duration_sec", longValue2);
                }
            }
        }
    }

    @Deprecated(message = "Please use SendItemParams instead.", replaceWith = @ReplaceWith(expression = "sendItemParams(threadKey, params)", imports = {}))
    public static final void A05(1NY r2, C70621ODs oDs, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        r2.A9m("offline_threading_id", str);
        r2.A9m("client_context", str);
        r2.A9m("action", "send_item");
        String A00 = 0qv.A00(C60960kU.A00);
        0qQ.A07(A00);
        r2.A9m(C66955Mfo.A01(), A00);
        if (str2 != null) {
            r2.A9m("mutation_token", str2);
        }
        if (str3 != null) {
            r2.A9m("send_attribution", str3);
        }
        if (z) {
            r2.A9m("sampled", "true");
        }
        if (z3) {
            r2.A9m("send_silently", "true");
        }
        1QJ r0 = AnonymousClass1QI.A00;
        0qQ.A07(r0);
        String str5 = r0.A02.A02;
        if (str5 != null) {
            r2.A9m("nav_chain", str5);
        }
        if (str4 != null && str4.length() > 0) {
            r2.A9m("ad_id", str4);
        }
        A03(r2, oDs);
        r2.A0I("is_shh_mode", z2);
    }

    @Deprecated(message = "Please  use createGenericShareBuilder instead.")
    public static final void A06(1NY r2, O5M o5m, JSONObject jSONObject) {
        String str;
        int i;
        boolean z = o5m instanceof C68896NaY;
        if (z) {
            str = "share_type";
        } else {
            str = "embedded_ent_type";
        }
        if (z) {
            i = ((C68896NaY) o5m).A00;
        } else if (o5m instanceof C68895NaX) {
            i = ((C68895NaX) o5m).A00;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r2.A0C(str, i);
        r2.A9m("json_params", jSONObject.toString());
    }

    public static final void A09(1NY r5, DirectThreadKey... directThreadKeyArr) {
        ArrayList<DirectThreadKey> A1C = AnonymousClass7TE.A1C();
        ArrayList<DirectThreadKey> A1C2 = AnonymousClass7TE.A1C();
        DirectThreadKey directThreadKey = directThreadKeyArr[0];
        if (directThreadKey.A00 != null) {
            A1C.add(directThreadKey);
        } else {
            A1C2.add(directThreadKey);
        }
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        for (DirectThreadKey directThreadKey2 : A1C) {
            String str = directThreadKey2.A00;
            if (str != null) {
                A1C3.add(str);
            }
        }
        ArrayList<Iterable> A1C4 = AnonymousClass7TE.A1C();
        for (DirectThreadKey directThreadKey3 : A1C2) {
            List list = directThreadKey3.A02;
            if (list != null) {
                A1C4.add(list);
            }
        }
        if (AnonymousClass7TE.A1b(A1C3)) {
            r5.A9m("thread_ids", A01(A1C3));
        }
        if (AnonymousClass7TE.A1b(A1C4)) {
            ArrayList A0r = AnonymousClass7TG.A0r(A1C4);
            for (Iterable A01 : A1C4) {
                A0r.add(A01(A01));
            }
            r5.A9m("recipient_users", A01(A0r));
        }
    }
}
