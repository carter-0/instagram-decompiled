package X;

import org.json.JSONObject;

/* renamed from: X.Sqj  reason: case insensitive filesystem */
public final class C12285Sqj implements C13585TdB {
    public final long A00;
    public final long A01;
    public final long A02;

    public C12285Sqj(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }

    public final JSONObject Ezz() {
        JSONObject A11 = DbS.A11();
        A11.put(C66579MXk.A00(676), this.A00);
        A11.put("free_space", this.A01);
        A11.put("total_space", this.A02);
        return A11;
    }
}
