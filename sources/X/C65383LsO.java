package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.LsO  reason: case insensitive filesystem */
public final class C65383LsO implements MXT {
    public final UserSession A00;
    public final C61292K1d A01;
    public final C270194gL A02;

    public final String ByO(UserSession userSession) {
        return null;
    }

    public final boolean CWu() {
        return false;
    }

    public final boolean CYu() {
        return false;
    }

    public final boolean CcK() {
        return false;
    }

    public final boolean EtN() {
        return false;
    }

    public final C270194gL Ahy() {
        return this.A02;
    }

    public final String Aml() {
        String str = this.A01.A03;
        0qQ.A07(str);
        return str;
    }

    public final String BJX() {
        String str = this.A02.A0Y;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final 1Xj BPf() {
        throw AnonymousClass7TE.A1B("Not supported for live.");
    }

    public final ImageUrl C74(Context context) {
        return this.A02.A02();
    }

    public final User CCd() {
        return this.A02.A03();
    }

    public final boolean CUz() {
        return true;
    }

    public final boolean CYg() {
        return true;
    }

    public final boolean CeQ() {
        return this.A02.A03().isVerified();
    }

    public final String getId() {
        return this.A02.getId();
    }

    public final String getUsername() {
        return this.A02.A03().getUsername();
    }

    public final int getViewCount() {
        return this.A02.A00();
    }

    public C65383LsO(UserSession userSession, C61292K1d k1d, C270194gL r4) {
        AnonymousClass7TG.A1U(userSession, k1d, r4);
        this.A00 = userSession;
        this.A01 = k1d;
        this.A02 = r4;
        C63530Kyf.A00.getAndIncrement();
    }
}
