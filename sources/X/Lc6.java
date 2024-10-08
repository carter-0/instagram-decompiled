package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

public final class Lc6 implements 1UV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Lc6(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        Boolean bool;
        File file;
        String path;
        switch (this.A00) {
            case 0:
                return !obj.equals(DbT.A0j((UserSession) this.A02));
            case 1:
                File file2 = (File) obj;
                try {
                    File canonicalFile = ((File) this.A01).getCanonicalFile();
                    if (file2 != null) {
                        file = file2.getCanonicalFile();
                    } else {
                        file = null;
                    }
                    bool = Boolean.valueOf(AnonymousClass7TF.A1Q(0qQ.A0K(canonicalFile, file) ? 1 : 0));
                } catch (Throwable th) {
                    bool = JTO.A1B(th);
                }
                if (bool instanceof 0eQ) {
                    bool = true;
                }
                return AnonymousClass7TE.A1a(bool);
            default:
                File file3 = (File) obj;
                if (!0qQ.A0K(this.A02, file3)) {
                    Iterator it = ((Set) this.A01).iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        if (file3 == null || (path = file3.getPath()) == null || !00p.A0k(A18, path, false)) {
                        }
                    }
                    return true;
                }
                return false;
        }
    }
}
