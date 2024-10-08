package X;

import android.text.TextUtils;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.RVe  reason: case insensitive filesystem */
public abstract class C9253RVe {
    public static final String A00(long j, List list) {
        0qQ.A0B(list, 1);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(j);
        A1A.append(';');
        ArrayList A0m = C51970G9q.A0m(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] address = ((InetAddress) it.next()).getAddress();
            0qQ.A07(address);
            A0m.add(Pxf.A0p(address, 3));
        }
        String join = TextUtils.join(";", A0m);
        0qQ.A07(join);
        return AnonymousClass7TF.A0l(join, A1A);
    }
}
