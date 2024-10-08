package X;

import android.util.Base64;
import java.io.IOException;
import java.security.MessageDigest;
import org.json.JSONException;
import org.json.JSONObject;

public final class SNK {
    public JSONObject A00 = DbS.A11();
    public final C10245Rp5 A01;

    public static final void A00(SNK snk) {
        if (snk.A00.names() == null) {
            try {
                String str = snk.A01.A00.A3u;
                if (str != null) {
                    snk.A00 = C66580MXl.A17(str);
                }
            } catch (JSONException e) {
                throw new Exception("Cannot read from the data store", e);
            } catch (IOException e2) {
                throw new Exception("Cannot read from the data store", e2);
            }
        }
    }

    public static final void A01(SNK snk) {
        try {
            C10245Rp5 rp5 = snk.A01;
            String A10 = DbT.A10(snk.A00);
            AnonymousClass3Q2 r0 = rp5.A00;
            r0.A3u = A10;
            r0.A0P();
        } catch (IOException e) {
            throw new Exception("Cannot write to data store", e);
        }
    }

    public SNK(C10245Rp5 rp5, String str, String str2) {
        this.A01 = rp5;
        String A0R = 002.A0R(str, str2);
        MessageDigest instance = MessageDigest.getInstance("sha256");
        0qQ.A07(instance);
        0qQ.A07(Base64.encodeToString(instance.digest(C66582MXn.A1a(A0R)), 10));
    }
}
