package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* renamed from: X.BFl  reason: case insensitive filesystem */
public final class C42058BFl extends AnonymousClass0T0 implements C46256DSl {
    public final User A00;

    public final C42058BFl F7T(1E9 r1) {
        return this;
    }

    public final C42058BFl F7U(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42058BFl) && 0qQ.A0K(this.A00, ((C42058BFl) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public C42058BFl(User user) {
        this.A00 = user;
    }

    public final C46256DSl E7t(1E9 r1) {
        return this;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        User user = this.A00;
        if (user != null) {
            A0t.put("producer", user.A08());
        }
        return C41845B3m.A0T("XDTPhotoCreditStickerDict", 0Yt.A0B(A0t));
    }
}
