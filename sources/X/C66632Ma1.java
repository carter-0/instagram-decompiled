package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;

/* renamed from: X.Ma1  reason: case insensitive filesystem */
public final class C66632Ma1 extends C66942Mfb {
    public User A00;
    public boolean A01;

    public C66632Ma1() {
        super(0);
    }

    public final User A06() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C66632Ma1) || !0qQ.A0K(A06(), ((C66632Ma1) obj).A06())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return A06().hashCode();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66632Ma1(User user) {
        super(0);
        int i;
        0qQ.A0B(user, 1);
        this.A00 = user;
        Integer BqJ = user.A03.BqJ();
        if (BqJ != null) {
            i = BqJ.intValue();
        } else {
            i = -1;
        }
        this.A00 = i;
    }
}
