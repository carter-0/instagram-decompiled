package X;

import java.net.Proxy;
import java.util.Collections;
import java.util.List;

public final class Xb9 {
    public int A00;
    public List A01 = Collections.emptyList();
    public List A02 = Collections.emptyList();
    public final List A03 = AnonymousClass7TE.A1C();
    public final C21504XdI A04;
    public final XZX A05;
    public final C21946Xmb A06;
    public final Y1T A07;

    public Xb9(C21504XdI xdI, C21946Xmb xmb, Y1T y1t, XZX xzx) {
        List A062;
        this.A04 = xdI;
        this.A05 = xzx;
        this.A07 = y1t;
        this.A06 = xmb;
        C11427STm sTm = xdI.A0A;
        Proxy proxy = xdI.A00;
        if (proxy != null) {
            A062 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = xdI.A01.select(sTm.A0B());
            if (select == null || select.isEmpty()) {
                A062 = SUS.A06(Proxy.NO_PROXY);
            } else {
                C22023Xt4 xt4 = SUS.A04;
                A062 = Collections.unmodifiableList(AnonymousClass7TE.A1D(select));
            }
        }
        this.A02 = A062;
        this.A00 = 0;
    }
}
