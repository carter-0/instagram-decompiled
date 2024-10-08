package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

public final class LsP implements MXT {
    public 1Xj A00;
    public C300835xz A01 = new C300835xz();
    public final UserSession A02;
    public final C61292K1d A03;

    public final String ByO(UserSession userSession) {
        return null;
    }

    public final boolean CUz() {
        return true;
    }

    public final boolean CYg() {
        return true;
    }

    public final boolean CcK() {
        return false;
    }

    public final /* synthetic */ C270194gL Ahy() {
        return null;
    }

    public final String Aml() {
        return this.A03.A03;
    }

    @Deprecated
    public final String BJX() {
        String str;
        String str2;
        1Xj r1 = this.A00;
        if (!r1.A5V()) {
            return r1.A0C.getTitle();
        }
        if (r1.A5Y()) {
            str = r1.A0C.getTitle();
        } else {
            str = null;
        }
        if (r1.A1T() != null) {
            str2 = r1.A1T().A0d;
        } else {
            str2 = null;
        }
        boolean z = !0mp.A0B(str);
        boolean z2 = !0mp.A0B(str2);
        if (z) {
            if (z2) {
                return 002.A0g(str, " • ", str2);
            }
            return str;
        } else if (z2) {
            return str2;
        } else {
            return null;
        }
    }

    public final 1Xj BPf() {
        return this.A00;
    }

    public final ImageUrl C74(Context context) {
        return this.A00.A1n(context);
    }

    public final User CCd() {
        return this.A00.A2A(this.A02);
    }

    public final boolean CWu() {
        return true;
    }

    public final boolean CYu() {
        return AnonymousClass7TF.A1V(this.A00.A0C.BFp());
    }

    public final boolean EtN() {
        return AnonymousClass7TF.A1V(this.A00.A0C.BFq());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return 2PP.A00(this.A00.getId(), ((MXT) obj).getId());
    }

    public final String getId() {
        return this.A00.getId();
    }

    public final int getViewCount() {
        1Xj r1 = this.A00;
        if (r1.A0C.CEg() == null) {
            return 0;
        }
        return r1.A0C.CEg().intValue();
    }

    public final int hashCode() {
        return this.A00.getId().hashCode();
    }

    public LsP(UserSession userSession, 1Xj r4, C61292K1d k1d) {
        this.A02 = userSession;
        this.A03 = k1d;
        this.A00 = r4;
        C63530Kyf.A00.getAndIncrement();
        C63531Kyg.A00.get(this.A00.A30());
    }

    public final boolean CeQ() {
        return CCd().isVerified();
    }

    public final String getUsername() {
        return CCd().getUsername();
    }
}
