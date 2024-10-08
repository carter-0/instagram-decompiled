package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cbf  reason: case insensitive filesystem */
public abstract class C44244Cbf {
    public static C42064BFr parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Float f = null;
            String str = null;
            User user = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("broadcasts".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C239653Hl parseFromJson = C277424v9.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("can_reply".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("can_reshare".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r9);
                } else if (AnonymousClass000.A00(686).equals(A17)) {
                    f = AnonymousClass7TF.A0U(r9);
                } else if (!"pk".equals(A17)) {
                    user = C41846B3n.A0a(r9, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                } else if (r9.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r9.A1P();
                }
                r9.A0z();
            }
            return new C42064BFr(user, bool, bool2, f, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
