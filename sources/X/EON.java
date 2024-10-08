package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class EON extends 17P implements C51955G8y {
    public User A00;

    public final C47218Dt5 FCS(1E6 r4) {
        0qQ.A0B(r4, 0);
        return FCR(new 1E9(r4, 6, false));
    }

    public final TextAppMentionType BRg() {
        return (TextAppMentionType) A0N(2009353327, G35.A00);
    }

    public final User BRj() {
        return this.A00;
    }

    public final C51955G8y E9N(1E9 r3) {
        User user;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(-1198593471, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            user = 1aC.A01(r3, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A00 = user;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.EON, com.facebook.pando.TreeJNI, X.G8y] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C48354EdB.A00(this));
    }

    public final C47218Dt5 FCR(1E9 r4) {
        User user;
        TextAppMentionType BRg = BRg();
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(-1198593471, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = 1aC.A01(r4, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) r4.A00(A01);
                return new C47218Dt5(BRg, user);
            }
        }
        user = null;
        return new C47218Dt5(BRg, user);
    }
}
