package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.Txo  reason: case insensitive filesystem */
public abstract class C14528Txo {
    public static C14529Txp parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C14529Txp txp = new C14529Txp();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    txp.A01 = str;
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    txp.A02 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    txp.A00 = (C16663Uyz) EnumHelper.A00(r4.A1Q(), C16663Uyz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                r4.A0z();
            }
            return txp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
