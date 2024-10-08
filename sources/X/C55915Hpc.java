package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;

/* renamed from: X.Hpc  reason: case insensitive filesystem */
public final class C55915Hpc {
    public final 0wc A00;

    public C55915Hpc(0wc r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void A00(1Xj r5) {
        Long l;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_thumbnail_impression");
        User A11 = C51966G9m.A11(r5);
        String str = null;
        if (A11 != null) {
            l = C51972G9s.A0h(A11);
        } else {
            l = null;
        }
        A0e.A9F("entity_id", l);
        User A112 = C51966G9m.A11(r5);
        if (A112 != null) {
            str = A112.getUsername();
        }
        A0e.AAJ("entity_name", str);
        G9t.A1I(A0e, r5, PublicKeyCredentialControllerUtility.JSON_KEY_ID, r5.getId());
        String A2n = r5.A2n();
        if (A2n != null) {
            C51965G9l.A1E(A0e, AnonymousClass7TE.A10(A2n));
            G9t.A1H(A0e, r5);
            G9w.A17(A0e);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
