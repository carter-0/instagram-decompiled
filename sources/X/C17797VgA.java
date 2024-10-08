package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VgA  reason: case insensitive filesystem */
public final class C17797VgA {
    public final String A00 = AnonymousClass7TG.A0j();
    public final List A01 = new ArrayList();

    public final int A00(C16672Uz8 uz8) {
        0qQ.A0B(uz8, 0);
        int i = 0;
        for (C18479VsV vsV : this.A01) {
            C16672Uz8 uz82 = vsV.A00;
            if (uz82 == null) {
                0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                throw AnonymousClass00P.createAndThrow();
            } else if (uz82 == uz8) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }
}
