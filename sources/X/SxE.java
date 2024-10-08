package X;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public final class SxE implements AnonymousClass63X {
    public final GoogleSignInAccount A00;
    public final Status A01;

    public SxE(GoogleSignInAccount googleSignInAccount, Status status) {
        this.A00 = googleSignInAccount;
        this.A01 = status;
    }

    public final Status BzI() {
        return this.A01;
    }
}
