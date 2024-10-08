package X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.RsP  reason: case insensitive filesystem */
public final class C10448RsP {
    public Map A00;
    public Set A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.RsP, java.lang.Object] */
    public static C11214SFo A00(Object obj, Map map) {
        HashSet hashSet = new HashSet();
        hashSet.add(obj);
        SSZ ssz = AnonymousClass2E0.A04().A01;
        ? obj2 = new Object();
        obj2.A00 = map;
        obj2.A01 = hashSet;
        0sm A0E = 0Yt.A0E();
        0qQ.A0B(A0E, 8);
        C12496SvS svS = new C12496SvS(ssz, 1);
        0sl r11 = 0sl.A00;
        return new C11214SFo(C11095S9w.A00(svS, r11), obj2, "SEND_E2EE_DATA", (String) null, (String) null, (String) null, (String) null, (String) null, A0E, r11);
    }
}
