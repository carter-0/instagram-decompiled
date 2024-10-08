package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.EjP  reason: case insensitive filesystem */
public abstract class C48740EjP {
    public static C47358Dvs parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C47358Dvs dvs = new C47358Dvs();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    dvs.A01 = AnonymousClass7TF.A0X(r3);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    dvs.A02 = str;
                } else if ("is_selected".equals(A17)) {
                    dvs.A00 = AnonymousClass7TF.A0S(r3);
                } else {
                    1XY.A01(r3, dvs, A17);
                }
                r3.A0z();
            }
            return dvs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
