package X;

import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Ee3  reason: case insensitive filesystem */
public abstract class C48408Ee3 {
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.F0A] */
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        C307786Rm r0;
        List list = r9.A00;
        if (list.size() >= 1) {
            String A0g = DbY.A0g(r9);
            if (list.get(1) == null) {
                r0 = C308206Td.A09(r8);
            } else {
                r0 = (C307786Rm) Dba.A0V(r9, 1);
            }
            JSONObject jSONObject = new JSONObject(A0g);
            JSONObject jSONObject2 = jSONObject.getJSONObject("error").getJSONObject("error_data");
            String string = jSONObject2.getString("api_path");
            AnonymousClass0aP A0A = C308206Td.A0A(r0);
            String string2 = jSONObject2.getString("challenge_context");
            ? obj = new Object();
            obj.A00 = string;
            obj.A01 = string2;
            String string3 = jSONObject.getJSONObject("error").getString("uid");
            0tS A0h = DbT.A0h();
            if (A0h.A09().contains(string3)) {
                A0h.A0H(094.A03(string3, A0h.A09()));
            }
            F5E.A00(A0A).A02(A0A.A00.A06(), obj);
        }
        return null;
    }
}
