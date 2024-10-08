package X;

import org.json.JSONObject;

/* renamed from: X.OLb  reason: case insensitive filesystem */
public final class C70781OLb {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C70781OLb(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        0qQ.A0B(str4, 6);
        this.A00 = str;
        this.A01 = str2;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final JSONObject A00() {
        JSONObject A11 = DbS.A11();
        A11.put("contact_id", this.A00);
        A11.put("is_group", this.A05);
        A11.put("contact_name", this.A01);
        A11.put("is_e2ee_thread", this.A04);
        A11.put("ig_handle", this.A02);
        A11.put(C66955Mfo.A02(9, 8, 99), this.A03);
        A11.put("CALL_RANK", Integer.MAX_VALUE);
        A11.put("MESSAGE_RANK", Integer.MAX_VALUE);
        return A11;
    }
}
