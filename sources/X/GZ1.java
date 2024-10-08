package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class GZ1 {
    public final GZ0 A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;

    public GZ1(GZ0 gz0, List list, List list2, List list3) {
        this.A00 = gz0;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put(gz0.A02, gz0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GZ0 gz02 = (GZ0) it.next();
            A1H.put(gz02.A02, gz02);
        }
        this.A03 = A1H;
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C376649Iu r1 = (C376649Iu) it2.next();
            A1H2.put(r1.A01, r1);
        }
        this.A02 = A1H2;
        LinkedHashMap A1H3 = AnonymousClass7TE.A1H();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            C55590HkA hkA = (C55590HkA) it3.next();
            A1H3.put(hkA.A00, hkA);
        }
        this.A01 = A1H3;
    }
}
