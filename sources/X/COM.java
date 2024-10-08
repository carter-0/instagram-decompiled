package X;

import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class COM extends 17P implements G90 {
    public List A00;

    public final List B3c() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'facepile' field.");
    }

    public final G90 E8C(1E9 r4) {
        List A0o = A0o(497541391, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r4, A0r, it);
        }
        this.A00 = A0r;
        return this;
    }

    public final String B9u() {
        return A0h(98629247);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COM] */
    public final Boolean BvU() {
        return getOptionalBooleanValueByHashCode(-1401042162);
    }

    public final String C2b() {
        return A0i(-353121165);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COM] */
    public final Integer CCi() {
        return getOptionalIntValueByHashCode(1919900571);
    }

    public final String CHh() {
        return A0h(951530927);
    }

    public final String getCategory() {
        return A0i(50511102);
    }

    public final String getSubtitle() {
        return A0U();
    }

    public final String getTitle() {
        return A0S();
    }
}
