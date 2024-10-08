package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.S1w  reason: case insensitive filesystem */
public final class C10940S1w {
    public final REA A00;
    public final C10689RwT A01;
    public final List A02;

    public C10940S1w(REA rea, C10689RwT rwT, List list) {
        AnonymousClass7TG.A1Q(rea, list);
        this.A01 = rwT;
        this.A00 = rea;
        this.A02 = list;
    }

    public final String toString() {
        try {
            JSONObject A11 = DbS.A11();
            C10689RwT rwT = this.A01;
            JSONObject A112 = DbS.A11();
            A112.put("startResponse", rwT.A01.A00);
            A112.put("endResponse", rwT.A00.A00);
            JSONArray A1E = Pxe.A1E();
            Iterator A0u = AnonymousClass7TF.A0u(rwT.A02);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                JSONObject A113 = DbS.A11();
                A113.put("segment", ((C11284SJc) A1J.getKey()).A00());
                A113.put("uploadResult", ((C11286SJe) A1J.getValue()).A00());
                A1E.put(A113);
            }
            A112.put("transferResults", A1E);
            A112.putOpt("creativeToolsCommand", (Object) null);
            A112.put("isEdited", rwT.A03);
            A11.put("uploadProtocolResponses", A112);
            A11.put("uploadMode", this.A00.name());
            List list = this.A02;
            JSONArray A1E2 = Pxe.A1E();
            for (Object next : list) {
                if (next instanceof SRW) {
                    A1E2.put(((SRW) next).A02());
                }
            }
            A11.put("transcodeResults", A1E2);
            return DbT.A10(A11);
        } catch (JSONException unused) {
            return super.toString();
        }
    }
}
