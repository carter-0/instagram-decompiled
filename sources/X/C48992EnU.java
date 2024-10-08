package X;

import com.instagram.model.business.PublicPhoneContact;
import java.io.StringWriter;

/* renamed from: X.EnU  reason: case insensitive filesystem */
public abstract class C48992EnU {
    public static String A00(PublicPhoneContact publicPhoneContact) {
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        String str = publicPhoneContact.A03;
        if (str != null) {
            A0K.A0R(AnonymousClass000.A00(3818), str);
        }
        String str2 = publicPhoneContact.A00;
        if (str2 != null) {
            A0K.A0R(AnonymousClass000.A00(4542), str2);
        }
        return AnonymousClass7TG.A0k(A0K, stringWriter);
    }
}
