package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xbw  reason: case insensitive filesystem */
public final class C21464Xbw {
    public final String A00;
    public final Map A01;
    public final C22023Xt4 A02;
    public final C11427STm A03;
    public final C21956Xml A04;
    public volatile C18584Vub A05;

    public C21464Xbw(C21985Xog xog) {
        Map unmodifiableMap;
        this.A03 = xog.A03;
        this.A00 = xog.A00;
        this.A02 = new C22023Xt4(xog.A02);
        this.A04 = xog.A04;
        Map map = xog.A01;
        C22023Xt4 xt4 = SUS.A04;
        if (map.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        this.A01 = unmodifiableMap;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Request{method=");
        A1A.append(this.A00);
        A1A.append(", url=");
        A1A.append(this.A03);
        A1A.append(Pxd.A00(121));
        return Pxg.A0p(this.A01, A1A);
    }
}
