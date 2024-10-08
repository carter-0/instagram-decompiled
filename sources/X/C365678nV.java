package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8nV  reason: invalid class name and case insensitive filesystem */
public final class C365678nV {
    public final List A00;
    public final List A01;

    public /* synthetic */ C365678nV(List list, List list2) {
        this.A00 = new ArrayList(list);
        this.A01 = new ArrayList(list2);
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.A00, this.A01});
    }
}
