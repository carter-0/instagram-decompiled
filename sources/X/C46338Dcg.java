package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dcg  reason: case insensitive filesystem */
public abstract /* synthetic */ class C46338Dcg {
    public static Map A00(C255233tn r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.getId() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.getId());
        }
        if (r3.getUsername() != null) {
            A1H.put(Dbh.A00(), r3.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
