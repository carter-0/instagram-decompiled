package X;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: X.FSu  reason: case insensitive filesystem */
public final class C50188FSu implements G9X {
    public final Credential A00;
    public final Status A01;

    public C50188FSu(Credential credential, Status status) {
        this.A01 = status;
        this.A00 = credential;
    }

    public final Status BzI() {
        return this.A01;
    }
}
