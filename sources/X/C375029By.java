package X;

import org.json.JSONObject;

/* renamed from: X.9By  reason: invalid class name and case insensitive filesystem */
public final class C375029By extends 157 {
    public final int A00() {
        return 26;
    }

    public final AnonymousClass15J A02(JSONObject jSONObject, int i) {
        0qQ.A0B(jSONObject, 1);
        int optInt = jSONObject.optInt("priority");
        AnonymousClass15J r0 = new AnonymousClass15J();
        r0.A02 = optInt;
        return r0;
    }

    public final 14s A01(AnonymousClass15J r3, int i) {
        if (r3 != null) {
            return new C382159dF(r3.A02);
        }
        14q r1 = 14q.A00;
        0qQ.A0A(r1);
        return r1;
    }
}
