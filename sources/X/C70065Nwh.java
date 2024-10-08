package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nwh  reason: case insensitive filesystem */
public abstract class C70065Nwh {
    public static String A00(C70816OMl oMl) {
        StringWriter A0v = JTO.A0v();
        17W A0K = AnonymousClass7TF.A0K(A0v);
        String str = oMl.A00;
        if (str != null) {
            A0K.A0R("question", str);
        }
        List list = oMl.A03;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(A0K, "options", list);
            while (A0s.hasNext()) {
                String A18 = AnonymousClass7TE.A18(A0s);
                if (A18 != null) {
                    A0K.A0c();
                    A0K.A0R("text", A18);
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
        }
        List list2 = oMl.A02;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(A0K, "new_options", list2);
            while (A0s2.hasNext()) {
                C61046Jvk jvk = (C61046Jvk) A0s2.next();
                if (jvk != null) {
                    A0K.A0c();
                    A0K.A0S("is_voted", jvk.A01);
                    C41846B3n.A0z(A0K, jvk.A00);
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
        }
        List list3 = oMl.A01;
        if (list3 != null) {
            Iterator A0s3 = C41845B3m.A0s(A0K, "existing_options", list3);
            while (A0s3.hasNext()) {
                C70565OBn oBn = (C70565OBn) A0s3.next();
                if (oBn != null) {
                    A0K.A0c();
                    A0K.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, oBn.A00);
                    A0K.A0S("is_voted", oBn.A01);
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
        }
        return AnonymousClass7TG.A0k(A0K, A0v);
    }
}
