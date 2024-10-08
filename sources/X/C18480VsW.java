package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.VsW  reason: case insensitive filesystem */
public final class C18480VsW {
    public final Wv0 A00 = new Wv0(AnonymousClass05K.A00);
    public final List A01 = new ArrayList();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public static final boolean A00(C247733gp r4) {
        0qQ.A0B(r4, 0);
        if (!0sr.A1P(new C252883pr[]{C252883pr.Deleted, C252883pr.DeletePending}).contains(r4.A06)) {
            if (!r4.A0P) {
                return true;
            }
            if (r4.A01 > 0) {
                List<C247733gp> list = r4.A0L;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (C247733gp r1 : list) {
                        if (r1.A0k && !r1.A0P) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
