package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class I6U {
    public static final void A04(UserSession userSession, 1Xj r7, AnonymousClass4DU r8, String str, int i) {
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(userSession, r7);
        0xI A00 = A00(userSession2, r7, r8, "instagram_save_collections_init", (String) null, str);
        A00.A08(Integer.valueOf(i), "position");
        DbU.A1R(A00, userSession2);
    }

    public static final 0xI A00(UserSession userSession, 1Xj r5, AnonymousClass4DU r6, String str, String str2, String str3) {
        0xI A00 = 0xI.A00(r6, str);
        A00.A0C("navigation_type", str3);
        if (r5 != null) {
            User A2A = r5.A2A(userSession);
            A00.A08(Integer.valueOf(r5.BR7().A00), "m_t");
            A00.A0C("m_pk", r5.getId());
            if (A2A != null) {
                A00.A0C("a_pk", A2A.getId());
            }
            if (r5.A3K(true) != null) {
                ArrayList A3K = r5.A3K(true);
                0qQ.A0A(A3K);
                if (!A3K.isEmpty()) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    ArrayList A3K2 = r5.A3K(true);
                    0qQ.A0A(A3K2);
                    Iterator A1G = AnonymousClass7TE.A1G(A3K2);
                    while (A1G.hasNext()) {
                        A1C.add(((Product) AnonymousClass7TF.A0a(A1G)).A0H);
                    }
                    A00.A0D("product_ids", A1C);
                }
            }
        }
        if (str2 != null) {
            A00.A07(C52240GKh.A00, str2);
        }
        return A00;
    }

    public static final void A01(Activity activity, UserSession userSession, 1Xj r4, AnonymousClass4DU r5, C249763kK r6, Integer num, String str, int i, int i2) {
        String str2;
        C51974G9v.A1M(userSession, num, str);
        if (!r4.CcK()) {
            if (num == AnonymousClass05K.A00) {
                str2 = "add_to_collection";
            } else {
                str2 = "remove_from_collection";
            }
            C254523sc A04 = C254513sb.A04(r4, r5, str2);
            A05(A04, num, str);
            A04.A0G(userSession, r4);
            A04.A09(i);
            A04.A4n = "private";
            A04.A65 = DbS.A0k();
            if (!AnonymousClass3WX.A02(r4, r5)) {
                A04.A0C(activity, userSession);
                if (r6 != null) {
                    A04.A6t = r6.getSessionId();
                }
            }
            C233822wX.A0E(userSession, A04, r4, r5, i2);
        }
    }

    public static final void A02(AnonymousClass0iw r5, UserSession userSession, 1Xj r7, SavedCollection savedCollection, String str, int i, int i2) {
        String A01 = C320166rs.A01(i, i2);
        User A2A = r7.A2A(userSession);
        0xI A012 = 0xI.A01(str, r5.getModuleName());
        A012.A08(Integer.valueOf(r7.BR7().A00), "m_t");
        A012.A0C("m_pk", r7.getId());
        A012.A0C("algorithm", r7.A0C.getAlgorithm());
        A012.A0C("position", A01);
        if (A2A != null) {
            A012.A0C("a_pk", A2A.getId());
        }
        A012.A07(C52240GKh.A00, savedCollection.A0F);
        A012.A07(C52240GKh.A01, savedCollection.A0G);
        DbU.A1R(A012, userSession);
    }

    public static final void A03(AnonymousClass0iw r2, UserSession userSession, SavedCollection savedCollection, String str, int i) {
        AnonymousClass7TG.A1T(r2, userSession, savedCollection);
        0xI A00 = 0xI.A00(r2, "instagram_save_collection_created");
        A00.A07(C52240GKh.A00, savedCollection.A0F);
        A00.A07(C52240GKh.A01, savedCollection.A0G);
        A00.A08(Integer.valueOf(i), "prev_num_collections");
        if (str != null) {
            A00.A0C("navigation_type", str);
        }
        DbU.A1R(A00, userSession);
    }

    public static final void A05(C254523sc r2, Integer num, String str) {
        if (num.intValue() != 0) {
            r2.A7y = AnonymousClass7TE.A1I(str);
        } else {
            r2.A7j = AnonymousClass7TE.A1I(str);
        }
    }
}
