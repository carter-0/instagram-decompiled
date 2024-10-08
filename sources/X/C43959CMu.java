package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* renamed from: X.CMu  reason: case insensitive filesystem */
public final class C43959CMu extends 17P implements C46256DSl {
    public User A00;

    public final C46256DSl E7t(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, -1003761774);
        return this;
    }

    public final C42058BFl F7T(1E9 r3) {
        User user;
        User A0b;
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, -1003761774);
        if (A0Z == null || (A0b = C41845B3m.A0b(r3, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r3, A0b);
        }
        return new C42058BFl(user);
    }

    public final C42058BFl F7U(1E6 r2) {
        return F7T(C41846B3n.A0S(r2));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CMu] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        User user = this.A00;
        if (user != null) {
            A0t.put("producer", user.A08());
        }
        return C41846B3n.A0P(this, A0t);
    }
}
