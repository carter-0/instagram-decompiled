package X;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

public final class AWP implements 1UV {
    public final /* synthetic */ Set A00;

    public AWP(Set set) {
        this.A00 = set;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        String path;
        File file = (File) obj;
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (file != null && (path = file.getPath()) != null && 00p.A0k(A18, path, false)) {
                return false;
            }
        }
        return true;
    }
}
