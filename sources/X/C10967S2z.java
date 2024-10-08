package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.S2z  reason: case insensitive filesystem */
public final class C10967S2z {
    public int A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";

    public final String toString() {
        try {
            JSONObject A11 = DbS.A11();
            A11.putOpt("ck", this.A01);
            A11.putOpt("cs", this.A02);
            A11.putOpt("di", this.A03);
            A11.putOpt("ds", this.A04);
            A11.put("sr", this.A00);
            A11.putOpt("rc", this.A05);
            return A11.toString();
        } catch (JSONException e) {
            0KC.A0I("ConnAckPayload", C66579MXk.A00(839), e);
            return "";
        }
    }
}
