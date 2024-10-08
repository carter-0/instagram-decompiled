package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

public final class Q09 implements C13752TgO {
    public final Object A00;
    public final Map A01;

    public Q09(Object obj, String str, Map map) {
        0qQ.A0B(str, 2);
        this.A00 = obj;
        this.A01 = map;
    }

    public final Runnable AIV(C307786Rm r3, C307446Qd r4, C229652no r5) {
        0qQ.A0B(r5, 2);
        Map map = this.A01;
        if (map == null) {
            return null;
        }
        map.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        return null;
    }

    public final Object BHB() {
        return this.A00;
    }
}
