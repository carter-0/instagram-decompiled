package X;

import org.json.JSONObject;

/* renamed from: X.9Bi  reason: invalid class name and case insensitive filesystem */
public final class C374919Bi extends 157 {
    public final int A00() {
        return 9;
    }

    public final 14s A01(AnonymousClass15J r3, int i) {
        if (r3 == null) {
            return 14q.A00;
        }
        return new C382149dE(r3.A02);
    }

    public final AnonymousClass15J A02(JSONObject jSONObject, int i) {
        int optInt = jSONObject.optInt("priority");
        AnonymousClass15J r0 = new AnonymousClass15J();
        r0.A02 = optInt;
        return r0;
    }
}
