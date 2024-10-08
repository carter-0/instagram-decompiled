package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

public final class Sx2 implements AnonymousClass63L {
    public static final Sx2 A01 = new Sx2(AnonymousClass7TE.A0a());
    public final Bundle A00;

    public /* synthetic */ Sx2(Bundle bundle) {
        this.A00 = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sx2)) {
            return false;
        }
        Bundle bundle = this.A00;
        Bundle bundle2 = ((Sx2) obj).A00;
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (!SA1.A01(bundle.get(A18), bundle2.get(A18))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A08(this.A00);
    }
}
