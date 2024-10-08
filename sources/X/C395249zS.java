package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.9zS  reason: invalid class name and case insensitive filesystem */
public abstract class C395249zS {
    public static AnonymousClass914 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass914 r1 = new AnonymousClass914();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("item_id".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(3062).equals(A17)) {
                    r1.A00 = AnonymousClass7TF.A0Z(r3);
                } else if (AnonymousClass000.A00(3202).equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("has_creator_replied".equals(A17)) {
                    r1.A05 = r3.A0d();
                } else if ("has_submissions".equals(A17)) {
                    r1.A06 = r3.A0d();
                } else if ("text".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
