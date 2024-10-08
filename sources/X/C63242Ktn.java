package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Ktn  reason: case insensitive filesystem */
public abstract class C63242Ktn {
    public static C59832Ja7 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C59832Ja7 ja7 = new C59832Ja7();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    ja7.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("text".equals(A17)) {
                    ja7.A05 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(3062).equals(A17)) {
                    ja7.A00 = AnonymousClass7TF.A0Z(r3);
                } else if ("is_active".equals(A17)) {
                    ja7.A06 = r3.A0d();
                } else if (AnonymousClass000.A00(3202).equals(A17)) {
                    ja7.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("prize".equals(A17)) {
                    ja7.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("submission_count".equals(A17)) {
                    ja7.A01 = AnonymousClass7TF.A0X(r3);
                }
                r3.A0z();
            }
            return ja7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
