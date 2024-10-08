package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.HashMap;

public abstract class SAZ {
    public static final C61076JwE A00(UserSession userSession, 1Xj r5) {
        HashMap A0r = Pxf.A0r(userSession, 1);
        String A07 = C231122qu.A07(userSession, r5);
        0qQ.A0A(A07);
        A0r.put("ad_id", A07);
        String A2v = r5.A2v();
        0qQ.A0A(A2v);
        A0r.put("tracking_token", A2v);
        String id = r5.getId();
        if (id != null) {
            A0r.put("media_id", id);
            return new C61076JwE("com.bloks.www.minishops.ad.collection", (Object) A0r, 15);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C61076JwE A01(UserSession userSession, 1Xj r11, AndroidLink androidLink, String str) {
        AnonymousClass7TG.A1N(userSession, r11);
        if (androidLink.Avj() == null) {
            return null;
        }
        String Avj = androidLink.Avj();
        if (Avj != null) {
            Uri A09 = DbT.A09(Avj);
            String queryParameter = A09.getQueryParameter("product_set_id");
            String queryParameter2 = A09.getQueryParameter("rich_doc_id");
            String queryParameter3 = A09.getQueryParameter("shopping_session_id");
            0qQ.A0A(queryParameter3);
            HashMap A1E = AnonymousClass7TE.A1E();
            String A07 = C231122qu.A07(userSession, r11);
            0qQ.A0A(A07);
            A1E.put("ad_id", A07);
            String A2v = r11.A2v();
            0qQ.A0A(A2v);
            A1E.put("tracking_token", A2v);
            String id = r11.getId();
            if (id != null) {
                A1E.put("media_id", id);
                A1E.put("shopping_session_id", queryParameter3);
                if (str != null) {
                    A1E.put("prior_module", str);
                }
                if (queryParameter != null) {
                    A1E.put("product_set_id", queryParameter);
                }
                if (queryParameter2 != null) {
                    A1E.put("rich_doc_id", queryParameter2);
                }
                String A0c = JTQ.A0c(AnonymousClass7TF.A0w(AnonymousClass000.A00(187), A1E));
                0qQ.A07(A0c);
                return new C61076JwE("com.bloks.www.minishops.ad.dynamic.shop.collection", (Object) DbY.A0m("params", A0c), 15);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
