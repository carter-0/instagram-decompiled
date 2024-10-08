package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.VWj  reason: case insensitive filesystem */
public final class C17456VWj {
    public final Map A00;
    public final List A01;
    public final Set A02;

    public C17456VWj(List list, Set set) {
        AnonymousClass7TG.A1O(list, set);
        this.A01 = list;
        this.A02 = set;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            W0O w0o = (W0O) it.next();
            AnonymousClass7TF.A1I(w0o.A04(), new C17379VTg(this.A02.contains(w0o.A04()), false), A0r);
        }
        this.A00 = 0Yt.A03(0Yt.A08(A0r));
    }
}
