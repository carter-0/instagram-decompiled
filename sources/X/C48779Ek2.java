package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ek2  reason: case insensitive filesystem */
public abstract class C48779Ek2 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.F3R, java.lang.Object] */
    public static F3R parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("module_type".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1E(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("answers".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            F36 parseFromJson = C48778Ek1.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A05 = arrayList;
                } else if ("isHidden".equals(A17)) {
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
