package X;

import org.json.JSONObject;

/* renamed from: X.QdV  reason: case insensitive filesystem */
public final class C7937QdV extends S1t implements C13585TdB {
    public C7937QdV(S1t s1t) {
        super(s1t.A00, s1t.A02, s1t.A01);
    }

    public final JSONObject Ezz() {
        JSONObject A11 = DbS.A11();
        A11.put("bytes", this.A00);
        A11.put("ondisk", this.A02);
        A11.put("entries", this.A01);
        return A11;
    }
}
