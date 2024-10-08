package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.AdMetadataType;
import java.io.IOException;

/* renamed from: X.3ks  reason: invalid class name and case insensitive filesystem */
public abstract class C250083ks {
    public static C250093kt parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            AdMetadataType adMetadataType = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    adMetadataType = (AdMetadataType) AdMetadataType.A01.get(str);
                    if (adMetadataType == null) {
                        adMetadataType = AdMetadataType.UNRECOGNIZED;
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (adMetadataType == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "AdMetadata");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new C250093kt(adMetadataType, str2);
            } else {
                ((0c9) r8).A03.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "AdMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
