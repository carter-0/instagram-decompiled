package X;

import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class S3K {
    public int A00 = 0;
    public long A01;
    public C13575Td0 A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07 = DbS.A0v(50);
    public UUID A08;

    public final String toString() {
        JSONObject A11 = DbS.A11();
        try {
            A11.put("seq", this.A00);
            A11.put("time", S9J.A00(this.A01));
            A11.putOpt("app_id", this.A03);
            A11.putOpt("app_ver", this.A04);
            A11.putOpt("build_num", this.A05);
            A11.putOpt(Q2M.A01(0, 9, 98), this.A02.get());
            A11.putOpt(Q2M.A00(), this.A08);
            A11.putOpt("uid", this.A06);
            List<SRO> list = this.A07;
            JSONArray A1E = Pxe.A1E();
            for (SRO A022 : list) {
                A1E.put(A022.A02());
            }
            A11.put("data", A1E);
            A11.put("log_type", "client_event");
            return A11.toString();
        } catch (JSONException e) {
            0KC.A0I("AnalyticsSession", "Failed to serialize", e);
            return "";
        }
    }
}
