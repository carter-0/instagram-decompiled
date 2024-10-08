package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.KWs  reason: case insensitive filesystem */
public final class C62036KWs extends C252733pa {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C73899Pla(this, 21));

    public static final String A00(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C254703su r0 = (C254703su) it.next();
            String A002 = AnonymousClass79U.A00(r0);
            if (A002 != null) {
                LinkedHashMap A0p = DbY.A0p("content", A002, AnonymousClass7TE.A1L("item_id", r0.A0h()));
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                Iterator A0s = AnonymousClass7TF.A0s(A0p);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    if (A1J.getValue() != null) {
                        Dbb.A1V(A1J, A1H);
                    }
                }
                jSONArray.put(new JSONObject(A1H));
            }
        }
        return DbT.A10(jSONArray);
    }

    public C62036KWs(UserSession userSession) {
        super("DirectTranslationService", AnonymousClass43D.A00(1790817603));
        this.A00 = userSession;
    }
}
