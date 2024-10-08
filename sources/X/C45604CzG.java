package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CzG  reason: case insensitive filesystem */
public abstract class C45604CzG {
    public static C270814hL parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            User user = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (!"posts".equals(A17)) {
                    user = C41846B3n.A0a(r5, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                } else if (r5.A11() == 16L.A0C) {
                    arrayList = AnonymousClass7TE.A1C();
                    while (r5.A1J() != 16L.A08) {
                        C41846B3n.A1D(r5, arrayList);
                    }
                } else {
                    arrayList = null;
                }
                r5.A0z();
            }
            return new C270814hL(user, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C270814hL r3) {
        r2.A0c();
        List list = r3.A01;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "posts", list);
            while (A0s.hasNext()) {
                C41848B3p.A1O(r2, A0s);
            }
            r2.A0Y();
        }
        User user = r3.A00;
        if (user != null) {
            C41845B3m.A0w(r2, user, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        }
        r2.A0Z();
    }
}
