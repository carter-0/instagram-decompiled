package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.3Ti  reason: invalid class name and case insensitive filesystem */
public abstract class C242273Ti {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.3Tk, java.lang.Object] */
    public static C242283Tk parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    num = Integer.valueOf(r5.A1D());
                } else if ("text".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            ? obj = new Object();
            if (num != null) {
                obj.A00 = num.intValue();
            }
            if (str != null) {
                obj.A01 = str;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
