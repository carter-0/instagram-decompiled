package X;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class S15 {
    public final int A00;
    public final File A01;

    public S15(C10668Rw2 rw2, int i) {
        0qQ.A0B(rw2, 1);
        String str = File.separator;
        String A0o = 002.A0o("updates", str, str, rw2.A00, i);
        0qQ.A07(A0o);
        this.A01 = JTO.A0s(rw2.A01, A0o);
        this.A00 = i;
    }

    public final boolean A00(Set set) {
        0qQ.A0B(set, 0);
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                0qQ.A0B(A18, 0);
                if (!JTO.A0s(this.A01, A18).isFile()) {
                    return false;
                }
            }
        }
        return true;
    }
}
