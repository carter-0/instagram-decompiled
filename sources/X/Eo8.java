package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.nux.cal.model.ContentText;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Eo8 {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.nux.cal.model.ContentText, java.lang.Object] */
    public static ContentText parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    obj.A01 = Eo9.A00(r4.A1Q());
                } else if ("content".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    obj.A02 = arrayList;
                } else if ("split_point".equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0S(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
