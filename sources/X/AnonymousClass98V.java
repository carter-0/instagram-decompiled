package X;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.98V  reason: invalid class name */
public final class AnonymousClass98V implements AnonymousClass97C {
    public static final AnonymousClass98V A00 = new Object();

    public final Class BHT() {
        return AnonymousClass98W.class;
    }

    public final Class Bfd() {
        return AnonymousClass98W.class;
    }

    public final /* bridge */ /* synthetic */ Object FNa(C375379Di r4) {
        if (r4 == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        } else if (r4.A00 != null) {
            for (List it : r4.A03.values()) {
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
            return new C40230AWu(r4);
        } else {
            throw new GeneralSecurityException("no primary in primitive set");
        }
    }
}
