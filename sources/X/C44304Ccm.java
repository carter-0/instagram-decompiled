package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ccm  reason: case insensitive filesystem */
public abstract class C44304Ccm {
    public static C47215Dt2 parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            User user = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (!"media_previews".equals(A17)) {
                    user = C41846B3n.A0a(r8, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                } else if (r8.A11() == 16L.A0C) {
                    arrayList = AnonymousClass7TE.A1C();
                    while (r8.A1J() != 16L.A08) {
                        C47212Dsz parseFromJson = C44249Cbk.parseFromJson(r8);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                } else {
                    arrayList = null;
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_previews", r8, "RecommendedAccountsForCategoryResponseItem");
            } else if (user != null || !(r8 instanceof 0c9)) {
                return new C47215Dt2(user, arrayList);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r8, "RecommendedAccountsForCategoryResponseItem");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
