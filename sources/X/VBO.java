package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class VBO {
    public static final List A00(List list) {
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16672Uz8 uz8 = ((C18479VsV) it.next()).A00;
            if (uz8 != null) {
                A0r.add(uz8);
            } else {
                0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return A0r;
    }
}
