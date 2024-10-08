package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4o  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41870B4o {
    public static Map A00(C253823rT r5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r5.B1Q();
        linkedHashMap.put("end", Integer.valueOf(r5.B1Q()));
        if (r5.getId() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r5.getId());
        }
        r5.Byb();
        linkedHashMap.put("start", Integer.valueOf(r5.Byb()));
        if (r5.getUsername() != null) {
            linkedHashMap.put(Dbh.A01(10, 8, 29), r5.getUsername());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
