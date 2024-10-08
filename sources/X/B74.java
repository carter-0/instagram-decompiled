package X;

import android.os.Parcelable;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class B74 extends 17P implements AnonymousClass60M {
    public final AnonymousClass60L F6w(1E9 r5) {
        List<ImmutablePandoUserDict> A0o = A0o(2093024461, ImmutablePandoUserDict.class);
        ArrayList<User> A0p = AnonymousClass7TF.A0p(A0o);
        for (ImmutablePandoUserDict A01 : A0o) {
            Parcelable.Creator creator = User.CREATOR;
            A0p.add(1aC.A01(r5, A01));
        }
        ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
        for (User A00 : A0p) {
            A0p2.add(r5.A00(A00));
        }
        return new AnonymousClass60L(A0p2);
    }
}
