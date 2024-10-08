package X;

import android.net.Uri;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: X.Fde  reason: case insensitive filesystem */
public final class C50518Fde implements C51908G7c {
    public final Credential A00;

    public final Uri Bh2() {
        return this.A00.A00;
    }

    public final String getPassword() {
        return this.A00.A03;
    }

    public final String getUsername() {
        String str = this.A00.A01;
        0qQ.A07(str);
        return str;
    }

    public C50518Fde(Credential credential) {
        this.A00 = credential;
    }
}
