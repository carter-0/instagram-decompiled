package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MetaPlaceDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HTk  reason: case insensitive filesystem */
public abstract /* synthetic */ class C54803HTk {
    public static Map A00(MetaPlaceDict metaPlaceDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (metaPlaceDict.getId() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, metaPlaceDict.getId());
        }
        if (metaPlaceDict.getName() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, metaPlaceDict.getName());
        }
        return 0Yt.A0B(A1H);
    }
}
