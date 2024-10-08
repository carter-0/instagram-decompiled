package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;

/* renamed from: X.RzS  reason: case insensitive filesystem */
public final class C10867RzS {
    public final LinkedHashMap A00(String str, String str2, boolean z) {
        LinkedHashMap A03 = 0Yt.A03(DbY.A0q("with_ads_disclosure", String.valueOf(z), AnonymousClass7TE.A1L("user_action", str), AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2)));
        A03.get("action");
        A03.put("IS_BLOKS_ACTION", "true");
        return A03;
    }
}
