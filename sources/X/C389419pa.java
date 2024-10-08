package X;

import android.os.Parcelable;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.9pa  reason: invalid class name and case insensitive filesystem */
public final class C389419pa extends 17P implements C298935uH {
    public User A00;

    public final C298925uG FD9(1E6 r4) {
        0qQ.A0B(r4, 0);
        return A0q(new 1E9(r4, 6, false));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.9pa] */
    public final C375609Eh Afc() {
        return (C375609Eh) getTreeValueByHashCode(3138, C389379pM.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.9pa] */
    public final C375639El BkJ() {
        return (C375639El) getTreeValueByHashCode(2008168156, C389409pP.class);
    }

    public final User CCd() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.9pa] */
    public final C298925uG A0q(1E9 r6) {
        C375599Eg r4;
        C375619Ej r3;
        C375609Eh Afc = Afc();
        User user = null;
        if (Afc != null) {
            r4 = Afc.F0n();
        } else {
            r4 = null;
        }
        C375639El BkJ = BkJ();
        if (BkJ != null) {
            r3 = BkJ.F8X();
        } else {
            r3 = null;
        }
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(3599307, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = 1aC.A01(r6, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) r6.A00(A01);
            }
        }
        return new C298925uG(r4, r3, user);
    }
}
