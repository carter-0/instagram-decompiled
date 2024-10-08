package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CMc extends 17P implements C270824hM {
    public User A00;
    public List A01;

    public final List BeM() {
        return this.A01;
    }

    public final User CCd() {
        return this.A00;
    }

    public final C270824hM E7o(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(106855379, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        this.A00 = C41847B3o.A0y(r4, this);
        return this;
    }

    public final C270814hL F6z(1E9 r6) {
        ArrayList arrayList;
        ArrayList arrayList2;
        User A0b;
        ImmutableList A08 = A08(106855379, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r6, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        User user = null;
        if (arrayList != null) {
            arrayList2 = AnonymousClass7TG.A0r(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C41848B3p.A1V(r6, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        ImmutablePandoUserDict A0Z = C41846B3n.A0Z(this);
        if (!(A0Z == null || (A0b = C41845B3m.A0b(r6, A0Z)) == null)) {
            user = C41846B3n.A0b(r6, A0b);
        }
        return new C270814hL(user, arrayList2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMc, X.4hM] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, Cb4.A00(this));
    }
}
