package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class S6G {
    public RQZ A00;
    public List A01;
    public final String A02;
    public final long A03 = System.currentTimeMillis();

    public final String A00() {
        List list = this.A01;
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1A.append(AnonymousClass7TE.A18(it));
            A1A.append("_");
        }
        A1A.setLength(A1A.length() - 1);
        return A1A.toString();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.RQZ] */
    public S6G(String str, long j) {
        this.A02 = str;
        ? obj = new Object();
        obj.A00 = 1;
        obj.A02 = j;
        obj.A01 = j;
        this.A00 = obj;
    }

    public final JSONObject A01() {
        JSONObject A11 = DbS.A11();
        try {
            A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "fbns_counters");
            A11.put("time", S9J.A00(this.A03));
            JSONObject A112 = DbS.A11();
            A112.put("key", this.A02);
            A112.put("dims", A00());
            RQZ rqz = this.A00;
            JSONObject A113 = DbS.A11();
            A113.put("cnt", rqz.A00);
            A113.put("avg", (double) (((float) rqz.A02) / ((float) rqz.A00)));
            A113.put("max", rqz.A01);
            Iterator<String> keys = A113.keys();
            while (keys.hasNext()) {
                String A18 = AnonymousClass7TE.A18(keys);
                A112.put(A18, A113.get(A18));
            }
            A11.put("extra", A112);
            return A11;
        } catch (JSONException e) {
            0KC.A0I("CounterEvent", "Failed to serialize", e);
            return A11;
        }
    }

    public final String toString() {
        return A01().toString();
    }
}
